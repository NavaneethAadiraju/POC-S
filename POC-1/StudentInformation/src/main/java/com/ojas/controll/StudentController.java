package com.ojas.controll;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Student;
import com.ojas.service.StudentServices;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	StudentServices studentservices;
	
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student student) {
		return studentservices.createStudent(student);
	}
	@GetMapping("/getStudentsInfo")
	public Iterable<Student> getAllStudents() {
		return studentservices.getAllStudents();
	}
	@PutMapping("/update/{studentId}")
	public Student updateStudent(@PathVariable("studentId") Integer studentId,String newNumber,String newEmail) {
		return studentservices.updateStudent(studentId, newNumber, newEmail);
	}
	@GetMapping("/getstudent/{studentId}")
	public Optional<Student> getStudent (Integer studentId) {
		return studentservices.getStudent(studentId);
	}
}
