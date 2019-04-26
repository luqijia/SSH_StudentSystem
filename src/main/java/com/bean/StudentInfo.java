package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_student")
public class StudentInfo {
	
	@Id
	private String studentId;
	
	@Column(nullable=false)
	private String studentName;
	
	@Column(nullable=false)
	private Integer age;
	
	@Column(nullable=false,length=10)
	private String sex;
	
	@Column(nullable=false)
	private String dept;
	
	@Column(nullable=false)
	private String className;

	@Column(nullable=false)
	private String state;

	public StudentInfo() {}

	public StudentInfo(String studentId, String studentName, Integer age, String sex, String dept, String className,
			String state) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.sex = sex;
		this.dept = dept;
		this.className = className;
		this.state = state;
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

	public long getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", sex=" + sex
				+ ", dept=" + dept + ", className=" + className + ", state=" + state + "]";
	}
	
}
