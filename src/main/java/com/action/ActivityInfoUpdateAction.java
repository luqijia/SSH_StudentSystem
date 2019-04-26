package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.ActivityInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.ActivityInfoServiceImpl;

@Component
public class ActivityInfoUpdateAction extends ActionSupport implements ModelDriven<ActivityInfo>{

	private ActivityInfo activityInfo = new ActivityInfo();

	@Autowired
	ActivityInfoServiceImpl serviceImpl;

	@Override
	public ActivityInfo getModel() {
		return activityInfo;
	}

	@Override
	public String execute() throws Exception {

//		 System.out.println("**************************");
//		 System.out.println(selectCourseInfo.getStudentId());
//		 System.out.println(selectCourseInfo.getStudentName());
//		 System.out.println(selectCourseInfo.getClassName());
//		 System.out.println(selectCourseInfo.getDeptName());
//		 System.out.println(selectCourseInfo.getCourseName());
//		 System.out.println(selectCourseInfo.getTeacherName());
//		 System.out.println(selectCourseInfo.getCredits());
//		 System.out.println("**************************");

		serviceImpl.updateActivityInfo(activityInfo);

		return "SUCCESS";
	}

}
