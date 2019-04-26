package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(com.bean.ComposeIdCoursePK.class)
@Table(name = "tb_sc")
public class SelectCourseInfo {

	@Id
	@Column(length=20)
	private String studentId;

	@Column(nullable=false)
	private String studentName;

	@Column(nullable=false)
	private String className;

	@Column(nullable=false)
	private String deptName;

	@Id
	private String courseName;

	@Column(nullable=false)
	private String teacherName;

	@Column(nullable=false,length=20)
	private Integer credits;

	public SelectCourseInfo() {}

	public SelectCourseInfo(String studentId, String studentName, String className, String deptName, String courseName,
			String teacherName, Integer credits) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.className = className;
		this.deptName = deptName;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.credits = credits;
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "SelectCourseInfo [studentId=" + studentId + ", studentName=" + studentName + ", className=" + className
				+ ", deptName=" + deptName + ", courseName=" + courseName + ", teacherName=" + teacherName
				+ ", credits=" + credits + "]";
	}

}
