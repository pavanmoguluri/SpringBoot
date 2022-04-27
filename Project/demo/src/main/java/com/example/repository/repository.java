package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.entity;

@Repository
public interface repository extends JpaRepository<entity,String>{
	
	List<entity> findAll();
	List<entity> save();
		
	}