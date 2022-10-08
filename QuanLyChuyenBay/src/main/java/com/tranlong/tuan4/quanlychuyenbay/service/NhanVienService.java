package com.tranlong.tuan4.quanlychuyenbay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranlong.tuan4.quanlychuyenbay.entity.NhanVien;
import com.tranlong.tuan4.quanlychuyenbay.repository.NhanVienRepository;

@Service
public class NhanVienService {

	@Autowired
	NhanVienRepository repository;
	
	public List<NhanVien> getAllNhanVienByLuong(Integer luong){
		List<NhanVien> result = null;
		if (luong != null && luong >0) {
			result = repository.findByLuong(luong);
		}
		return result;
	}

	public Integer getSumSalary() {
		Integer rs = 0;
		rs = repository.sumLuong();
		return rs;
	}
	
	
}
