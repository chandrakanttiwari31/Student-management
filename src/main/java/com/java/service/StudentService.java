package com.java.service;

import java.util.List;

import com.java.pojo.Student;

public interface StudentService {

	List<Student> loadAllStudent();
	void saveStudent(Student student);
	Student getStudent(int id);
	void update(Student student);
	void delete(int id);

	
}
