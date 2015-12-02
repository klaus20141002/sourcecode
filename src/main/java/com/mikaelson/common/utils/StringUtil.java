/******************************************************************************
 * @File name   :      StringUtil.java
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
 * 2015年11月29日 下午10:52:49        Hasee     1.0            Initial Version
 *****************************************************************************/
package com.mikaelson.common.utils;

/**
 *
 */
public final class StringUtil {
	public final static boolean notEmpty(String str) {
		if(str==null || str == "") {
			return false ;
		}
		return true ;
	}
}
