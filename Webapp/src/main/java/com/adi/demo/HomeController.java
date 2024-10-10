package com.adi.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

public class HomeController {
	
	@RequestMapping("Home")  
	public String home(HttpServletRequest req,HttpServeletReaponse res) {
		HttpSession session = req.getSession()
		String name = req.getParameter("name");
		System.out.println("Hiiiii+ name");
		session.setAttribute(name, name);
		return "Home.jsp";
	}

}
