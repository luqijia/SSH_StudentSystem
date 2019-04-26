package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.PunishmentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.PunishmentInfoServiceImpl;

@Component
public class PunishmentInfoDeleteAction extends ActionSupport implements ModelDriven<PunishmentInfo>{
	
	//RamdomAccess
	private String msg;

	private PunishmentInfo punishmentInfo = new PunishmentInfo();

	@Autowired
	PunishmentInfoServiceImpl serviceImpl;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public PunishmentInfo getModel() {
		return punishmentInfo;
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

		serviceImpl.deletePunishmentInfo(punishmentInfo.getStudentId());
		msg = "删除成功";
		return "SUCCESS";
	}

}
