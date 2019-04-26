package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.PunishmentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.PunishmentInfoServiceImpl;

@Component
public class PunishmentInfoUpdateAction extends ActionSupport implements ModelDriven<PunishmentInfo>{
	
	private PunishmentInfo punishmentInfo = new PunishmentInfo();

	@Autowired
	PunishmentInfoServiceImpl serviceImpl;

	@Override
	public PunishmentInfo getModel() {
		return punishmentInfo;
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

		serviceImpl.updatePunishmentInfo(punishmentInfo);

		return "SUCCESS";
	}

}
