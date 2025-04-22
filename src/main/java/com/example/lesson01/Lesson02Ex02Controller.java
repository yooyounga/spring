package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//HTML로 보내는 컨트롤러
@Controller //ResponseBody가 있으면 안됨.
public class Lesson02Ex02Controller {
	//http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		//return 되는 string은 html의 경로이다.(@ResponseBody가 없을때)
		//lesson01/ex02 이렇게만 해도 됨.
		return "lesson01/ex02"; //Response html view 경로
	}
}
