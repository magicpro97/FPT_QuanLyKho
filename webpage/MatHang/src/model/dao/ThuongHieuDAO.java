package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.ThuongHieu;

public class ThuongHieuDAO {

	public ArrayList<ThuongHieu> getDanhSachThuongHieu(String path) {
		ArrayList<ThuongHieu> danhSach =new ArrayList<ThuongHieu>();
		Connection con = MatHangDAO.connect();
		if(con==null) return danhSach;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select *from THUONGHIEU");
			while(rs.next())
				danhSach.add(new ThuongHieu(rs.getString(1), rs.getString(2),path+rs.getString(3),rs.getString(4),rs.getString(5)) );
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

	public boolean them(String maTH, String tenTH, String anhDaiDien,
			String truSo, String website) {
		// TODO Auto-generated method stub
		Connection con = MatHangDAO.connect();
		if(con==null) return false;
		String sql=	String.format("INSERT INTO THUONGHIEU"+
				" VALUES ( '%s',N'%s','%s',N'%s','%s' )", maTH, tenTH, anhDaiDien, truSo, website);
		try{
			Statement stmt = con.createStatement();
			if(stmt.executeUpdate(sql)<0)
				return false;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

}
