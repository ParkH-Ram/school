use sqldb;

DELIMITER $$
CREATE procedure ifProc()   -- 메서드 같은 느낌
BEGIN
 -- sql 프로그래밍
	DECLARE var1 INT;  -- 변수선언
	SET var1 = 100;		-- 변수에 값을 대입
    
    IF var1 = 100 THEN
		SELECT '100 입니다 ' ;
	ELSE
		SELECT '100 이아임다' ;
	END IF;
END $$
DELIMITER ;

call ifProc();  -- 메서드 콜 

-- employess DB의 employees 테이블 사용
-- 옆에는 입사일 열이 있는데 직원 번호에 10001번째 해당하는 직원의 입사일이 5년 넘었는지 확인

drop procedure if exists ifProc2;
use employees;

delimiter $$
create procedure ifproc2()   -- 수정할 땐 drop 후 새로 생성
begin 
   declare hireDate date;
    declare curDate date;
    declare days int;
    
    select hire_date into hireDate
   from employees.employees
    where emp_no = 10001;
    
    set curDate = current_date();
    set days = datediff(curDate, hireDate);
    
    if (days/365) >= 5 then
      select concat('입사한지', days/365 , '일이나 지났습니다. 축하합니다.');
      -- round(days/365,0)   소수점 제거 함수  계산할 값 뒤에 , 인수 번째 까지 소수점 출력 
   else 
      select concat('입사한지', days, '일 밖에 안되었습니다.');
   end if;
end $$
delimiter ;

call ifproc2();


create table usertbl
(
   userid      char(8),
    name       varchar(10),
    birthyear   int,
    addr      char(2),
    mobile1      char(3),
    mobile2      char(8),
    height      smallint,
    mdate      date
);

create table buytbl
(
   num         int,
    userid      char(8),
    prodname   char(6),
    groupname   char(4),
    price      int,
    amount      smallint
);