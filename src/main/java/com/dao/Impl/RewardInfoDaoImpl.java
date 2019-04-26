package com.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.ActivityInfo;
import com.bean.RewardInfo;
import com.dao.RewardInfoDao;

@Repository
@Transactional
public class RewardInfoDaoImpl implements RewardInfoDao {

	@Autowired
	SessionFactory sessionFactory;

	Query createQuery;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertRewardInfo(RewardInfo rewardInfo) {
		currentSession().save(rewardInfo);
	}

	@Override
	public void updateRewardInfoById(RewardInfo rewardInfo) {
		currentSession().update(rewardInfo);
	}

	@Override
	public void deleteRewardInfo(RewardInfo rewardInfo) {
		currentSession().delete(rewardInfo);
	}
	
	@Override
	public List<RewardInfo> findRewardInfo() {
		List<RewardInfo> rewardInfo = currentSession().createCriteria(RewardInfo.class).list();
		return rewardInfo;
	}

}
