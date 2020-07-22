package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TeachersTimeTable;

public interface TeachersTimeTableRepo  extends JpaRepository<TeachersTimeTable, Integer>{

}
