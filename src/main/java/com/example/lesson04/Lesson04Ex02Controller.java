package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.domain.Student;
import com.example.lesson04.service.StudentBO;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
	@Autowired
	private StudentBO studentBO;
	//가입화면
	//http://localhost/lesson04/ex02/add-student-view
	@GetMapping("/add-student-view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	//실제가입
	//http://localhost/lesson04/ex02/add-student
	@PostMapping("/add-student")
	public String addStudent(
			@ModelAttribute Student student, //form태그 name속성 값 = 필드와 일치 매핑
			Model model) {
		//DB insert
		studentBO.addStudent(student);
		//현재 insert한 학생 select
		Student newStudent= studentBO.getStudentById(student.getId());
		
		//select한 정보를 model에 담는다 
		model.addAttribute("student", newStudent);
		//가입된 정보 보여주는 화면으로 이동
		return "lesson04/afterAddStudent";
	}
}
