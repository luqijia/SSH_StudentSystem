package com.bean;

import java.io.Serializable;


public class ComposeIdActivityPK implements Serializable {

	private String studentId;
	private String activityContent;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getActivityContent() {
		return activityContent;
	}

	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}

}
