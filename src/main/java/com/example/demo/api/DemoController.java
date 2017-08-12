package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.services.DemoService;
import com.example.demo.api.services.beans.DemoUser;

@RestController
public class DemoController {

	@Autowired
	private DemoService service;
	
	@RequestMapping(path = "/getUser/{userName}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<DemoUser> greeting(@PathVariable String userName) {

		DemoUser result = service.getDemoUserByUserName(userName).get(0);
		
		return ResponseEntity.ok(result);
	}
}
