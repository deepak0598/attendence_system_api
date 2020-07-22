package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoginDetails;

public interface LoginDetailsRepo extends JpaRepository<LoginDetails, Integer>{

}
