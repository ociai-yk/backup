drop database if exists web1;
create database web1;
use web1;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
user_password varchar(255)
);

insert into users values(1,"taro","123");
insert into users values(2,"jiro","456");
insert into users values(3,"hanako","789");