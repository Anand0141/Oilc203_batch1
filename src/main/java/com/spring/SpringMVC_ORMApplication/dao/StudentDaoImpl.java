package com.spring.SpringMVC_ORMApplication.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.SpringMVC_ORMApplication.model.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public int createStudent(Student student) {
		int i = (int) hibernateTemplate.save(student);
		return i;
	}

	@Override
	public List<Student> getAllStudents() {
		return hibernateTemplate.loadAll(Student.class);
	}

	@Override
	public Student getStudentById(int studentId) {
		return hibernateTemplate.get(Student.class, studentId);
	}

	@Override
	public Student updateStudent(Student student, int studentId) {
		Student std = new Student();
		std.setStudentId(studentId);
		std.setStudentName(student.getStudentName());
		std.setEmail(student.getEmail());
		std.setAddress(student.getAddress());
		hibernateTemplate.update(std);
		return std;
	}

	@Override
	public void deleteStudent(int studentId) {
		hibernateTemplate.delete(studentId);
		
	}

}
