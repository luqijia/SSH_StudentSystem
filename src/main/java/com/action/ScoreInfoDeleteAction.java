//package com.action;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.bean.ScoreInfo;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import com.service.Impl.ScoreInfoServiceImpl;
//import com.service.Impl.SelectCourseInfoServiceImpl;
//
//@Component
//public class ScoreInfoDeleteAction extends ActionSupport implements ModelDriven<ScoreInfo>{
//	
//	private String msg;
//
//	private ScoreInfo scoreInfo = new ScoreInfo();
//
//	@Autowired
//	ScoreInfoServiceImpl serviceImpl;
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
//	public ScoreInfo getModel() {
//		return scoreInfo;
//	}
//
//	@Override
//	public String execute() throws Exception {
//
//		System.out.println("delete");
//		System.out.println(scoreInfo);
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
////		serviceImpl.deleteScoreInfo(scoreInfo.getStudentId());
//		serviceImpl.deleteScoreInfo(scoreInfo);
//		msg = "删除成功";
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
import com.service.Impl.SelectCourseInfoServiceImpl;

@Component
public class ScoreInfoDeleteAction implements ServletRequestAware{
	
	private String msg;


	@Autowired
	ScoreInfoServiceImpl serviceImpl;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private HttpServletRequest request;
	
	public String execute() throws Exception {
		
		ScoreInfo scoreInfo = new ScoreInfo();
		scoreInfo.setClassName(request.getParameter("className"));
		scoreInfo.setStudentId(request.getParameter("studentId"));
		scoreInfo.setStudentName(request.getParameter("studentName"));
		scoreInfo.setDeptName(request.getParameter("deptName"));
		scoreInfo.setCourseName(request.getParameter("courseName"));
		scoreInfo.setTeacherName(request.getParameter("teacherName"));
		scoreInfo.setScore(Integer.parseInt(request.getParameter("score")));
		serviceImpl.deleteScoreInfo(scoreInfo);
		msg = "删除成功";
		return "SUCCESS";
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}

