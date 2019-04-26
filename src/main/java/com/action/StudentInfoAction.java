package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.Impl.StudentInfoServiceImpl;

import net.sf.json.JSONObject;

@Component
public class StudentInfoAction extends ActionSupport{
	
	private Map<String, Object> map;
	
	@Autowired
	StudentInfoServiceImpl studentInfoServiceImpl;
	

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("student!!");
		
		map = new HashMap<>();
		List<StudentInfo> studentInfo = studentInfoServiceImpl.getStudentInfo("学院");
		map.put("sEcho", 1);
		map.put("iTotalRecords", studentInfo.size());
		map.put("iTotalDisplayRecords", studentInfo.size());
		map.put("aaData", studentInfo);
		
		System.out.println("map="+map);
//		JSONObject jsonObject = JSONObject.fromObject(map);
//		System.out.println("jsonObject="+jsonObject);
		return "SUCCESS";
	}
}
