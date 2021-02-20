-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: eazynetdb
-- ------------------------------------------------------
-- Server version 8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '名称',
  `nickname` varchar(45) COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '昵称',
  `first_name` varchar(45) COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '名字',
  `last_name` varchar(45) COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '姓氏',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '邮箱',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '地址',
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '手机号',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `create_user` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime DEFAULT NULL COMMENT '修改时间',
  `modify_user` varchar(20) CHARACTER SET utf8 COLLATE utf8_estonian_ci DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`id`),
  KEY `MOBILE_INDEX` (`phone`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
INSERT INTO `user_info` VALUES (1,'admin','系统管理员',NULL,NULL,0,NULL,NULL,NULL,'2021-02-20 13:48:16',NULL,'2021-02-20 13:48:16',NULL);
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-20 14:16:18
