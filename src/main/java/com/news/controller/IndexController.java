package com.news.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@RequestMapping(path= {"/test"})
	@ResponseBody
	public String index() {
		return "hello news";
	}
}
