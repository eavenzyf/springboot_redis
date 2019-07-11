/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 10.1.37-MariaDB 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `person` (
	`id` int (11),
	`name` varchar (765),
	`sex` varchar (12),
	`age` int (2)
); 
insert into `person` (`id`, `name`, `sex`, `age`) values('1','小明','男','16');
insert into `person` (`id`, `name`, `sex`, `age`) values('2','小芳','女','18');
insert into `person` (`id`, `name`, `sex`, `age`) values('3','天天','男','20');
