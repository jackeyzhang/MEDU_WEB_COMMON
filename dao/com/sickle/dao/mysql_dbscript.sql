CREATE DATABASE `medu` /*!40100 DEFAULT CHARACTER SET utf8 */$$

delimiter $$

CREATE TABLE `classes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `schoolid` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `teacherid` int(11) DEFAULT NULL,
  `classtime` varchar(145) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `school_fk_idx` (`schoolid`),
  KEY `teacher_fk_idx` (`teacherid`),
  CONSTRAINT `school_fk` FOREIGN KEY (`schoolid`) REFERENCES `school` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `teacher_fk` FOREIGN KEY (`teacherid`) REFERENCES `teacher` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级信息'$$


delimiter $$

CREATE TABLE `org` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  `manager` varchar(45) NOT NULL,
  `loginName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='公司信息'$$


delimiter $$

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学校信息'$$


delimiter $$

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息'$$


delimiter $$

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `hobby` varchar(200) DEFAULT NULL,
  `contact` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `workage` int(11) DEFAULT NULL,
  `grade` float DEFAULT NULL,
  `openStatus` int(11) DEFAULT NULL,
  `loginName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `resume` varchar(50) NOT NULL,
  `orgname` varchar(20) NOT NULL,
  `title` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COMMENT='老师信息'$$


delimiter $$

CREATE TABLE `web_ui` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `context` varchar(5000) DEFAULT NULL,
  `hint` varchar(500) DEFAULT NULL,
  `alert` varchar(500) DEFAULT NULL,
  `elementid` varchar(50) NOT NULL,
  `version` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='界面定制化表'$$


