/*
Navicat MySQL Data Transfer

Source Server         : 本地志愿者数据库
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : precisehelp

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-05-31 18:55:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `adm_id` int(11) NOT NULL AUTO_INCREMENT,
  `adm_account` varchar(20) DEFAULT NULL,
  `adm_psw` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`adm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for adminsinfo
-- ----------------------------
DROP TABLE IF EXISTS `adminsinfo`;
CREATE TABLE `adminsinfo` (
  `adminfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `adm_num` varchar(20) DEFAULT NULL,
  `adm_nickname` varchar(20) DEFAULT NULL,
  `adm_name` varchar(10) DEFAULT NULL,
  `adm_phone` varchar(20) DEFAULT NULL,
  `adm_idnum` varchar(20) DEFAULT NULL,
  `adm_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`adminfo_id`),
  KEY `adm_id` (`adm_id`),
  CONSTRAINT `adminsinfo_ibfk_1` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `com_id` int(11) NOT NULL AUTO_INCREMENT,
  `com_content` varchar(250) DEFAULT NULL,
  `orderdone_id` int(11) DEFAULT NULL,
  `com_parent` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`com_id`),
  KEY `orderdone_id` (`orderdone_id`),
  KEY `com_parent` (`com_id`)
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`orderdone_id`) REFERENCES `order_done` (`orderdone_id`),
  CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `comments_ibfk_3` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`),
  CONSTRAINT `comments_ibfk_4` FOREIGN KEY (`com_parent`) REFERENCES `comments` (`com_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for express
-- ----------------------------
DROP TABLE IF EXISTS `express`;
CREATE TABLE `express` (
  `express_id` int(11) NOT NULL AUTO_INCREMENT,
  `express_kcom` varchar(20) DEFAULT NULL,
  `express_knum` varchar(50) DEFAULT NULL,
  `express_content` text,
  PRIMARY KEY (`express_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodsarea
-- ----------------------------
DROP TABLE IF EXISTS `goodsarea`;
CREATE TABLE `goodsarea` (
  `area_id` int(11) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(50) DEFAULT NULL,
  `area_location` varchar(100) DEFAULT NULL,
  `area_stat` text,
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `goodsinfo`;
CREATE TABLE `goodsinfo` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) DEFAULT NULL,
  `goods_stat` text,
  `goods_last_price` double DEFAULT NULL,
  `goods_now_price` double DEFAULT NULL,
  `goods_discount` double DEFAULT '1',
  `goods_price_unit` varchar(10) DEFAULT NULL,
  `goodsarea_id` int(11) DEFAULT NULL,
  `goodstype_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`goods_id`),
  KEY `goodsarea_id` (`goodsarea_id`),
  KEY `goodstype_id` (`goodstype_id`),
  CONSTRAINT `goodsinfo_ibfk_1` FOREIGN KEY (`goodsarea_id`) REFERENCES `goodsarea` (`area_id`),
  CONSTRAINT `goodsinfo_ibfk_2` FOREIGN KEY (`goodstype_id`) REFERENCES `goodstype` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(20) DEFAULT NULL,
  `type_stat` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for letters
-- ----------------------------
DROP TABLE IF EXISTS `letters`;
CREATE TABLE `letters` (
  `let_id` int(11) NOT NULL AUTO_INCREMENT,
  `let_title` varchar(30) DEFAULT NULL,
  `let_content` text,
  `let_time` date DEFAULT NULL,
  `let_stat` int(11) DEFAULT NULL,
  `let_from` int(11) DEFAULT NULL,
  `let_to` int(11) DEFAULT NULL,
  PRIMARY KEY (`let_id`),
  KEY `let_from` (`let_from`),
  KEY `let_to` (`let_to`),
  CONSTRAINT `letters_ibfk_1` FOREIGN KEY (`let_from`) REFERENCES `users` (`user_id`),
  CONSTRAINT `letters_ibfk_2` FOREIGN KEY (`let_to`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_doing
-- ----------------------------
DROP TABLE IF EXISTS `order_doing`;
CREATE TABLE `order_doing` (
  `orderdoing_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_num` varchar(30) DEFAULT NULL,
  `order_ps` varchar(200) DEFAULT NULL,
  `order_time` date DEFAULT NULL,
  `order_stat` int(11) DEFAULT NULL,
  `order_kcom` varchar(20) DEFAULT NULL,
  `order_knum` varchar(50) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `adm_id` int(11) DEFAULT NULL,
  `express_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderdoing_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  KEY `adm_id` (`adm_id`),
  KEY `express_id` (`express_id`),
  CONSTRAINT `order_doing_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_doing_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`),
  CONSTRAINT `order_doing_ibfk_3` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `order_doing_ibfk_4` FOREIGN KEY (`express_id`) REFERENCES `express` (`express_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_done
-- ----------------------------
DROP TABLE IF EXISTS `order_done`;
CREATE TABLE `order_done` (
  `orderdone_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_num` varchar(30) DEFAULT NULL,
  `order_ps` varchar(200) DEFAULT NULL,
  `order_time` date DEFAULT NULL,
  `order_kcom` varchar(20) DEFAULT NULL,
  `order_knum` varchar(50) DEFAULT NULL,
  `order_donetime` date DEFAULT NULL,
  `order_comment` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  `adm_id` int(11) DEFAULT NULL,
  `express_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderdone_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  KEY `adm_id` (`adm_id`),
  KEY `express_id` (`express_id`),
  CONSTRAINT `order_done_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_done_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`),
  CONSTRAINT `order_done_ibfk_3` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `order_done_ibfk_4` FOREIGN KEY (`express_id`) REFERENCES `express` (`express_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_todo
-- ----------------------------
DROP TABLE IF EXISTS `order_todo`;
CREATE TABLE `order_todo` (
  `ordertodo_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` varchar(30) DEFAULT NULL,
  `order_ps` varchar(200) DEFAULT NULL,
  `order_time` date DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `goods_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`ordertodo_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `order_todo_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_todo_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for toaddress
-- ----------------------------
DROP TABLE IF EXISTS `toaddress`;
CREATE TABLE `toaddress` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `address_province` varchar(20) DEFAULT NULL,
  `address_city` varchar(20) DEFAULT NULL,
  `address_area` varchar(30) DEFAULT NULL,
  `address_road` varchar(30) DEFAULT NULL,
  `address_detail` varchar(100) DEFAULT NULL,
  `address_postcode` varchar(10) DEFAULT NULL,
  `address_name` varchar(10) DEFAULT NULL,
  `address_phone` varchar(20) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `toaddress_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(30) DEFAULT NULL,
  `user_psw` varchar(30) DEFAULT NULL,
  `user_zf_psw` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usersinfo
-- ----------------------------
DROP TABLE IF EXISTS `usersinfo`;
CREATE TABLE `usersinfo` (
  `usersinfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_img` varchar(100) DEFAULT NULL,
  `user_sex` varchar(5) DEFAULT NULL,
  `user_nickname` varchar(30) DEFAULT NULL,
  `user_sign` varchar(250) DEFAULT NULL,
  `user_phone` varchar(20) DEFAULT NULL,
  `user_idnum` varchar(25) DEFAULT NULL,
  `user_rname` varchar(10) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`usersinfo_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `usersinfo_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
