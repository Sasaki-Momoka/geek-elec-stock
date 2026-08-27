package com.example.demo.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class SigninForm implements Serializable {
	private String email;
	private String password;
}