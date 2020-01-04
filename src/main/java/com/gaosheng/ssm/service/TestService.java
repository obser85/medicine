package com.gaosheng.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaosheng.ssm.mapper.PersonDao;

@Service
public class TestService {
	
	@Autowired
	private PersonDao personDao;

	public void test(){
		System.out.println("in service method");
		System.out.println(personDao.findById(16));
	}
}
