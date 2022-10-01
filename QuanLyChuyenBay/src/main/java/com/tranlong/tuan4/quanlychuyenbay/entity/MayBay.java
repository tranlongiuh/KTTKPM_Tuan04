package com.tranlong.tuan4.quanlychuyenbay.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {

	@Id
	@Column(name = "ma_mb", nullable = false)
	private Integer ma;

	@Column(name = "loai")
	private String loai;

	@Column(name = "tam_bay")
	private Integer tamBay;

	@ManyToMany(mappedBy = "mayBayDuocLai")
	Set<NhanVien> nhanVienLai;

	public MayBay() {
		super();
	}

	public MayBay(Integer ma, String loai, Integer tamBay) {
		super();
		this.ma = ma;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public MayBay(Integer ma, String loai, Integer tamBay, Set<NhanVien> nhanVienLai) {
		super();
		this.ma = ma;
		this.loai = loai;
		this.tamBay = tamBay;
		this.nhanVienLai = nhanVienLai;
	}

	public Integer getMa() {
		return ma;
	}

	public void setMa(Integer ma) {
		this.ma = ma;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public Integer getTamBay() {
		return tamBay;
	}

	public void setTamBay(Integer tamBay) {
		this.tamBay = tamBay;
	}

	public Set<NhanVien> getNhanVienLai() {
		return nhanVienLai;
	}

	public void setNhanVienLai(Set<NhanVien> nhanVienLai) {
		this.nhanVienLai = nhanVienLai;
	}

	@Override
	public String toString() {
		return "MayBay [ma=" + ma + ", loai=" + loai + ", tamBay=" + tamBay + ", nhanVienLai=" + nhanVienLai + "]";
	}

}
