package form;

import java.util.ArrayList;

import model.bean.ThuongHieu;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class DanhSachThuongHieuForm extends ActionForm{
	private FormFile file;
	private String maTH;
	private String tenTH;
	private String truSo;
	private String website;
	private String request;
	private String anhDaiDien;
	private String thongBao;
	private ArrayList<ThuongHieu> danhSachThuongHieu;
	
	
	public String getThongBao() {
		return thongBao;
	}

	public void setThongBao(String thongBao) {
		this.thongBao = thongBao;
	}

	public String getAnhDaiDien() {
		return anhDaiDien;
	}

	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String submit) {
		this.request = submit;
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

	public ArrayList<ThuongHieu> getDanhSachThuongHieu() {
		return danhSachThuongHieu;
	}

	public void setDanhSachThuongHieu(ArrayList<ThuongHieu> danhSachThuongHieu) {
		this.danhSachThuongHieu = danhSachThuongHieu;
	}

	public FormFile getFile() {
		return file;
	}

	public void setFile(FormFile file) {
		this.file = file;
	}
	
}
