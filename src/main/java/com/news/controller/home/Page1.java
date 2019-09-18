package com.news.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Page1 {
	
	@RequestMapping(path = { "/home/page1" })
	@ResponseBody
	public String page1() {
		return "hello this is page1";
	}
}
