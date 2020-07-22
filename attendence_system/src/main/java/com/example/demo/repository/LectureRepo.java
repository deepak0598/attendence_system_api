package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Lecture;

public interface LectureRepo  extends JpaRepository<Lecture, Integer>{

}
