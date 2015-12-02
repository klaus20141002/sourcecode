/******************************************************************************
 * @File name   :      TestBuild.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年12月2日
 *
 * @Copyright Notice: 
 * Copyright (c) 2020 Mikaelson Niklaus, Inc. All  Rights Reserved.
 * This software is published under the terms of the Mikaelson Niklaus Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------
 * Date                   Who         Version        Comments
 * 2015年12月2日 下午10:56:55        Hasee     1.0            Initial Version
 *****************************************************************************/
package com.mikaelson.login;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.mikaelson.login.service.ILoginService;

/**
 *
 */
@ContextConfiguration(locations = { "classpath*:spring-context.xml" })
public class TestBuild extends AbstractJUnit4SpringContextTests {

	public <T> T getBean(Class<T> type) {
		return applicationContext.getBean(type);
	}

	public Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}

	protected ApplicationContext getContext() {
		return applicationContext;
	}
	@Test
	public void testLogin() {
		System.out.println("============="+applicationContext);
		
		ILoginService loginService = getBean(ILoginService.class) ;
		
		loginService.sayHello();
	}
	
	
}
