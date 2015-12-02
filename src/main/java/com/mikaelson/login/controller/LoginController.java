package com.mikaelson.login.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mikaelson.login.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	private ILoginService loginService ;
	
	public static Logger logger = Logger.getLogger(LoginController.class) ;
	
	@RequestMapping({"/login","/"})
	public String login() {
		loginService.sayHello();
		logger.info("info LoginController LOGIN "+new Date());
		logger.debug(" debug LoginController LOGIN "+new Date());
		logger.error(" error LoginController LOGIN "+new Date());
		return "index";
	}
}
