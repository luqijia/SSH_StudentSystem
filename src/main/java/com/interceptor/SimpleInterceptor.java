package com.interceptor;

import com.action.HomeAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SimpleInterceptor extends AbstractInterceptor {

	//用来拦截当未登录时，无法直接访问主界面
	public String intercept(ActionInvocation invocation) throws Exception {
		HomeAction action = (HomeAction) invocation.getAction();
		String result = invocation.invoke();
		return result;
	}
}
