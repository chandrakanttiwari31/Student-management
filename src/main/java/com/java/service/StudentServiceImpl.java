package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Dao.StudentDao;
import com.java.pojo.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public List<Student> loadAllStudent() {
	List<Student> s=studentDao.loadAllStudent();
		return s;
	}

	public void saveStudent(Student student) {

     studentDao.saveStudent(student);

	}
	
	public Student getStudent(int id)
	{
		Student student=studentDao.getStudent(id);
		return student;
	}

	public void update(Student student)
	{
		
		studentDao.update(student);
	}
	
	
	public void delete(int id)
	{
		studentDao.delete(id);
	}
}
