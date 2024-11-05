package com.adi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adi.demo.dao.AlienRepo;
import com.adi.demo.model.alien;
public class AlienController {
	
	@Controller
	public class Aliencontroller
	{   
		
		@Autowired
		AlienRepo repo;
		
		@RequestMapping("/")
		public String home( ) {s
			return "home.jsp";
		}
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(alien alien ) {
		
		CrudRepository<com.adi.demo.model.alien, Integer> repo = null;
		repo.save(alien);
		return "home.jsp";
	}

}
