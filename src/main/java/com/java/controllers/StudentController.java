package com.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.Dao.StudentDao;
import com.java.pojo.Student;
import com.java.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/student")
	public String showStudent(Model model)
	{
		List<Student> s=studentservice.loadAllStudent();
	
		
		
		model.addAttribute("students",s);
		return "studentlist";
		
	}
	
	
	@GetMapping("/showaddStudent")
	public String showAddStudent(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		
		return "addStudent";
		
	}
	
	//saveStudent
	
	@PostMapping("/saveStudent")
	public String AddStudent(Student student)
	{
		
		
		if(student.getId()==0)
		{  // insert
			studentservice.saveStudent(student);
		}
		else
		{
			// do update
			studentservice.update(student);
		}
		
		
		return "redirect:/student";
		
	}
	
	
	

	@GetMapping("/updateStudent")
	public String showAddStudent(@RequestParam("userid") int id,Model model)
	{
		Student mystudent=studentservice.getStudent(id);
		System.out.println(mystudent);
		
		//setting the student information
		 //when wwe use @modelAttribute then we use the code below
//		student.setId(mystudent.getId());
//		student.setName(mystudent.getName());
//		student.setMobile(mystudent.getMobile());
//	student.setCountry(mystudent.getCountry());
		
		model.addAttribute("student",mystudent);
		
		return "addStudent";
		
	}

	//deleteStudent
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userid") int id)
	{
		studentservice.delete(id);
		return "redirect:/student";
	}
	
	
}
