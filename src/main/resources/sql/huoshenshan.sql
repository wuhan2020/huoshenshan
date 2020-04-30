/*
Navicat MySQL Data Transfer

Source Server         : 
Source Server Version : 50647
Source Host           : 
Source Database       : huoshenshan

Target Server Type    : MYSQL
Target Server Version : 50647
File Encoding         : 65001

Date: 2020-04-30 16:50:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for vedio
-- ----------------------------
DROP TABLE IF EXISTS `vedio`;
CREATE TABLE `vedio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(255) DEFAULT NULL,
  `fileExtension` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  `updatedTime` datetime DEFAULT NULL,
  `hackathonId` int(11) DEFAULT NULL,
  `hackathonStage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vedio
-- ----------------------------
