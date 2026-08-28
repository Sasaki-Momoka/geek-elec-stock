package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.UserDto;
import com.example.demo.form.SigninForm;
import com.example.demo.service.SigninService;

public class Controller {
 //  ControllerからServiceを呼び出してログイン処理を行う
	private final SigninService signinService;

	public Controller(SigninService signinService) {
		this.signinService = signinService;
	}

	//  ログイン画面表示
	// GETリクエストで、/signinにアクセスされた場合実行
	// ログインフォームを画面に渡してlogin.htmlを表示する
	@GetMapping("/signin")
	public String signin(Model model) {
	//  画面から入力された情報を受け取るためのフォームを生成
		model.addAttribute("signinForm", new SigninForm());
	//  ログイン画面表示
		return "login";
	}
  //  ログイン情報取得
	@PostMapping("/signin")
	public String signin(
			@ModelAttribute SigninForm signinForm) {
  //  入力されたメールアドレスをもとにユーザー情報を取得  
		UserDto user = signinService.findByEmail(signinForm.getEmail());

		return "login";
	}

}
