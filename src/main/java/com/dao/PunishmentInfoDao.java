package com.dao;

import java.util.List;

import com.bean.PunishmentInfo;

public interface PunishmentInfoDao {
	PunishmentInfo findPunishmentInfoById(String id);
	List<PunishmentInfo> findPunishmentInfoByName(String name);
	List<PunishmentInfo> findPunishmentInfosByClass(String classname);
	List<PunishmentInfo> findPunishmentInfosByDept(String dept);
	void insertPunishmentInfo(PunishmentInfo punishmentInfo);
	void updatePunishmentInfoById(PunishmentInfo punishmentInfo);
	void deletePunishmentInfoById(String id);
	
	List<PunishmentInfo> findPunishmentInfo(String args);
}
