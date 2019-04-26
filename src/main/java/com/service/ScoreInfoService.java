//package com.service;
//
//import java.util.List;
//
//import com.bean.ScoreInfo;
//
//public interface ScoreInfoService {
//	List<ScoreInfo> getScoreInfo(String args);
//	void insertScoreInfo(ScoreInfo scoreInfo);
//	void updateScoreInfo(ScoreInfo scoreInfo);
//	void deleteScoreInfo(ScoreInfo id);
//}
package com.service;

import java.util.List;

import com.bean.ScoreInfo;

public interface ScoreInfoService {
	List<ScoreInfo> getScoreInfoAll();
	void insertScoreInfo(ScoreInfo scoreInfo);
	void updateScoreInfo(ScoreInfo scoreInfo);
	void deleteScoreInfo(ScoreInfo all);

}
