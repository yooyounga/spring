package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	//input :X
	//output :단건 Review
	public Review selectReviewById(int id);
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			//하나의 map으로 구성
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") Double point,
			@Param("review") String review);
	
	public int updateReviewById(
			//하나의 map으로 구성
			@Param("id") int id,
			@Param("review") String review);
	
	public int deleteReviewById(int id);
}
