package com.mikaelson.login.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mikaelson.login.service.ILoginService;

@Service
@Transactional(rollbackFor=Exception.class)
public class LoginServiceImpl implements ILoginService{
	public static Logger logger = Logger.getLogger(LoginServiceImpl.class) ;
	public void sayHello() {
		logger.error("hello from my first spring mvc project");
	}
}
