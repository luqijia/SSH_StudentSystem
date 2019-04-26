package com.service;

import java.util.List;

import com.bean.StudentInfo;

public interface StudentInfoService {
	List<StudentInfo> getStudentInfo(String args);
	void insertStudentInfo(StudentInfo student);
	void deleteStudentInfo(String id);
	void updateStudentInfo(StudentInfo student);
}
