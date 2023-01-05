package com.spring.SpringMVC_ORMApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringMVC_ORMApplication.dao.StudentDao;
import com.spring.SpringMVC_ORMApplication.model.Student;

@Service
public class StudentServiceImpl implements StudentDao {

	@Autowired
	private StudentDao dao;
	
	public int createStudent(Student student) {
		return dao.createStudent(student);
		 
	}

	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	@Override
	public Student getStudentById(int studentId) {
		return dao.getStudentById(studentId);
	}

	@Override
	public Student updateStudent(Student student, int studentId) {
		return dao.updateStudent(student, studentId);
	}

	@Override
	public void deleteStudent(int studentId) {
		dao.deleteStudent(studentId);
		
	}

	

}
