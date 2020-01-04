package com.gaosheng.ssm.mapper;

import com.gaosheng.ssm.domain.Person;

public interface PersonDao {
	
	//根据主键ID查询用户
	public Person findById(Integer id);
	
}
