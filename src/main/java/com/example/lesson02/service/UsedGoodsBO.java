package com.example.lesson02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.domain.UsedGoods;
import com.example.lesson02.mapper.UsedGoodsMapper;

@Service //spring bean
public class UsedGoodsBO {
	@Autowired //dependency Injection(DI) :의존성주입
	private UsedGoodsMapper usedGoodsMapper; //스프링 bean을 가져온다
	//input :x 컨트롤러로부터 받아옴
	//output:(Mapper에서 받아온 걸 )List<UsedGoods> 컨트롤러에게 준다
	public List<UsedGoods> getUsedGoodsList(){
		List<UsedGoods> usedGoodsList=usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList;
		
		//return usedGoodsMapper.selectUsedGoodsList();
	}
}
