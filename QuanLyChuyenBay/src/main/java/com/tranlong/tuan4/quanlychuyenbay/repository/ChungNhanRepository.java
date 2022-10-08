package com.tranlong.tuan4.quanlychuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tranlong.tuan4.quanlychuyenbay.entity.NhanVien;

@Repository
public interface ChungNhanRepository extends JpaRepository<NhanVien, String>{

	@Query(value = " select distinct n.ma_nv from nhanvien n join chungnhan c on n.ma_nv = c.ma_nv join maybay m "
			+ " on c.ma_mb = m.ma_mb where m.loai like ?", nativeQuery = true)
	List<String> findNhanVienByLoaiMB(String loai);
}
