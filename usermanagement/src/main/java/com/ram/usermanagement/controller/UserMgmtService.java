package com.ram.usermanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMgmtService {

	@GetMapping("/microservice/userManagement")
	public String getUserMgmtService() {
		return "Welcome to User Management Service";
	}
}
