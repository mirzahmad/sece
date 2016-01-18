/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 100108
Source Host           : localhost:3306
Source Database       : secedb

Target Server Type    : MYSQL
Target Server Version : 100108
File Encoding         : 65001

Date: 2016-01-17 20:31:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` longtext NOT NULL,
  `enabled` bit(1) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `meta_tags` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `category_order` int(11) DEFAULT NULL,
  `parent_ids` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5s5t2pfpxo0vnd1ihc43721ty` (`parent_id`),
  CONSTRAINT `FK5s5t2pfpxo0vnd1ihc43721ty` FOREIGN KEY (`parent_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for manufacturer
-- ----------------------------
DROP TABLE IF EXISTS `manufacturer`;
CREATE TABLE `manufacturer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` longtext NOT NULL,
  `image_url` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for option
-- ----------------------------
DROP TABLE IF EXISTS `option`;
CREATE TABLE `option` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `option_code` char(1) NOT NULL,
  `option_name` varchar(255) NOT NULL,
  `option_type` varchar(255) NOT NULL,
  `option_value` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL,
  `updated_date` datetime DEFAULT NULL,
  `average_customer_review` float DEFAULT NULL,
  `code` varchar(255) NOT NULL,
  `customer_review_totals` int(11) DEFAULT NULL,
  `description` longtext,
  `enabled` bit(1) NOT NULL,
  `image_urls` varchar(255) NOT NULL,
  `keywords` longtext,
  `made_in` varchar(255) DEFAULT NULL,
  `manufacturer_id` bigint(20) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `page_title` varchar(255) DEFAULT NULL,
  `related_products` varchar(255) DEFAULT NULL,
  `template_file_name` varchar(255) NOT NULL,
  `total_sold` bigint(20) DEFAULT NULL,
  `type` varchar(255) NOT NULL,
  `warranty_message` longtext,
  `category_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_10ganh9tlh637bdu7sammc8dp` (`code`),
  KEY `FKexqqeaksnmmku5py194ywp140` (`category_id`),
  CONSTRAINT `FKexqqeaksnmmku5py194ywp140` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product_item
-- ----------------------------
DROP TABLE IF EXISTS `product_item`;
CREATE TABLE `product_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL,
  `updated_date` datetime DEFAULT NULL,
  `always_available` bit(1) DEFAULT NULL,
  `product_item_condition` varchar(255) DEFAULT NULL,
  `cost` int(11) DEFAULT NULL,
  `product_item_depth` float DEFAULT NULL,
  `description` longtext,
  `enabled` bit(1) NOT NULL,
  `gift_wrap_available` bit(1) DEFAULT NULL,
  `gift_wrap_cost` int(11) DEFAULT NULL,
  `height` float NOT NULL,
  `mint_qty_to_order` smallint(6) DEFAULT NULL,
  `pre_order_release_date` datetime DEFAULT NULL,
  `regular_price` int(11) NOT NULL,
  `shipping_cost` int(11) DEFAULT NULL,
  `sku` varchar(255) NOT NULL,
  `special_message` varchar(255) DEFAULT NULL,
  `special_price` int(11) DEFAULT NULL,
  `special_price_begin_date` datetime DEFAULT NULL,
  `special_price_end_date` datetime DEFAULT NULL,
  `tax_cost` int(11) DEFAULT NULL,
  `tax_exempt` bit(1) DEFAULT NULL,
  `warranty` longtext,
  `weight` float NOT NULL,
  `width` float NOT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_mkfh9mxm2vedivv99hjkmd77g` (`sku`),
  KEY `FK41w979xpjkoguv4oev33qlk1s` (`product_id`),
  CONSTRAINT `FK41w979xpjkoguv4oev33qlk1s` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product_item_media_files
-- ----------------------------
DROP TABLE IF EXISTS `product_item_media_files`;
CREATE TABLE `product_item_media_files` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `large_file_url` varchar(255) NOT NULL,
  `media_type` char(1) NOT NULL,
  `small_image_url` varchar(255) NOT NULL,
  `product_item_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqkva79c0x2wxejowdt7arb2e7` (`product_item_id`),
  CONSTRAINT `FKqkva79c0x2wxejowdt7arb2e7` FOREIGN KEY (`product_item_id`) REFERENCES `product_item` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product_item_option
-- ----------------------------
DROP TABLE IF EXISTS `product_item_option`;
CREATE TABLE `product_item_option` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `enabled` bit(1) NOT NULL,
  `option_code` char(1) NOT NULL,
  `option_name` varchar(255) NOT NULL,
  `option_value` varchar(255) NOT NULL,
  `sort_order` smallint(6) DEFAULT NULL,
  `option_id` bigint(20) DEFAULT NULL,
  `product_item_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl9h5ryko6de6pj3av6qguali6` (`option_id`),
  KEY `FK3bdkdm8xgy4tq8og5qrnf08m4` (`product_item_id`),
  CONSTRAINT `FK3bdkdm8xgy4tq8og5qrnf08m4` FOREIGN KEY (`product_item_id`) REFERENCES `product_item` (`id`),
  CONSTRAINT `FKl9h5ryko6de6pj3av6qguali6` FOREIGN KEY (`option_id`) REFERENCES `option` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
