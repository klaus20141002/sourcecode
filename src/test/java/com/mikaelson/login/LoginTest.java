package com.mikaelson.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mikaelson.login.service.ILoginService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
         "classpath*:spring-context.xml"
 })
public class LoginTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	private ILoginService loginService ;
	
	@Test
	public void testLogin() {
		System.err.println("error happens");
		loginService.sayHello();
	}

}
