package com.ojas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.StudentDao;
import com.ojas.model.Student;
@Service
public class StudentServices {
	
	@Autowired
	StudentDao std;
	
	public Student createStudent(Student student) {
		return std.save(student);
	}
	public Iterable<Student> getAllStudents() {
		return std.findAll();
	}
	public Optional<Student> getStudent (Integer studentId) {
		return std.findById(studentId);
	}
	public Student updateStudent(Integer studentId,String newNumber,String newEmail) {
		Student student = std.findById(studentId).orElse(new Student());
		student.setPhNumber(newNumber);
		student.setEmail(newEmail);
		return std.save(student);
	}
}
