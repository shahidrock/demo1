package com.example.demo1.Student;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return Arrays.asList(new Student(1L, "john Doe"));
	}
}
