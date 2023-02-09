use sqldb;

drop view if exists v_usertbl;  -- view 테이블 삭제할땐 drop view if exists 테이블명


create view v_usertbl   -- view를 만들 때는 내가 원하는 것만 선택 해서 보여 줄 수 있다.
as
	select userid, name, addr from usertbl; 
    -- sqldb 중 usertbl에서  userid, name, addr 항복만 출력한다 
    
select * from v_usertbl;

--  여기까지 저장 --

-- 기본적인 뷰 생성, 뷰 생성시 뷰에 사용될 열의 이름을 변경 가능ALTER

CREATE VIEW v_userbuytbl
AS
	SELECT U.userid AS 'USER ID', name, prodName, addr, CONCAT(mobile1, mobile2) AS 'MOBILE PHONE'
    FROM usertbl U
		Inner join buytbl B
			ON U.userid = B.userid;

select * from v_userbuytbl;

-- 띄어쓰기 이용 시 ` ` << 백틱 을 사용해서 묶어 줘야 함
select * from v_userbuytbl WHERE name = '김범수';   -- 특정 구매자의 기록만 알고 싶다면 

ALTER VIEW v_userbuytbl   -- 수정할 때 ALTER 이용
AS
	SELECT U.userid AS '사용자 이름', name, prodName, addr, CONCAT(mobile1, mobile2) AS 'MOBILE PHONE'
    FROM usertbl U
		Inner join buytbl B
			ON U.userid = B.userid;   

select * from v_userbuytbl;
select `사용자 이름` FROM v_userbuytbl;


show create view v_usertbl;

desc v_usertbl;

select * from v_usertbl;

-- 업데이트
update v_usertbl set addr = '부산' where userid = 'JKW';  -- jkw 의 주소를 부산으로 바꾸겠다

-- 뷰를 통한 데이터 입력    ->>> not null 에 처리가 되어야지만 뷰를 통해서 데이터 입력 가능
INSERT into v_usertbl(userid, name, addr) values('kbm', '김병만', '충청');

desc usertbl;

-- 그룹 함수를 포함하는  뷰
CREATE VIEW v_sum
AS
	SELECT userid AS 'userid', SUM(price*amount) AS '합계'
		FROM buytbl GROUP BY userid;

select * from v_sum;

select * from Information_SCHEMA.views
	where table_SCHEMA = 'sqldb' and table_name = 'v_sum';
    
-- 항목 : IS_UPDATALBE - 테이블 수정 NO : 수정 불가
-- 집계함수를 사용한 뷰
-- UNION ALL, JOIN 등을  사용한 뷰
-- DISTINCT, GROUP BY 등을 사용한 뷰 

-- 뷰를 통한 데이터 입력 : 조건을 이용해서 view를 생성 시
create view v_momo
AS 
	SELECT * from usertbl WHERE height >= 177;  -- 키가 177이상인 사람 생성
    
select * from v_momo;


-- 177미만 사용자 삭제       -- view 안에는 177미만인 사용자가 없어 데이터 삭제 0
Delete From v_momo WHERE height < 177;   

-- 177 미만  추가 사용 가능
insert into v_momo values('kbm', '김병만', 1977, '경기', 010, 5555555, 158,'2023-01-01');

select * from v_momo;

select * from usertbl;

-- 뷰 : 177 이상인 사용자만 다룰 수 있는 권한 : 조전 옵션에 맞는 데이터만 입력 가능하게 설정
ALTER VIEW v_momo
AS 
	SELECT * FROM usertbl WHERE height >= 177  -- 키가 177이상인 사람 생성
		WITH CHECK option;      -- where 부분을 체크 해서 위에  where 조건에 해당하는 사람만 수정 가능
INSERT INTo v_momo values('sjh', '서장훈', 2006, '서울', '010', '33333333', 200, '2023-03-03');

select * from v_momo;

-- 2개 이상의 테이블이 관련된 복함 뷰

-- join 통해서 만든 뷰에는 수정 삭제 작업 불가


show variables like 'innodb_fire_per_table';

-- 테이블 스페이스 확장명 .idb
CREATE TABLESPACE ts_a ADD DATAFILE 'ts_a.ibd';
CREATE TABLESPACE ts_b ADD DATAFILE 'ts_b.ibd';
CREATE TABLESPACE ts_c ADD DATAFILE 'ts_c.ibd';

use sqldb;

-- 테이블 생성시 테이블 스페이스에 연결
create table table_a (id int)
	tablespace ts_a;         -- 시스템 테이블 스페이스에 저장이 되지 않고 별도의 ts_a라는 테이블 스페이스에 별도로 저장
    
    
-- 테이블을 먼저 생성 후 테이블 스페이스에 연결
create table table_b (id int);


drop table secondarytbl;
create table secondarytbl(
userID char(8),
name varchar(10)
);

insert into secondarytbl values ('LSG', '이승기');
insert into secondarytbl values ('KBS', '김범수');
insert into secondarytbl values ('KKH', '김경호');
insert into secondarytbl values ('JYP', '박진영');
insert into secondarytbl values ('SSK', '신세경');
insert into secondarytbl values ('LJB', '임재범');
insert into secondarytbl values ('YJS', '이준석');
insert into secondarytbl values ('EJW', '은지원');
insert into secondarytbl values ('JKW', '조관우');
insert into secondarytbl values ('BBK', '바비킴');

select * from secondarytbl;

CREATE database if not exists testdb;
use testdb;
Drop table if exists mixedtbl;
create table mixedtbl
( userID char(8) not null,
   name varchar(10) not null,
   addr char(2)
   );
   
INSERT Into Mixedtbl Values('LSG', '이승기', '서울');
INSERT Into Mixedtbl Values('KBS', '김범수', '경남');
INSERT Into Mixedtbl Values('KKH', '김경호', '전남');
INSERT Into Mixedtbl Values('JYP', '조용필', '창원');
INSERT Into Mixedtbl Values('SSK', '성시경', '마산');
INSERT Into Mixedtbl Values('LGB', '임재범', '서울');
INSERT Into Mixedtbl Values('YJS', '윤종신', '창원');
INSERT Into Mixedtbl Values('EJW', '은지원', '경남');
INSERT Into Mixedtbl Values('JKW', '조관우', '경북');
INSERT Into Mixedtbl Values('BBK', '바비킴', '서울');

SELECT * from mixedTbl;


-- 클러스터형 인덱스를 생성 .  Primary Key로 지정하고 별다른 얘기가 없으며 ㄴ디폴트로 클러스터형 인덱스가 생성된다
ALTER table mixedtbl
	add constraint PK_mixedtbl_userID
		Primary key (userID);
        
ALTER table mixedtbl
	add constraint uk_mixedtbl_name
		unique (name);
        
show index from mixedtbl;
        
-- 임재범의 주소를 알고 싶을 때 검색
-- 클러스터형 인덱스가 있든지 보조 인덱스가 있든지 두 가지가 혼합되어 있든지 아님 인덱스가 아예 없든지-
-- 쿼리문의 실행결과에는 아무런 차이가 없다. 인덱스는 단지 빨리 검색해주는 역할을 할 뿐 결과의 내용과는 상관이 없다.
select addr from mixedtbl where name = '임재범';

    
