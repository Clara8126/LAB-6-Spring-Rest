package com.greatLearning.studentManagement.controller;
import org.springframework.stereotype.Controller;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatLearning.studentManagement.model.Student;

@Controller
@RequestMapping("/students")

public class StudentController {

		@RequestMapping("/list")
		public String getAllBooks( Model theModel) {
			Student student = new Student();
			student.setLastname("Test Book");
			student.setFirstname("Tester");
			student.setCourse("Test");
			student.setCountry("Test");
			theModel.addAttribute("StudentModel", Collections.singletonList(student));
			return "studentlist";
		}

		@RequestMapping("/add")
		public String addStudent(Model theModel) {
			Student student = new Student();
			theModel.addAttribute("Student", student);
			return "studentsave";
		}

		@RequestMapping("/update")
		public String updateStudent(@RequestParam("id") int id,Model theModel) {
			Student student = new Student();
			student.setFirstname("Tester");
			student.setLastname("Test Book");
			student.setCourse("Test");
			student.setCountry("Test");
			theModel.addAttribute("Student", student);
			return "studentsave";
		}

		@RequestMapping("/delete")
		public String deleteStudent(@RequestParam("id") int id) {
			System.out.println(id);
			return "redirect:/students/list";
		}

		@RequestMapping("/save")
		public String saveStudent(@RequestParam("id") int id, 
	  @RequestParam("Firstname") String Firstname,
		@RequestParam("Lastname")String Lastname,
		@RequestParam("Course") String Course,
		@RequestParam("Country") String Country) {

			System.out.println(id+" "+Firstname+" "+Lastname+" "+Course +""+Country );
			return "redirect:/students/list";
		}
	
}
