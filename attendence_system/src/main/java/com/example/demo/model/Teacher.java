package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name="teacher")
@Table(name="teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacherId;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="loginDetailsId",nullable = false)
	private LoginDetails loginDetails;
	
	@JoinTable(
			name="teachersubjects",
			joinColumns=@JoinColumn(name="teacherId",referencedColumnName = "teacherId"),
			inverseJoinColumns = @JoinColumn(name="subjectId",referencedColumnName = "subjectId")
			)
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Subject> subject=new ArrayList<>();
	
	@Column(nullable = false)
	private String teacherName;
	
	@Column(nullable = false)
	private String teacherGender;
	
	@Column(nullable = false)
	private String teacherEmail;
	
	@Column(nullable = false)
	private int teacherPhone;
	
	@Column(nullable = false)
	private String teacherAddress;
}
