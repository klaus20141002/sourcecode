package com.mikaelson.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.mikaelson.common.constants.CommonConstants;
import com.mikaelson.common.utils.StringUtil;
import com.mikaelson.login.dto.RestfulLoginQueryDto;
import com.mikaelson.login.dto.RestfulLoginResultDto;
import com.mikaelson.login.service.ILoginService;
@Controller
public class RestfultLoginController {

	@Autowired
	private ILoginService loginService ;
	
	
	@RequestMapping({"/rest/login","/rest/"})
	@ResponseBody
	public RestfulLoginResultDto login(@RequestBody String inputParam) {
		RestfulLoginResultDto result = new RestfulLoginResultDto() ;
		if(StringUtil.notEmpty(inputParam)) {
			RestfulLoginQueryDto queryDto = JSON.parseObject(inputParam, RestfulLoginQueryDto.class) ;
			if(queryDto!=null) {
				loginService.sayHello();
				result.setErrorMessage("null");
				result.setIsSuccess(CommonConstants.SUCCESS);
				return result ;
			}
			result.setIsSuccess(CommonConstants.FAILURE);
			result.setErrorMessage("error param");
		} else {
			result.setIsSuccess(CommonConstants.FAILURE);
			result.setErrorMessage("error param");
		}
		loginService.sayHello();
		return result;
	}
}
