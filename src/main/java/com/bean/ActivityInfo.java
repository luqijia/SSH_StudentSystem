package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(com.bean.ComposeIdActivityPK.class)
@Table(name="tb_activity")
public class ActivityInfo {
	
	@Id
	@Column(length = 20)
	private String studentId;
	
	@Column(nullable=false)
	private String studentName;
	
	@Column(nullable=false)
	private String className;
	
	@Column(nullable=false)
	private String deptName;
	
	@Id
	private String activityContent;
	
	@Column(nullable=false)
	private String data;

	public ActivityInfo() {}

	public ActivityInfo(String studentId, String studentName, String className, String deptName, String activityContent,
			String data) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.className = className;
		this.deptName = deptName;
		this.activityContent = activityContent;
		this.data = data;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getActivityContent() {
		return activityContent;
	}

	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ActivityInfo [studentId=" + studentId + ", studentName=" + studentName + ", className=" + className
				+ ", deptName=" + deptName + ", activityContent=" + activityContent + ", data=" + data + "]";
	}
}
