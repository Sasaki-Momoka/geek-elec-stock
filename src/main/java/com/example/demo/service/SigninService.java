package com.example.demo.service;

import com.example.demo.dto.UserDto;

public interface  SigninService {

	UserDto findByEmail(String email);
	
}

