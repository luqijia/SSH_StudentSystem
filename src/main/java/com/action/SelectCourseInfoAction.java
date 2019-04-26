package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.SelectCourseInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Impl.SelectCourseInfoServiceImpl;

import net.sf.json.JSONObject;

@Component
public class SelectCourseInfoAction extends ActionSupport {
	private Map<String, Object> map;

	@Autowired
	SelectCourseInfoServiceImpl serviceImpl;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		map = new HashMap<>();
		List<SelectCourseInfo> selectCourseInfos = serviceImpl.getSelectCourseInfo("学院");
		map.put("sEcho", 1);
		map.put("iTotalRecords", selectCourseInfos.size());
		map.put("iTotalDisplayRecords", selectCourseInfos.size());
		map.put("aaData", selectCourseInfos);
//		JSONObject jsonObject = JSONObject.fromObject(map);
//		System.out.println("jsonObject=" + jsonObject);
		return "SUCCESS";
	}
}
