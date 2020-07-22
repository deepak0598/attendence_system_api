package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.LoginDetails;
import com.example.demo.repository.LoginDetailsRepo;

@RestController
@RequestMapping("/authenticate")
public class LoginController {
	
	@Autowired
	LoginDetailsRepo loginDetailsRepo;
	
	@GetMapping("/user")
	public List<LoginDetails> authUser() {
		return loginDetailsRepo.findAll();
	}
}
