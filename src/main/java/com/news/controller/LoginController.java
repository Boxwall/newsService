package com.news.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.news.entity.Visitor;
import com.news.util.redis.JedisAdapter;
import com.news.util.redis.JedisUtil;

@Controller
public class LoginController {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	private JedisAdapter jedisAdapter;
	
	@RequestMapping("/login")
	public void login(String name, String password, HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		logger.info("name:"+name+",password:"+password);
		
		Visitor visitor = new Visitor();
		
		visitor.setName(name);
		visitor.setVisitorId(UUID.randomUUID().toString().substring(24));
		
		jedisAdapter.setex(name, 60, visitor.getVisitorId());
		logger.info("name:"+name+",VisitorId:"+visitor.getVisitorId());
		
		HttpSession session = request.getSession();
		session.setAttribute("loginInfo", visitor);
		
		response.sendRedirect(request.getContextPath()+"/home/page");
	}

}
