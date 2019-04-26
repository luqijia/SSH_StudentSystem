package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.RewardInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Impl.RewardInfoServiceImpl;

@Component
public class RewardInfoAction extends ActionSupport{
	
	private Map<String, Object> map;

	@Autowired
	RewardInfoServiceImpl serviceImpl;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		map = new HashMap<>();
		List<RewardInfo> rewardInfos = serviceImpl.getRewardInfoAll();
		map.put("sEcho", 1);
		map.put("iTotalRecords", rewardInfos.size());
		map.put("iTotalDisplayRecords", rewardInfos.size());
		map.put("aaData", rewardInfos);

		return "SUCCESS";
	}
}
