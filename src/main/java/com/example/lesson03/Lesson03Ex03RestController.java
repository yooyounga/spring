package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.service.ReviewBO;

@RestController
public class Lesson03Ex03RestController {
	@Autowired
	private ReviewBO reviewBO; 
	
	//http://localhost/lesson03/ex03?id=21&review=별루야
	@RequestMapping("/lesson03/ex03")
	public String ex03(@RequestParam("id") int id,@RequestParam("review") String review) {
	
		return "업데이트 갯수:"+reviewBO.updateReview(id,review);
	}
}
