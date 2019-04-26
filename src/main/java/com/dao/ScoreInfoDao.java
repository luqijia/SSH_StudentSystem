//package com.dao;
//
//import java.util.List;
//
//import com.bean.ScoreInfo;
//
//public interface ScoreInfoDao {
//	ScoreInfo findScoreInfoById(String id);
//	List<ScoreInfo> findScoreInfoByName(String name);
//	List<ScoreInfo> findScoreInfosByClass(String classname);
//	List<ScoreInfo> findScoreInfosByDept(String dept);
//	void insertScoreInfo(ScoreInfo scoreInfo);
//	void updateScoreInfoById(ScoreInfo scoreInfo);
////	void deleteScoreInfoById(String id);
//	void deleteScoreInfoById(ScoreInfo id);
//	
//	List<ScoreInfo> findScoreInfo(String args);
//}
package com.dao;

import java.util.List;

import com.bean.ScoreInfo;

public interface ScoreInfoDao {
	void insertScoreInfo(ScoreInfo scoreInfo);
	void updateScoreInfo(ScoreInfo scoreInfo);
	void deleteScoreInfoByAll(ScoreInfo aLL);
	List<ScoreInfo> findScoreInfo();

}

