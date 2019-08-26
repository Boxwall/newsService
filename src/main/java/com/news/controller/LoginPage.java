package com.news.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.news.entity.Visitor;

@Controller
public class LoginPage {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());

	@RequestMapping("/loginpage")
	public String getPage() {
		return "login";
	}

}
