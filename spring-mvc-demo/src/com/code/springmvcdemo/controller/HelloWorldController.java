package com.code.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//mrthod to show initial Html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form"; 
	}
	//method for process the HTML form.
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutOut(HttpServletRequest request, Model model) {
		String Studentname  = request.getParameter("name");
		
		Studentname = Studentname.toUpperCase();
		
		String result = "yo !" + Studentname;
		
		model.addAttribute("result", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(HttpServletRequest request,@RequestParam("name") String StudentName , Model model) {
		
		StudentName = StudentName.toUpperCase();
		
		String result = "Heyyy V3 " + StudentName;
		
		model.addAttribute("result", result);
		
		return "helloworld";
	}
	
}

