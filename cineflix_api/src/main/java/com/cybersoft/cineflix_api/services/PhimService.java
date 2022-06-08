package com.cybersoft.cineflix_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybersoft.cineflix_api.entity.Phim;
import com.cybersoft.cineflix_api.repository.PhimRepository;

@Service
public class PhimService implements PhimServiceImp {

	@Autowired
	PhimRepository phimRepository;
	
	@Override
	public List<Phim> getAllPhim() {
		// TODO Auto-generated method stub
		return phimRepository.findAll();
	}

}
