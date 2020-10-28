drop database if exist lmsdb;

create database lmsdb;

use lmsdb;

create table books(
b_code int PRIMARY KEY,
title varchar(20) NOT NULL,
price decimal(10,2)	NOT NULL,
publish_date DATE NOT NULL,
category varchar(50) not null);

insert into books values
(101,"Let us c",180.00,'1999-09-09',"Textbook"),
(102,"Let us c++",280.00,'1999-08-09',"Textbook"),
 (103,"java",380.00,'1999-07-09',"Textbook"),
 (104,"j2ee",580.00,'1999-06-09',"Textbook"),
 (105,"sprintboot",980.00,'1999-05-09',"Textbook");