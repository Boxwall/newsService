package com.news.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = { "/home" })
@Controller
public class TestPage {
	
	@RequestMapping(path = { "/page" })
	@ResponseBody
	public String page1() {
		return "hello this is page1";
	}
}
