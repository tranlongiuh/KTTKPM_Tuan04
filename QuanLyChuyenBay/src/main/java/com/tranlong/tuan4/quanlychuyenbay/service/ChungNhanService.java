package com.tranlong.tuan4.quanlychuyenbay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tranlong.tuan4.quanlychuyenbay.repository.ChungNhanRepository;

@Service
public class ChungNhanService {

	@Autowired
	ChungNhanRepository repository;

	public List<String> getMaNhanVienByLoaiMB(String loai) {
		loai = "%" + loai + "%";
		return repository.findNhanVienByLoaiMB(loai);
	}

}
