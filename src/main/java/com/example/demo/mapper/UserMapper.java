package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserDto;

//  ユーザー情報をDBから取得するMapper

@Mapper
public interface UserMapper {
	//  入力されたメールアドレスを条件に検索する
	UserDto findByEmail(String email);
	
}
