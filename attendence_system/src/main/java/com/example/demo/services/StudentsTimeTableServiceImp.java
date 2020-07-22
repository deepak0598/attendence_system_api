package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentsTimeTable;
import com.example.demo.modelforservices.StudentsTimeTableServiceModel;
import com.example.demo.repository.StudentsTimeTableRepo;


@Service
public class StudentsTimeTableServiceImp implements StudentsTimeTableService{

	@Autowired
	StudentsTimeTableRepo studentsTimeTableRepo;
	
	StudentsTimeTableServiceModel studentsTimeTableServiceModel=null;

	@Override
	public StudentsTimeTableServiceModel getTimeTable(int classId) {
		studentsTimeTableServiceModel=new StudentsTimeTableServiceModel();
		for(StudentsTimeTable studentstimeTable:studentsTimeTableRepo.findByClasseId(classId)) {
			
			do {
				studentsTimeTableServiceModel.setForClasse(studentstimeTable.getClasse().getClasseName());
			}while(false);
			
			if(!studentsTimeTableServiceModel.getDays().contains(studentstimeTable.getDay().getDayName()))
				studentsTimeTableServiceModel.getDays().add(studentstimeTable.getDay().getDayName());
			if(!studentsTimeTableServiceModel.getLectures().contains(studentstimeTable.getLecture().getLectureName()))
				studentsTimeTableServiceModel.getLectures().add(studentstimeTable.getLecture().getLectureName());
			
			switch(studentstimeTable.getDay().getDayName().toString()) {
			case "Mon":
					studentsTimeTableServiceModel.getMonSubjects().add(studentstimeTable.getSubject().getSubjectName());
					studentsTimeTableServiceModel.getMonTeachers().add(studentstimeTable.getTeacher().getTeacherName());
					break;
			case "Tue":
					studentsTimeTableServiceModel.getTueSubjects().add(studentstimeTable.getSubject().getSubjectName());
					studentsTimeTableServiceModel.getTueTeachers().add(studentstimeTable.getTeacher().getTeacherName());
					break;
			case "Wed":
					studentsTimeTableServiceModel.getWedSubjects().add(studentstimeTable.getSubject().getSubjectName());
					studentsTimeTableServiceModel.getWedTeachers().add(studentstimeTable.getTeacher().getTeacherName());
					break;
			case "Thu":
					studentsTimeTableServiceModel.getThuSubjects().add(studentstimeTable.getSubject().getSubjectName());
					studentsTimeTableServiceModel.getThuTeachers().add(studentstimeTable.getTeacher().getTeacherName());
					break;
			case "Fri":
					studentsTimeTableServiceModel.getFriSubjects().add(studentstimeTable.getSubject().getSubjectName());
					studentsTimeTableServiceModel.getFriTeachers().add(studentstimeTable.getTeacher().getTeacherName());
			}
		}
		return studentsTimeTableServiceModel;
	}
	
	

}
