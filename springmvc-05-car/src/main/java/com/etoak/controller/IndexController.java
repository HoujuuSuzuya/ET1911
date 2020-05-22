package com.etoak.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etoak.bean.User;
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class IndexController {
	
	@RequestMapping("/add")
	public String add(String name) {
		System.out.println(name);
		return "forward:/index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public String json(@RequestBody Map<String,String> map) {
		System.out.println(map);
		return "success";
	}
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		request.setAttribute("user",new User(1,"requestUser","",20));
		
		request.getSession().setAttribute("sessionUser",new User(2,"sessionUser","",21));
		
		List<User> userList = new ArrayList<>();
		request.setAttribute("userList",userList);
		
		userList.add(new User(3,"李田所","",28));
		userList.add(new User(4,"海灵顿","",22));
		
		return "index";
	}
}
