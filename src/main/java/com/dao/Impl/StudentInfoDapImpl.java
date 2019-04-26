package com.dao.Impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.StudentInfo;
import com.dao.StudentInfoDao;

@Repository
@Transactional
public class StudentInfoDapImpl implements StudentInfoDao{

	
	@Autowired
	SessionFactory sessionFactory;
	
	Query createQuery;
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public StudentInfo findStudentById(String id) {
		return currentSession().get(StudentInfo.class, id);
	}

	@Override
	public List<StudentInfo> findStudentByName(String name) {
		createQuery = currentSession().createQuery("from StudentInfo where studentName = '"+name+"'");
		List<StudentInfo> studentInfo = createQuery.list();
		return studentInfo;
	}

	@Override
	public List<StudentInfo> findStudentsByClass(String className) {
		createQuery = currentSession().createQuery("from StudentInfo where className like '%"+className+"%'");
		List<StudentInfo> studentInfos = createQuery.list();
		return studentInfos;
	}

	@Override
	public List<StudentInfo> findStudentsByDept(String dept) {
		createQuery = currentSession().createQuery("from StudentInfo where dept like '%"+dept+"%'");
		List<StudentInfo> studentInfos = createQuery.list();
		return studentInfos;
	}

	@Override
	public void updateStudentById(StudentInfo student) {
		currentSession().update(student);
	}

	@Override
	public void insertStudent(StudentInfo student) {
		currentSession().save(student);
	}

	@Override
	public void deleteStudentById(String id) {
		StudentInfo studentInfo = currentSession().get(StudentInfo.class, id);
		currentSession().delete(studentInfo);
	}
	
	@Override
	public List<StudentInfo> findStudentInfo(String args) {
		createQuery = currentSession().createQuery("from StudentInfo where studentId = '"+args+"' or studentName = '"+args+"' or className like '%"+args+"%' or dept like '%"+args+"%'");
		List<StudentInfo> studentInfo = createQuery.list();
		return studentInfo;
	}

}
