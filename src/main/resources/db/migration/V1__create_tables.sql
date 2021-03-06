/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE TABLE `tbl_user` (
	`user_id` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
	`user_username` VARCHAR(255) NOT NULL,
	`user_password` VARCHAR(255) NOT NULL,
	`user_type` VARCHAR(10) NOT NULL,
	`user_email` VARCHAR(255) ,
	`user_home_address` VARCHAR(255) ,
	`user_phone` VARCHAR(255) ,
	PRIMARY KEY (`user_id`)
);


-- Data exporting was unselected.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;