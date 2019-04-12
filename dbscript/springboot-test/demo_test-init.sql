#创建表
CREATE TABLE `springcloudtest`.`demo_test` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `is_active` TINYINT(1) NULL,
  `create_datetime` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_datetime` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`));


#数据初始化
INSERT INTO `springcloudtest`.`demo_test` (`name`, `is_active`) VALUES ('名称1', '0');
INSERT INTO `springcloudtest`.`demo_test` (`name`, `is_active`) VALUES ('名称2', '1');
INSERT INTO `springcloudtest`.`demo_test` (`name`, `is_active`) VALUES ('name1', '1');
INSERT INTO `springcloudtest`.`demo_test` (`name`, `is_active`) VALUES ('name2', '0');
INSERT INTO `springcloudtest`.`demo_test` (`name`, `is_active`) VALUES ('aaaa', '1');
INSERT INTO `springcloudtest`.`demo_test` (`name`, `is_active`) VALUES ('bbbb', '0');
