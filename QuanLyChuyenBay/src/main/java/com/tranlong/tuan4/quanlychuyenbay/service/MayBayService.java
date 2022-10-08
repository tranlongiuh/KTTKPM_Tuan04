package com.tranlong.tuan4.quanlychuyenbay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranlong.tuan4.quanlychuyenbay.entity.MayBay;
import com.tranlong.tuan4.quanlychuyenbay.repository.MayBayRepository;

@Service
public class MayBayService {

	@Autowired
	MayBayRepository repository;

	public List<MayBay> findAllByTamBay(Integer tamBay) {
		List<MayBay> result = null;
		if (tamBay != null && tamBay > 0) {
			result = repository.findAllByTamBay(tamBay);
		} else {
			System.out.println("Khong tim thay diem den " + tamBay);
		}
		return result;
	}

	public List<MayBay> getAllChuyenBayBettwen(Integer tamBay1, Integer tamBay2) {
		List<MayBay> result = null;
		if (tamBay1 != null && tamBay1 > 0 && tamBay2 != null && tamBay2 > tamBay1) {
			result = repository.findByTamBay(tamBay1, tamBay2);
		}
		return result;
	}

	public List<MayBay> getAllMayBayByLoai(String loai) {
		List<MayBay> result = null;
		if (loai != null && loai.length() > 0) {
			result = repository.findAllByLoaiLike("%" + loai + "%");
		} else {
			System.out.println("Khong tim thay loai " + loai);
		}
		return result;
	}

}


