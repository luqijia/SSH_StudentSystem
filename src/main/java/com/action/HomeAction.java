package com.action;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class HomeAction extends ActionSupport {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		
		if (getUsername().equals("admin")
				&& getPassword().equals("admin") )
			{
				return "SUCCESS";
			}
			else
			{
				return "ERROR";
			}
	}
}
