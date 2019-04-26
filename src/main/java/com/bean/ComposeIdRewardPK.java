package com.bean;

import java.io.Serializable;

public class ComposeIdRewardPK implements Serializable {

	private String studentId;
	private String rewardContent;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getRewardContent() {
		return rewardContent;
	}

	public void setRewardContent(String rewardContent) {
		this.rewardContent = rewardContent;
	}

}
