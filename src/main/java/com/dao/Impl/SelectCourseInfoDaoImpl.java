//package com.dao.Impl;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.bean.SelectCourseInfo;
//import com.bean.StudentInfo;
//import com.dao.SelectCourseInfoDao;
//
//@Repository
//@Transactional
//public class SelectCourseInfoDaoImpl implements SelectCourseInfoDao {
//
//	@Autowired
//	SessionFactory sessionFactory;
//
//	Query createQuery;
//
//	private Session currentSession() {
//		return sessionFactory.getCurrentSession();
//	}
//
//	@Override
//	public SelectCourseInfo findSCById(String id) {
//		return currentSession().get(SelectCourseInfo.class, id);
//	}
//
//	@Override
//	public List<SelectCourseInfo> findSCByName(String name) {
//		createQuery = currentSession().createQuery("from SelectCourseInfo where studentName = '" + name + "'");
//		List<SelectCourseInfo> selectCourseInfo = createQuery.list();
//		return selectCourseInfo;
//	}
//
//	
//	@Override
//	public List<SelectCourseInfo> findSCsByClass(String classname) {
//		createQuery = currentSession().createQuery("from SelectCourseInfo where className like '%" + classname + "%'");
//		List<SelectCourseInfo> selectCourseInfos = createQuery.list();
//		return selectCourseInfos;
//	}
//
//	@Override
//	public List<SelectCourseInfo> findSCsByDept(String dept) {
//		createQuery = currentSession().createQuery("from SelectCourseInfo where deptName like '%" + dept + "%'");
//		List<SelectCourseInfo> selectCourseInfos = createQuery.list();
//		return selectCourseInfos;
//	}
//
//	@Override
//	public void updateSCById(SelectCourseInfo selectCourse) {
//		currentSession().update(selectCourse);
//	}
//
//	@Override
//	public void insertSC(SelectCourseInfo selectCourse) {
//		currentSession().save(selectCourse);
//	}
//
//	@Override
//	public void deleteSCById(String id) {
//		SelectCourseInfo selectCourseInfo = currentSession().get(SelectCourseInfo.class, id);
//		currentSession().delete(selectCourseInfo);
//	}
//	
//	@Override
//	public List<SelectCourseInfo> findSelectCourseInfo(String args) {
//		createQuery = currentSession().createQuery("from SelectCourseInfo where studentId = '"+args+"' or studentName = '"+args+"' or className like '%"+args+"%' or deptName like '%"+args+"%'");
//		List<SelectCourseInfo> selectCourseInfo = createQuery.list();
//		return selectCourseInfo;
//	}
//
//}
package com.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.SelectCourseInfo;
import com.bean.StudentInfo;
import com.dao.SelectCourseInfoDao;

@Repository
@Transactional
public class SelectCourseInfoDaoImpl implements SelectCourseInfoDao {

	@Autowired
	SessionFactory sessionFactory;

	Query createQuery;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public SelectCourseInfo findSCById(String id) {
		return currentSession().get(SelectCourseInfo.class, id);
	}

	@Override
	public List<SelectCourseInfo> findSCByName(String name) {
		createQuery = currentSession().createQuery("from SelectCourseInfo where studentName = '" + name + "'");
		List<SelectCourseInfo> selectCourseInfo = createQuery.list();
		return selectCourseInfo;
	}

	@Override
	public List<SelectCourseInfo> findSCsByClass(String classname) {
		createQuery = currentSession().createQuery("from SelectCourseInfo where className like '%" + classname + "%'");
		List<SelectCourseInfo> selectCourseInfos = createQuery.list();
		return selectCourseInfos;
	}

	@Override
	public List<SelectCourseInfo> findSCsByDept(String dept) {
		createQuery = currentSession().createQuery("from SelectCourseInfo where deptName like '%" + dept + "%'");
		List<SelectCourseInfo> selectCourseInfos = createQuery.list();
		return selectCourseInfos;
	}

	@Override
	public void updateSCById(SelectCourseInfo selectCourse) {
		currentSession().update(selectCourse);
	}

	@Override
	public void insertSC(SelectCourseInfo selectCourse) {
		currentSession().save(selectCourse);
	}

	@Override
	public void deleteSC(SelectCourseInfo selectCourseInfo) {
/*		SelectCourseInfo selectCourseInfo = currentSession().get(SelectCourseInfo.class, id);*/
		currentSession().delete(selectCourseInfo);
	}
	
	@Override
	public List<SelectCourseInfo> findSelectCourseInfo(String args) {
		createQuery = currentSession().createQuery("from SelectCourseInfo where studentId = '"+args+"' or studentName = '"+args+"' or className like '%"+args+"%' or deptName like '%"+args+"%'");
		List<SelectCourseInfo> selectCourseInfo = createQuery.list();
		return selectCourseInfo;
	}

}

