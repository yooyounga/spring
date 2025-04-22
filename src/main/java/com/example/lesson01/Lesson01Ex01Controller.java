package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")//메소드위에 붙은 path보다 먼저 읽혀진다.
@Controller //spring bean으로 등록
public class Lesson01Ex01Controller {
	//http://localhost:8080/lesson01/ex01/1
	@RequestMapping("/1")
	@ResponseBody //리턴하는 값이 response body에 담겨서 간다=>html로 변환되어 간다. html로 변환해주는 것은 HttpMessageConverter해 처리해준다.
	public String ex01_1() {
		return "<h2>문자열을 Response body에 보내는 예제</h2>";
	}
	
	//http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	@ResponseBody //리턴하는 값이 response body에 담겨서 간다=>html로 변환되어 간다.
	public Map<String,Object> ex01_2() {
		Map<String,Object> fruits = new HashMap<>();
		fruits.put("사과", 5);
		fruits.put("오렌지", 3);
		fruits.put("키위", 10);
		
		//spring boot starter안에 있는 jackson라이브러리가 포함되어 있기 때문
		//map->json으로 변환됨.
		return fruits;
	}
}