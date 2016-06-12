package com.mikaelson.login.controller;

import io.swagger.annotations.ApiOperation;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mikaelson.login.domain.User;
import com.mikaelson.login.dto.RestfulLoginResultDto;
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
	
	@ApiOperation(value = "", httpMethod = "GET", response = RestfulLoginResultDto.class, notes = "show users")
	@RequestMapping(value={"/users"} ,method=RequestMethod.GET)
	public RestfulLoginResultDto showUser() {
		System.out.println("GET invoked");
		
		return new RestfulLoginResultDto();
	}
	
	@ApiOperation(value = "", httpMethod = "POST", response = RestfulLoginResultDto.class, notes = "show users")
	@RequestMapping(value={"/users"} ,method=RequestMethod.POST)
	public RestfulLoginResultDto showUser(User user) {
		
		System.out.println("POST invoked");
		return new RestfulLoginResultDto();
	}
	
	
	
}
