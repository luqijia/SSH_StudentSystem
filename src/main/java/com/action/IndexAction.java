package com.action;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class IndexAction extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		return "SUCCESS";
	}
}
