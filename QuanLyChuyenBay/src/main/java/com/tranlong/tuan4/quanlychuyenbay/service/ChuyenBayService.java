package com.tranlong.tuan4.quanlychuyenbay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranlong.tuan4.quanlychuyenbay.entity.ChuyenBay;
import com.tranlong.tuan4.quanlychuyenbay.repository.ChuyenBayRepository;

@Service
public class ChuyenBayService {

	@Autowired
	ChuyenBayRepository repository;

	public List<ChuyenBay> getAllChuyenBayByGaDen(String gaDen) {
		List<ChuyenBay> result = null;
		if (gaDen != null && gaDen.length() > 0) {
			result = repository.findByGaDen(gaDen);
		} else {
			System.out.println("Khong tim thay diem den " + gaDen);
		}
		return result;

	}

	public List<ChuyenBay> getAllChuyenBay(String gaDi, String gaDen) {
		List<ChuyenBay> result = null;
		if (gaDi != null && gaDi.length() > 0 && gaDen != null && gaDen.length() > 0) {
			result = repository.findByGaDiAndGaDen(gaDi, gaDen);
		}
		return result;
	}

	public List<ChuyenBay> getAllChuyenBayBetween(Integer doDai1, Integer doDai2) {
		List<ChuyenBay> result = null;
		if (doDai1 != null && doDai1 > 0 && doDai2 != null && doDai2 > doDai1) {
			result = repository.findByBetween(doDai1, doDai2);
		}
		return result;
	}

}
