package com.training.spring.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

	@RequestMapping("/hi")
	public String getMapping() {
		return "utkarsh";			//  /utkarsh.jsp
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "success";			//  /success.jsp
	}
	
	@RequestMapping("/oracle")
	public String tom() {
		return "success";			//  /success.jsp
	}
}
