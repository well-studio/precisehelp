/*
Navicat MySQL Data Transfer

Source Server         : 本地志愿者数据库
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : precisehelp

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2016-06-13 16:43:16
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
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1271932f-dd65-4b8c-8667-6c91b8ea8cda', 'employee0001', '1', '456789');
INSERT INTO `admins` VALUES ('9a99c8af-7462-4704-b7a1-309db18a29a0', 'employee0002', '1', '456789');
INSERT INTO `admins` VALUES ('b2edc69d-5d0e-4368-b7db-8e81e963b799', 'admin01', '0', '123456');

-- ----------------------------
-- Table structure for adminsinfo
-- ----------------------------
DROP TABLE IF EXISTS `adminsinfo`;
CREATE TABLE `adminsinfo` (
  `adminfo_id` int(11) NOT NULL AUTO_INCREMENT,
  `adm_num` varchar(20) DEFAULT NULL,
  `adm_nickname` varchar(20) DEFAULT NULL,
  `adm_img` varchar(50) DEFAULT NULL,
  `adm_name` varchar(10) DEFAULT NULL,
  `adm_phone` varchar(20) DEFAULT NULL,
  `adm_idnum` varchar(20) DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`adminfo_id`),
  KEY `adm_id` (`adm_id`),
  CONSTRAINT `adminsinfo_ibfk_1` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminsinfo
-- ----------------------------
INSERT INTO `adminsinfo` VALUES ('1', '01', '总监大人', 'imgs/admin/01.jpg', '丰凡', '15211183721', '43092219960612721X', 'b2edc69d-5d0e-4368-b7db-8e81e963b799');
INSERT INTO `adminsinfo` VALUES ('2', '0001', '处理专员-大腊肉', 'imgs/admin/0001.jpg', '莫丹', '15756892356', '430613199706231523', '1271932f-dd65-4b8c-8667-6c91b8ea8cda');
INSERT INTO `adminsinfo` VALUES ('3', '0002', '处理专业-小鲜肉', 'imgs/admin/0002.jpg', '刘潇', '15223568978', '430613199706231524', '9a99c8af-7462-4704-b7a1-309db18a29a0');

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments` (
  `com_id` int(11) NOT NULL AUTO_INCREMENT,
  `com_content` varchar(250) DEFAULT NULL,
  `com_time` timestamp NULL DEFAULT NULL,
  `com_ups` int(11) DEFAULT '0',
  `com_res` int(11) DEFAULT '3',
  `orderdone_id` int(11) DEFAULT NULL,
  `com_parent` int(11) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`com_id`),
  KEY `orderdone_id` (`orderdone_id`),
  KEY `com_parent` (`com_parent`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`orderdone_id`) REFERENCES `order_done` (`orderdone_id`),
  CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`com_parent`) REFERENCES `comments` (`com_id`),
  CONSTRAINT `comments_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `comments_ibfk_4` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES ('1', '这个土鸡好评，味道特别纯正，值得购买！', '2016-06-16 15:54:10', '0', '3', null, null, 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', 'cee1a09d-4730-4038-a520-3fbaabe269c1');

-- ----------------------------
-- Table structure for coupons
-- ----------------------------
DROP TABLE IF EXISTS `coupons`;
CREATE TABLE `coupons` (
  `cou_id` varchar(60) NOT NULL,
  `cou_number` varchar(30) DEFAULT NULL,
  `cou_start_time` timestamp NULL DEFAULT NULL,
  `cou_end_time` timestamp NULL DEFAULT NULL,
  `cou_use_time` timestamp NULL DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `cou_typeid` int(11) DEFAULT NULL,
  PRIMARY KEY (`cou_id`),
  KEY `user_id` (`user_id`),
  KEY `cou_typeid` (`cou_typeid`),
  CONSTRAINT `coupons_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `coupons_ibfk_2` FOREIGN KEY (`cou_typeid`) REFERENCES `couponstype` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coupons
-- ----------------------------

-- ----------------------------
-- Table structure for couponstype
-- ----------------------------
DROP TABLE IF EXISTS `couponstype`;
CREATE TABLE `couponstype` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(30) DEFAULT NULL,
  `type_goods` varchar(80) DEFAULT NULL,
  `type_invalid` int(11) DEFAULT '1',
  `type_candis` int(11) DEFAULT '1',
  `type_require` double DEFAULT NULL,
  `type_value` double DEFAULT NULL,
  `type_percent` double DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of couponstype
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of express
-- ----------------------------
INSERT INTO `express` VALUES ('1', '韵达快递', '165XXXXXX165', '快递内容  json 数据？');
INSERT INTO `express` VALUES ('2', '申通快递', '166XXXXXX166', '快递内容  json 数据？');
INSERT INTO `express` VALUES ('3', '圆通快递', '167XXXXXX167', '快递内容  json 数据？');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsarea
-- ----------------------------
INSERT INTO `goodsarea` VALUES ('1', '湘西XX村', '中国湖南省湘西XXXXXXXX', '图片+文字的详细产地描述');
INSERT INTO `goodsarea` VALUES ('2', '衡阳XX村', '中国湖南省衡阳市XX村XXXXXX', '图片+文字的详细产地描述');
INSERT INTO `goodsarea` VALUES ('3', '常德XX村', '中国湖南省常德市XX村XXXXXX', '图片+文字的详细产地描述');

-- ----------------------------
-- Table structure for goodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `goodsinfo`;
CREATE TABLE `goodsinfo` (
  `goods_id` varchar(60) NOT NULL,
  `goods_name` varchar(50) DEFAULT NULL,
  `goods_img` varchar(100) DEFAULT NULL,
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
-- Records of goodsinfo
-- ----------------------------
INSERT INTO `goodsinfo` VALUES ('0a7ec30b-516a-4d49-a137-ee2c7fd97a1f', '湖南湘西烟熏猪耳朵', '/imgs/goods/title/湘西腊猪耳朵.jpg', '(湘西猪耳朵)图片+文字的详细描述', '79.9', '69.9', '1', '人民币/500g', '1', '1');
INSERT INTO `goodsinfo` VALUES ('39354a2f-bdc8-4546-b66a-4535cf6d6139', '湖南湘西柴火腊肉', '/imgs/goods/title/湘西腊肉.jpg', '(湘西腊肉)商品图片+文字的详细描述', '40', '36.8', '1', '人民币/500g', '1', '1');
INSERT INTO `goodsinfo` VALUES ('520660af-fd40-41f7-9203-531e8f094a6f', '湖南湘西蜡肥肠', '/imgs/goods/title/湘西蜡肥肠.jpg', '(湘西腊肥肠)图片+文字的详细描述', '60.6', '57.8', '1', '人民币/500g', '1', '1');
INSERT INTO `goodsinfo` VALUES ('77929df2-8d25-4ce5-9822-9dd14a87df61', '湖南衡阳XX村土鸡蛋', '/imgs/goods/title/衡阳XX村土鸡蛋.jpg', '(衡阳XX村土鸡蛋)图片+文字的详细描述', '25.5', '22.8', '1', '人民币/500g', '2', '2');
INSERT INTO `goodsinfo` VALUES ('c38a2b3b-3052-46f5-97fb-3630e5388779', '湖南湘西腊牛肉', '/imgs/goods/title/湘西腊牛肉.jpg', '(湘西腊牛肉)图片+文字的详细描述', '72.5', '68.8', '1', '人民币/500g', '1', '1');
INSERT INTO `goodsinfo` VALUES ('cee1a09d-4730-4038-a520-3fbaabe269c1', '湖南常德XX村土鸡', '/imgs/goods/title/常德XX村土鸡.jpg', '(常德XX村土鸡蛋)图片+文字的详细描述', '33', '29.9', '1', '人民币/500g', '3', '2');
INSERT INTO `goodsinfo` VALUES ('ebdab1d5-a1a9-4538-91c7-7bf3830ab80d', '湖南湘西熏制腊鱼', '/imgs/goods/title/湘西腊鱼.jpg', '(湘西腊鱼)图片+文字的详细描述', '35.8', '29.8', '1', '人民币/500g', '1', '1');
INSERT INTO `goodsinfo` VALUES ('ef7d4f7e-d938-4aa0-8bbf-29d559b9bb0b', '湖南湘西酱板鸭', '/imgs/goods/title/湘西酱板鸭.jpg', '(湘西腊肠)商品图片+文字的详细描述', '49.9', '52.5', '1', '人民币/500g', '1', '1');
INSERT INTO `goodsinfo` VALUES ('f2657e82-2a1d-4e1b-973a-d75b07c88f9c', '湖南湘西咸香腊鸭腿', '/imgs/goods/title/湘西腊鸭腿.jpg', '(湘西腊鸭腿)图片+文字的详细描述', '58.6', '49.9', '1', '人民币/500g', '1', '1');

-- ----------------------------
-- Table structure for goodsquestion
-- ----------------------------
DROP TABLE IF EXISTS `goodsquestion`;
CREATE TABLE `goodsquestion` (
  `ques_id` varchar(60) NOT NULL,
  `ques_title` varchar(50) DEFAULT NULL,
  `ques_content` text,
  `ques_time` timestamp NULL DEFAULT NULL,
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
-- Records of goodsquestion
-- ----------------------------

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(20) DEFAULT NULL,
  `type_stat` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodstype
-- ----------------------------
INSERT INTO `goodstype` VALUES ('1', '农香腊味', '腊味食材的描述');
INSERT INTO `goodstype` VALUES ('2', '农香经典', '农香经典的描述');

-- ----------------------------
-- Table structure for letters
-- ----------------------------
DROP TABLE IF EXISTS `letters`;
CREATE TABLE `letters` (
  `let_id` varchar(60) NOT NULL,
  `let_title` varchar(30) DEFAULT NULL,
  `let_content` text,
  `let_time` timestamp NULL DEFAULT NULL,
  `let_draft` int(11) DEFAULT '1',
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
-- Records of letters
-- ----------------------------
INSERT INTO `letters` VALUES ('d90c360b-4211-45a8-a070-91fb82fa2a50', '能+下Q咨询个东西不？', '谢谢，就是简单的问下东西，交个朋友!', '2016-06-13 21:51:51', '1', '0', '0', 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '39f4ca63-49cf-4fab-8726-f7766c3bad80');
INSERT INTO `letters` VALUES ('da7ccdde-a623-477d-bb10-070e0699854d', '请问你买的那个土鸡到底怎么样？值不值得？', '如题，谢谢啦', '2016-06-15 15:50:01', '1', '0', '0', '00386e2f-4ad1-4d0e-a8a9-95a357991731', '39f4ca63-49cf-4fab-8726-f7766c3bad80');
INSERT INTO `letters` VALUES ('f9d932c2-467b-408e-8ba2-d2e842757723', '不错', '值得购买', '2016-06-15 17:50:41', '1', '0', '0', '39f4ca63-49cf-4fab-8726-f7766c3bad80', '00386e2f-4ad1-4d0e-a8a9-95a357991731');

-- ----------------------------
-- Table structure for order_doing
-- ----------------------------
DROP TABLE IF EXISTS `order_doing`;
CREATE TABLE `order_doing` (
  `orderdoing_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_num` varchar(30) DEFAULT NULL,
  `order_ps` varchar(200) DEFAULT NULL,
  `order_time` timestamp NULL DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `order_handle_time` timestamp NULL DEFAULT NULL,
  `order_stat` int(11) DEFAULT '0',
  `order_kcom` varchar(20) DEFAULT NULL,
  `order_knum` varchar(50) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `goods_id` varchar(60) DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
  `goods_num` int(11) DEFAULT '1',
  `express_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderdoing_id`),
  KEY `address_id` (`address_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  KEY `adm_id` (`adm_id`),
  KEY `express_id` (`express_id`),
  CONSTRAINT `order_doing_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `toaddress` (`address_id`),
  CONSTRAINT `order_doing_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_doing_ibfk_3` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`),
  CONSTRAINT `order_doing_ibfk_4` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `order_doing_ibfk_5` FOREIGN KEY (`express_id`) REFERENCES `express` (`express_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_doing
-- ----------------------------
INSERT INTO `order_doing` VALUES ('1', '201606130000015', '麻烦快点儿发货！', '2016-06-14 16:12:45', '2', '2016-06-14 17:12:54', '1', '申通', '166XXXXX166', '39f4ca63-49cf-4fab-8726-f7766c3bad80', '0a7ec30b-516a-4d49-a137-ee2c7fd97a1f', '1271932f-dd65-4b8c-8667-6c91b8ea8cda', '1', '3');
INSERT INTO `order_doing` VALUES ('2', '201606130000007', null, '2016-06-13 13:15:11', '1', '2016-06-15 16:15:22', '0', '圆通', '167XXXXX167', null, null, null, '1', null);

-- ----------------------------
-- Table structure for order_done
-- ----------------------------
DROP TABLE IF EXISTS `order_done`;
CREATE TABLE `order_done` (
  `orderdone_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_num` varchar(30) DEFAULT NULL,
  `order_ps` varchar(200) DEFAULT NULL,
  `order_time` timestamp NULL DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  `order_kcom` varchar(20) DEFAULT NULL,
  `order_knum` varchar(50) DEFAULT NULL,
  `order_donetime` timestamp NULL DEFAULT NULL,
  `order_comment` int(11) DEFAULT '0',
  `user_id` varchar(60) DEFAULT NULL,
  `goods_num` int(11) DEFAULT '1',
  `goods_id` varchar(60) DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
  `express_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderdone_id`),
  KEY `address_id` (`address_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  KEY `adm_id` (`adm_id`),
  KEY `express_id` (`express_id`),
  CONSTRAINT `order_done_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `toaddress` (`address_id`),
  CONSTRAINT `order_done_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_done_ibfk_3` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`),
  CONSTRAINT `order_done_ibfk_4` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `order_done_ibfk_5` FOREIGN KEY (`express_id`) REFERENCES `express` (`express_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_done
-- ----------------------------
INSERT INTO `order_done` VALUES ('1', '201606130000001', '请快点发货，谢谢！', '2016-06-13 15:56:28', null, '韵达快递', '165XXXXX165', '2016-06-16 16:57:01', '0', 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '1', 'cee1a09d-4730-4038-a520-3fbaabe269c1', 'b2edc69d-5d0e-4368-b7db-8e81e963b799', '1');
INSERT INTO `order_done` VALUES ('2', '201606130000001', '请快点发货，谢谢！', '2016-06-13 15:56:28', null, '韵达快递', '165XXXXX165', '2016-06-16 16:57:01', '0', 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '2', '0a7ec30b-516a-4d49-a137-ee2c7fd97a1f', 'b2edc69d-5d0e-4368-b7db-8e81e963b799', '1');

-- ----------------------------
-- Table structure for order_todo
-- ----------------------------
DROP TABLE IF EXISTS `order_todo`;
CREATE TABLE `order_todo` (
  `ordertodo_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` varchar(30) DEFAULT NULL,
  `order_ps` varchar(200) DEFAULT NULL,
  `order_time` timestamp NULL DEFAULT NULL,
  `order_pay` int(11) DEFAULT '0',
  `order_cancel` int(11) DEFAULT '0',
  `address_id` int(11) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  `goods_num` int(11) DEFAULT '1',
  `goods_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ordertodo_id`),
  KEY `address_id` (`address_id`),
  KEY `user_id` (`user_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `order_todo_ibfk_1` FOREIGN KEY (`address_id`) REFERENCES `toaddress` (`address_id`),
  CONSTRAINT `order_todo_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `order_todo_ibfk_3` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_todo
-- ----------------------------
INSERT INTO `order_todo` VALUES ('1', '201606150000999', '16号再给我发货吧！！！', '2016-06-15 16:40:27', '1', '0', '2', 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '2', '77929df2-8d25-4ce5-9822-9dd14a87df61');

-- ----------------------------
-- Table structure for questionreply
-- ----------------------------
DROP TABLE IF EXISTS `questionreply`;
CREATE TABLE `questionreply` (
  `reply_id` int(11) NOT NULL AUTO_INCREMENT,
  `reply_content` varchar(200) NOT NULL,
  `reply_time` timestamp NULL DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
  `ques_id` varchar(60) DEFAULT NULL,
  `user_id` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `adm_id` (`adm_id`),
  KEY `ques_id` (`ques_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `questionreply_ibfk_1` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `questionreply_ibfk_2` FOREIGN KEY (`ques_id`) REFERENCES `goodsquestion` (`ques_id`),
  CONSTRAINT `questionreply_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questionreply
-- ----------------------------

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
-- Records of shoppingcart
-- ----------------------------
INSERT INTO `shoppingcart` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', '39354a2f-bdc8-4546-b66a-4535cf6d6139', '2');
INSERT INTO `shoppingcart` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', '520660af-fd40-41f7-9203-531e8f094a6f', '3');
INSERT INTO `shoppingcart` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', '77929df2-8d25-4ce5-9822-9dd14a87df61', '2');
INSERT INTO `shoppingcart` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', 'ef7d4f7e-d938-4aa0-8bbf-29d559b9bb0b', '1');
INSERT INTO `shoppingcart` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', '0a7ec30b-516a-4d49-a137-ee2c7fd97a1f', '1');
INSERT INTO `shoppingcart` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', 'c38a2b3b-3052-46f5-97fb-3630e5388779', '1');
INSERT INTO `shoppingcart` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', 'ef7d4f7e-d938-4aa0-8bbf-29d559b9bb0b', '2');
INSERT INTO `shoppingcart` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', 'f2657e82-2a1d-4e1b-973a-d75b07c88f9c', '4');
INSERT INTO `shoppingcart` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '39354a2f-bdc8-4546-b66a-4535cf6d6139', '1');
INSERT INTO `shoppingcart` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '520660af-fd40-41f7-9203-531e8f094a6f', '1');
INSERT INTO `shoppingcart` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '77929df2-8d25-4ce5-9822-9dd14a87df61', '3');
INSERT INTO `shoppingcart` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', 'c38a2b3b-3052-46f5-97fb-3630e5388779', '2');
INSERT INTO `shoppingcart` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', 'cee1a09d-4730-4038-a520-3fbaabe269c1', '12');
INSERT INTO `shoppingcart` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', 'f2657e82-2a1d-4e1b-973a-d75b07c88f9c', '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of toaddress
-- ----------------------------
INSERT INTO `toaddress` VALUES ('1', '湖南省', '长沙市', '岳麓区', '岳麓大道569号', '湖南商学院', '410205', '谢霸天', '15211183724', 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2');
INSERT INTO `toaddress` VALUES ('2', '广东省', '广州市', 'XX区', 'XX大道XXXX号', 'XXX小区15栋', '420351', '金慧珊', '15211183723', '39f4ca63-49cf-4fab-8726-f7766c3bad80');
INSERT INTO `toaddress` VALUES ('3', '湖北省', '武汉市', 'XX区', 'XX大道XXXX号', 'XXX小区16栋', '430105', '李比之', '15211183722', '00386e2f-4ad1-4d0e-a8a9-95a357991731');

-- ----------------------------
-- Table structure for todolist
-- ----------------------------
DROP TABLE IF EXISTS `todolist`;
CREATE TABLE `todolist` (
  `todo_id` int(11) NOT NULL AUTO_INCREMENT,
  `todo_time` timestamp NULL DEFAULT NULL,
  `adm_id` varchar(60) DEFAULT NULL,
  `orderdoing_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`todo_id`),
  KEY `adm_id` (`adm_id`),
  KEY `orderdoing_id` (`orderdoing_id`),
  CONSTRAINT `todolist_ibfk_1` FOREIGN KEY (`adm_id`) REFERENCES `admins` (`adm_id`),
  CONSTRAINT `todolist_ibfk_2` FOREIGN KEY (`orderdoing_id`) REFERENCES `order_doing` (`orderdoing_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of todolist
-- ----------------------------
INSERT INTO `todolist` VALUES ('1', '2016-06-15 16:41:46', 'b2edc69d-5d0e-4368-b7db-8e81e963b799', '1');

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
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', '15211183722', '456789', 'iwanttobuy');
INSERT INTO `users` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', '15211183723', '456789', 'iwanttobuy');
INSERT INTO `users` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', '15211183724', '456789', 'iwanttobuy');

-- ----------------------------
-- Table structure for usersfavorite
-- ----------------------------
DROP TABLE IF EXISTS `usersfavorite`;
CREATE TABLE `usersfavorite` (
  `user_id` varchar(60) NOT NULL DEFAULT '',
  `goods_id` varchar(60) NOT NULL DEFAULT '',
  `add_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`,`goods_id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `usersfavorite_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  CONSTRAINT `usersfavorite_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usersfavorite
-- ----------------------------
INSERT INTO `usersfavorite` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', '77929df2-8d25-4ce5-9822-9dd14a87df61', '2016-06-13 12:47:25');
INSERT INTO `usersfavorite` VALUES ('00386e2f-4ad1-4d0e-a8a9-95a357991731', 'f2657e82-2a1d-4e1b-973a-d75b07c88f9c', '2016-06-03 12:47:29');
INSERT INTO `usersfavorite` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', '0a7ec30b-516a-4d49-a137-ee2c7fd97a1f', '2016-06-14 15:46:08');
INSERT INTO `usersfavorite` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', '520660af-fd40-41f7-9203-531e8f094a6f', '2016-06-13 15:38:23');
INSERT INTO `usersfavorite` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', '77929df2-8d25-4ce5-9822-9dd14a87df61', '2016-06-12 15:46:56');
INSERT INTO `usersfavorite` VALUES ('39f4ca63-49cf-4fab-8726-f7766c3bad80', 'f2657e82-2a1d-4e1b-973a-d75b07c88f9c', '2016-06-11 13:48:12');
INSERT INTO `usersfavorite` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', 'cee1a09d-4730-4038-a520-3fbaabe269c1', '2016-06-09 21:48:39');
INSERT INTO `usersfavorite` VALUES ('c49747c1-51cc-4c17-a3a9-61cc3b7de5e2', 'ef7d4f7e-d938-4aa0-8bbf-29d559b9bb0b', '2016-06-10 22:48:16');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usersinfo
-- ----------------------------
INSERT INTO `usersinfo` VALUES ('1', '/imgs/users/头像-1.jpg', '男', '愤怒的小荔枝', '湘西腊肉特别对味儿！', '15211183722', '430953199007121556', '李比之', '00386e2f-4ad1-4d0e-a8a9-95a357991731');
INSERT INTO `usersinfo` VALUES ('2', '/imgs/users/头像-2.jpg', '女', '贤惠的小豌豆', '有没有农家特制豌豆出售？', '15211183723', '430953199007121557', '金慧珊', '39f4ca63-49cf-4fab-8726-f7766c3bad80');
INSERT INTO `usersinfo` VALUES ('3', '/imgs/users/头像-3.jpg', '男', '霸道的小刺猬', '土鸡贼对胃，越吃越想吃', '15211183724', '430953199007121558', '谢霸天', 'c49747c1-51cc-4c17-a3a9-61cc3b7de5e2');
