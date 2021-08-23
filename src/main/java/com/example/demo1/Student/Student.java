package com.example.demo1.Student;

public class Student {
	private Long id;
	private String firstName;
	
	public Student() {}
	
	public Student(Long id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}
	
	public Student(String firstName) {
		this.firstName = firstName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + "]";
	}
}
