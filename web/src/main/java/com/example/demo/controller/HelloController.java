package com.example.demo.controller;

import com.example.demo.vo.telnet.SuccessResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wangkai
 * @date 2018-03-22 17:28
 * @desc com.didispace.web
 */
@RestController
@RequestMapping("/V1/")
public class HelloController {

//	@ResponseBody
	@RequestMapping("hello")
	public Object hello(HttpServletRequest servletRequest) {
		return SuccessResponse.newInstance("Hello World");
	}

	@RequestMapping("index")
	public Object index(ModelMap map) {
		map.addAttribute("host", "http://blog.didispace.com");
		return SuccessResponse.newInstance("index");
	}
}
