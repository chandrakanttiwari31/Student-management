package com.java.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.pojo.Student;
import com.java.rowmapper.studentrowmapper;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Student> loadAllStudent() {
		String sql = "select * from students";
		List<Student> studentData = jdbcTemplate.query(sql, new studentrowmapper());

		return studentData;
	}

	public void saveStudent(Student student) 
	{
 Object[] sql={
		student.getName(),
		student.getMobile(),
		student.getCountry()};
 
 
		String query="insert into students(name,mobile,country) values(?,?,?)";
		
		jdbcTemplate.update(query,sql);
		System.out.println("1 record inserted");
	}

	
	public Student getStudent(int id)
	{
		String sql="select * from students where id=?";
		Student student=jdbcTemplate.queryForObject(sql, new studentrowmapper(),id);
		return student;
	}
	
	public void update(Student student)
	{
		String sql="update students set name=?,mobile=?,country=? where id=?";
		jdbcTemplate.update(sql,student.getName(),student.getMobile(),student.getCountry(),student.getId());
		System.out.println("1 record updated");
	}
	
	public void delete(int id)
	{
		String sql="delete from students where id=?";
		jdbcTemplate.update(sql, id);
		
	}
	
}
