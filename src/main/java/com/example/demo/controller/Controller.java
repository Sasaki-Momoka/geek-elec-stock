package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.form.SigninForm;


public class Controller {

	@GetMapping("/signin")
	public String signin(Model model) {
		model.addAttribute("signinForm", new SigninForm());

		return "signin";
	}
	
	
	
}
