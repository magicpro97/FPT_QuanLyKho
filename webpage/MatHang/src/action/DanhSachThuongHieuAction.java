package action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.ThuongHieuBO;
import model.dao.DanhMucHangDAO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.tiles.PathAttribute;
import org.apache.struts.upload.FormFile;

import common.Common;
import form.DanhSachThuongHieuForm;

public class DanhSachThuongHieuAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		 	DanhSachThuongHieuForm danhSachThuongHieuForm = (DanhSachThuongHieuForm)form;
		 	ThuongHieuBO tHBO=new ThuongHieuBO();
		 	danhSachThuongHieuForm.setDanhSachThuongHieu(tHBO.getDanhSachThuongHieu("images/"));
		 	danhSachThuongHieuForm.setImg("images/230105-938296-1000-1d0c65d755-1478510766.jpg");
		 	FormFile formFile=danhSachThuongHieuForm.getFile();
 			String pathAnh=getServlet().getServletContext().getRealPath("/") + "images";
		 	//if(formFile!=null) System.out.println(formFile.getContentType()+"kl\n"+formFile.getFileSize()+"s1z3\n"+formFile.getFileData()[13]);
		 	System.out.println("323232");
 			if("Xóa".equals(danhSachThuongHieuForm.getRequest())){
 				danhSachThuongHieuForm.setRequest("");
		 		boolean thanhCong=tHBO.xoa(danhSachThuongHieuForm.getMaTH());
		 		//System.out.println("eeeeeeeeeeqx"+thanhCong+"ee"+danhSachThuongHieuForm.getMaTH());
		 		if(thanhCong){
		 			danhSachThuongHieuForm.setThongBao("Xóa thành công!");
		 			//System.out.println("0000\\n"+danhSachThuongHieuForm.getSrc()+"\\n"+pathAnh);
			 		Common.xoaAnh(danhSachThuongHieuForm.getSrc(), pathAnh);
		 		}else danhSachThuongHieuForm.setThongBao("Thất bại");
		 			
		 	}
 			if("Thay đổi".equals(danhSachThuongHieuForm.getRequest())){
 				danhSachThuongHieuForm.setRequest("");
		 		System.out.println("eeeeeeeeeeqtd");
	 			File anh=prepare(formFile.getFileName());
 				if(formFile!=null){
 					System.out.println("dddddd0000");
 					if(!anh.exists()){
 						Common.xoaAnh(danhSachThuongHieuForm.getSrc(), pathAnh);
 				 		boolean thanhCong=tHBO.sua(danhSachThuongHieuForm.getMaTH(),
 		 						danhSachThuongHieuForm.getTenTH(),formFile.getFileName()
 		 						,danhSachThuongHieuForm.getTruSo(),danhSachThuongHieuForm.getWebsite());
 				 		if(thanhCong){
 				 			saveFile(formFile,anh);
 				 			danhSachThuongHieuForm.setThongBao("Thay đổi thành công!");
 			 			}else danhSachThuongHieuForm.setThongBao("Thất bại");
 					}else{
 						danhSachThuongHieuForm.setThongBao("Ảnh đã tồn tại!");
 						return mapping.findForward("quayLai");
 					}
 				}else{
 					boolean thanhCong=tHBO.sua(danhSachThuongHieuForm.getMaTH(),
 	 						danhSachThuongHieuForm.getTenTH(),formFile.getFileName()
 	 						,danhSachThuongHieuForm.getTruSo(),danhSachThuongHieuForm.getWebsite());
 			 		if(thanhCong)
 			 			danhSachThuongHieuForm.setThongBao("Thay đổi thành công!");
 		 			else danhSachThuongHieuForm.setThongBao("Thất bại");
 				}
		 	}
		 	if(formFile!=null)
			 	if(!"".equals(formFile.getFileName())){
		 			File anh=prepare(formFile.getFileName());
			 		System.out.println("eeeeeeeeee1");
	 				if(!anh.exists()){
					 		System.out.println("eeeeeeeeee2");
					 		System.out.println(danhSachThuongHieuForm.getRequest());
					 		
						 	if("Thêm Mới".equals(danhSachThuongHieuForm.getRequest())){
				 				danhSachThuongHieuForm.setRequest("ola");
					 			boolean thanhCong = tHBO.them(danhSachThuongHieuForm.getMaTH(),
										 						danhSachThuongHieuForm.getTenTH(),formFile.getFileName()
										 						,danhSachThuongHieuForm.getTruSo(),danhSachThuongHieuForm.getWebsite());
					 			if(thanhCong){
						 			saveFile(formFile,anh);
						 			danhSachThuongHieuForm.setThongBao("Thêm thành công!");
					 			}else danhSachThuongHieuForm.setThongBao("Thất bại");
					 			return mapping.findForward("them");
						 	}
	 				}else danhSachThuongHieuForm.setThongBao("Ảnh đã tồn tại!");
			 	}
		return mapping.findForward("quayLai");
	}
	private void saveFile(FormFile file, File anh) throws IOException{
          FileOutputStream fos = new FileOutputStream(anh);
          fos.write(file.getFileData());
          fos.flush();
          fos.close();
	}
	private File prepare(String fileName){
	    //Get the servers upload directory real path name
		String filePath = getServlet().getServletContext().getRealPath("/") + "images";
	    //create the upload folder if not exists
	    File folder = new File(filePath);
	    if(!folder.exists()){
	    	folder.mkdir();
	    }
	    File fileAnh = new File(filePath, fileName);
	    System.out.println("parepare"+fileAnh.getName()+"__"+fileAnh.getPath());
	    System.out.println("oooo:"+fileAnh.exists());
    	return fileAnh;
	}
	public static void main(String[] args) {
		File fileAnh = new File("D:\\ComputingPrac\\EclipseWorkPlace\\Web\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp1\\wtpwebapps\\MatHang\\images", "anh-dai-dien1.jpg");
		System.out.println(fileAnh.exists());
	}
}
