use java;

create table friend(
num int primary key auto_increment,		/*알아서 숫자가 1씩 증가한다*/
name varchar(20) not null,
jumin varchar(15) not null
);
desc friend;
select * from friend;