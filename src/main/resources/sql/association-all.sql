/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.6.42 : Database - association
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`association` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `association`;

/*Table structure for table `association` */

DROP TABLE IF EXISTS `association`;

CREATE TABLE `association` (
  `association_name` varchar(50) NOT NULL DEFAULT '' COMMENT '社团名称',
  `association_nature` varchar(50) NOT NULL DEFAULT '' COMMENT '社团性质',
  `president` int(12) NOT NULL COMMENT '社长-学生表学号',
  `establishment_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '成立时间',
  `financial_information` varchar(50) NOT NULL DEFAULT '' COMMENT '财务信息',
  `status` int(10) DEFAULT '0' COMMENT '状态:0-未审核,1-已审核，2-注销',
  PRIMARY KEY (`association_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='association';

/*Data for the table `association` */

insert  into `association`(`association_name`,`association_nature`,`president`,`establishment_time`,`financial_information`,`status`) values ('爪哇王国','学习型平台',161543342,'2019-01-09 09:11:42','',0),('爪哇部落','学习型平台',161543342,'2019-01-09 09:09:04','',2);

/*Table structure for table `association_member` */

DROP TABLE IF EXISTS `association_member`;

CREATE TABLE `association_member` (
  `association_member_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `association_member_no` int(12) NOT NULL COMMENT '成员学号',
  `association_name` varchar(50) NOT NULL DEFAULT '' COMMENT '社团名字',
  `duties` varchar(50) NOT NULL DEFAULT '普通成员' COMMENT '成员职务',
  `status` int(12) NOT NULL DEFAULT '0' COMMENT '状态 0-未审核，1-已审核，2-已注销',
  PRIMARY KEY (`association_member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='association_member';

/*Data for the table `association_member` */

insert  into `association_member`(`association_member_id`,`association_member_no`,`association_name`,`duties`,`status`) values (1,161543341,'爪哇部落','普通成员',1);

/*Table structure for table `msg` */

DROP TABLE IF EXISTS `msg`;

CREATE TABLE `msg` (
  `msg_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `content` varchar(50) NOT NULL DEFAULT '' COMMENT '消息内容',
  `association_name` varchar(50) NOT NULL DEFAULT '' COMMENT '消息发送社团',
  `status` int(12) NOT NULL DEFAULT '0' COMMENT '消息状态:0-未读，1-已读',
  `stu_no` int(12) NOT NULL COMMENT '消息接受的学生学号',
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='msg';

/*Data for the table `msg` */

insert  into `msg`(`msg_id`,`content`,`association_name`,`status`,`stu_no`) values (1,'今晚吃宵夜','爪哇部落',1,161543341);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `stu_no` int(10) NOT NULL COMMENT '学号',
  `name` varchar(50) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '姓名',
  `college` varchar(50) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '学院',
  `concat` varchar(50) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '联系方式',
  `sex` varchar(50) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '性别',
  `password` varchar(50) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '密码',
  `account_role` int(1) NOT NULL DEFAULT '0' COMMENT '角色',
  PRIMARY KEY (`stu_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='student';

/*Data for the table `student` */

insert  into `student`(`stu_no`,`name`,`college`,`concat`,`sex`,`password`,`account_role`) values (161543341,'谢云忠','互联网金融与信息工程','15219224150','男','123456',0),(161543342,'谢有俊','互联网金融与信息工程学院','15817061252','男','123456',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
