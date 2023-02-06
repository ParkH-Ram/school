create table usertbl
(userid char(8) not null primary key, 
name varchar(10) not null,
birthYear int not null,
addr char(2) not null,
mobile1 char(3),
mobile2 char(8),
height smallint,
mdate date
);
create table buytbl
(num int auto_increment not null primary key,
userid char(8) not null,
prodName char(6) not null,
groupName char(4),
price INT not null,
amount smallint not null,
foreign key (userid) references usertbl(userid)
);
INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울', NULL  , NULL      , 186, '2013-12-12');
INSERT INTO usertbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
INSERT INTO usertbl VALUES('YJS', '윤종신', 1969, '경남', NULL  , NULL      , 170, '2005-5-5');
INSERT INTO usertbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
INSERT INTO usertbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
INSERT INTO usertbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');
INSERT INTO buytbl(userid,prodname,groupname,price,amount)  VALUES('KBS', '운동화', NULL   , 30,   2);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('JYP', '모니터', '전자', 200,  1);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('BBK', '모니터', '전자', 200,  5);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('KBS', '청바지', '의류', 50,   3);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('BBK', '메모리', '전자', 80,  10);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('SSK', '책'    , '서적', 15,   5);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('EJW', '책'    , '서적', 15,   2);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('EJW', '청바지', '의류', 50,   1);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('BBK', '운동화', NULL   , 30,   2);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('EJW', '책'    , '서적', 15,   1);
INSERT INTO buytbl(userid,prodname,groupname,price,amount) VALUES('BBK', '운동화', NULL   , 30,   2);

SELECT * FROM usertbl WHERE name;

create table buytbl4 (SELECT * FROM buytbl);    -- 테이블 복사 할때는 create 뒤에 select를 붙이면 됨 

-- _한글자에 대한 모든 문자열
select name, height from usertbl where name like '_종신';

-- 김경호 보다 키가 크거나 같은  사람의 이름과 키를 출력
-- 김곃오 키
select name, height from usertbl where name like '김경호';
select name, height from usertbl where height >= 177;
-- 서브 쿼라 : 각가의 쿼리를 조합,  쿼리문안에 쿼리문 작성'

select name, height from usertbl where height >=
	(select height from usertbl where name like '김경호');  -- 두개를 안쓰고 이런식으로 괄호를 써서 만들면 ' '부분안에 이름만 바꿔주면 됨
-- 서브쿼리의 결괏값이 2개 이상인 경우 : any 서브쿼리  - in()
select name, height from usertbl where height >=
	(select height from usertbl where addr = '경남');
    
select height from usertbl where addr = '경남';
    
    -- 칼럼별로 정렬 : ORDER BY 칼럼명
	-- 기본 : 오름차순 ASC
    -- 내림차순 : DESC
    -- describe : 테이블
    -- descending : 칼럼
    
select name, mDate From usertbl order by mdate;
select name, mDate FROM usertbl order by mdate desc;
select name, height FROM usertbl order by mdate desc;
 select name, height FROM usertbl order by mdate desc, name asc;
  -- 중복된 것을 하나만 남기는 DISTINCT
 SELECT addr from usertbl;
 select addr from usertbl ORDER BY addr;
 select DISTINCT addr FROM usertbl;
   -- 전체 행이 몇개 인지 개수 표기
 SELECT COUNT(*) as cnt FROM usertbl;
 -- 이름 개수 가져오기 // (name) == (컬럼)
 SELECT COUNT(name) as cnt FROM usertbl;
   개를 안쓰고 이런식으로 괄호를 써서 만들면 ' '부분안에 이름만 바꿔주면 됨

-- 서브쿼리의 결괏값이 2개 이상인 경우 : any 서브쿼리  - in()
select name, height from usertbl where height >=
	(select height from usertbl where addr = '경남');
    
select height from usertbl where addr = '경남';
    
    -- 칼럼별로 정렬 : ORDER BY 칼럼명
	-- 기본 : 오름차순 ASC
    -- 내림차순 : DESC
    -- describe : 테이블
    -- descending : 칼럼
    
select name, mDate From usertbl order by mdate;

select name, mDate FROM usertbl order by mdate desc;

select name, height FROM usertbl order by mdate desc;

 select name, height FROM usertbl order by mdate desc, name asc;
 
 -- 중복된 것을 하나만 남기는 DISTINCT
 SELECT addr from usertbl;
 select addr from usertbl ORDER BY addr;
 select DISTINCT addr FROM usertbl;
 
 
 -- 전체 행이 몇개 인지 개수 표기
 SELECT COUNT(*) as cnt FROM usertbl;
 -- 이름 개수 가져오기 // (name) == (컬럼)
 SELECT COUNT(name) as cnt FROM usertbl;
 
 
 