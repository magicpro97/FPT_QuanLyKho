package action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.ThuongHieuBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import form.DanhSachThuongHieuForm;

public class DanhSachThuongHieuAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		 	DanhSachThuongHieuForm danhSachThuongHieuForm = (DanhSachThuongHieuForm)form;
		 	ThuongHieuBO tHBO=new ThuongHieuBO();
		 	danhSachThuongHieuForm.setDanhSachThuongHieu(tHBO.getDanhSachThuongHieu("images/"));
		 	if("Thêm Mới".equals(danhSachThuongHieuForm.getRequest())){
	 			ThuongHieuBO tHBOBo=new ThuongHieuBO();
	 			String fileName=danhSachThuongHieuForm.getFile().getFileName();
	 			if(!"".equals(fileName)){
		 			boolean thanhCong = tHBO.them(danhSachThuongHieuForm.getMaTH(),
							 						danhSachThuongHieuForm.getTenTH(),fileName
							 						,danhSachThuongHieuForm.getTruSo(),danhSachThuongHieuForm.getWebsite());
		 			if(thanhCong)
			 			saveFile(danhSachThuongHieuForm.getFile());
		 			
	 			}else danhSachThuongHieuForm.setThongBao("Thất bại");
	 			danhSachThuongHieuForm.setThongBao("Thêm thành công");
	 			return mapping.findForward("success");
		 	}else if("Xóa".equals(danhSachThuongHieuForm.getRequest())){
		 		
		 	}else if("Sửa".equals(danhSachThuongHieuForm.getRequest())){
		 		
		 	}
		 		
		 	
		return mapping.findForward("success");
	}
	private boolean saveFile(FormFile file) throws IOException{
	    //Get the servers upload directory real path name
		String filePath = getServlet().getServletContext().getRealPath("/") + "images";

	    //create the upload folder if not exists
	    File folder = new File(filePath);
	    if(!folder.exists()){
	    	folder.mkdir();
	    }

	    String fileName = file.getFileName();
        File newFile = new File(filePath, fileName);

        if(!newFile.exists()){
          FileOutputStream fos = new FileOutputStream(newFile);
          fos.write(file.getFileData());
          fos.flush();
          fos.close();
          return true;
        }
	    return false;
	}
}
