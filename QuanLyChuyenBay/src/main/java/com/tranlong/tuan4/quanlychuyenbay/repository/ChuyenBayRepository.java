package com.tranlong.tuan4.quanlychuyenbay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tranlong.tuan4.quanlychuyenbay.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {

	List<ChuyenBay> findByGaDen(String gaDen);

	@Query(value = "SELECT * FROM chuyenbay cb where cb.ga_di = ?1 and cb.ga_den = ?2", nativeQuery = true)
	List<ChuyenBay> findByGaDiAndGaDen(String gaDi, String gaDen);

	@Query(value = "SELECT * FROM chuyenbay cb where cb.do_dai > ?1 and cb.do_dai < ?2", nativeQuery = true)
	List<ChuyenBay> findByBetween(Integer doDai1, Integer doDai2);

	List<ChuyenBay> findByGaDi(String gaDi);
}
