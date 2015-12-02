/******************************************************************************
 * @File name   :      BaseTest.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年11月29日
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
 * 2015年11月29日 下午11:47:05        Hasee     1.0            Initial Version
 *****************************************************************************/
package com.mikaelson.basetest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
         "classpath*:spring-context.xml"
 })
public class BaseTest  extends AbstractJUnit4SpringContextTests{

}
