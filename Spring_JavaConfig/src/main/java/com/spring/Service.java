package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	
	@Autowired
	Dao dao;
	
	public void save() {
		dao.create();
	}

}
