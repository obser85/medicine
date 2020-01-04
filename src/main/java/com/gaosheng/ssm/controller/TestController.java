package com.gaosheng.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gaosheng.ssm.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping("/test")
	public void test(){
		System.out.println("in this method");
		service.test();
	}
}
