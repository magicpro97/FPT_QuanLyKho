package form;

import java.util.ArrayList;

import model.bean.DanhMucHang;
import model.bean.MatHang;
import model.bean.ThuongHieu;
import model.bo.DanhMucHangBO;
import model.bo.MatHangBO;
import model.bo.ThuongHieuBO;

import org.apache.struts.action.ActionForm;

public class DanhSachMatHangForm extends ActionForm{
	MatHangBO mHBO=new MatHangBO();
	private ArrayList<DanhMucHang> danhSachDanhMuc=(new DanhMucHangBO()).getDanhSachDanhMuc();
	private ArrayList<ThuongHieu> danhSachThuongHieu=(new ThuongHieuBO()).getDanhSachThuongHieu("images/");
	private ArrayList<MatHang> danhSachMatHang=mHBO.getDanhSachMatHang();
	private String maMH;
	private String tenMH;
	private String maDM;
	private String maTH;
	private long giaNhap;
	private long giaBan;
	private String dVT;
	private String moTa;
	private String tenTH;
	private String tenDM;
	
	public String getTenTH() {
		return tenTH;
	}

	public void setTenTH(String tenTH) {
		this.tenTH = tenTH;
	}

	public String getTenDM() {
		return tenDM;
	}

	public void setTenDM(String tenDM) {
		this.tenDM = tenDM;
	}

	public String getTenMH() {
		return tenMH;
	}
	
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public String getMaDM() {
		return maDM;
	}

	public void setMaDM(String maDM) {
		this.maDM = maDM;
	}

	public String getMaTH() {
		return maTH;
	}

	public void setMaTH(String maTH) {
		this.maTH = maTH;
	}
	
	public DanhSachMatHangForm(){
		super();
	}
	
	public ArrayList<DanhMucHang> getDanhSachDanhMuc() {
		return danhSachDanhMuc;
	}
	public void setDanhSachDanhMuc(ArrayList<DanhMucHang> danhSachDanhMuc) {
		this.danhSachDanhMuc = danhSachDanhMuc;
	}
	public ArrayList<ThuongHieu> getDanhSachThuongHieu() {
		return danhSachThuongHieu;
	}
	public void setDanhSachThuongHieu(ArrayList<ThuongHieu> danhSachThuongHieu) {
		this.danhSachThuongHieu = danhSachThuongHieu;
	}
	public ArrayList<MatHang> getDanhSachMatHang() {
		return danhSachMatHang;
	}
	public void setDanhSachMatHang(ArrayList<MatHang> danhSachMatHang) {
		this.danhSachMatHang = danhSachMatHang;
	}
	public String getMaMH() {
		return maMH;
	}
	public void setMaMH(String maMH) {
		this.maMH = maMH;
	}
	public long getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(long giaNhap) {
		this.giaNhap = giaNhap;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	public String getdVT() {
		return dVT;
	}
	public void setdVT(String donVi) {
		this.dVT = donVi;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
}
