use mydb;
drop table if exists buytbl, usertbl;

create table usertbl
(
   userid      char(8)      not null   primary key,
    name      varchar(10)   not null,
    birthyear   int         not null,
    addr      char(2)      not null,
    mobile1      char(3)      null,
    mobile2      char(8)      null,
    height      smallint   null,
    mdate      date      null
);

create table buytbl
(
   num         int         auto_increment   not null   primary key,
    userid      char(8)      not null,
    prodname   char(6)      not null,
    groupname   char(4)      null,
    price      int         not null,
    amount      smallint   not null,
    foreign key(userid) references usertbl(userID)
);



-- 먼저 각각의 테이블에 데이터를 테이블당 4건씩만 입력하자. 입력 시에 김범수의 출생년도는 모르는 것으로 NULL값을 넣고, 김경호의 출생년도는 1871년으로 자롬ㅅ 입력 해보자.

INSERT into usertbl values('LSG', '이승기', 1987, '서울', '011', '11111111', 182, '2008-8-8');
INSERT into usertbl values('KBS', '김범수', NULL, '경남', '011', '22222222', 173, '2012-8-8');
INSERT into usertbl values('LSG', '이승기', 1871, '전남', '011', '33333333', 177, '2007-8-8');
INSERT into usertbl values('LSG', '이승기', 1950, '경기', '011', '44444444', 166, '2009-8-8');
