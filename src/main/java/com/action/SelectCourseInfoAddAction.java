//package com.action;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.bean.SelectCourseInfo;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import com.service.Impl.SelectCourseInfoServiceImpl;
//
//@Component
//public class SelectCourseInfoAddAction extends ActionSupport implements ModelDriven<SelectCourseInfo> {
//	
//	private SelectCourseInfo selectCourseInfo = new SelectCourseInfo();
//
//	@Override
//	public SelectCourseInfo getModel() {
//		return selectCourseInfo;
//	}
//
//	@Autowired
//	SelectCourseInfoServiceImpl serviceImpl;
//
//	@Override
//	public String execute() throws Exception {
//
////		 System.out.println("**************************");
////		 System.out.println(selectCourseInfo.getStudentId());
////		 System.out.println(selectCourseInfo.getStudentName());
////		 System.out.println(selectCourseInfo.getClassName());
////		 System.out.println(selectCourseInfo.getDeptName());
////		 System.out.println(selectCourseInfo.getCourseName());
////		 System.out.println(selectCourseInfo.getTeacherName());
////		 System.out.println(selectCourseInfo.getCredits());
////		 System.out.println("**************************");
//
//		serviceImpl.insetSelectCourseInfo(selectCourseInfo);;
//
//		return "SUCCESS";
//	}
//}
package com.action;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.SelectCourseInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.SelectCourseInfoServiceImpl;




@Component
public class SelectCourseInfoAddAction extends ActionSupport  {
	
	@Autowired
	SelectCourseInfoServiceImpl serviceImpl;

	@Override
	public String execute() throws Exception {
		SelectCourseInfo selectCourseInfo = new SelectCourseInfo();
		HttpServletRequest request=ServletActionContext.getRequest();
		selectCourseInfo.setStudentId(request.getParameter("studentId"));
		selectCourseInfo.setStudentName(request.getParameter("studentName"));
		selectCourseInfo.setClassName(request.getParameter("className"));
		selectCourseInfo.setDeptName(request.getParameter("deptName"));
		selectCourseInfo.setCourseName(request.getParameter("courseName"));
		selectCourseInfo.setTeacherName(request.getParameter("teacherName"));
		selectCourseInfo.setCredits(MyTools.strToint(request.getParameter("studentId")));
//		System.out.println("**************************");
//		System.out.println(selectCourseInfo.getStudentId()+"123123");
//		 System.out.println(selectCourseInfo.getStudentName());
//		 System.out.println(selectCourseInfo.getClassName());
//		 System.out.println(selectCourseInfo.getDeptName());
//		 System.out.println(selectCourseInfo.getCourseName());
//		 System.out.println(selectCourseInfo.getTeacherName());
//		 System.out.println(selectCourseInfo.getCredits());
//		 System.out.println("**************************");

		serviceImpl.insetSelectCourseInfo(selectCourseInfo);

		return "SUCCESS";
	}
}
