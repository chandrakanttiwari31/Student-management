package com.java.rowmapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.pojo.Student;

public class studentrowmapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
		
		Student s=new Student();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setMobile(rs.getLong("mobile"));
		s.setCountry(rs.getString("country"));
		
		return s;
	}
	
}
