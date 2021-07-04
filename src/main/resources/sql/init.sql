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
-- DROP TABLE IF EXISTS `plugins`;
CREATE TABLE IF NOT EXISTS `plugins`  (
                            `id` INTEGER PRIMARY KEY,
                            `name` varchar  ,
                            `xml_id` varchar  ,
                            `version` varchar  ,
                            `until_build` varchar  ,
                            `since_build` varchar  ,
                            `description` varchar   ,
                            `vendor_email` varchar  ,
                            `vendor_url` varchar  ,
                            `change_notes` varchar  ,
                            `url` varchar  ,
                            `ctime` INTEGER ,
                            `rtime` INTEGER ,
                            PRIMARY KEY (`id`) USING BTREE
) ;

SET FOREIGN_KEY_CHECKS = 1;
