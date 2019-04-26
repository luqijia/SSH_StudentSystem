package com.bean;

import java.io.Serializable;

public class ComposeIdPunishmentPK implements Serializable {

	private String studentId;
	private String punishmentContent;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getPunishmentContent() {
		return punishmentContent;
	}

	public void setPunishmentContent(String punishmentContent) {
		this.punishmentContent = punishmentContent;
	}

}
