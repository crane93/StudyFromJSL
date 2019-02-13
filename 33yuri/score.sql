use java;

create table score(
num int primary key auto_increment,
name varchar(10) not null,
korean int(10) not null,
English int(10) not null,
math int(10) not null);

desc score;
select * from score;
drop table score;