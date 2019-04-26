package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.RewardInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.RewardInfoServiceImpl;

@Component
public class RewardInfoUpdateAction extends ActionSupport implements ModelDriven<RewardInfo>{

	private RewardInfo rewardInfo = new RewardInfo();

	@Autowired
	RewardInfoServiceImpl serviceImpl;

	@Override
	public RewardInfo getModel() {
		return rewardInfo;
	}

	@Override
	public String execute() throws Exception {

		serviceImpl.updateRewardInfo(rewardInfo);

		return "SUCCESS";
	}
}
