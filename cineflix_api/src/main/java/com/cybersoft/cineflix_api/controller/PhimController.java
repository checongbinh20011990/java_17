package com.cybersoft.cineflix_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybersoft.cineflix_api.entity.Phim;
import com.cybersoft.cineflix_api.services.PhimServiceImp;

@RestController
@RequestMapping("/phim")
public class PhimController {
	
	@Autowired
	PhimServiceImp phimServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getAllPhim(){
		List<Map<String, ?>> listPhim = phimServiceImp.getAllPhim();
		
		return new ResponseEntity<List<Map<String, ?>>>(listPhim, HttpStatus.OK);
	}
	
	@GetMapping("/{id_quocgia}")
	public ResponseEntity<?> getPhimByQuocGia(@PathVariable("id_quocgia") int id_quocgia){
		List<Map<String, ?>> listPhim = phimServiceImp.getPhimByQuocGia(id_quocgia);
		
		return new ResponseEntity<List<Map<String, ?>>>(listPhim, HttpStatus.OK);
	}
	
}
