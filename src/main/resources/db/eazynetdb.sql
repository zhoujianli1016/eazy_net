-- 用户信息
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '唯一主键',
  `created_date` int(11) DEFAULT NULL COMMENT '创建时间戳',
  `created_user` varchar(45) DEFAULT NULL COMMENT '创建人',
  `modifyed_date` int(11) DEFAULT NULL COMMENT '更新时间戳',
  `modifyed_user` varchar(45) DEFAULT NULL COMMENT '更新人',
  `first_name` varchar(45) DEFAULT NULL COMMENT '姓氏',
  `last_name` varchar(45) DEFAULT NULL COMMENT '名字',
  `username` varchar(45) DEFAULT NULL COMMENT '姓名',
  `nickname` varchar(45) DEFAULT NULL COMMENT '昵称',
  `sex` tinyint(1) NOT NULL DEFAULT '-1' COMMENT '性别：-1其他、0男、1女',
  `email` varchar(45) DEFAULT NULL COMMENT '邮箱地址',
  `address` varchar(45) DEFAULT NULL COMMENT '地址',
  `phone` varchar(45) DEFAULT NULL COMMENT '手机号',
  `valid` bit(1) NOT NULL DEFAULT b'1' COMMENT '有效性：0无效、1有效',
  PRIMARY KEY (`id`),
  KEY `created_date_index` (`created_date`) USING BTREE,
  KEY `modifyed_date_index` (`modifyed_date`) USING BTREE,
  KEY `sex_index` (`sex`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息'