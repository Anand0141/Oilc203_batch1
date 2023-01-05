package com.spring.SpringMVC_ORMApplication.dao;

import java.util.List;

import com.spring.SpringMVC_ORMApplication.model.Student;

public interface StudentDao {
	
	public int createStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getStudentById(int studentId);
	
	public Student updateStudent(Student student,int studentId);
	
	public void deleteStudent(int studentId);
	
}
