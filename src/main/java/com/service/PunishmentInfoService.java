package com.service;

import java.util.List;

import com.bean.PunishmentInfo;

public interface PunishmentInfoService {
	List<PunishmentInfo> getPunishmentInfo(String args);
	void insertPunishmentInfo(PunishmentInfo punishmentInfo);
	void updatePunishmentInfo(PunishmentInfo punishmentInfo);
	void deletePunishmentInfo(String id);
}
