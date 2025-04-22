package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController //@Controller+@ResponseBpdy
public class Lesson01Ex01RestController {

	//http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h2>RestController로 String 리턴</h2>";
	}
	
	@RequestMapping("/4")
	public Map<String ,String> ex01_4() {
		Map<String,String> test=new HashMap<>();
		test.put("박보검", "잘생겼다");
		test.put("변우석", "멋있다");
		
		return test;
	}
	@RequestMapping("/5")
	public Data ex01_5() {
		Data oData=new Data();
		oData.setId(1);
		oData.setName("유영아");
		
		return oData;
	}
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data oData=new Data();
		oData.setId(15);
		oData.setName("류선재");
		
		return new ResponseEntity<>(oData,HttpStatus.BAD_REQUEST);
	}
	
	
	
}
