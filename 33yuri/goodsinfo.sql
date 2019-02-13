use java;

create table goodsinfo(
code char(5) not null,
name varchar(30) not null,
price int(8) not null,
maker varchar(20),
primary key(code)
);

desc goodsinfo;

insert into goodsinfo values
('a1001', '세탁기', '300000', '삼성');
insert into goodsinfo values
('a1002', '노트북', '130000', '삼성');
insert into goodsinfo values
('a1003', '냉장고', '300000', 'LG');

select * from goodsinfo;

create table person(
num int primary key auto_increment,
name varchar(20),
jumin varchar(15),
birht date);
/*테이블의 속성명을 바꾸는 방법
지금 birht라고 오타 나서 찾아봤어 ㅎ
ALTER TABLE `테이블명` CHANGE `기존컬럼명` `새컬럼명` 기존자료형*/
insert into person values
(null,'김유리','555555-5555555','2019-01-31');

insert into person values
(null,'김리','555555-5555555',now());

select * from person;



