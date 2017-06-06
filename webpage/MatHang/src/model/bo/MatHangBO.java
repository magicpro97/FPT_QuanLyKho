package model.bo;

import java.util.ArrayList;

import model.bean.MatHang;
import model.dao.MatHangDAO;

public class MatHangBO {

	public ArrayList<MatHang> getDanhSachMatHang() {
		// TODO Auto-generated method stub
		MatHangDAO mHDAO=new MatHangDAO();
		return mHDAO.getDanhSachMatHang();
	}

}
