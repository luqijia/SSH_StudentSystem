//package com.action;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.bean.SelectCourseInfo;
//import com.bean.StudentInfo;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import com.service.Impl.SelectCourseInfoServiceImpl;
//import com.service.Impl.StudentInfoServiceImpl;
//
//@Component
//public class SelectCourseInfoDeleteAction extends ActionSupport implements ModelDriven<SelectCourseInfo> {
//
//	private String msg;
//
//	private SelectCourseInfo selectCourseInfo = new SelectCourseInfo();
//
//	@Autowired
//	SelectCourseInfoServiceImpl serviceImpl;
//
//	public String getMsg() {
//		return msg;
//	}
//
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
//
//	@Override
//	public SelectCourseInfo getModel() {
//		return selectCourseInfo;
//	}
//
//	@Override
//	public String execute() throws Exception {
//
//		// System.out.println("*******************");
//		// System.out.println(student.getStudentId());
//		// System.out.println(student.getStudentName());
//		// System.out.println(student.getAge());
//		// System.out.println(student.getSex());
//		// System.out.println(student.getDept());
//		// System.out.println(student.getClassName());
//		// System.out.println(student.getState());
//		// System.out.println("*******************");
//
//		serviceImpl.deleteSelectCourseInfo(selectCourseInfo.getStudentId());
//		msg = "删除成功";
//		return "SUCCESS";
//	}
//}
package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.SelectCourseInfo;
import com.bean.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.SelectCourseInfoServiceImpl;
import com.service.Impl.StudentInfoServiceImpl;

@Component
public class SelectCourseInfoDeleteAction extends ActionSupport  {

	private String msg;

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
		// System.out.println("*******************");
		// System.out.println(student.getStudentId());
		// System.out.println(student.getStudentName());
		// System.out.println(student.getAge());
		// System.out.println(student.getSex());
		// System.out.println(student.getDept());
		// System.out.println(student.getClassName());
		// System.out.println(student.getState());
		// System.out.println("*******************");

		serviceImpl.deleteSelectCourseInfo(selectCourseInfo);
		msg = "删除成功";
		return "SUCCESS";
	}
}
