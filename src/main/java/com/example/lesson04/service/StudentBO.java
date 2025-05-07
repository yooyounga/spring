package com.example.lesson04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.Student;
import com.example.lesson04.mapper.StudentMapper;

@Service
public class StudentBO {
	@Autowired
	StudentMapper studentMapper;
	//input :Student객체가 넘어감.
	//output:void 또는 성공한 갯수
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}
	public Student getStudentById(int id) {
		return studentMapper.selectStudentById(id);
	}
}
