package com.news.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = { "/home" })
@Controller
public class TestPage {

	@RequestMapping(path = { "/page1" })
	@ResponseBody
	public String index() {
		return "hello this is page1";
	}

}
