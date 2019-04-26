package com.bean;

import java.io.Serializable;

import javax.persistence.Embeddable;

public class ComposeIdCoursePK implements Serializable{

	private String studentId;
	private String courseName;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
