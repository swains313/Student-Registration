package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;

public interface StudentRepo extends JpaRepository<Student, String>{
	
	List<Student> findAllByOrderByNameAsc();

}
