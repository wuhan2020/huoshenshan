 
SET FOREIGN_KEY_CHECKS=0;
 
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 
DROP TABLE IF EXISTS `vedio`;
CREATE TABLE `vedio` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fileName` varchar(255) DEFAULT NULL,
  `fileExtension` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  `hackathon_id` int(11) DEFAULT NULL,
  `hackathon_stage` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
