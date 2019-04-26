//package com.service.Impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bean.ScoreInfo;
//import com.dao.Impl.ScoreInfoDaoImpl;
//import com.service.ScoreInfoService;
//
//@Service
//public class ScoreInfoServiceImpl implements ScoreInfoService{
//
//	@Autowired
//	ScoreInfoDaoImpl scoreInfoDaoImpl;	
//	@Override
//	public List<ScoreInfo> getScoreInfo(String args) {
//		return scoreInfoDaoImpl.findScoreInfo(args);
//	}
//
//	@Override
//	public void insertScoreInfo(ScoreInfo scoreInfo) {
//		scoreInfoDaoImpl.insertScoreInfo(scoreInfo);
//	}
//
//	@Override
//	public void updateScoreInfo(ScoreInfo scoreInfo) {
//		scoreInfoDaoImpl.updateScoreInfoById(scoreInfo);
//	}
//
////	@Override
////	public void deleteScoreInfo(String id) {
////		scoreInfoDaoImpl.deleteScoreInfoById(id);
////	}
//	
//	@Override
//	public void deleteScoreInfo(ScoreInfo id) {
//		scoreInfoDaoImpl.deleteScoreInfoById(id);
//	}
//
//}
package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ScoreInfo;
import com.dao.Impl.ScoreInfoDaoImpl;
import com.service.ScoreInfoService;

@Service
public class ScoreInfoServiceImpl implements ScoreInfoService{

	@Autowired
	ScoreInfoDaoImpl scoreInfoDaoImpl;	
	@Override
	public List<ScoreInfo> getScoreInfoAll() {
		return scoreInfoDaoImpl.findScoreInfo();
	}

	@Override
	public void insertScoreInfo(ScoreInfo scoreInfo) {
		scoreInfoDaoImpl.insertScoreInfo(scoreInfo);
	}

	@Override
	public void updateScoreInfo(ScoreInfo scoreInfo) {
		scoreInfoDaoImpl.updateScoreInfo(scoreInfo);
	}

	@Override
	public void deleteScoreInfo(ScoreInfo all) {
		scoreInfoDaoImpl.deleteScoreInfoByAll(all);
	}

}
