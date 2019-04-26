package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.ActivityInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.ActivityInfoServiceImpl;

@Component
public class ActivityInfoDeleteAction extends ActionSupport implements ModelDriven<ActivityInfo>{

	private String msg;

	private ActivityInfo activityInfo = new ActivityInfo();

	@Autowired
	ActivityInfoServiceImpl serviceImpl;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public ActivityInfo getModel() {
		return activityInfo;
	}

	@Override
	public String execute() throws Exception {

		// System.out.println("*******************");
		// System.out.println(student.getStudentId());
		// System.out.println(student.getStudentName());
		// System.out.println(student.getAge());
		// System.out.println(student.getSex());
		// System.out.println(student.getDept());
		// System.out.println(student.getClassName());
		// System.out.println(student.getState());
		// System.out.println("*******************");

		serviceImpl.deleteActivityInfo(activityInfo.getStudentId());
		msg = "删除成功";
		return "SUCCESS";
	}
}
