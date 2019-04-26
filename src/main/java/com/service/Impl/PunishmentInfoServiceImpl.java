package com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.PunishmentInfo;
import com.dao.Impl.PunishmentInfoDaoImpl;
import com.service.PunishmentInfoService;

@Service
public class PunishmentInfoServiceImpl implements PunishmentInfoService{

	@Autowired
	PunishmentInfoDaoImpl punishmentInfoDaoImpl;
	
	@Override
	public List<PunishmentInfo> getPunishmentInfo(String args) {
		return punishmentInfoDaoImpl.findPunishmentInfo(args);
	}

	@Override
	public void insertPunishmentInfo(PunishmentInfo punishmentInfo) {
		punishmentInfoDaoImpl.insertPunishmentInfo(punishmentInfo);
	}

	@Override
	public void updatePunishmentInfo(PunishmentInfo punishmentInfo) {
		punishmentInfoDaoImpl.updatePunishmentInfoById(punishmentInfo);
	}

	@Override
	public void deletePunishmentInfo(String id) {
		punishmentInfoDaoImpl.deletePunishmentInfoById(id);
	}

}
