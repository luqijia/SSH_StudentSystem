package com.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.ActivityInfo;
import com.dao.ActivityInfoDao;

@Repository
@Transactional
public class ActivityInfoDaoImpl implements ActivityInfoDao{

	@Autowired
	SessionFactory sessionFactory;
	
	Query createQuery;
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public ActivityInfo findActivityInfoById(String id) {
		return currentSession().get(ActivityInfo.class, id);
	}

	@Override
	public List<ActivityInfo> findActivityInfoByName(String name) {
		createQuery = currentSession().createQuery("from ActivityInfo where studentName = '"+name+"'");
		List<ActivityInfo> activityInfo = createQuery.list();
		return activityInfo;
	}

	@Override
	public List<ActivityInfo> findActivityInfosByClass(String classname) {
		createQuery = currentSession().createQuery("from ActivityInfo where className like '%"+classname+"%'");
		List<ActivityInfo> activityInfos = createQuery.list();
		return activityInfos;
	}

	@Override
	public List<ActivityInfo> findActivityInfosByDept(String dept) {
		createQuery = currentSession().createQuery("from ActivityInfo where deptName like '%"+dept+"%'");
		List<ActivityInfo> activityInfos = createQuery.list();
		return activityInfos;
	}

	@Override
	public void insertActivityInfo(ActivityInfo activityInfo) {
		currentSession().save(activityInfo);
	}

	@Override
	public void updateActivityInfoById(ActivityInfo activityInfo) {
		currentSession().update(activityInfo);
	}

	@Override
	public void deleteActivityInfoById(String id) {
		ActivityInfo activityInfo = currentSession().get(ActivityInfo.class, id);
		currentSession().delete(activityInfo);
	}
	
	@Override
	public List<ActivityInfo> findActivityInfo(String args) {
		createQuery = currentSession().createQuery("from ActivityInfo where studentId = '"+args+"' or studentName = '"+args+"' or className like '%"+args+"%' or deptName like '%"+args+"%'");
		List<ActivityInfo> activityInfo = createQuery.list();
		return activityInfo;
	}
	
	public List<ActivityInfo> findAll() {
		System.out.println("findall");
		return currentSession().createCriteria(ActivityInfo.class).list();
	}
}
