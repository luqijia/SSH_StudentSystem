/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50558
Source Host           : localhost:3306
Source Database       : ssh_studentsystem

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2019-04-26 21:24:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_activity
-- ----------------------------
DROP TABLE IF EXISTS `tb_activity`;
CREATE TABLE `tb_activity` (
  `activityContent` varchar(255) NOT NULL,
  `studentId` varchar(20) NOT NULL,
  `className` varchar(255) NOT NULL,
  `data` varchar(255) NOT NULL,
  `deptName` varchar(255) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  PRIMARY KEY (`activityContent`,`studentId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_punishment
-- ----------------------------
DROP TABLE IF EXISTS `tb_punishment`;
CREATE TABLE `tb_punishment` (
  `studentId` varchar(20) NOT NULL,
  `className` varchar(255) NOT NULL,
  `data` varchar(255) NOT NULL,
  `deptName` varchar(255) NOT NULL,
  `punishmentContent` varchar(255) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  PRIMARY KEY (`studentId`,`punishmentContent`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_reward
-- ----------------------------
DROP TABLE IF EXISTS `tb_reward`;
CREATE TABLE `tb_reward` (
  `studentId` varchar(20) NOT NULL,
  `className` varchar(255) NOT NULL,
  `data` varchar(255) NOT NULL,
  `deptName` varchar(255) NOT NULL,
  `rewardContent` varchar(255) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  PRIMARY KEY (`studentId`,`rewardContent`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_sc
-- ----------------------------
DROP TABLE IF EXISTS `tb_sc`;
CREATE TABLE `tb_sc` (
  `studentId` varchar(20) NOT NULL,
  `className` varchar(255) NOT NULL,
  `courseName` varchar(255) NOT NULL,
  `credits` int(11) NOT NULL,
  `deptName` varchar(255) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  `teacherName` varchar(255) NOT NULL,
  PRIMARY KEY (`studentId`,`courseName`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_score
-- ----------------------------
DROP TABLE IF EXISTS `tb_score`;
CREATE TABLE `tb_score` (
  `studentId` varchar(20) NOT NULL,
  `className` varchar(255) NOT NULL,
  `courseName` varchar(255) NOT NULL,
  `deptName` varchar(255) NOT NULL,
  `score` int(11) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  `teacherName` varchar(255) NOT NULL,
  PRIMARY KEY (`studentId`,`courseName`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `studentId` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  `className` varchar(255) NOT NULL,
  `dept` varchar(255) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `state` varchar(255) NOT NULL,
  `studentName` varchar(255) NOT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_studenttest
-- ----------------------------
DROP TABLE IF EXISTS `tb_studenttest`;
CREATE TABLE `tb_studenttest` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) DEFAULT NULL,
  `s_no` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_io7qv4oca2cc2siqtkebh5mfh` (`s_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
