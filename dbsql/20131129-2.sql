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
-- Table structure for table `cls`
--

DROP TABLE IF EXISTS `cls`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cls` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `teachername` varchar(45) NOT NULL,
  `contact` varchar(145) DEFAULT NULL,
  `classtime` varchar(145) DEFAULT NULL,
  `classaddress` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cls`
--

LOCK TABLES `cls` WRITE;
/*!40000 ALTER TABLE `cls` DISABLE KEYS */;
INSERT INTO `cls` VALUES (5,'周五语文课','张老师','362365332','时间描述','浦东新区张杨路123号'),(6,'周五语文课','张老师','362365332','时间描述','浦东新区张杨路123号'),(7,'周六语文课','张老师','362365332','时间描述','浦东新区张杨路123号'),(8,'周三语文课','张老师','362365332','时间描述','浦东新区张杨路123号');
/*!40000 ALTER TABLE `cls` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cls_member`
--

DROP TABLE IF EXISTS `cls_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cls_member` (
  `idcls_member` int(11) NOT NULL AUTO_INCREMENT,
  `cls_id` int(11) NOT NULL,
  `member_id` int(11) NOT NULL,
  PRIMARY KEY (`idcls_member`),
  KEY `clsfk_idx` (`cls_id`),
  KEY `memberfk_idx` (`member_id`),
  CONSTRAINT `clsfk` FOREIGN KEY (`cls_id`) REFERENCES `cls` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `memberfk` FOREIGN KEY (`member_id`) REFERENCES `member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cls_member`
--

LOCK TABLES `cls_member` WRITE;
/*!40000 ALTER TABLE `cls_member` DISABLE KEYS */;
INSERT INTO `cls_member` VALUES (6,6,86),(7,7,87),(8,7,87),(9,8,88);
/*!40000 ALTER TABLE `cls_member` ENABLE KEYS */;
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
  `icon` varchar(45) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `grade` float DEFAULT NULL,
  `openStatus` int(11) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `resume` varchar(50) DEFAULT NULL,
  `orgname` varchar(20) DEFAULT NULL,
  `title` varchar(10) DEFAULT NULL,
  `chara` varchar(10) NOT NULL,
  `city` varchar(20) DEFAULT NULL,
  `area` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='老师信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (6,'老师名字0','icons/header/user_female1.png','女',NULL,NULL,'email0@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(7,'老师名字1','icons/header/user_male1.png','男',NULL,NULL,'email1@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(8,'老师名字2','icons/header/user_female1.png','女',NULL,NULL,'email2@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(9,'老师名字3','icons/header/user_male2.png','男','null','321','email3@139.com',-1,-1,'123','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(10,'老师名字4','icons/header/user_female1.png','女',NULL,NULL,'email4@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(11,'老师名字5','icons/header/user_male1.png','男',NULL,NULL,'email5@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(12,'老师名字6','icons/header/user_female1.png','女',NULL,NULL,'email6@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(13,'老师名字7','icons/header/user_male1.png','男',NULL,NULL,'email7@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(14,'老师名字8','icons/header/user_female1.png','女',NULL,NULL,'email8@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(15,'老师名字9','icons/header/user_male1.png','男',NULL,NULL,'email9@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(16,'老师名字10','icons/header/user_female1.png','女',NULL,NULL,'email10@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(17,'老师名字11','icons/header/user_male1.png','男',NULL,NULL,'email11@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(18,'老师名字12','icons/header/user_female1.png','女',NULL,NULL,'email12@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(19,'老师名字13','icons/header/user_male1.png','男',NULL,NULL,'email13@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(20,'老师名字14','icons/header/user_female1.png','女',NULL,NULL,'email14@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(21,'老师名字15','icons/header/user_male1.png','男',NULL,NULL,'email15@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(22,'老师名字16','icons/header/user_female1.png','女',NULL,NULL,'email16@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(23,'老师名字17','icons/header/user_male1.png','男',NULL,NULL,'email17@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(24,'老师名字18','icons/header/user_female1.png','女',NULL,NULL,'email18@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(25,'老师名字19','icons/header/user_male1.png','男',NULL,NULL,'email19@139.com',NULL,NULL,'密码','老师基本情况，相关信息，教学擅长等等信息','XX学校/机构','职位：主管/老师','teacher','上海','浦东新区'),(26,'老师名字0','icons/header/user_female1.png','女',NULL,NULL,'email0@139.com',NULL,NULL,'密码','个人简历0','公司名称0','title0','teacher','上海','浦东新区'),(27,'老师名字1','icons/header/user_male1.png',NULL,NULL,NULL,'email1@139.com',NULL,NULL,'密码','个人简历1','公司名称1','title1','teacher','上海','浦东新区'),(28,'老师名字2','icons/header/user_female1.png','女',NULL,NULL,'email2@139.com',NULL,NULL,'密码','个人简历2','公司名称2','title2','teacher','上海','浦东新区'),(29,'老师名字3','icons/header/user_male1.png',NULL,NULL,NULL,'email3@139.com',NULL,NULL,'密码','个人简历3','公司名称3','title3','teacher','上海','浦东新区'),(30,'老师名字4','icons/header/user_female1.png','女',NULL,NULL,'email4@139.com',NULL,NULL,'密码','个人简历4','公司名称4','title4','teacher','上海','浦东新区'),(31,'老师名字5','icons/header/user_male1.png',NULL,NULL,NULL,'email5@139.com',NULL,NULL,'密码','个人简历5','公司名称5','title5','teacher','上海','浦东新区'),(32,'老师名字6','icons/header/user_female1.png','女',NULL,NULL,'email6@139.com',NULL,NULL,'密码','个人简历6','公司名称6','title6','teacher','上海','浦东新区'),(33,'老师名字7','icons/header/user_male1.png',NULL,NULL,NULL,'email7@139.com',NULL,NULL,'密码','个人简历7','公司名称7','title7','teacher','上海','浦东新区'),(34,'老师名字8','icons/header/user_female1.png','女',NULL,NULL,'email8@139.com',NULL,NULL,'密码','个人简历8','公司名称8','title8','teacher','上海','浦东新区'),(35,'老师名字9','icons/header/user_male1.png',NULL,NULL,NULL,'email9@139.com',NULL,NULL,'密码','个人简历9','公司名称9','title9','teacher','上海','浦东新区'),(36,'老师名字10','icons/header/user_female1.png','女',NULL,NULL,'email10@139.com',NULL,NULL,'密码','个人简历10','公司名称10','title10','teacher','上海','浦东新区'),(37,'老师名字11','icons/header/user_male1.png',NULL,NULL,NULL,'email11@139.com',NULL,NULL,'密码','个人简历11','公司名称11','title11','teacher','上海','浦东新区'),(38,'老师名字12','icons/header/user_female1.png','女',NULL,NULL,'email12@139.com',NULL,NULL,'密码','个人简历12','公司名称12','title12','teacher','上海','浦东新区'),(39,'老师名字13','icons/header/user_male1.png',NULL,NULL,NULL,'email13@139.com',NULL,NULL,'密码','个人简历13','公司名称13','title13','teacher','上海','浦东新区'),(40,'老师名字14','icons/header/user_female1.png','女',NULL,NULL,'email14@139.com',NULL,NULL,'密码','个人简历14','公司名称14','title14','teacher','上海','浦东新区'),(41,'老师名字15','icons/header/user_male1.png',NULL,NULL,NULL,'email15@139.com',NULL,NULL,'密码','个人简历15','公司名称15','title15','teacher','上海','浦东新区'),(42,'老师名字16','icons/header/user_female1.png','女',NULL,NULL,'email16@139.com',NULL,NULL,'密码','个人简历16','公司名称16','title16','teacher','上海','浦东新区'),(43,'老师名字17','icons/header/user_male1.png',NULL,NULL,NULL,'email17@139.com',NULL,NULL,'密码','个人简历17','公司名称17','title17','teacher','上海','浦东新区'),(44,'老师名字18','icons/header/user_female1.png','女',NULL,NULL,'email18@139.com',NULL,NULL,'密码','个人简历18','公司名称18','title18','teacher','上海','浦东新区'),(48,'新用户注册','icons/header/user_female1.png','女','null','33332123','zhangsan@XXX.com',-1,-1,'123','爱上大声地','汲原堂','CEO','teacher','上海','浦东新区'),(49,'毛毛','icons/header/user_male1.png','男','null','7758521','zhangsan@XXX.com',-1,-1,'123','我是一名非常出色的语文老师，欢迎大家认识我','上海浦东第一小学','语文老师','teacher','上海','浦东新区'),(51,'mary','icons/header/user_male1.png','女','null','321321','zhangsan@XXX.com',-1,-1,'123','经验丰富身强力壮','美国阿肯色州大学','艺术老师','teacher','上海','浦东新区'),(52,'fuck','icons/header/user_female1.png','女','null','7758521','zhangsan@XXX.com',-1,-1,'123','this is amazing teacher','medu colleage','teacher','teacher','上海','浦东新区'),(53,'marry','icons/header/user_male1.png','女','null','77677887','zhangsan@XXX.com',-1,-1,'777777','汲原堂最佳老师；东方之星最佳老师。','汲原堂','教学主管','teacher','上海','浦东新区'),(54,'老师0','icons/header/user_female1.png','女',NULL,NULL,'email0@139.com',NULL,NULL,'密码','个人简历0','公司名称0','title0','normal',NULL,NULL),(55,'老师1','icons/header/user_male1.png',NULL,NULL,NULL,'email1@139.com',NULL,NULL,'密码','个人简历1','公司名称1','title1','normal',NULL,NULL),(56,'老师2','icons/header/user_female1.png','女',NULL,NULL,'email2@139.com',NULL,NULL,'密码','个人简历2','公司名称2','title2','normal',NULL,NULL),(57,'老师3','icons/header/user_male1.png',NULL,NULL,NULL,'email3@139.com',NULL,NULL,'密码','个人简历3','公司名称3','title3','normal',NULL,NULL),(58,'老师4','icons/header/user_female1.png','女',NULL,NULL,'email4@139.com',NULL,NULL,'密码','个人简历4','公司名称4','title4','normal',NULL,NULL),(59,'老师5','icons/header/user_male1.png',NULL,NULL,NULL,'email5@139.com',NULL,NULL,'密码','个人简历5','公司名称5','title5','normal',NULL,NULL),(60,'老师6','icons/header/user_female1.png','女',NULL,NULL,'email6@139.com',NULL,NULL,'密码','个人简历6','公司名称6','title6','normal',NULL,NULL),(61,'老师7','icons/header/user_male1.png',NULL,NULL,NULL,'email7@139.com',NULL,NULL,'密码','个人简历7','公司名称7','title7','normal',NULL,NULL),(62,'老师8','icons/header/user_female1.png','女',NULL,NULL,'email8@139.com',NULL,NULL,'密码','个人简历8','公司名称8','title8','normal',NULL,NULL),(63,'老师9','icons/header/user_male1.png',NULL,NULL,NULL,'email9@139.com',NULL,NULL,'密码','个人简历9','公司名称9','title9','normal',NULL,NULL),(64,'老师10','icons/header/user_female1.png','女',NULL,NULL,'email10@139.com',NULL,NULL,'密码','个人简历10','公司名称10','title10','normal',NULL,NULL),(65,'老师11','icons/header/user_male1.png',NULL,NULL,NULL,'email11@139.com',NULL,NULL,'密码','个人简历11','公司名称11','title11','normal',NULL,NULL),(66,'老师12','icons/header/user_female1.png','女',NULL,NULL,'email12@139.com',NULL,NULL,'密码','个人简历12','公司名称12','title12','normal',NULL,NULL),(67,'老师13','icons/header/user_male1.png',NULL,NULL,NULL,'email13@139.com',NULL,NULL,'密码','个人简历13','公司名称13','title13','normal',NULL,NULL),(68,'老师14','icons/header/user_female1.png','女',NULL,NULL,'email14@139.com',NULL,NULL,'密码','个人简历14','公司名称14','title14','normal',NULL,NULL),(69,'老师15','icons/header/user_male1.png',NULL,NULL,NULL,'email15@139.com',NULL,NULL,'密码','个人简历15','公司名称15','title15','normal',NULL,NULL),(70,'老师16','icons/header/user_female1.png','女',NULL,NULL,'email16@139.com',NULL,NULL,'密码','个人简历16','公司名称16','title16','normal',NULL,NULL),(71,'老师17','icons/header/user_male1.png',NULL,NULL,NULL,'email17@139.com',NULL,NULL,'密码','个人简历17','公司名称17','title17','normal',NULL,NULL),(72,'老师18','icons/header/user_female1.png','女',NULL,NULL,'email18@139.com',NULL,NULL,'密码','个人简历18','公司名称18','title18','normal',NULL,NULL),(73,'老师19','icons/header/user_male1.png',NULL,NULL,NULL,'email19@139.com',NULL,NULL,'密码','个人简历19','公司名称19','title19','normal',NULL,NULL),(74,'tt','icons/header/user_female1.png','女','null','12345677','zhangsan@XXX.com',-1,-1,'tt','this is a super man,','heaven','god','teacher','null','null'),(75,'qq','icons/header/user_male1.png','女','null','123321123123','zhangsan@XXX.com',-1,-1,'333','宝山最好的老师','宝山一中','语文老师','teacher','上海','宝山'),(76,'123','icons/header/user_female1.png','男','null','123','zhangsan@XXX.com',-1,-1,'321','222','333','语文老师','teacher','铁岭','一朵花'),(77,'123','icons/header/user_male1.png','女','null','null','zhangsan@XXX.com',-1,-1,'wuhaha','null','null','null','normal','null','null'),(81,'jackey','icons/header/user_female2.png','女','null','123123','zhangsan@XXX.com',-1,-1,'123','我是一个数学老师','浦东第一大学','高数老师','teacher','上海','宝山'),(82,'王小二','icons/header/user_male1.png','男','','1235896624','zhangchenhao@139.com',-1,-1,'password','resume','上海宝山一中','数学老师','teacher','上海','宝山'),(86,'张琛浩',NULL,NULL,NULL,NULL,'zhangchenhao@139.com',NULL,NULL,'123','resume','orgname','学生','normal','上海',NULL),(87,'马景花',NULL,NULL,NULL,NULL,'zhangchenhao@139.com',NULL,NULL,'123','resume','orgname','学生','normal','上海',NULL),(88,'魏斌斌',NULL,NULL,NULL,NULL,'zhangchenhao@139.com',NULL,NULL,'123','resume','orgname','学生','normal','上海',NULL);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `send` int(11) NOT NULL,
  `receiver` int(11) NOT NULL,
  `hasread` varchar(2) DEFAULT NULL,
  `receivetime` datetime DEFAULT NULL,
  `content` varchar(4500) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (1,1,81,'n','2013-11-26 00:00:00','c','t','y'),(7,-1,-1,'','2013-11-28 00:00:00','内容','标题',''),(8,-1,-1,'','2013-11-28 00:00:00','内容','标题','');
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
  `price` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COMMENT='通知';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notice`
--

LOCK TABLES `notice` WRITE;
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT INTO `notice` VALUES (1,12,'公司、组织、个人的名称','notice address:0','1/2/3 per week: 0','notice content:0',0,NULL),(2,12,'公司、组织、个人的名称','notice address:1','1/2/3 per week: 1','notice content:1',1,NULL),(3,12,'公司、组织、个人的名称','notice address:2','1/2/3 per week: 2','notice content:2',0,NULL),(4,12,'公司、组织、个人的名称','notice address:3','1/2/3 per week: 3','notice content:3',1,NULL),(5,12,'公司、组织、个人的名称','notice address:4','1/2/3 per week: 4','notice content:4',0,NULL),(6,12,'公司、组织、个人的名称','notice address:5','1/2/3 per week: 5','notice content:5',1,NULL),(7,12,'公司、组织、个人的名称','notice address:6','1/2/3 per week: 6','notice content:6',0,NULL),(8,12,'公司、组织、个人的名称','notice address:7','1/2/3 per week: 7','notice content:7',1,NULL),(9,12,'公司、组织、个人的名称','notice address:8','1/2/3 per week: 8','notice content:8',0,NULL),(10,12,'公司、组织、个人的名称','notice address:9','1/2/3 per week: 9','notice content:9',1,NULL),(11,12,'公司、组织、个人的名称','notice address:10','1/2/3 per week: 10','notice content:10',0,NULL),(12,12,'公司、组织、个人的名称','notice address:11','1/2/3 per week: 11','notice content:11',1,NULL),(13,12,'公司、组织、个人的名称','notice address:12','1/2/3 per week: 12','notice content:12',0,NULL),(14,12,'公司、组织、个人的名称','notice address:13','1/2/3 per week: 13','notice content:13',1,NULL),(15,12,'公司、组织、个人的名称','notice address:14','1/2/3 per week: 14','notice content:14',0,NULL),(16,12,'公司、组织、个人的名称','notice address:15','1/2/3 per week: 15','notice content:15',1,NULL),(17,12,'公司、组织、个人的名称','notice address:16','1/2/3 per week: 16','notice content:16',0,NULL),(18,12,'公司、组织、个人的名称','notice address:17','1/2/3 per week: 17','notice content:17',1,NULL),(19,12,'公司、组织、个人的名称','notice address:18','1/2/3 per week: 18','notice content:18',0,NULL),(20,12,'公司、组织、个人的名称','notice address:19','1/2/3 per week: 19','notice content:19',1,NULL),(21,12,'公司、组织、个人的名称','notice address:20','1/2/3 per week: 20','notice content:20',0,NULL),(22,12,'公司、组织、个人的名称','notice address:21','1/2/3 per week: 21','notice content:21',1,NULL),(23,12,'公司、组织、个人的名称','notice address:22','1/2/3 per week: 22','notice content:22',0,NULL),(24,12,'公司、组织、个人的名称','notice address:23','1/2/3 per week: 23','notice content:23',1,NULL),(25,12,'公司、组织、个人的名称','notice address:24','1/2/3 per week: 24','notice content:24',0,NULL),(26,12,'公司、组织、个人的名称','notice address:25','1/2/3 per week: 25','notice content:25',1,NULL),(27,12,'公司、组织、个人的名称','notice address:26','1/2/3 per week: 26','notice content:26',0,NULL),(28,12,'公司、组织、个人的名称','notice address:27','1/2/3 per week: 27','notice content:27',1,NULL),(29,12,'公司、组织、个人的名称','notice address:28','1/2/3 per week: 28','notice content:28',0,NULL),(30,12,'公司、组织、个人的名称','notice address:29','1/2/3 per week: 29','notice content:29',1,NULL);
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
  `provinceCity` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='公司信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `org`
--

LOCK TABLES `org` WRITE;
/*!40000 ALTER TABLE `org` DISABLE KEYS */;
INSERT INTO `org` VALUES (5,'汲原堂','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(9,'魏斌斌','祁连山路2389弄','123321213123','魏斌斌','weibinbin','wbb',NULL,NULL),(10,'123','321','3','123','3','2',NULL,NULL),(14,'6','7','3','8','2','4',NULL,NULL),(16,'33332','223','33123','33','123','332123',NULL,NULL),(17,'w2w','2w','ww2w2w2','ww','wwwwwww','2ww2w2w',NULL,NULL),(18,'w2w','2w','ww2w2w2','ww','wwwwwww','2ww2w2w',NULL,NULL),(19,'123','123','123','123','123','123',NULL,NULL),(20,'3123123123','312312','132123123123','2123','3123123','31223123',NULL,NULL),(22,'dan','池塘','123123131','王八','adn','adadsad',NULL,NULL),(23,'汲原堂','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(24,'汲原堂0','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(25,'汲原堂1','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(26,'汲原堂2','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(27,'汲原堂3','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(28,'汲原堂4','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(29,'汲原堂5','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(30,'汲原堂6','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(31,'汲原堂7','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(32,'汲原堂8','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL),(33,'汲原堂9','延平路69号601B','15236362525','MisMa','jiyuantang','123456',NULL,NULL);
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
  `orgid` int(11) DEFAULT NULL,
  `loginname` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `provinceCity` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
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
INSERT INTO `school` VALUES (1,'静安教学点',5,'jingan',NULL,NULL,NULL,NULL),(2,'静安教学点',23,'jingan',NULL,NULL,NULL,NULL),(3,'静安教学点0',24,'jingan',NULL,NULL,NULL,NULL),(4,'静安教学点1',25,'jingan',NULL,NULL,NULL,NULL),(5,'静安教学点2',26,'jingan',NULL,NULL,NULL,NULL),(6,'静安教学点3',27,'jingan',NULL,NULL,NULL,NULL),(7,'静安教学点4',28,'jingan',NULL,NULL,NULL,NULL),(8,'静安教学点5',29,'jingan',NULL,NULL,NULL,NULL),(9,'静安教学点6',30,'jingan',NULL,NULL,NULL,NULL),(10,'静安教学点7',31,'jingan',NULL,NULL,NULL,NULL),(11,'静安教学点8',32,'jingan',NULL,NULL,NULL,NULL),(12,'静安教学点9',33,'jingan',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `school` ENABLE KEYS */;
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

-- Dump completed on 2013-11-29 14:15:15
