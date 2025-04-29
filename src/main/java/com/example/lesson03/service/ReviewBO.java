package com.example.lesson03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	@Autowired
	public ReviewMapper reviewMapper;
	
	
	public Review getReviewById(int id) {
		return reviewMapper.selectReviewById(id);
	}
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	public int addReviewAsField(int storeId,String menu,String userName,Double point,String review) {
		return reviewMapper.insertReviewAsField(storeId,menu,userName,point,review);
	}
	public int updateReview(int id,String review) {
		return reviewMapper.updateReviewById(id,review);
	}
	/*
	결과값을 리턴함.
	public int deleteReview(int id) {
		return reviewMapper.deleteReviewById(id);
	}
	*/
	//리턴값을 안 줄수도 있음.
	public void deleteReview(int id) {
		int rowCount=reviewMapper.deleteReviewById(id);
	}
}
