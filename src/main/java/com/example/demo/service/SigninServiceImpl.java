package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.mapper.UserMapper;

@Service
public class SigninServiceImpl implements SigninService{
	
	private final UserMapper userMapper;
	
	public SigninServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public UserDto findByEmail(String email) {
		return userMapper.findByEmail(email);
	}

	
	
}
