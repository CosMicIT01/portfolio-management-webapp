-- -----------------------------------------------------
-- Schema crm_db
-- -----------------------------------------------------
-- USE `crm_db` ;

CREATE TABLE `tbl_user` (
	`user_id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`user_username` VARCHAR(255) NOT NULL,
	`user_password` VARCHAR(255) NOT NULL,
	`user_email` VARCHAR(255) ,
	`user_home_address` VARCHAR(255) ,
	`user_phone` VARCHAR(255) ,
	PRIMARY KEY (`user_id`)
);
