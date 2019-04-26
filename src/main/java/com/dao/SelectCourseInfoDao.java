//package com.dao;
//
//import java.util.List;
//
//import com.bean.SelectCourseInfo;
//
//public interface SelectCourseInfoDao {
//	SelectCourseInfo findSCById(String id);
//
//	List<SelectCourseInfo> findSCByName(String name);
//
//	List<SelectCourseInfo> findSCsByClass(String classname);
//
//	List<SelectCourseInfo> findSCsByDept(String dept);
//
//	void updateSCById(SelectCourseInfo selectCourse);
//
//	void insertSC(SelectCourseInfo selectCourse);
//
//	void deleteSCById(String id);
//
//	List<SelectCourseInfo> findSelectCourseInfo(String args);
//}
package com.dao;

import java.util.List;

import com.bean.SelectCourseInfo;

public interface SelectCourseInfoDao {
	SelectCourseInfo findSCById(String id);

	List<SelectCourseInfo> findSCByName(String name);

	List<SelectCourseInfo> findSCsByClass(String classname);

	List<SelectCourseInfo> findSCsByDept(String dept);

	void updateSCById(SelectCourseInfo selectCourse);

	void insertSC(SelectCourseInfo selectCourse);

	/*void deleteSCById(String id);*/

	List<SelectCourseInfo> findSelectCourseInfo(String args);

	void deleteSC(SelectCourseInfo selectCourseInfo);

}
