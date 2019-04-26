package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.ActivityInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Impl.ActivityInfoServiceImpl;

@Component
public class ActivityInfoAction extends ActionSupport{
	
	private Map<String, Object> map;

	@Autowired
	ActivityInfoServiceImpl serviceImpl;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		map = new HashMap<>();
//		List<ActivityInfo> activityInfos = serviceImpl.getActivityInfo("学院");
		System.out.println("activity");
		List<ActivityInfo> activityInfos = serviceImpl.getActivityInfo("学院");
		System.out.println("end activity");
		map.put("sEcho", 1);
		map.put("iTotalRecords", activityInfos.size());
		map.put("iTotalDisplayRecords", activityInfos.size());
		map.put("aaData", activityInfos);
//		 JSONObject jsonObject = JSONObject.fromObject(map);
//		 System.out.println("jsonObject=" + jsonObject);
		return "SUCCESS";
	}

}
