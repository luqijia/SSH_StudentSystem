package com.service;

import java.util.List;

import com.bean.ActivityInfo;

public interface ActivityInfoService {
	List<ActivityInfo> getActivityInfo(String args);
	void insertActivityInfo(ActivityInfo activityInfo);
	void updateActivityInfo(ActivityInfo activityInfo);
	void deleteActivityInfo(String id);
}
