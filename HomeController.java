package com.jdbctemp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdbctemp.model.emp2;
import com.jdbctemp.service.emp2Service;
@Controller
public class HomeController{
	@Autowired
	emp2Service emp2Service;
	@RequestMapping("/home")
	String home()
	{
		return "home";
	}
	@RequestMapping("/listemployees")
	String getStudents(Model model) {
		   List<emp2> list = emp2Service.getALLEmployees();
		   System.out.println(list);
		   model.addAttribute("listemp", list);
		   return "listemployees";
	   }
	   
	}
	
	

