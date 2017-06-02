package model.bean;

public class MatHang {
	private String MaMH;
	private String tenMH;
	private String maDM;
	private String maTH;
	private String tenTH;
	private String tenDM;
	private long giaNhap;
	private long giaBan;
	private String moTa;
	private String hSD;
	private String dVT;
	private String anhDaiDien;
	
	
	public MatHang(String maMH, String tenMH, String maDM, String maTH,
			String tenTH, String tenDM, long giaNhap, long giaBan, String moTa,
			String hSD, String dVT, String anhDaiDien) {
		super();
		MaMH = maMH;
		this.tenMH = tenMH;
		this.maDM = maDM;
		this.maTH = maTH;
		this.tenTH = tenTH;
		this.tenDM = tenDM;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.moTa = moTa;
		this.hSD = hSD;
		this.dVT = dVT;
		this.anhDaiDien = anhDaiDien;
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
	public String getdVT() {
		return dVT;
	}
	public void setdVT(String dVT) {
		this.dVT = dVT;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	public String getMaMH() {
		return MaMH;
	}
	public void setMaMH(String maMH) {
		MaMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
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
	public long getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(long giaNhapVao) {
		this.giaNhap = giaNhapVao;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBanRa) {
		this.giaBan = giaBanRa;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String gethSD() {
		return hSD;
	}
	public void sethSD(String hSD) {
		this.hSD = hSD;
	}
	
	

}
