-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: mysql3.gear.host    Database: quickroom1
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
  `Room_ID` int(11) NOT NULL AUTO_INCREMENT,
  `City` varchar(45) DEFAULT NULL,
  `State` varchar(45) DEFAULT NULL,
  `Country` varchar(45) DEFAULT NULL,
  `Max_Occupancy` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Room_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'Chicago','Illinios','United States','1'),(2,'Queens','New York','United States','3'),(3,'Munich','Bavaria','Germany','2'),(4,'Paris',NULL,'France','5'),(5,'Los Angeles','California','United States','2'),(6,'Salt Lake City','Utah','United States','1'),(7,'Rome',NULL,'Italy','1'),(8,'Punta Cana',NULL,'Dominican Republic','2'),(9,'Austin','Texas','United States','4'),(10,'Dallas','Texas','United States','1'),(12,'Dublin',NULL,'Ierland','3'),(13,'London',NULL,'England','1'),(14,'Manchester',NULL,'England','2'),(15,'Syracuse','New York','United States','3'),(16,'Rome ',NULL,'Italy','3'),(17,'Paris',NULL,'France','4'),(18,'Quuens','New York','United States','2'),(19,'Toronto',NULL,'Canada','2'),(20,'Niagra Falls',NULL,'Canada','5'),(21,'','','',''),(22,'','','',''),(23,'','','',''),(24,'','','',''),(25,'','','','');
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

-- Dump completed on 2016-11-27 21:03:20
