package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.entity;
import com.example.repository.repository;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class controller {
	
	@Autowired
	repository repo;
	
//	@PostMapping("/post")
//	String postData() {
//		return null;
//	}
	
	@GetMapping("/get")
	List<entity> lisOFEmp(){
		return repo.findAll();
	}

}
