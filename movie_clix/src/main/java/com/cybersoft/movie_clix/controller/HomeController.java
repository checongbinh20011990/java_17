package com.cybersoft.movie_clix.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybersoft.movie_clix.entity.DTPhim;
import com.cybersoft.movie_clix.entity.Phim;
import com.cybersoft.movie_clix.repository.PhimRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	PhimRepository phimRepository;
	
	@Transactional
	@GetMapping("")
	public ModelAndView modelAndView() {
		ModelAndView andView = new ModelAndView("index");
		andView.addObject("abc", "Hello friend");
		
		
		for (DTPhim phim : phimRepository.getAllPhimById(1L)) {
			System.out.println(phim.getTen_phim());
		}
		
		return andView;
	}
	
}
