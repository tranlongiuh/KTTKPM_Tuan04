package com.tranlong.tuan4.quanlychuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tranlong.tuan4.quanlychuyenbay.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
	
	@Query(value = "SELECT * FROM maybay where tam_bay > ?", nativeQuery = true)
	List<MayBay> findAllByTamBay(Integer tamBay);
	
	@Query(value = "SELECT * FROM maybay where do_dai > ?1 and do_dai < ?2", nativeQuery = true)
	List<MayBay> findByTamBay(Integer tamBay1, Integer tamBay2);

	List<MayBay> findAllByLoaiLike(String loai);
}
