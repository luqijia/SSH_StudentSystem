package com.service;

import java.util.List;

import com.bean.RewardInfo;

public interface RewardInfoService {
	List<RewardInfo> getRewardInfoAll();
	void insertRewardInfo(RewardInfo rewardInfo);
	void updateRewardInfo(RewardInfo rewardInfo);
	void deleteRewardInfo(RewardInfo rewardInfo);
}
