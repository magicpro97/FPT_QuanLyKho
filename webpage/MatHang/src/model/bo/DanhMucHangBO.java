package model.bo;

import java.util.ArrayList;

import model.bean.DanhMucHang;
import model.dao.DanhMucHangDAO;

public class DanhMucHangBO {

	public ArrayList<DanhMucHang> getDanhSachDanhMuc() {
		// TODO Auto-generated method stub
		return (new DanhMucHangDAO()).getDanhSachDanhMuc();
	}

}
