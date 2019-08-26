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
public class LoginController {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());

	@RequestMapping("/login")
	@ResponseBody
	public String login(String name, String password, HttpServletRequest request) {

		Visitor visitor = new Visitor();
		visitor.setName(name);
		visitor.setVisitorId(UUID.randomUUID().toString().substring(24));
		HttpSession session = request.getSession();
		session.setAttribute("loginInfo", visitor);
		return "success";
	}

}
