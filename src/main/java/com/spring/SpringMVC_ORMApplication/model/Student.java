package com.spring.SpringMVC_ORMApplication.model;

public class Student {

	private int studentId;
	private String studentName;
	private String email;
	private String Address;

	public Student(int studentId, String studentName, String email, String address) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		Address = address;
	}

	public Student() {

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", Address="
				+ Address + "]";
	}
}
