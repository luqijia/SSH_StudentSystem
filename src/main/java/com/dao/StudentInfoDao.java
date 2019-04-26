package com.dao;

import java.util.List;

import com.bean.StudentInfo;

public interface StudentInfoDao {
	StudentInfo findStudentById(String id);
	List<StudentInfo> findStudentByName(String name);
	List<StudentInfo> findStudentsByClass(String className);
	List<StudentInfo> findStudentsByDept(String dept);
	void updateStudentById(StudentInfo student);
	void insertStudent(StudentInfo student);
	void deleteStudentById(String id);
	
	List<StudentInfo> findStudentInfo(String args);
}
