//package com.service.Impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bean.SelectCourseInfo;
//import com.dao.Impl.SelectCourseInfoDaoImpl;
//import com.service.SelectCourseInfoService;
//
//@Service
//public class SelectCourseInfoServiceImpl implements SelectCourseInfoService{
//
//	@Autowired
//	SelectCourseInfoDaoImpl selectCourseInfoDaoImpl;
//	
//	@Override
//	public List<SelectCourseInfo> getSelectCourseInfo(String args) {
//		return selectCourseInfoDaoImpl.findSelectCourseInfo(args);
//	}
//
//	@Override
//	public void insetSelectCourseInfo(SelectCourseInfo selectCourseInfo) {
//		selectCourseInfoDaoImpl.insertSC(selectCourseInfo);
//	}
//
//	@Override
//	public void updateSelectCourseInfo(SelectCourseInfo selectCourseInfo) {
//		selectCourseInfoDaoImpl.updateSCById(selectCourseInfo);
//	}
//
//	@Override
//	public void deleteSelectCourseInfo(SelectCourseInfo selectCourseInfo) {
//		selectCourseInfoDaoImpl.deleteSC(selectCourseInfo);
//	}
//
//}
package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.SelectCourseInfo;
import com.dao.Impl.SelectCourseInfoDaoImpl;
import com.service.SelectCourseInfoService;

@Service
public class SelectCourseInfoServiceImpl implements SelectCourseInfoService{

	@Autowired
	SelectCourseInfoDaoImpl selectCourseInfoDaoImpl;
	
	@Override
	public List<SelectCourseInfo> getSelectCourseInfo(String args) {
		return selectCourseInfoDaoImpl.findSelectCourseInfo(args);
	}

	@Override
	public void insetSelectCourseInfo(SelectCourseInfo selectCourseInfo) {
		selectCourseInfoDaoImpl.insertSC(selectCourseInfo);
	}

	@Override
	public void updateSelectCourseInfo(SelectCourseInfo selectCourseInfo) {
		selectCourseInfoDaoImpl.updateSCById(selectCourseInfo);
	}

	@Override
	public void deleteSelectCourseInfo(SelectCourseInfo selectCourseInfo) {
		selectCourseInfoDaoImpl.deleteSC(selectCourseInfo);
	}

}
