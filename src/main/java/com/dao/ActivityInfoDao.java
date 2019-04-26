package com.dao;

import java.util.List;

import com.bean.ActivityInfo;

public interface ActivityInfoDao {
	ActivityInfo findActivityInfoById(String id);
	List<ActivityInfo> findActivityInfoByName(String name);
	List<ActivityInfo> findActivityInfosByClass(String classname);
	List<ActivityInfo> findActivityInfosByDept(String dept);
	void insertActivityInfo(ActivityInfo activityInfo);
	void updateActivityInfoById(ActivityInfo activityInfo);
	void deleteActivityInfoById(String id);
	
	List<ActivityInfo> findActivityInfo(String args);
}
