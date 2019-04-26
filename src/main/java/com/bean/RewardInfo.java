package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(com.bean.ComposeIdRewardPK.class)
@Table(name="tb_reward")
public class RewardInfo {
	
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
	private String rewardContent;
	
	@Column(nullable=false)
	private String data;
	
	public RewardInfo() {}

	public RewardInfo(String studentId, String studentName, String className, String deptName, String rewardContent,
			String data) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.className = className;
		this.deptName = deptName;
		this.rewardContent = rewardContent;
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

	public String getRewardContent() {
		return rewardContent;
	}

	public void setRewardContent(String rewardContent) {
		this.rewardContent = rewardContent;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RewardInfo [studentId=" + studentId + ", studentName=" + studentName + ", className=" + className
				+ ", deptName=" + deptName + ", rewardContent=" + rewardContent + ", data=" + data + "]";
	}

}
