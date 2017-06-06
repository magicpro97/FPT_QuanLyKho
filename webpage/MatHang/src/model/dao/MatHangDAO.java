package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;











import model.bean.DanhMucHang;
import model.bean.MatHang;
import model.bean.ThuongHieu;

public class MatHangDAO {
	static Connection connect(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=NhapXuatKho; User=Kai;Password=0987654#@!");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e)  {
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<MatHang> getDanhSachMatHang() {
		ArrayList<MatHang> danhSach =new ArrayList<MatHang>();
		Connection con = connect();
		if(con==null) return danhSach;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select M.*,T.TenTH,D.TenDM from MATHANG M inner join THUONGHIEU T ON M.MaTH=T.MaTH INNER JOIN DMHANG D ON D.MaDM=M.MaDM");
			while(rs.next())
				danhSach.add(new MatHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(11), rs.getString(12), rs.getLong(8), rs.getLong(9), rs.getString(10),rs.getString(7),rs.getString(6),null));
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


	public static void main(String[] args) {
		MatHangDAO mh =new MatHangDAO();
		connect();
		System.out.println("1"+mh+"1");
	}
}
