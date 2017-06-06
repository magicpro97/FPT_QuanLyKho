package model.bean;

public class ThuongHieu {
	private String maTH;
	private String tenTH;
	private String anhDaiDien;
	private String truSo;
	private String website;
	public ThuongHieu(String maTH, String tenTH, String anhDaiDien,
			String truSo, String website) {
		super();
		this.maTH = maTH;
		this.tenTH = tenTH;
		this.anhDaiDien = anhDaiDien;
		this.truSo = truSo;
		this.website = website;
	}
	public String getMaTH() {
		return maTH;
	}
	public void setMaTH(String maTH) {
		this.maTH = maTH;
	}
	public String getTenTH() {
		return tenTH;
	}
	public void setTenTH(String tenTH) {
		this.tenTH = tenTH;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	public String getTruSo() {
		return truSo;
	}
	public void setTruSo(String truSo) {
		this.truSo = truSo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	
}
