package model.bo;

import java.util.ArrayList;

import model.bean.ThuongHieu;
import model.dao.ThuongHieuDAO;

public class ThuongHieuBO {

	public ArrayList<ThuongHieu> getDanhSachThuongHieu(String  path) {
		// TODO Auto-generated method stub
		return (new ThuongHieuDAO()).getDanhSachThuongHieu(path);
	}

	public boolean them(String maTH, String tenTH, String anhDaiDien,
			String truSo, String website) {
		// TODO Auto-generated method stub
		return (new ThuongHieuDAO()).them(maTH,tenTH,anhDaiDien,truSo,website);
	}

}
