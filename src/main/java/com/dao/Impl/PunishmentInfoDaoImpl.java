package com.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.PunishmentInfo;
import com.dao.PunishmentInfoDao;

@Repository
@Transactional
public class PunishmentInfoDaoImpl implements PunishmentInfoDao {

	@Autowired
	SessionFactory sessionFactory;

	Query createQuery;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public PunishmentInfo findPunishmentInfoById(String id) {
		return currentSession().get(PunishmentInfo.class, id);
	}

	@Override
	public List<PunishmentInfo> findPunishmentInfoByName(String name) {
		createQuery = currentSession().createQuery("from PunishmentInfo where studentName = '" + name + "'");
		List<PunishmentInfo> punishmentInfo = createQuery.list();
		return punishmentInfo;
	}

	@Override
	public List<PunishmentInfo> findPunishmentInfosByClass(String classname) {
		createQuery = currentSession().createQuery("from PunishmentInfo where className like '%" + classname + "%'");
		List<PunishmentInfo> punishmentInfos = createQuery.list();
		return punishmentInfos;
	}

	@Override
	public List<PunishmentInfo> findPunishmentInfosByDept(String dept) {
		createQuery = currentSession().createQuery("from PunishmentInfo where deptName like '%" + dept + "%'");
		List<PunishmentInfo> punishmentInfos = createQuery.list();
		return punishmentInfos;
	}

	@Override
	public void insertPunishmentInfo(PunishmentInfo punishmentInfo) {
		currentSession().save(punishmentInfo);
	}

	@Override
	public void updatePunishmentInfoById(PunishmentInfo punishmentInfo) {
		currentSession().update(punishmentInfo);
	}

	@Override
	public void deletePunishmentInfoById(String id) {
		PunishmentInfo punishmentInfo = currentSession().get(PunishmentInfo.class, id);
		currentSession().delete(punishmentInfo);
	}
	
	@Override
	public List<PunishmentInfo> findPunishmentInfo(String args) {
		createQuery = currentSession().createQuery("from PunishmentInfo where studentId = '"+args+"' or studentName = '"+args+"' or className like '%"+args+"%' or deptName like '%"+args+"%'");
		List<PunishmentInfo> punishmentInfo = createQuery.list();
		return punishmentInfo;
	}
}
