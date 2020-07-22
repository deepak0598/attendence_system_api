package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentsAttendence;

public interface StudentsAttendenceRepo  extends JpaRepository<StudentsAttendence, Integer>{

}
