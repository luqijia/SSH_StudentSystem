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
//import com.bean.ScoreInfo;
//import com.bean.StudentInfo;
//import com.dao.ScoreInfoDao;
//
//@Repository
//@Transactional
//public class ScoreInfoDaoImpl implements ScoreInfoDao {
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
//	public ScoreInfo findScoreInfoById(String id) {
//		return currentSession().get(ScoreInfo.class, id);
//	}
//
//	@Override
//	public List<ScoreInfo> findScoreInfoByName(String name) {
//		createQuery = currentSession().createQuery("from ScoreInfo where studentName = '" + name + "'");
//		List<ScoreInfo> scoreInfo = createQuery.list();
//		return scoreInfo;
//	}
//
//	@Override
//	public List<ScoreInfo> findScoreInfosByClass(String classname) {
//		createQuery = currentSession().createQuery("from ScoreInfo where className = '%" + classname + "%'");
//		List<ScoreInfo> scoreInfo = createQuery.list();
//		return scoreInfo;
//	}
//
//	@Override
//	public List<ScoreInfo> findScoreInfosByDept(String dept) {
//		createQuery = currentSession().createQuery("from ScoreInfo where deptName = '%" + dept + "%'");
//		List<ScoreInfo> scoreInfos = createQuery.list();
//		return scoreInfos;
//	}
//
//	@Override
//	public void insertScoreInfo(ScoreInfo scoreInfo) {
//		currentSession().save(scoreInfo);
//	}
//
//	@Override
//	public void updateScoreInfoById(ScoreInfo scoreInfo) {
//		currentSession().update(scoreInfo);
//	}
//
////	@Override
////	public void deleteScoreInfoById(String id) {
////		ScoreInfo scoreInfo = currentSession().get(ScoreInfo.class, id);
////		currentSession().delete(scoreInfo);
////	}
//	@Override
//	public void deleteScoreInfoById(ScoreInfo id) {
////		ScoreInfo scoreInfo = currentSession().get(ScoreInfo.class, id);
//		currentSession().delete(id);
//	}
//	
//	@Override
//	public List<ScoreInfo> findScoreInfo(String args) {
//		createQuery = currentSession().createQuery("from ScoreInfo where studentId = '"+args+"' or studentName = '"+args+"' or className like '%"+args+"%' or deptName like '%"+args+"%'");
//		List<ScoreInfo> scoreInfo = createQuery.list();
//		return scoreInfo;
//	}
//
//}
package com.dao.Impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManager;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.RewardInfo;
import com.bean.ScoreInfo;
import com.bean.StudentInfo;
import com.dao.ScoreInfoDao;

@Repository
@Transactional
public class ScoreInfoDaoImpl implements ScoreInfoDao {

	

	@Autowired
	SessionFactory sessionFactory;

	Query createQuery;
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertScoreInfo(ScoreInfo scoreInfo) {
		currentSession().save(scoreInfo);
	}

	@Override
	public void updateScoreInfo(ScoreInfo scoreInfo) {
		currentSession().update(scoreInfo);
	}

	@Override
	public void deleteScoreInfoByAll(ScoreInfo all) {
		currentSession().delete(all);
	}

	@Override
	public List<ScoreInfo> findScoreInfo() {
		List<ScoreInfo> scoreInfo = currentSession().createCriteria(ScoreInfo.class).list();
		return scoreInfo;
	}
	
}

