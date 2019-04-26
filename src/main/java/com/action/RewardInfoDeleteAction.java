package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.RewardInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.Impl.RewardInfoServiceImpl;

@Component
public class RewardInfoDeleteAction extends ActionSupport implements ModelDriven<RewardInfo>{
	
	private String msg;

	private RewardInfo rewardInfo = new RewardInfo();

	@Autowired
	RewardInfoServiceImpl serviceImpl;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public RewardInfo getModel() {
		return rewardInfo;
	}

	@Override
	public String execute() throws Exception {

		serviceImpl.deleteRewardInfo(rewardInfo);
		msg = "删除成功";
		return "SUCCESS";
	}

}
