package com.example.demo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.api.services.beans.DemoUser;
import com.example.demo.dao.DemoRepository;

@Component
public class DemoService {

	@Autowired
	private DemoRepository repo;
	
	public List<DemoUser> getDemoUserByUserName(String userName) {
		
		List<DemoUser> result = null;
		
		result = repo.getUserByUserName(userName);
		
		return result;
	}
}
