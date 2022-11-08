package com.greatlearning.student.studentmanagement.services;

import java.util.List;

import com.greatlearning.student.studentmanagement.model.Student;

public interface StudentService {
	List<Student> findAll();
	Student save(Student student);
	Student findById(int id);
	Student deleteById(int id);
}
