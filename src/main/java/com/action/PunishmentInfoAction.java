package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.PunishmentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Impl.PunishmentInfoServiceImpl;

@Component
public class PunishmentInfoAction extends ActionSupport{
	
	private Map<String, Object> map;

	@Autowired
	PunishmentInfoServiceImpl serviceImpl;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		map = new HashMap<>();
		List<PunishmentInfo> punishmentInfos = serviceImpl.getPunishmentInfo("学院");
		map.put("sEcho", 1);
		map.put("iTotalRecords", punishmentInfos.size());
		map.put("iTotalDisplayRecords", punishmentInfos.size());
		map.put("aaData", punishmentInfos);
//		 JSONObject jsonObject = JSONObject.fromObject(map);
//		 System.out.println("jsonObject=" + jsonObject);
		return "SUCCESS";
	}
}
