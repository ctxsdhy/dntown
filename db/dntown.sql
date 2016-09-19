/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50629
Source Host           : localhost:3306
Source Database       : dntown

Target Server Type    : MYSQL
Target Server Version : 50629
File Encoding         : 65001

Date: 2016-09-19 22:31:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dntown_wx_game24_question
-- ----------------------------
DROP TABLE IF EXISTS `dntown_wx_game24_question`;
CREATE TABLE `dntown_wx_game24_question` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `num1` int(11) DEFAULT NULL,
  `num2` int(11) DEFAULT NULL,
  `num3` int(11) DEFAULT NULL,
  `num4` int(11) DEFAULT NULL,
  `answer` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `hit_rate` float DEFAULT '0',
  `times` int(11) DEFAULT '0',
  `right_times` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=405 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dntown_wx_game24_question
-- ----------------------------
INSERT INTO `dntown_wx_game24_question` VALUES ('1', '1', '1', '1', '8', '8×(1＋1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('2', '1', '1', '2', '6', '2×6×(1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('3', '1', '1', '2', '7', '(1＋2)×(7＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('4', '1', '1', '2', '8', '(1＋2)×8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('5', '1', '1', '2', '9', '(1＋2)×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('6', '1', '1', '3', '4', '3×4×(1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('7', '1', '1', '3', '5', '(1＋3)×(5＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('8', '1', '1', '3', '6', '(1＋3)×6×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('9', '1', '1', '3', '7', '(1＋3)×(7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('10', '1', '1', '3', '8', '1＋3×8－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('11', '1', '1', '3', '9', '1×3×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('12', '1', '1', '4', '4', '4×(1＋4＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('13', '1', '1', '4', '5', '(1＋4)×5－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('14', '1', '1', '4', '6', '1＋4×6－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('15', '1', '1', '4', '7', '1×4×(7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('16', '1', '1', '4', '8', '(4－1)×8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('17', '1', '1', '4', '9', '(4－1)×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('18', '1', '1', '5', '5', '(1＋5)×(5－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('19', '1', '1', '5', '6', '(5－1)×6×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('20', '1', '1', '5', '7', '(5－1)×(7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('21', '1', '1', '5', '8', '8×(5－1－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('22', '1', '1', '6', '6', '(6＋6)×(1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('23', '1', '1', '6', '8', '6×8/(1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('24', '1', '1', '6', '9', '6＋9×(1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('25', '1', '1', '8', '8', '8＋8×(1＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('26', '1', '2', '2', '4', '2×4×(2＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('27', '1', '2', '2', '5', '(2＋2)×(5＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('28', '1', '2', '2', '6', '(2＋2)×6×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('29', '1', '2', '2', '7', '(2＋2)×(7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('30', '1', '2', '2', '8', '8×(2＋2－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('31', '1', '2', '2', '9', '2×(2＋9＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('32', '1', '2', '3', '3', '2×3×(3＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('33', '1', '2', '3', '4', '2×3×4×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('34', '1', '2', '3', '5', '(2＋3)×5－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('35', '1', '2', '3', '6', '3×(2＋6)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('36', '1', '2', '3', '7', '2＋3×7＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('37', '1', '2', '3', '8', '2×(3＋8＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('38', '1', '2', '3', '9', '2×(3＋9)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('39', '1', '2', '4', '4', '(2＋4)×4×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('40', '1', '2', '4', '5', '(2＋4)×(5－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('41', '1', '2', '4', '6', '4×6×(2－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('42', '1', '2', '4', '7', '2×(4＋7＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('43', '1', '2', '4', '8', '2×(4＋8)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('44', '1', '2', '4', '9', '2×(4＋9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('45', '1', '2', '5', '5', '5×5－2＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('46', '1', '2', '5', '6', '2×(5＋6＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('47', '1', '2', '5', '7', '2×(5＋7)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('48', '1', '2', '5', '8', '2×(5＋8－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('49', '1', '2', '5', '9', '5＋2×9＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('50', '1', '2', '6', '6', '2×(6＋6)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('51', '1', '2', '6', '7', '2×(6＋7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('52', '1', '2', '6', '8', '6＋2×(8＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('53', '1', '2', '6', '9', '6＋2×9×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('54', '1', '2', '7', '7', '(7×7－1)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('55', '1', '2', '7', '8', '7＋2×8＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('56', '1', '2', '7', '9', '2×7＋9＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('57', '1', '2', '8', '8', '2×8＋8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('58', '1', '2', '8', '9', '2×8＋9－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('59', '1', '3', '3', '3', '(3＋3)×(3＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('60', '1', '3', '3', '4', '(3＋3)×4×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('61', '1', '3', '3', '5', '(3＋3)×(5－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('62', '1', '3', '3', '6', '3＋3×(6＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('63', '1', '3', '3', '7', '3＋3×7×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('64', '1', '3', '3', '8', '3＋3×(8－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('65', '1', '3', '3', '9', '(3＋9)×(3－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('66', '1', '3', '4', '4', '3×(4＋4)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('67', '1', '3', '4', '5', '3＋4×5＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('68', '1', '3', '4', '6', '6/(1－3/4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('69', '1', '3', '4', '7', '4＋3×7－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('70', '1', '3', '4', '8', '(4＋8)×(3－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('71', '1', '3', '4', '9', '4×(9－3)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('72', '1', '3', '5', '6', '5＋3×6＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('73', '1', '3', '5', '7', '(5＋7)×(3－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('74', '1', '3', '5', '8', '3×5＋8＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('75', '1', '3', '5', '9', '3×5＋9×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('76', '1', '3', '6', '6', '3×6＋6×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('77', '1', '3', '6', '7', '3×6＋7－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('78', '1', '3', '6', '8', '(6－3)×8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('79', '1', '3', '6', '9', '(6－3)×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('80', '1', '3', '7', '7', '(7－3)×(7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('81', '1', '3', '7', '8', '8×(7－3－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('82', '1', '3', '7', '9', '9/3×(7＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('83', '1', '3', '8', '8', '8/3×(8＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('84', '1', '3', '8', '9', '8/3×9×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('85', '1', '3', '9', '9', '9/3×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('86', '1', '4', '4', '4', '4＋4×(4＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('87', '1', '4', '4', '5', '4＋4×5×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('88', '1', '4', '4', '6', '4＋4×(6－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('89', '1', '4', '4', '7', '4×4＋7＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('90', '1', '4', '4', '8', '4×4＋8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('91', '1', '4', '4', '9', '4×4＋9－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('92', '1', '4', '5', '5', '4＋5×(5－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('93', '1', '4', '5', '6', '6/(5/4－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('94', '1', '4', '5', '7', '4×7－5＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('95', '1', '4', '5', '8', '8＋4×(5－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('96', '1', '4', '5', '9', '5×(9－4)－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('97', '1', '4', '6', '6', '6＋6×(4－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('98', '1', '4', '6', '7', '6×(7－4＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('99', '1', '4', '6', '8', '6×(8－4)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('100', '1', '4', '6', '9', '6×(9－4－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('101', '1', '4', '7', '7', '(7－4)×(7＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('102', '1', '4', '7', '8', '(7－4)×8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('103', '1', '4', '7', '9', '(7－4)×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('104', '1', '4', '8', '8', '4×8－8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('105', '1', '4', '8', '9', '4×8－9＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('106', '1', '5', '5', '5', '5×(5－1/5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('107', '1', '5', '5', '6', '5×6－5－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('108', '1', '5', '5', '9', '(9－5)×(5＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('109', '1', '5', '6', '6', '5×6－6×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('110', '1', '5', '6', '7', '5×6－7＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('111', '1', '5', '6', '8', '6×(8－5＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('112', '1', '5', '6', '9', '6×(9－5)×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('113', '1', '5', '7', '8', '8×(7－5＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('114', '1', '5', '7', '9', '(9－5)×(7－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('115', '1', '5', '8', '8', '(8－5)×8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('116', '1', '5', '8', '9', '(8－5)×(9－1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('117', '1', '5', '9', '9', '5＋9＋9＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('118', '1', '6', '6', '6', '6×(6－1)－6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('119', '1', '6', '6', '8', '6/(1－6/8)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('120', '1', '6', '6', '9', '6×(9－6＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('121', '1', '6', '7', '9', '(9－6)×(7＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('122', '1', '6', '8', '8', '8×(8－6＋1)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('123', '1', '6', '8', '9', '6＋8＋9＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('124', '1', '6', '9', '9', '6＋9＋9×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('125', '1', '7', '7', '9', '7＋7＋9＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('126', '1', '7', '8', '8', '7＋8＋8＋1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('127', '1', '7', '8', '9', '7＋8＋9×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('128', '1', '7', '9', '9', '7＋9＋9－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('129', '1', '8', '8', '8', '8＋8＋8×1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('130', '1', '8', '8', '9', '8＋8＋9－1', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('131', '2', '2', '2', '3', '(2＋2)×3×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('132', '2', '2', '2', '4', '(2＋2)×(4＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('133', '2', '2', '2', '5', '(2＋2×5)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('134', '2', '2', '2', '7', '2×(2×7－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('135', '2', '2', '2', '8', '(2＋2＋8)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('136', '2', '2', '2', '9', '2＋(2＋9)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('137', '2', '2', '3', '3', '2×(3＋3)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('138', '2', '2', '3', '4', '3×(2＋4＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('139', '2', '2', '3', '5', '3×(2×5－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('140', '2', '2', '3', '6', '(2×3＋6)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('141', '2', '2', '3', '7', '(2＋3＋7)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('142', '2', '2', '3', '8', '2＋(3＋8)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('143', '2', '2', '3', '9', '2×3＋9×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('144', '2', '2', '4', '4', '(2×4＋4)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('145', '2', '2', '4', '5', '2＋4×5＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('146', '2', '2', '4', '6', '(2＋4＋6)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('147', '2', '2', '4', '7', '2＋(4＋7)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('148', '2', '2', '4', '8', '(2＋4)×8/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('149', '2', '2', '4', '9', '2＋4＋9×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('150', '2', '2', '5', '5', '(2＋5＋5)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('151', '2', '2', '5', '6', '2＋(5＋6)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('152', '2', '2', '5', '7', '2×5＋7×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('153', '2', '2', '5', '8', '2×(5＋8)－2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('154', '2', '2', '5', '9', '2×(5＋9－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('155', '2', '2', '6', '6', '(2＋6)×6/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('156', '2', '2', '6', '7', '2×(6＋7)－2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('157', '2', '2', '6', '8', '2＋6＋8×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('158', '2', '2', '6', '9', '(6/2＋9)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('159', '2', '2', '7', '7', '2×(7＋7－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('160', '2', '2', '7', '8', '2×7＋8＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('161', '2', '2', '8', '8', '2×(8＋8/2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('162', '2', '2', '8', '9', '8＋2×9－2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('163', '2', '3', '3', '3', '(3＋3×3)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('164', '2', '3', '3', '5', '3＋3×(5＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('165', '2', '3', '3', '6', '(3＋3＋6)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('166', '2', '3', '3', '7', '3×(3＋7－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('167', '2', '3', '3', '8', '(3＋3)×8/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('168', '2', '3', '3', '9', '3＋3＋9×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('169', '2', '3', '4', '4', '3×4×(4－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('170', '2', '3', '4', '5', '(3＋4＋5)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('171', '2', '3', '4', '6', '3×(4＋6－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('172', '2', '3', '4', '7', '4＋(3＋7)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('173', '2', '3', '4', '8', '3×(4＋8/2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('174', '2', '3', '4', '9', '4×(3＋9)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('175', '2', '3', '5', '5', '(3＋5)×(5－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('176', '2', '3', '5', '6', '(3＋5)×6/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('177', '2', '3', '5', '7', '3×5＋7＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('178', '2', '3', '5', '8', '3＋5＋8×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('179', '2', '3', '5', '9', '(3＋5×9)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('180', '2', '3', '6', '6', '(3×6－6)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('181', '2', '3', '6', '7', '3＋6×7/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('182', '2', '3', '6', '8', '3×6＋8－2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('183', '2', '3', '6', '9', '(6－3＋9)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('184', '2', '3', '7', '7', '3＋7＋7×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('185', '2', '3', '7', '8', '(7－3＋8)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('186', '2', '3', '7', '9', '3×(7＋9)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('187', '2', '3', '8', '8', '3×(8＋8)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('188', '2', '3', '8', '9', '8×(9－3×2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('189', '2', '3', '9', '9', '9－3＋9×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('190', '2', '4', '4', '4', '(4＋4＋4)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('191', '2', '4', '4', '5', '(4＋4)×(5－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('192', '2', '4', '4', '6', '4＋(4＋6)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('193', '2', '4', '4', '7', '4＋4×(7－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('194', '2', '4', '4', '8', '4＋4＋8×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('195', '2', '4', '4', '9', '4×(9－2)－4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('196', '2', '4', '5', '5', '4＋(5＋5)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('197', '2', '4', '5', '6', '4＋5×(6－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('198', '2', '4', '5', '7', '4×(5＋7)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('199', '2', '4', '5', '8', '4＋5×8/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('200', '2', '4', '5', '9', '(9－5)×(4＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('201', '2', '4', '6', '6', '4×(6＋6)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('202', '2', '4', '6', '7', '4＋6＋7×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('203', '2', '4', '6', '8', '6/4×8×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('204', '2', '4', '6', '9', '6＋4×9/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('205', '2', '4', '7', '7', '(7＋7)×2－4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('206', '2', '4', '7', '8', '4×7－8/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('207', '2', '4', '7', '9', '(7－4＋9)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('208', '2', '4', '8', '8', '8＋4×8/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('209', '2', '4', '8', '9', '8×(9－4－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('210', '2', '4', '9', '9', '4＋9＋9＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('211', '2', '5', '5', '7', '5＋5＋7×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('212', '2', '5', '5', '8', '8×(5/5＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('213', '2', '5', '5', '9', '5＋9＋5×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('214', '2', '5', '6', '6', '6＋6×(5－2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('215', '2', '5', '6', '7', '6×(7－5＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('216', '2', '5', '6', '8', '5×6－8＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('217', '2', '5', '6', '9', '9＋6×5/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('218', '2', '5', '7', '7', '7＋7＋5×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('219', '2', '5', '7', '8', '8×(5×2－7)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('220', '2', '5', '7', '9', '5×7－9－2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('221', '2', '5', '8', '8', '(5×8＋8)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('222', '2', '5', '8', '9', '5＋8＋9＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('223', '2', '6', '6', '6', '6＋6＋6×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('224', '2', '6', '6', '7', '(6＋6×7)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('225', '2', '6', '6', '8', '6×(8－6＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('226', '2', '6', '6', '9', '(6×9－6)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('227', '2', '6', '7', '8', '8×(7－6＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('228', '2', '6', '7', '9', '6＋7＋9＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('229', '2', '6', '8', '8', '6＋8＋8＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('230', '2', '6', '8', '9', '8/6×9×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('231', '2', '6', '9', '9', '(9－6＋9)×2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('232', '2', '7', '7', '8', '7＋7＋8＋2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('233', '2', '7', '8', '8', '(7×8－8)/2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('234', '2', '7', '8', '9', '(7＋9)×2－8', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('235', '2', '8', '8', '8', '8×(8/8＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('236', '2', '8', '8', '9', '8×(9－8＋2)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('237', '2', '8', '9', '9', '8＋9＋9－2', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('238', '3', '3', '3', '3', '3×3×3－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('239', '3', '3', '3', '4', '3＋(3＋4)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('240', '3', '3', '3', '5', '3×3＋5×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('241', '3', '3', '3', '6', '3＋3＋6×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('242', '3', '3', '3', '7', '(3＋3)×(7－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('243', '3', '3', '3', '8', '3＋3×8－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('244', '3', '3', '3', '9', '3×(9－3/3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('245', '3', '3', '4', '4', '3×4＋4×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('246', '3', '3', '4', '5', '3×(4＋5)－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('247', '3', '3', '4', '6', '3＋4×6－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('248', '3', '3', '4', '7', '3×(4＋7－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('249', '3', '3', '4', '8', '(4－3)×8×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('250', '3', '3', '4', '9', '(3－4＋9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('251', '3', '3', '5', '5', '5×5－3/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('252', '3', '3', '5', '6', '(3＋5)×(6－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('253', '3', '3', '5', '7', '(3×5－7)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('254', '3', '3', '5', '9', '(3＋5)×9/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('255', '3', '3', '6', '6', '3×(6＋6/3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('256', '3', '3', '6', '7', '6＋3×7－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('257', '3', '3', '6', '8', '(3＋6)×8/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('258', '3', '3', '6', '9', '3－6＋9×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('259', '3', '3', '7', '7', '7×(3/7＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('260', '3', '3', '7', '8', '7＋8＋3×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('261', '3', '3', '7', '9', '3＋7×9/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('262', '3', '3', '8', '8', '8/(3－8/3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('263', '3', '3', '8', '9', '8×(9－3－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('264', '3', '3', '9', '9', '3＋9＋9＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('265', '3', '4', '4', '4', '4×(4＋3)－4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('266', '3', '4', '4', '5', '4×4＋5＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('267', '3', '4', '4', '6', '(4＋4)×(6－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('268', '3', '4', '4', '7', '(4/4＋7)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('269', '3', '4', '4', '8', '4＋4×(8－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('270', '3', '4', '4', '9', '(4＋4)×9/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('271', '3', '4', '5', '5', '4＋5＋5×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('272', '3', '4', '5', '6', '6×(5－4＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('273', '3', '4', '5', '7', '4＋5×(7－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('274', '3', '4', '5', '8', '(4＋5)×8/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('275', '3', '4', '5', '9', '(4－5＋9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('276', '3', '4', '6', '6', '(6－4＋6)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('277', '3', '4', '6', '8', '6×(4＋8)/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('278', '3', '4', '6', '9', '(6－4)×(9＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('279', '3', '4', '7', '7', '4×7－7＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('280', '3', '4', '7', '8', '8＋4×(7－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('281', '3', '4', '7', '9', '4－7＋9×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('282', '3', '4', '8', '9', '4＋8＋9＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('283', '3', '4', '9', '9', '4×(9＋9)/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('284', '3', '5', '5', '6', '6×(5/5＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('285', '3', '5', '5', '7', '(5/5＋7)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('286', '3', '5', '5', '8', '5－5＋8×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('287', '3', '5', '5', '9', '5×(9/5＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('288', '3', '5', '6', '6', '(6＋6)×(5－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('289', '3', '5', '6', '7', '(6－5＋7)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('290', '3', '5', '6', '8', '(6－5)×8×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('291', '3', '5', '6', '9', '(5－6＋9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('292', '3', '5', '7', '8', '5×7－8－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('293', '3', '5', '7', '9', '5＋7＋9＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('294', '3', '5', '8', '8', '5＋8＋8＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('295', '3', '5', '8', '9', '5－8＋9×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('296', '3', '5', '9', '9', '9＋5×9/3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('297', '3', '6', '6', '6', '6＋6×(6－3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('298', '3', '6', '6', '7', '(6/6＋7)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('299', '3', '6', '6', '8', '6－6＋8×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('300', '3', '6', '6', '9', '6＋6＋9＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('301', '3', '6', '7', '7', '6×(7/7＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('302', '3', '6', '7', '8', '6＋7＋8＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('303', '3', '6', '7', '9', '(6－7＋9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('304', '3', '6', '8', '8', '6×8－8×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('305', '3', '6', '8', '9', '(8－6)×(9＋3)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('306', '3', '6', '9', '9', '6－9＋9×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('307', '3', '7', '7', '7', '7＋7＋7＋3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('308', '3', '7', '7', '8', '7－7＋8×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('309', '3', '7', '7', '9', '(9－7/7)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('310', '3', '7', '8', '8', '(7＋8/8)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('311', '3', '7', '8', '9', '(7－8＋9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('312', '3', '7', '9', '9', '(7＋9/9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('313', '3', '8', '8', '8', '(8＋8－8)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('314', '3', '8', '8', '9', '8×(9－8)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('315', '3', '8', '9', '9', '(8＋9－9)×3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('316', '3', '9', '9', '9', '9＋9＋9－3', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('317', '4', '4', '4', '4', '4＋4＋4×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('318', '4', '4', '4', '5', '(4/4＋5)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('319', '4', '4', '4', '6', '4＋4×6－4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('320', '4', '4', '4', '7', '(4＋4)×(7－4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('321', '4', '4', '4', '8', '4×(4＋8/4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('322', '4', '4', '4', '9', '4＋4×(9－4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('323', '4', '4', '5', '5', '4×(5＋5－4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('324', '4', '4', '5', '6', '(5－4)×6×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('325', '4', '4', '5', '7', '(4－5＋7)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('326', '4', '4', '5', '8', '4＋5×(8－4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('327', '4', '4', '6', '8', '(4－6＋8)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('328', '4', '4', '6', '9', '4/6×9×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('329', '4', '4', '7', '7', '7×(4－4/7)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('330', '4', '4', '7', '8', '4×7－8＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('331', '4', '4', '7', '9', '4＋7＋9＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('332', '4', '4', '8', '8', '4＋8＋8＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('333', '4', '4', '8', '9', '4×9－8－4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('334', '4', '5', '5', '5', '(5＋5/5)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('335', '4', '5', '5', '6', '5－5＋6×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('336', '4', '5', '5', '7', '(7－5/5)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('337', '4', '5', '5', '8', '8×(4－5/5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('338', '4', '5', '5', '9', '5×(9－5)＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('339', '4', '5', '6', '6', '(5＋6/6)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('340', '4', '5', '6', '7', '(5－6＋7)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('341', '4', '5', '6', '8', '8×(5－6＋4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('342', '4', '5', '6', '9', '5＋6＋9＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('343', '4', '5', '7', '7', '(5＋7/7)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('344', '4', '5', '7', '8', '5＋7＋8＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('345', '4', '5', '7', '9', '7×(9－5)－4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('346', '4', '5', '8', '8', '(5＋8/8)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('347', '4', '5', '8', '9', '(5－8＋9)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('348', '4', '5', '9', '9', '(5＋9/9)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('349', '4', '6', '6', '6', '(6＋6－6)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('350', '4', '6', '6', '7', '6＋6×(7－4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('351', '4', '6', '6', '8', '6＋6＋8＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('352', '4', '6', '6', '9', '6＋9×(6－4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('353', '4', '6', '7', '7', '6＋7＋7＋4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('354', '4', '6', '7', '8', '(8－7)×6×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('355', '4', '6', '7', '9', '6×(7＋9)/4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('356', '4', '6', '8', '8', '(6＋8－8)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('357', '4', '6', '8', '9', '6＋8×9/4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('358', '4', '6', '9', '9', '(6＋9－9)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('359', '4', '7', '7', '7', '(7－7/7)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('360', '4', '7', '7', '8', '(7＋7－8)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('361', '4', '7', '8', '8', '(7－8/8)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('362', '4', '7', '8', '9', '(7＋8－9)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('363', '4', '7', '9', '9', '(7－9/9)×4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('364', '4', '8', '8', '8', '8＋8×8/4', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('365', '4', '8', '8', '9', '8×(8－9＋4)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('366', '4', '8', '9', '9', '(4－9/9)×8', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('367', '5', '5', '5', '5', '5×5－5/5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('368', '5', '5', '5', '6', '5×5－6＋5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('369', '5', '5', '5', '9', '5＋5＋9＋5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('370', '5', '5', '6', '6', '5×(6－6/5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('371', '5', '5', '6', '7', '6－7＋5×5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('372', '5', '5', '6', '8', '5＋6＋8＋5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('373', '5', '5', '7', '7', '5＋7＋7＋5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('374', '5', '5', '7', '8', '7－8＋5×5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('375', '5', '5', '8', '8', '5×5－8/8', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('376', '5', '5', '8', '9', '8－9＋5×5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('377', '5', '5', '9', '9', '5×5－9/9', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('378', '5', '6', '6', '6', '6×(5－6/6)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('379', '5', '6', '6', '7', '6＋6＋7＋5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('380', '5', '6', '6', '8', '6＋6×(8－5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('381', '5', '6', '6', '9', '6×9－6×5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('382', '5', '6', '7', '7', '(5－7/7)×6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('383', '5', '6', '7', '8', '6×(7－8＋5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('384', '5', '6', '7', '9', '6＋9×(7－5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('385', '5', '6', '8', '8', '8×(6－8＋5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('386', '5', '6', '8', '9', '6×(8－9＋5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('387', '5', '6', '9', '9', '9－(6－9)×5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('388', '5', '7', '7', '9', '(9－7)×(7＋5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('389', '5', '7', '8', '8', '(7＋8)×8/5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('390', '5', '7', '8', '9', '8×(7－9＋5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('391', '5', '8', '8', '8', '8×8－8×5', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('392', '5', '8', '8', '9', '8×9/(8－5)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('393', '6', '6', '6', '6', '6＋6＋6＋6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('394', '6', '6', '6', '8', '(6＋6－8)×6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('395', '6', '6', '6', '9', '6＋6×(9－6)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('396', '6', '6', '7', '9', '(6＋7－9)×6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('397', '6', '6', '8', '8', '6×8/(8－6)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('398', '6', '6', '8', '9', '(8－6)×9＋6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('399', '6', '7', '8', '9', '8/(9－7)×6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('400', '6', '7', '9', '9', '(7＋9)×9/6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('401', '6', '8', '8', '8', '8＋8×(8－6)', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('402', '6', '8', '8', '9', '(8＋8)×9/6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('403', '6', '8', '9', '9', '8×(9＋9)/6', '0', '0', '0');
INSERT INTO `dntown_wx_game24_question` VALUES ('404', '7', '8', '8', '9', '8＋8×(9－7)', '0', '0', '0');

-- ----------------------------
-- Table structure for dntown_wx_game24_user
-- ----------------------------
DROP TABLE IF EXISTS `dntown_wx_game24_user`;
CREATE TABLE `dntown_wx_game24_user` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `open_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `hit_rate` float DEFAULT NULL,
  `times` int(11) DEFAULT NULL,
  `right_times` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `rank` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `module_step` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `step_time` datetime DEFAULT NULL,
  `question_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `is_answered` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dntown_wx_game24_user
-- ----------------------------

-- ----------------------------
-- Table structure for dntown_wx_log
-- ----------------------------
DROP TABLE IF EXISTS `dntown_wx_log`;
CREATE TABLE `dntown_wx_log` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `type` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `open_id` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `user_Name` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `content` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `reply` text COLLATE utf8_bin,
  `module` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `step` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dntown_wx_log
-- ----------------------------

-- ----------------------------
-- Table structure for dntown_wx_user
-- ----------------------------
DROP TABLE IF EXISTS `dntown_wx_user`;
CREATE TABLE `dntown_wx_user` (
  `id` varchar(32) COLLATE utf8_bin NOT NULL,
  `open_id` varchar(32) COLLATE utf8_bin NOT NULL,
  `user_name` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `module` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `step` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `module_time` datetime DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of dntown_wx_user
-- ----------------------------
