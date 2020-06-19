package com.spring.exam.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.exam.sys.model.User;
import com.spring.exam.sys.service.HomeService;

@Controller
public class HomController {
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/")
	public String index() {
//		User user = homeService.getUserById("1");
		return "index.html";
	}
}
