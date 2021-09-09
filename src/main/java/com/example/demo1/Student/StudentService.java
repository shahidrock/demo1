package com.example.demo1.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	public void addNewStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(Long id) {		
		studentRepository.deleteById(id);
	}
}
