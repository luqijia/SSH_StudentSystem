package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ActivityInfo;
import com.dao.Impl.ActivityInfoDaoImpl;
import com.service.ActivityInfoService;

@Service
public class ActivityInfoServiceImpl implements ActivityInfoService{

	@Autowired
	ActivityInfoDaoImpl activityInfoDaoImpl;
	
	@Override
	public List<ActivityInfo> getActivityInfo(String args) {
//		return activityInfoDaoImpl.findActivityInfo(args);
		return activityInfoDaoImpl.findAll();
	}

	@Override
	public void insertActivityInfo(ActivityInfo activityInfo) {
		activityInfoDaoImpl.insertActivityInfo(activityInfo);
	}

	@Override
	public void updateActivityInfo(ActivityInfo activityInfo) {
		activityInfoDaoImpl.updateActivityInfoById(activityInfo);
	}

	@Override
	public void deleteActivityInfo(String id) {
		activityInfoDaoImpl.deleteActivityInfoById(id);
	}

}
