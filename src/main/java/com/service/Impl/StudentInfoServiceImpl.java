package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.StudentInfo;
import com.dao.Impl.StudentInfoDapImpl;
import com.service.StudentInfoService;

@Service
public class StudentInfoServiceImpl implements StudentInfoService{

	@Autowired
	StudentInfoDapImpl studentInfoDapImpl;
	
	@Override
	public List<StudentInfo> getStudentInfo(String args) {
		return studentInfoDapImpl.findStudentInfo(args);
	}

	@Override
	public void insertStudentInfo(StudentInfo student) {
		studentInfoDapImpl.insertStudent(student);
	}

	@Override
	public void deleteStudentInfo(String id) {
		studentInfoDapImpl.deleteStudentById(id);
	}

	@Override
	public void updateStudentInfo(StudentInfo student) {
		studentInfoDapImpl.updateStudentById(student);
	}

}
