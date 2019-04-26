package com.dao;

import java.util.List;

import com.bean.RewardInfo;

public interface RewardInfoDao {
	
	void insertRewardInfo(RewardInfo rewardInfo);
	void updateRewardInfoById(RewardInfo rewardInfo);
	void deleteRewardInfo(RewardInfo rewardInfo);
	
	List<RewardInfo> findRewardInfo();
}
