package com.java.Dao;

import java.util.List;

import com.java.pojo.Student;

public interface StudentDao {

	List<Student> loadAllStudent();
	void saveStudent(Student student);
	Student getStudent(int id);
	void update(Student student);
	void delete(int id);
	
}
