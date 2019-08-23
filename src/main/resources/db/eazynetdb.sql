/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : eazynetdb

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 24/08/2019 01:07:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_estonian_ci NOT NULL COMMENT '主键id',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL DEFAULT NULL COMMENT '名称',
  `sex` int(1) NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL DEFAULT NULL COMMENT '地址',
  `mobile` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL DEFAULT NULL COMMENT '手机号',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `modify_user` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci NULL DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_estonian_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
