package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.DanhMucHang;

public class DanhMucHangDAO {

	public ArrayList<DanhMucHang> getDanhSachDanhMuc() {
		ArrayList<DanhMucHang> danhSach =new ArrayList<DanhMucHang>();
		Connection con = MatHangDAO.connect();
		if(con==null) return danhSach;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select *from DMHANG");
			while(rs.next())
				danhSach.add(new DanhMucHang(rs.getString(1), rs.getString(2)) );
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		return danhSach;
	}

}
