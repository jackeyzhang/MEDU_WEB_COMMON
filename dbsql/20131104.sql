CREATE DATABASE  IF NOT EXISTS `medu` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `medu`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: medu
-- ------------------------------------------------------
-- Server version	5.5.20

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
-- Table structure for table `classes`
--

DROP TABLE IF EXISTS `classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `schoolid` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `memberid` int(11) DEFAULT NULL,
  `classtime` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `school_fk_idx` (`schoolid`),
  KEY `teacher_fk_idx` (`memberid`),
  CONSTRAINT `teacher_fk` FOREIGN KEY (`memberid`) REFERENCES `member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `school_fk` FOREIGN KEY (`schoolid`) REFERENCES `school` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='班级信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes`
--

LOCK TABLES `classes` WRITE;
/*!40000 ALTER TABLE `classes` DISABLE KEYS */;
INSERT INTO `classes` VALUES (1,NULL,'XX课程0',NULL,'每周五'),(2,NULL,'XX课程1',NULL,'每周五'),(3,NULL,'XX课程2',NULL,'每周五'),(4,NULL,'XX课程3',NULL,'每周五'),(5,NULL,'XX课程4',NULL,'每周五'),(6,NULL,'XX课程5',NULL,'每周五'),(7,NULL,'XX课程6',NULL,'每周五'),(8,NULL,'XX课程7',NULL,'每周五'),(9,NULL,'XX课程8',NULL,'每周五'),(10,NULL,'XX课程9',NULL,'每周五'),(11,NULL,'XX课程10',NULL,'每周五'),(12,NULL,'XX课程11',NULL,'每周五'),(13,NULL,'XX课程12',NULL,'每周五'),(14,NULL,'XX课程13',NULL,'每周五'),(15,NULL,'XX课程14',NULL,'每周五'),(16,NULL,'XX课程15',NULL,'每周五'),(17,NULL,'XX课程16',NULL,'每周五'),(18,NULL,'XX课程17',NULL,'每周五'),(19,NULL,'XX课程18',NULL,'每周五'),(20,NULL,'XX课程19',NULL,'每周五'),(21,NULL,'XX课程20',NULL,'每周五'),(22,NULL,'XX课程21',NULL,'每周五'),(23,NULL,'XX课程22',NULL,'每周五'),(24,NULL,'XX课程23',NULL,'每周五'),(25,NULL,'XX课程24',NULL,'每周五'),(26,NULL,'XX课程25',NULL,'每周五'),(27,NULL,'XX课程26',NULL,'每周五'),(28,NULL,'XX课程27',NULL,'每周五'),(29,NULL,'XX课程28',NULL,'每周五'),(30,NULL,'XX课程29',NULL,'每周五');
/*!40000 ALTER TABLE `classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `grade` float DEFAULT NULL,
  `openStatus` int(11) DEFAULT NULL,
  `loginName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `resume` varchar(50) NOT NULL,
  `orgname` varchar(20) NOT NULL,
  `title` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='老师信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (6,'老师名字0','男',NULL,NULL,'email0@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(7,'老师名字1','男',NULL,NULL,'email1@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(8,'老师名字2','男',NULL,NULL,'email2@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(9,'老师名字3','男',NULL,NULL,'email3@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(10,'老师名字4','男',NULL,NULL,'email4@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(11,'老师名字5','男',NULL,NULL,'email5@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(12,'老师名字6','男',NULL,NULL,'email6@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(13,'老师名字7','男',NULL,NULL,'email7@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(14,'老师名字8','男',NULL,NULL,'email8@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(15,'老师名字9','男',NULL,NULL,'email9@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(16,'老师名字10','男',NULL,NULL,'email10@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(17,'老师名字11','男',NULL,NULL,'email11@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(18,'老师名字12','男',NULL,NULL,'email12@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(19,'老师名字13','男',NULL,NULL,'email13@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(20,'老师名字14','男',NULL,NULL,'email14@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(21,'老师名字15','男',NULL,NULL,'email15@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(22,'老师名字16','男',NULL,NULL,'email16@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(23,'老师名字17','男',NULL,NULL,'email17@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(24,'老师名字18','男',NULL,NULL,'email18@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(25,'老师名字19','男',NULL,NULL,'email19@139.com',NULL,NULL,'登录名','密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师'),(26,'老师名字0',NULL,NULL,NULL,'email0@139.com',NULL,NULL,'登录名','密码','个人简历0','公司名称0','title0'),(27,'老师名字1',NULL,NULL,NULL,'email1@139.com',NULL,NULL,'登录名','密码','个人简历1','公司名称1','title1'),(28,'老师名字2',NULL,NULL,NULL,'email2@139.com',NULL,NULL,'登录名','密码','个人简历2','公司名称2','title2'),(29,'老师名字3',NULL,NULL,NULL,'email3@139.com',NULL,NULL,'登录名','密码','个人简历3','公司名称3','title3'),(30,'老师名字4',NULL,NULL,NULL,'email4@139.com',NULL,NULL,'登录名','密码','个人简历4','公司名称4','title4'),(31,'老师名字5',NULL,NULL,NULL,'email5@139.com',NULL,NULL,'登录名','密码','个人简历5','公司名称5','title5'),(32,'老师名字6',NULL,NULL,NULL,'email6@139.com',NULL,NULL,'登录名','密码','个人简历6','公司名称6','title6'),(33,'老师名字7',NULL,NULL,NULL,'email7@139.com',NULL,NULL,'登录名','密码','个人简历7','公司名称7','title7'),(34,'老师名字8',NULL,NULL,NULL,'email8@139.com',NULL,NULL,'登录名','密码','个人简历8','公司名称8','title8'),(35,'老师名字9',NULL,NULL,NULL,'email9@139.com',NULL,NULL,'登录名','密码','个人简历9','公司名称9','title9'),(36,'老师名字10',NULL,NULL,NULL,'email10@139.com',NULL,NULL,'登录名','密码','个人简历10','公司名称10','title10'),(37,'老师名字11',NULL,NULL,NULL,'email11@139.com',NULL,NULL,'登录名','密码','个人简历11','公司名称11','title11'),(38,'老师名字12',NULL,NULL,NULL,'email12@139.com',NULL,NULL,'登录名','密码','个人简历12','公司名称12','title12'),(39,'老师名字13',NULL,NULL,NULL,'email13@139.com',NULL,NULL,'登录名','密码','个人简历13','公司名称13','title13'),(40,'老师名字14',NULL,NULL,NULL,'email14@139.com',NULL,NULL,'登录名','密码','个人简历14','公司名称14','title14'),(41,'老师名字15',NULL,NULL,NULL,'email15@139.com',NULL,NULL,'登录名','密码','个人简历15','公司名称15','title15'),(42,'老师名字16',NULL,NULL,NULL,'email16@139.com',NULL,NULL,'登录名','密码','个人简历16','公司名称16','title16'),(43,'老师名字17',NULL,NULL,NULL,'email17@139.com',NULL,NULL,'登录名','密码','个人简历17','公司名称17','title17'),(44,'老师名字18',NULL,NULL,NULL,'email18@139.com',NULL,NULL,'登录名','密码','个人简历18','公司名称18','title18'),(48,'新用户注册','男','null','33332123','zhangsan@XXX.com',-1,-1,'null','123','爱上大声地','汲原堂','CEO'),(49,'毛毛','男','null','7758521','zhangsan@XXX.com',-1,-1,'null','123','我是一名非常出色的语文老师，欢迎大家认识我','上海浦东第一小学','语文老师');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `from` int(11) NOT NULL,
  `to` int(11) NOT NULL,
  `hasread` varchar(2) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `content` varchar(4500) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `publisherid` int(11) NOT NULL,
  `orgname` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `datedesc` varchar(45) DEFAULT NULL,
  `content` varchar(45) DEFAULT NULL,
  `passed` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (1,12,'公司、组织、个人的名称','notice address:0','1/2/3 per week: 0','notice content:0',0),(2,12,'公司、组织、个人的名称','notice address:1','1/2/3 per week: 1','notice content:1',1),(3,12,'公司、组织、个人的名称','notice address:2','1/2/3 per week: 2','notice content:2',0),(4,12,'公司、组织、个人的名称','notice address:3','1/2/3 per week: 3','notice content:3',1),(5,12,'公司、组织、个人的名称','notice address:4','1/2/3 per week: 4','notice content:4',0),(6,12,'公司、组织、个人的名称','notice address:5','1/2/3 per week: 5','notice content:5',1),(7,12,'公司、组织、个人的名称','notice address:6','1/2/3 per week: 6','notice content:6',0),(8,12,'公司、组织、个人的名称','notice address:7','1/2/3 per week: 7','notice content:7',1),(9,12,'公司、组织、个人的名称','notice address:8','1/2/3 per week: 8','notice content:8',0),(10,12,'公司、组织、个人的名称','notice address:9','1/2/3 per week: 9','notice content:9',1),(11,12,'公司、组织、个人的名称','notice address:10','1/2/3 per week: 10','notice content:10',0),(12,12,'公司、组织、个人的名称','notice address:11','1/2/3 per week: 11','notice content:11',1),(13,12,'公司、组织、个人的名称','notice address:12','1/2/3 per week: 12','notice content:12',0),(14,12,'公司、组织、个人的名称','notice address:13','1/2/3 per week: 13','notice content:13',1),(15,12,'公司、组织、个人的名称','notice address:14','1/2/3 per week: 14','notice content:14',0),(16,12,'公司、组织、个人的名称','notice address:15','1/2/3 per week: 15','notice content:15',1),(17,12,'公司、组织、个人的名称','notice address:16','1/2/3 per week: 16','notice content:16',0),(18,12,'公司、组织、个人的名称','notice address:17','1/2/3 per week: 17','notice content:17',1),(19,12,'公司、组织、个人的名称','notice address:18','1/2/3 per week: 18','notice content:18',0),(20,12,'公司、组织、个人的名称','notice address:19','1/2/3 per week: 19','notice content:19',1),(21,12,'公司、组织、个人的名称','notice address:20','1/2/3 per week: 20','notice content:20',0),(22,12,'公司、组织、个人的名称','notice address:21','1/2/3 per week: 21','notice content:21',1),(23,12,'公司、组织、个人的名称','notice address:22','1/2/3 per week: 22','notice content:22',0),(24,12,'公司、组织、个人的名称','notice address:23','1/2/3 per week: 23','notice content:23',1),(25,12,'公司、组织、个人的名称','notice address:24','1/2/3 per week: 24','notice content:24',0),(26,12,'公司、组织、个人的名称','notice address:25','1/2/3 per week: 25','notice content:25',1),(27,12,'公司、组织、个人的名称','notice address:26','1/2/3 per week: 26','notice content:26',0),(28,12,'公司、组织、个人的名称','notice address:27','1/2/3 per week: 27','notice content:27',1),(29,12,'公司、组织、个人的名称','notice address:28','1/2/3 per week: 28','notice content:28',0),(30,12,'公司、组织、个人的名称','notice address:29','1/2/3 per week: 29','notice content:29',1);
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `org`
--

DROP TABLE IF EXISTS `org`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `org` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  `manager` varchar(45) NOT NULL,
  `loginName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='公司信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `org`
--

LOCK TABLES `org` WRITE;
/*!40000 ALTER TABLE `org` DISABLE KEYS */;
INSERT INTO `org` VALUES (5,'汲原堂','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(9,'魏斌斌','祁连山路2389弄','123321213123','魏斌斌','weibinbin','wbb'),(10,'123','321','3','123','3','2'),(14,'6','7','3','8','2','4'),(16,'33332','223','33123','33','123','332123'),(17,'w2w','2w','ww2w2w2','ww','wwwwwww','2ww2w2w'),(18,'w2w','2w','ww2w2w2','ww','wwwwwww','2ww2w2w'),(19,'123','123','123','123','123','123'),(20,'3123123123','312312','132123123123','2123','3123123','31223123'),(22,'dan','池塘','123123131','王八','adn','adadsad'),(23,'汲原堂','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(24,'汲原堂0','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(25,'汲原堂1','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(26,'汲原堂2','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(27,'汲原堂3','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(28,'汲原堂4','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(29,'汲原堂5','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(30,'汲原堂6','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(31,'汲原堂7','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(32,'汲原堂8','延平路69号601B','15236362525','MisMa','jiyuantang','123456'),(33,'汲原堂9','延平路69号601B','15236362525','MisMa','jiyuantang','123456');
/*!40000 ALTER TABLE `org` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `school`
--

DROP TABLE IF EXISTS `school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `orgid` int(11) DEFAULT NULL,
  `loginname` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `org_fk_idx` (`orgid`),
  CONSTRAINT `org_fk` FOREIGN KEY (`orgid`) REFERENCES `org` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='学校信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `school`
--

LOCK TABLES `school` WRITE;
/*!40000 ALTER TABLE `school` DISABLE KEYS */;
INSERT INTO `school` VALUES (1,'静安教学点',NULL,5,'jingan',NULL),(2,'静安教学点',NULL,23,'jingan',NULL),(3,'静安教学点0',NULL,24,'jingan',NULL),(4,'静安教学点1',NULL,25,'jingan',NULL),(5,'静安教学点2',NULL,26,'jingan',NULL),(6,'静安教学点3',NULL,27,'jingan',NULL),(7,'静安教学点4',NULL,28,'jingan',NULL),(8,'静安教学点5',NULL,29,'jingan',NULL),(9,'静安教学点6',NULL,30,'jingan',NULL),(10,'静安教学点7',NULL,31,'jingan',NULL),(11,'静安教学点8',NULL,32,'jingan',NULL),(12,'静安教学点9',NULL,33,'jingan',NULL);
/*!40000 ALTER TABLE `school` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classId` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `contact` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `parent` varchar(45) DEFAULT NULL,
  `loginName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `class_fk_idx` (`classId`),
  CONSTRAINT `class_fk` FOREIGN KEY (`classId`) REFERENCES `classes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `web_ui`
--

DROP TABLE IF EXISTS `web_ui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `web_ui` (
  `id` int(11) NOT NULL,
  `title` varchar(50) DEFAULT NULL,
  `context` varchar(5000) DEFAULT NULL,
  `hint` varchar(500) DEFAULT NULL,
  `alert` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='界面定制化表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `web_ui`
--

LOCK TABLES `web_ui` WRITE;
/*!40000 ALTER TABLE `web_ui` DISABLE KEYS */;
/*!40000 ALTER TABLE `web_ui` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-11-04 17:48:14
