use employees;

select emp_no, hire_date from employees order by hire_date asc;

select emp_no, hire_date from employees order by hire_date asc limit 5;

-- 출력 범위 지정 : LIMIT 0, 5  -> 0번째부터 5개 출력 ----LIMIT 5 OFFSET 0과 동일
-- 				LIMIT 0,20 


use sqldb;

-- 필요한 부분만 복사
create table buytbl5 (select userid, prodname from buytbl);
select * from buytbl5;

select * from buytbl;
select * from buytbl order by userID;

-- 사용자별 총 구매 개수
select userID AS '사용자 아이디', sum(amount) AS '총 구매 개수' from buytbl group by userID;

-- 사용자별 총 구매 액 :  구매액 
select userID AS '사용자 아이디', sum(price * amount) AS '총 구매액' from buytbl group by userID;

-- 물품별 총 판매금액이 얼마인가
select prodName AS '사용자 아이디', sum(price * amount) AS '총 구매액' from buytbl group by prodName;

-- 물품별 총 판매개수 판매개수가 많은 순으로 정렬
select prodName AS '사용자 아이디', sum(amount) AS '총 판매 개수' from buytbl group by prodName order by sum(amount) desc, prodName;

-- 평균 구매개수 
select * from buytbl;

-- 총 amount 개수에서 사용자 수를 나누면 ;
select avg(amount) AS '평균 구매 개수' from buytbl;

-- 사용자 별로 한번에 몇 개 씩 구매 하는가?
select userID, avg(amount) AS '평균 구매 개수' from buytbl GROUP BY userID;

-- 가장 큰 키
select userID, avg(amount) AS '평균 구매 개수' from buytbl GROUP BY userID;
select name, MAX(height), MIN(height) FROM usertbl;
select name, MAX(height), MIN(geight) FROM usertbl Group by Name;
select name, height
	from usertbl
    where height = (select max(height)FROM usertbl)
    OR height = (select MIN(height)from usertbl);
    
    select name, height from usertbl where height = (select max(height) from usertbl);
