create table t_users(
	id number(18) primary key,--使用Hibernate的时候，尽量一定要定义主键
	username varchar2(20) not null unique,
	password varchar2(20) not null,
	birth date default sysdate,
	sex number(1) default 1
);