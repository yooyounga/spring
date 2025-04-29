package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.service.UserBO;

@RequestMapping("/lesson04/ex01")
@Controller //html 화면으로 이동하므로 @RestController X,@ResponseBoby X
public class Lesson04Ex01Controller {
	@Autowired
	private UserBO userBO;
	/*
	Request ->Response
	
	@ResponseBoby return String => HttpMessageConverter=>Html
	@ResponseBoby return 객체 => HttpMessageConverter=>Jackson=>JSON
	  X           return String =>ViewResolver(경로)=>html
	
	*/
	//회원가입 화면
	//http://localhost/lesson04/ex01/add-user-view
	//@RequestMapping("/add-user-view")
	@RequestMapping(path="/add-user-view", method= RequestMethod.GET)
	public String addUserView() {
		return "lesson04/addUser";
	}
	//회원가입처리
	@PostMapping("/add-user")
	public String addUser(
		@RequestParam("name") String name
		,@RequestParam("yyyymmdd") String yyyymmdd
		,@RequestParam("email") String email
		,@RequestParam(value="introduce", required = false) String introduce
		) {
		//db insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		return "lesson04/afterAddUser";
	}
}
