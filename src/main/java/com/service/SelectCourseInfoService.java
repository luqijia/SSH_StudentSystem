//package com.service;
//
//import java.util.List;
//
//import com.bean.SelectCourseInfo;
//
//public interface SelectCourseInfoService {
//	List<SelectCourseInfo> getSelectCourseInfo(String args);
//	void insetSelectCourseInfo(SelectCourseInfo selectCourseInfo);
//	void updateSelectCourseInfo(SelectCourseInfo selectCourseInfo);
//	void deleteSelectCourseInfo(SelectCourseInfo selectCourseInfo);
//}
package com.service;

import java.util.List;

import com.bean.SelectCourseInfo;

public interface SelectCourseInfoService {
	List<SelectCourseInfo> getSelectCourseInfo(String args);
	void insetSelectCourseInfo(SelectCourseInfo selectCourseInfo);
	void updateSelectCourseInfo(SelectCourseInfo selectCourseInfo);
	void deleteSelectCourseInfo(SelectCourseInfo id);
}
