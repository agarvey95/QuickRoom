-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: quickroom1
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Room_name` varchar(45) NOT NULL,
  `Con_num` int(11) NOT NULL,
  `City` varchar(45) DEFAULT NULL,
  `Country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'S-101',1001,'New York City','United States'),(2,'S-102',1002,'New York City','United States'),(3,'S-103',1003,'New York City','United States'),(4,'S-104',1004,'New York City','United States'),(5,'S-201',1005,'New York City','United States'),(6,'S-202',1006,'New York City','United States'),(7,'S-203',1007,'New York City','United States'),(8,'S-204',1008,'New York City','United States'),(9,'S-301',1009,'New York City','United States'),(10,'S-302',1010,'New York City','United States'),(11,'S-303',1011,'New York City','United States'),(12,'S-304',1012,'New York City','United States'),(13,'S-401',1013,'New York City','United States'),(14,'S-402',1014,'New York City','United States'),(15,'S-403',1015,'New York City','United States'),(16,'S-404',1016,'New York City','United States'),(17,'S-101',1017,'Rome','Italy'),(18,'S-102',1018,'Rome','Italy'),(19,'S-103',1019,'Rome','Italy'),(20,'S-104',1020,'Rome','Italy'),(21,'S-201',1021,'Rome','Italy'),(22,'S-202',1022,'Rome','Italy'),(23,'S-203',1023,'Rome','Italy'),(24,'S-204',1024,'Rome','Italy'),(25,'S-301',1025,'Rome','Italy'),(26,'S-302',1026,'Rome','Italy'),(27,'S-303',1027,'Rome','Italy'),(28,'S-304',1028,'Rome','Italy'),(29,'S-401',1029,'Rome','Italy'),(30,'S-402',1030,'Rome','Italy'),(31,'S-403',1031,'Rome','Italy'),(32,'S-404',1032,'Rome','Italy'),(33,'S-101',1033,'Chicago','United States'),(34,'S-102',1034,'Chicago','United States'),(35,'S-103',1035,'Chicago','United States'),(36,'S-104',1036,'Chicago','United States'),(37,'S-201',1037,'Chicago','United States'),(38,'S-202',1038,'Chicago','United States'),(39,'S-203',1039,'Chicago','United States'),(40,'S-204',1040,'Chicago','United States'),(41,'S-301',1041,'Chicago','United States'),(42,'S-302',1042,'Chicago','United States'),(43,'S-303',1043,'Chicago','United States'),(44,'S-304',1044,'Chicago','United States'),(45,'S-401',1045,'Chicago','United States'),(46,'S-402',1046,'Chicago','United States'),(47,'S-403',1047,'Chicago','United States'),(48,'S-404',1048,'Chicago','United States'),(49,'S-101',1049,'Munich','Germany'),(50,'S-102',1050,'Munich','Germany'),(51,'S-103',1051,'Munich','Germany'),(52,'S-104',1052,'Munich','Germany'),(53,'S-201',1053,'Munich','Germany'),(54,'S-202',1054,'Munich','Germany'),(55,'S-203',1055,'Munich','Germany'),(56,'S-204',1056,'Munich','Germany'),(57,'S-301',1057,'Munich','Germany'),(58,'S-302',1058,'Munich','Germany'),(59,'S-303',1059,'Munich','Germany'),(60,'S-304',1060,'Munich','Germany'),(61,'S-401',1061,'Munich','Germany'),(62,'S-402',1062,'Munich','Germany'),(63,'S-403',1063,'Munich','Germany'),(64,'S-404',1064,'Munich','Germany'),(65,'S-101',1065,'Toronto','Canada'),(66,'S-102',1066,'Toronto','Canada'),(67,'S-103',1067,'Toronto','Canada'),(68,'S-104',1068,'Toronto','Canada'),(69,'S-201',1069,'Toronto','Canada'),(70,'S-202',1070,'Toronto','Canada'),(71,'S-203',1071,'Toronto','Canada'),(72,'S-204',1072,'Toronto','Canada'),(73,'S-301',1073,'Toronto','Canada'),(74,'S-302',1074,'Toronto','Canada'),(75,'S-303',1075,'Toronto','Canada'),(76,'S-304',1076,'Toronto','Canada'),(77,'S-401',1077,'Toronto','Canada'),(78,'S-402',1078,'Toronto','Canada'),(79,'S-403',1079,'Toronto','Canada'),(80,'S-404',1080,'Toronto','Canada'),(81,'S-101',1081,'Boston','United States'),(82,'S-102',1082,'Boston','United States'),(83,'S-103',1083,'Boston','United States'),(84,'S-104',1084,'Boston','United States'),(85,'S-201',1085,'Boston','United States'),(86,'S-202',1086,'Boston','United States'),(87,'S-203',1087,'Boston','United States'),(88,'S-204',1088,'Boston','United States'),(89,'S-301',1089,'Boston','United States'),(90,'S-302',1090,'Boston','United States'),(91,'S-303',1091,'Boston','United States'),(92,'S-304',1092,'Boston','United States'),(93,'S-401',1093,'Boston','United States'),(94,'S-402',1094,'Boston','United States'),(95,'S-403',1095,'Boston','United States'),(96,'S-404',1096,'Boston','United States'),(97,'S-101',1097,'Dublin','Ierland'),(98,'S-102',1098,'Dublin','Ierland'),(99,'S-103',1099,'Dublin','Ierland'),(100,'S-104',1100,'Dublin','Ierland'),(101,'S-201',1101,'Dublin','Ierland'),(102,'S-202',1102,'Dublin','Ierland'),(103,'S-203',1103,'Dublin','Ierland'),(104,'S-204',1104,'Dublin','Ierland'),(105,'S-301',1105,'Dublin','Ierland'),(106,'S-302',1106,'Dublin','Ierland'),(107,'S-303',1107,'Dublin','Ierland'),(108,'S-304',1108,'Dublin','Ierland'),(109,'S-401',1109,'Dublin','Ierland'),(110,'S-402',1110,'Dublin','Ierland'),(111,'S-403',1111,'Dublin','Ierland'),(112,'S-404',1112,'Dublin','Ierland'),(113,'S-101',1113,'Punta Cana','Dominican Republic'),(114,'S-102',1114,'Punta Cana','Dominican Republic'),(115,'S-103',1115,'Punta Cana','Dominican Republic'),(116,'S-104',1116,'Punta Cana','Dominican Republic'),(117,'S-201',1117,'Punta Cana','Dominican Republic'),(118,'S-202',1118,'Punta Cana','Dominican Republic'),(119,'S-203',1119,'Punta Cana','Dominican Republic'),(120,'S-204',1120,'Punta Cana','Dominican Republic'),(121,'S-301',1121,'Punta Cana','Dominican Republic'),(122,'S-302',1122,'Punta Cana','Dominican Republic'),(123,'S-303',1123,'Punta Cana','Dominican Republic'),(124,'S-304',1124,'Punta Cana','Dominican Republic'),(125,'S-401',1125,'Punta Cana','Dominican Republic'),(126,'S-402',1126,'Punta Cana','Dominican Republic'),(127,'S-403',1127,'Punta Cana','Dominican Republic'),(128,'S-404',1128,'Punta Cana','Dominican Republic');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-08 16:06:38
