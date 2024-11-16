package com.adi.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adi.demo.dao.Alienrepo;
import com.adi.demo.model.Alien;

public class Aliencontroller 
{
	Alienrepo repo; 
	
	@RequestMapping("/")
    public String home() {
	 return "home.jsp";
   }
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) 
	{
		repo.save(alien);
	return "home.jsp";	
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
 //public  ModelAndView getAlien(@RequestParam int aid) 
	//{
		//ModelAndView mv =new ModelAndView("showAlien.jsp");
		//Alien alien = repo.findById(aid).orElse(new Alien());
		
		//System.out.println(repo.findByTech("java"));
		//System.out.println(repo.findByAidGreaterThan(102));
		//System.out.println(repo.findByTechSorted("Java"));
		
		
		//mv.addObject(alien);
	//return mv;}
	
	public String getAlien(@RequestParam int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien());
		return repo.findAll().toString();
	}
}

