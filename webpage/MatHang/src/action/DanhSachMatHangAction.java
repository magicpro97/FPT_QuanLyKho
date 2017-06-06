package action;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.MatHang;
import model.bo.MatHangBO;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachMatHangForm;

public class DanhSachMatHangAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		/*DanhSachMatHangForm danhSachMatHangForm = (DanhSachMatHangForm)form;
		
		danhSachMatHangForm.setDanhSachDanhMuc(new Pair[]{new Pair("A001","Kẹo"),new Pair("A002","Banh")});
		
		danhSachMatHangForm.setDanhSachThuongHieu(new Pair[]{new Pair("TH001","Kinh ĐÔ"),new Pair("TH002","Ông nội Kinh Đô")});
		
		MatHangBO mHBO=new MatHangBO();
		danhSachMatHangForm.setDanhSachMatHang(mHBO.getDanhSachMatHang());
		*/
		return mapping.findForward("dSMH");
		
	}
}
