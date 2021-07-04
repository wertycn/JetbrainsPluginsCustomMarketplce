/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : 81.70.244.96:13306
 Source Schema         : jpcm

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 04/07/2021 11:03:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for plugins
-- ----------------------------
DROP TABLE IF EXISTS `plugins`;
CREATE TABLE `plugins`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `xml_id` varchar(255) NOT NULL,
  `version` varchar(255) NULL DEFAULT NULL,
  `until_build` varchar(255) NULL DEFAULT NULL,
  `since_build` varchar(255) NULL DEFAULT NULL,
  `description` text NULL,
  `vendor_email` varchar(255) NULL DEFAULT NULL,
  `vendor_url` varchar(255) NULL DEFAULT NULL,
  `change_notes` text NULL,
  `url` varchar(255) NOT NULL,
  `ctime` datetime NOT NULL,
  `rtime` datetime NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
