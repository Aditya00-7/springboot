package com.adi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller

public class HomeController {
	
	@RequestMapping("Home")  
	//public String home(@RequestParam("name")String myname,HttpSession session) 
	public ModelAndView home(@RequestParam("name")String myname)
	{
	
		ModelAndView mv = new  ModelAndView();
		mv.addObject("name",myname);
		mv.setViewName("Home");
		//System.out.println("Hiiiii+ myname");
		//session.setAttribute("name", myname);
		return mv;
	}

}
