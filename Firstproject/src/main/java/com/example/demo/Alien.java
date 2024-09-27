package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")  // use to count number of printing a values
public class Alien {
	 private int aid;
	 private String aname;
	 private String tech;
	 @Autowired // used to link the two different objects 
	 
	  @Qualifier("laptop") // used as find by name of certain things
	 private  laptop laptop1;
	 
	 
	public Alien() {
		super();
		System.out.println("Object Created ");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	
	public laptop getLaptop1() {
		return laptop1;
	}
	public void setLaptop1(laptop laptop1) {
		this.laptop1 = laptop1;
	}
	public void show() {
		System.out.println("in show");
		laptop1.compile();
	}

}
