CREATE DATABASE  IF NOT EXISTS `to_do_list_apis`;
USE `to_do_list_apis`;

--
-- Table structure for table `library_books`
--

DROP TABLE IF EXISTS `task`;

CREATE TABLE `task` (
                        `id` int NOT NULL AUTO_INCREMENT,
                        `title` varchar(45) DEFAULT NULL,
                        `date` varchar(45) DEFAULT NULL,
                        `description` varchar(250) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
