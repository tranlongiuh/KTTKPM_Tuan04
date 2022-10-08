package com.tranlong.tuan4.quanlychuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tranlong.tuan4.quanlychuyenbay.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

	@Query(value = "SELECT * FROM nhanvien where luong > ?", nativeQuery = true)
	List<NhanVien> findByLuong(Integer luong);

	@Query(value = "SELECT SUM(luong) FROM nhanvien", nativeQuery = true)
	Integer sumLuong();
}
