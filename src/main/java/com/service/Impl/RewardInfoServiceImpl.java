package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.RewardInfo;
import com.dao.Impl.RewardInfoDaoImpl;
import com.service.RewardInfoService;

@Service
public class RewardInfoServiceImpl implements RewardInfoService{

	@Autowired
	RewardInfoDaoImpl rewardInfoDaoImpl;

	@Override
	public void insertRewardInfo(RewardInfo rewardInfo) {
		rewardInfoDaoImpl.insertRewardInfo(rewardInfo);
	}

	@Override
	public void updateRewardInfo(RewardInfo rewardInfo) {
		rewardInfoDaoImpl.updateRewardInfoById(rewardInfo);
	}

	@Override
	public void deleteRewardInfo(RewardInfo rewardInfo) {
		rewardInfoDaoImpl.deleteRewardInfo(rewardInfo);
	}

	@Override
	public List<RewardInfo> getRewardInfoAll() {
		return rewardInfoDaoImpl.findRewardInfo();
	}

}
