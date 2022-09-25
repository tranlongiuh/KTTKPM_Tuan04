package com.tranlong.tuan4.quanlychuyenbay.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	@Column(name = "MaCB", nullable = false)
	private String ma;

	@Column(name = "GaDi")
	private String gaDi;

	@Column(name = "GaDen")
	private String gaDen;

	@Column(name = "DoDai")
	private Integer doDai;

	@Column(name = "GioDi")
	private Time gioDi;

	@Column(name = "GioDen")
	private Time gioDen;

	@Column(name = "ChiPhi")
	private Integer chiPhi;

	public ChuyenBay() {
		super();
	}

	public ChuyenBay(String ma, String gaDi, String gaDen, Integer doDai, Time gioDi, Time gioDen, Integer chiPhi) {
		super();
		this.ma = ma;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getGaDi() {
		return gaDi;
	}

	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}

	public String getGaDen() {
		return gaDen;
	}

	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}

	public Integer getDoDai() {
		return doDai;
	}

	public void setDoDai(Integer doDai) {
		this.doDai = doDai;
	}

	public Time getGioDi() {
		return gioDi;
	}

	public void setGioDi(Time gioDi) {
		this.gioDi = gioDi;
	}

	public Time getGioDen() {
		return gioDen;
	}

	public void setGioDen(Time gioDen) {
		this.gioDen = gioDen;
	}

	public Integer getChiPhi() {
		return chiPhi;
	}

	public void setChiPhi(Integer chiPhi) {
		this.chiPhi = chiPhi;
	}

	@Override
	public String toString() {
		return "ChuyenBay [ma=" + ma + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi=" + gioDi
				+ ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}

}
