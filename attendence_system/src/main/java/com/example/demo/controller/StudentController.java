package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelforservices.StudentsTimeTableServiceModel;
import com.example.demo.services.StudentsTimeTableServiceImp;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentsTimeTableServiceImp studentsTimeTableServiceImp;

	
	@GetMapping("/timetable/{classeId}")
	public StudentsTimeTableServiceModel getStudentsTimeTable(@PathVariable int classeId){
		StudentsTimeTableServiceModel studentsTimeTableServiceModel=studentsTimeTableServiceImp.getTimeTable(classeId);
		return studentsTimeTableServiceModel;
	}

}
