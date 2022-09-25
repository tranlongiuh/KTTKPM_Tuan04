package com.tranlong.tuan4.quanlychuyenbay.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "nhanvien")
public class NhanVien {

	@Id
	@Column(name = "MaNV", nullable = false)
	private String ma;

	@Column(name = "Ten")
	private String ten;

	@Column(name = "Luong")
	private Integer luong;

	@ManyToMany
	@JoinTable(name = "chungnhan", joinColumns = @JoinColumn(name = "MaNV"), inverseJoinColumns = @JoinColumn(name = "MaMB"))
	Set<MayBay> mayBayDuocLai;

	public NhanVien() {
		super();
	}

	public NhanVien(String ma, String ten, Integer luong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.luong = luong;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Integer getLuong() {
		return luong;
	}

	public void setLuong(Integer luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "NhanVien [ma=" + ma + ", ten=" + ten + ", luong=" + luong + "]";
	}

}
