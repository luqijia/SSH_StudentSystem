package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.ScoreInfo;
import com.dao.Impl.ScoreInfoDaoImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Impl.ScoreInfoServiceImpl;

import net.sf.json.JSONObject;

@Component
public class ScoreInfoAction extends ActionSupport {
	private Map<String, Object> map;

	@Autowired
	ScoreInfoServiceImpl serviceImpl;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		map = new HashMap<>();
		List<ScoreInfo> scoreInfos = serviceImpl.getScoreInfoAll();
		map.put("sEcho", 1);
		map.put("iTotalRecords", scoreInfos.size());
		map.put("iTotalDisplayRecords", scoreInfos.size());
		map.put("aaData", scoreInfos);
//		 JSONObject jsonObject = JSONObject.fromObject(map);
//		 System.out.println("jsonObject=" + jsonObject);
		return "SUCCESS";
	}
}
