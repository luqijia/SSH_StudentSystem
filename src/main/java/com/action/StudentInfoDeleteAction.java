package com.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.StudentInfoServiceImpl;

@Component
public class StudentInfoDeleteAction extends ActionSupport implements ModelDriven<StudentInfo>{

	private String msg;

	private StudentInfo student =new StudentInfo();
	
	@Autowired
	StudentInfoServiceImpl  serviceImpl;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public StudentInfo getModel() {
		return student;
	}
	
	@Override
	public String execute() throws Exception {
		
//		System.out.println("*******************");
//		System.out.println(student.getStudentId());
//		System.out.println(student.getStudentName());
//		System.out.println(student.getAge());
//		System.out.println(student.getSex());
//		System.out.println(student.getDept());
//		System.out.println(student.getClassName());
//		System.out.println(student.getState());
//		System.out.println("*******************");
		
		serviceImpl.deleteStudentInfo(student.getStudentId());
		msg = "删除成功";
		return "SUCCESS";
	}
}
