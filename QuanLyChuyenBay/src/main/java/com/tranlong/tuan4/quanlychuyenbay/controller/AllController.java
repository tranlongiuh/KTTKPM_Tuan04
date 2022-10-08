package com.tranlong.tuan4.quanlychuyenbay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tranlong.tuan4.quanlychuyenbay.entity.ChuyenBay;
import com.tranlong.tuan4.quanlychuyenbay.entity.MayBay;
import com.tranlong.tuan4.quanlychuyenbay.entity.NhanVien;
import com.tranlong.tuan4.quanlychuyenbay.service.ChuyenBayService;
import com.tranlong.tuan4.quanlychuyenbay.service.MayBayService;
import com.tranlong.tuan4.quanlychuyenbay.service.NhanVienService;

@RequestMapping("/chuyen-bay")
@RestController
public class AllController {

	@Autowired
	MayBayService mayBayService;

	@Autowired
	ChuyenBayService chuyenBayService;

	@Autowired
	NhanVienService nhanVienService;

	// 1. Cho biết các chuyến bay đi Đà Lạt (DAD).
	@GetMapping("/cau1/{gaDen}")
	public List<ChuyenBay> cau1(@PathVariable String gaDen) {
		return chuyenBayService.getAllChuyenBayByGaDen(gaDen);
	}

	// 2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@GetMapping("/cau2/{tamBay}")
	public List<MayBay> cau2(@PathVariable Integer tamBay) {
		return mayBayService.findAllByTamBay(tamBay);
	}

	// 3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@GetMapping("/cau3/{luong}")
	public List<NhanVien> cau3(@PathVariable Integer luong) {
		return nhanVienService.getAllNhanVienByLuong(luong);
	}

	// 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn
	// 8.000km.
	@GetMapping("/cau4/{doDai1}/{doDai2}")
	public List<ChuyenBay> cau4(@PathVariable Integer doDai1, @PathVariable Integer doDai2) {
		return chuyenBayService.getAllChuyenBayBetween(doDai1, doDai2);
	}

	// 5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@GetMapping("/cau5/{gaDi}/{gaDen}")
	public List<ChuyenBay> cau5(@PathVariable String gaDi, @PathVariable String gaDen) {
		return chuyenBayService.getAllChuyenBay(gaDi, gaDen);
	}

	//	6.	Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@GetMapping("/cau6/{gaDi}")
	public List<ChuyenBay> cau6(@PathVariable String gaDi) {
		return chuyenBayService.getAllChuyenBayByGaDi(gaDi);
	}
	
	//	7.	Có bao nhiêu loại máy báy Boeing.
	@GetMapping("/cau7/{loai}")
	public List<MayBay> cau7(@PathVariable String loai) {
		return mayBayService.getAllMayBayByLoai(loai);
	}
	//	8.	Cho biết tổng số lương phải trả cho các nhân viên.
	@GetMapping("/cau8")
	public Integer cau8() {
		return nhanVienService.getSumSalary();
	}
//	9.	Cho biết mã số của các phi công lái máy báy Boeing.
//	10.	Cho biết các nhân viên có thể lái máy bay có mã số 747.
//	11.	Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
//	12.	Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
//	13.	Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
//	14.	Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320.
//	15.	Cho biết tên của các phi công lái máy bay Boeing.
//	16.	Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
//	17.	Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
//
//	18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
//	19.	Với mỗi ga có chuyến  bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.
//	20.	Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
//	21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
//	22.	Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
//	23.	Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
//	24.	Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
//	25.	Tìm các nhân viên không phải là phi công.
//	26.	Cho biết mã số của các nhân viên có lương cao nhất.
//	27.	Cho biết tổng số lương phải trả cho các phi công.
//	28.	Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.
}
