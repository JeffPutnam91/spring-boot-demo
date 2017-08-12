package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.api.services.beans.DemoUser;
import com.example.demo.api.services.mappers.DemoUserRowMapper;

@Component
public class DemoRepository {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public List<DemoUser> getUserByUserName(String userName) {
		
		List<DemoUser> demoUser = null;
	
		demoUser = jdbcTemplate.query("SELECT * FROM user WHERE username = ?", 
				new Object[]{userName}, new DemoUserRowMapper());
		return demoUser;
	}
}
