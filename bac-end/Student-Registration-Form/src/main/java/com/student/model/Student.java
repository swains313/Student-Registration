package com.student.model;

import org.hibernate.annotations.GenericGenerator;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT")
public class Student {
	
	
	@Id
	@GenericGenerator(name = "customgen", strategy ="com.student.model.StudentIdGenerator" )
	@GeneratedValue(generator = "customgen")
	private String regdId;
	

	private String name;
	
	private String dob;
	
	private String classs;
	
	private String division;
	
	private String gender;
	
	
	
	
	
	

}
