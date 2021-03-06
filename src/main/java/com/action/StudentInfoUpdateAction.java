package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.StudentInfoServiceImpl;

@Component
public class StudentInfoUpdateAction extends ActionSupport implements ModelDriven<StudentInfo> {

	private StudentInfo student = new StudentInfo();

	@Autowired
	StudentInfoServiceImpl serviceImpl;

	@Override
	public StudentInfo getModel() {
		return student;
	}

	@Override
	public String execute() throws Exception {

//		System.out.println("**************************");
//		System.out.println(student.getStudentId());
//		System.out.println(student.getStudentName());
//		System.out.println(student.getAge());
//		System.out.println(student.getSex());
//		System.out.println(student.getDept());
//		System.out.println(student.getClassName());
//		System.out.println(student.getState());
//		System.out.println("**************************");

		serviceImpl.updateStudentInfo(student);

		return "SUCCESS";
	}
}
