package com.cybersoft.cineflix_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cybersoft.cineflix_api.entity.Phim;
import com.cybersoft.cineflix_api.services.FileSystemStorageServiceImp;
import com.cybersoft.cineflix_api.services.PhimServiceImp;

@RestController
@RequestMapping("/phim")
public class PhimController {
	
	@Autowired
	PhimServiceImp phimServiceImp;
	
	@Autowired
	FileSystemStorageServiceImp fileSystemStorageServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getAllPhim(){
		List<Map<String, ?>> listPhim = phimServiceImp.getAllPhim();
		//Cach 1
		//jackjson, gson String
		// localhost:8080/file
		//ten_loai, ten_phim, hinh_anh, sevetletContext
		
		//Cach 2
		//Duyệt listPhim
		//sevetletContext, / localhost:8080/file/hinh_anh
		//Lấy giá trị của hình ảnh và gán ngược lại
		
		return new ResponseEntity<List<Map<String, ?>>>(listPhim, HttpStatus.OK);
	}
	
	@GetMapping("/{id_quocgia}")
	public ResponseEntity<?> getPhimByQuocGia(@PathVariable("id_quocgia") int id_quocgia){
		List<Map<String, ?>> listPhim = phimServiceImp.getPhimByQuocGia(id_quocgia);
		
		return new ResponseEntity<List<Map<String, ?>>>(listPhim, HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> insertPhim(
			@RequestParam("file") MultipartFile file,
			@RequestParam("tenphim") String tenphim,
			@RequestParam("mota") String mota
			){
		
		fileSystemStorageServiceImp.init();
		if(fileSystemStorageServiceImp.saveFile(file)) {
			Phim phim = new Phim();
			phim.setTen_phim(tenphim);
			phim.setMo_ta(mota);
			phim.setHinh_anh(file.getOriginalFilename());
			
			phimServiceImp.insertPhim(phim);
		}
		
		
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
}
