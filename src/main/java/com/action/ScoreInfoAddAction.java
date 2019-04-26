//package com.action;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.bean.ScoreInfo;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import com.service.Impl.ScoreInfoServiceImpl;
//
//@Component
//public class ScoreInfoAddAction extends ActionSupport implements ModelDriven<ScoreInfo> {
//
//	private ScoreInfo scoreInfo = new ScoreInfo();
//
//	@Override
//	public ScoreInfo getModel() {
//		return scoreInfo;
//	}
//
//	@Autowired
//	ScoreInfoServiceImpl serviceImpl;
//
//	@Override
//	public String execute() throws Exception {
//
//		// System.out.println("**************************");
//		// System.out.println(selectCourseInfo.getStudentId());
//		// System.out.println(selectCourseInfo.getStudentName());
//		// System.out.println(selectCourseInfo.getClassName());
//		// System.out.println(selectCourseInfo.getDeptName());
//		// System.out.println(selectCourseInfo.getCourseName());
//		// System.out.println(selectCourseInfo.getTeacherName());
//		// System.out.println(selectCourseInfo.getCredits());
//		// System.out.println("**************************");
//
//		serviceImpl.insertScoreInfo(scoreInfo);
//
//		return "SUCCESS";
//	}
//}
package com.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.ScoreInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.ScoreInfoServiceImpl;

@Component
public class ScoreInfoAddAction  implements ServletRequestAware{

	private HttpServletRequest request;

	@Autowired
	ScoreInfoServiceImpl serviceImpl;

	
	public String execute() throws Exception {
	ScoreInfo scoreInfo = new ScoreInfo();
	scoreInfo.setClassName(request.getParameter("className"));
	scoreInfo.setStudentId(request.getParameter("studentId"));
	scoreInfo.setStudentName(request.getParameter("studentName"));
	scoreInfo.setDeptName(request.getParameter("deptName"));
	scoreInfo.setCourseName(request.getParameter("courseName"));
	scoreInfo.setTeacherName(request.getParameter("teacherName"));
	scoreInfo.setScore(Integer.parseInt(request.getParameter("score")));
	serviceImpl.insertScoreInfo(scoreInfo);
	return "SUCCESS";
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
