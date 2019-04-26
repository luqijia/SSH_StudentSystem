package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.PunishmentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.PunishmentInfoServiceImpl;

@Component
public class PunishmentInfoAddAction extends ActionSupport implements ModelDriven<PunishmentInfo>{
	
	private PunishmentInfo punishmentInfo = new PunishmentInfo();

	@Override
	public PunishmentInfo getModel() {
		return punishmentInfo;
	}

	@Autowired
	PunishmentInfoServiceImpl serviceImpl;

	@Override
	public String execute() throws Exception {

		// System.out.println("**************************");
		// System.out.println(selectCourseInfo.getStudentId());
		// System.out.println(selectCourseInfo.getStudentName());
		// System.out.println(selectCourseInfo.getClassName());
		// System.out.println(selectCourseInfo.getDeptName());
		// System.out.println(selectCourseInfo.getCourseName());
		// System.out.println(selectCourseInfo.getTeacherName());
		// System.out.println(selectCourseInfo.getCredits());
		// System.out.println("**************************");

		serviceImpl.insertPunishmentInfo(punishmentInfo);

		return "SUCCESS";
	}

}
