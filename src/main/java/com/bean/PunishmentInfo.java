package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(com.bean.ComposeIdPunishmentPK.class)
@Table(name="tb_punishment")
public class PunishmentInfo {
	
	@Id
	private String studentId;
	
	@Column(nullable=false)
	private String studentName;
	
	@Column(nullable=false)
	private String className;
	
	@Column(nullable=false)
	private String deptName;
	
	@Id
	private String punishmentContent;
	
	@Column(nullable=false)
	private String data;

	public PunishmentInfo() {}

	public PunishmentInfo(String studentId, String studentName, String className, String deptName,
			String punishmentContent, String data) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.className = className;
		this.deptName = deptName;
		this.punishmentContent = punishmentContent;
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

	public String getPunishmentContent() {
		return punishmentContent;
	}

	public void setPunishmentContent(String punishmentContent) {
		this.punishmentContent = punishmentContent;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PunishmentInfo [studentId=" + studentId + ", studentName=" + studentName + ", className=" + className
				+ ", deptName=" + deptName + ", punishmentContent=" + punishmentContent + ", data=" + data + "]";
	}
}
