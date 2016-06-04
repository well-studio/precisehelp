/*
Navicat MySQL Data Transfer

Source Server         : 本地志愿者数据库
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : precisehelp

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-06-04 15:44:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `adm_id` varchar(60) NOT NULL,
  `adm_account` varchar(20) DEFAULT NULL,
  `adm_power` int(11) DEFAULT NULL,
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
  `adm_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`adminfo_id`),
  KEY `adm_id` (`adm_id`),
  CONSTRAINT `adminsinfo_ibfk_1` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for coupons
-- ----------------------------
DROP TABLE IF EXISTS `coupons`;
CREATE TABLE `coupons` (
  `cou_id` varchar(60) NOT NULL,
  `cou_number` varchar(30) DEFAULT NULL,
  `cou_start_time` date DEFAULT NULL,
  `cou_end_time` date DEFAULT NULL,
  `cou_use_time` date DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `cou_typeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cou_id`),
  KEY `user_id` (`user_id`),
  KEY `cou_typeid` (`cou_typeid`),
  CONSTRAINT `coupons_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `coupons_ibfk_2` FOREIGN KEY (`cou_typeid`) REFERENCES `couponstype` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for couponstype
-- ----------------------------
DROP TABLE IF EXISTS `couponstype`;
CREATE TABLE `couponstype` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(30) DEFAULT NULL,
  `type_goods` varchar(80) DEFAULT NULL,
  `type_candis` int(11) DEFAULT '1',
  `type_require` double DEFAULT NULL,
  `type_value` double DEFAULT NULL,
  `type_percent` double DEFAULT NULL,
  PRIMARY KEY (`type_id`)
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
  `goods_id` varchar(60) NOT NULL,
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
-- Table structure for goodsquestion
-- ----------------------------
DROP TABLE IF EXISTS `goodsquestion`;
CREATE TABLE `goodsquestion` (
  `ques_id` varchar(60) NOT NULL,
  `ques_title` varchar(50) DEFAULT NULL,
  `ques_content` text,
  `ques_time` date DEFAULT NULL,
  `ques_close` int(11) DEFAULT '0',
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ques_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `goodsquestion_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `goodsquestion_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
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
  `let_stat` int(11) DEFAULT '0',
  `let_sys` int(11) DEFAULT '0',
  `let_from` varchar(60) DEFAULT NULL,
  `let_to` varchar(60) DEFAULT NULL,
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
  `order_handle_time` date DEFAULT NULL,
  `order_stat` int(11) DEFAULT NULL,
  `order_kcom` varchar(20) DEFAULT NULL,
  `order_knum` varchar(50) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
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
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
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
  `order_pay` int(11) DEFAULT '0',
  `order_cancel` int(11) DEFAULT '0',
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ordertodo_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `order_todo_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_todo_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for questionreply
-- ----------------------------
DROP TABLE IF EXISTS `questionreply`;
CREATE TABLE `questionreply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `reply_content` varchar(200) NOT NULL,
  `reply_time` date DEFAULT NULL,
  `reply_adm` int(11) DEFAULT '0',
  `ques_id` varchar(60) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `ques_id` (`ques_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `questionreply_ibfk_1` FOREIGN KEY (`ques_id`) REFERENCES `goodsquestion` (`ques_id`),
  CONSTRAINT `questionreply_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `shoppingcart`;
CREATE TABLE `shoppingcart` (
  `user_id` varchar(60) NOT NULL DEFAULT '',
  `goods_id` varchar(60) NOT NULL DEFAULT '',
  `goods_num` int(11) DEFAULT '0',
  PRIMARY KEY (`user_id`,`goods_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `shoppingcart_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `shoppingcart_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
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
  `user_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `toaddress_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for todolist
-- ----------------------------
DROP TABLE IF EXISTS `todolist`;
CREATE TABLE `todolist` (
  `todo_id` int(11) NOT NULL AUTO_INCREMENT,
  `todo_time` date DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
  `orderdoing_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`todo_id`),
  KEY `adm_id` (`adm_id`),
  KEY `orderdoing_id` (`orderdoing_id`),
  CONSTRAINT `todolist_ibfk_1` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `todolist_ibfk_2` FOREIGN KEY (`orderdoing_id`) REFERENCES `order_doing` (`orderdoing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` varchar(60) NOT NULL,
  `user_account` varchar(30) DEFAULT NULL,
  `user_psw` varchar(30) DEFAULT NULL,
  `user_pay_psw` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for usersfavorite
-- ----------------------------
DROP TABLE IF EXISTS `usersfavorite`;
CREATE TABLE `usersfavorite` (
  `favo_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`favo_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `usersfavorite_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `usersfavorite_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
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
  `user_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`usersinfo_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `usersinfo_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
