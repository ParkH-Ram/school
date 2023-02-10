use sqldb;

drop PROCEDURE if exists userProc1;

delimiter $$
create procedure userProc1(IN userName varchar(10))
begin
	select * from usertbl where name = userName;
end $$
delimiter ;

call userProc1('조관우');



drop PROCEDURE if exists userProc2;

delimiter $$
create procedure userProc2(IN userBirth varchar(10), IN userHeight INT) -- in 입력 매개 변수  2개
begin
	select * from usertbl
    where birthYear > userBirth AND height > userHeight;    -- 입력한 것보다 이후에 태어났고  키보다 더큰 사용자가 누군지? 
end $$
delimiter ;


call userProc2(1970, 175);



drop PROCEDURE if exists userProc3;

delimiter $$
create procedure userProc3(IN txtValue char(10), out outValue INT) -- in 입력 매개 변수  2개
begin
	Insert Into testTbl Value(null, txtValue);
    SELECT max(id) Into outValue From testTBL;
end $$
delimiter ;

create table if not exists testTBL (
	id int AUTO_INCREMENT primary key,
    txt char(10)
);

Call userProc3('테스트값', @myValue);        -- 뒤에 변수명을 따로 지정?   -- myValue로 변수를 하나 받게되고
SELECT concat('현재 입력된 ID 값 ==>', @myValue);

drop PROCEDURE if exists caseProc;

delimiter $$
create procedure caseProc(IN userName varchar(10))
begin
	declare bYear INT; 
    declare tti char(3);
    select birthYear INTO bYear From userTBl
		where name = userName;
    CASE
		WHEN ( bYear % 12 = 0 ) THEN SET tti = '원숭이';
        WHEN ( bYear % 12 = 1 ) THEN SET tti = '닭';
        WHEN ( bYear % 12 = 2 ) THEN SET tti = '개';
        WHEN ( bYear % 12 = 3 ) THEN SET tti = '돼지';
        WHEN ( bYear % 12 = 4 ) THEN SET tti = '쥐';
        WHEN ( bYear % 12 = 5 ) THEN SET tti = '소';
        WHEN ( bYear % 12 = 6 ) THEN SET tti = '호랑이';
        WHEN ( bYear % 12 = 7 ) THEN SET tti = '토끼';
        WHEN ( bYear % 12 = 8 ) THEN SET tti = '용';
        WHEN ( bYear % 12 = 9 ) THEN SET tti = '뱀';
        WHEN ( bYear % 12 = 10 ) THEN SET tti = '말';
		ELSE set tti = '양';
	END CASE;
    SELECT concat(userName, '의 띠 ==> ', tti);
end $$
delimiter ; 

call caseProc('김범수');
call caseProc('성시경');


-- while 이용한 구구단

Drop table if Exists gugutbl;

create table gugutbl (txt varchar(100));  -- 구구단 저장 테이블

drop PROCEDURE if exists whileProc;

delimiter $$
create procedure whileProc()
begin
	DECLARE str varchar(100);     -- 각 단을 문자열ㄹ ㅗ지정
    declare i Int;
    declare j int;
    set i = 2;
    
    while (i<10) DO
		set str = '';  -- 각 단 시작 시 저장할 문자열을 초기화
        set j = 1;
        while(j<10) do
			set str = concat(str, ' ', i, 'x', j, '=', i*j);        -- 구구단 계산값 누적
            set j = j+1;    -- 구구단 뒷 자리 수 증가
        end while;
        set i = i + 1 ;  --  단을 증가
        Insert Into gugutbl values(str);
	end while;
end $$
delimiter ;

call whileProc();
select * from gugutbl;



-- 트리거 : 테이블에 DML(i, u, d) 문이 실행 될 때 자동으로 SQL문을 실행
create database if not exists testdb;
use testdb; 

create table if not exists testtbl (id int, txt varchar(10));

insert into testtbl values (1, '레드벨벳');
insert into testtbl values (2, '잇지');
insert into testtbl values (3, '블랙핑크');

select * from testtbl;




DROP TRIGGER if exists testTrg



-- 트리거
DELIMITER //
CREATE TRIGGER testTrg -- 트리거 하나 생성
	AFTER DELETE       -- 딜리트를 실행하고 난 뒤 트리거 작동
    ON testTBL
    FOR EACH ROW 
BEGIN
	SET @msg = '가수 그룹 삭제';         -- 트리어 이렁났을 때 실행 구분
END //
DELIMITER ;


-- 데이터를 삽입, 수정, 삭제
SET @msg = '';
INSERT INTO testTbl values(4, '마마무'); -- 낫띵 
SELECT @msg;
update testdb set txt = '블핑' where id = 3;  -- 낫띵
select @msg;
DELETE from testtbl where id =4;             -- 데이터 삭제시 트리거 작업 실행ALTER
select @msg;


-- ALTER 트리거 사용
-- 회원 테이블에 update, delete를 시도하면 수정 또는 삭제된 데이터를 별도의 테이블에 보관하고 변경된 일자와 변경한 사람을 기록
use sqldb;
drop table buytbl;
create table backup_usertbl
(
userID char(8) not null primary key,
name varchar(10) not null,
birthYear int not null,
addr  char(2) not null,
mobile1 char(3),
mobile2 char(8),
height smallint,
mDate date,
modType char(2),  -- 변경된 타입 : 수정 또는 삭제
modDate date,    -- 변경된 날짜
modUser varchar(256) -- 변경한 사용자가 누구?   
 -- 기존의 있는 유저 테이블과 비슷하지만 내용이 더 많아짐 
 -- 칼럼이 많아짐
-- 기존 테이블에서 추가된 내용이 붙게 되어서 내용이 더욱 많아짐 
);

select * from backup_usertbl;

-- 변경 (update)과 delect가 발생할 때 작동하는 트리거

Drop trigger if exists backUsertbl_UpdateTrg;

delimiter //
create trigger backUserTbl_UpdateTrg
	after update   -- 업데이트 이후에 동작
    on userTbl	   -- usertbl1 에 부착
    for each row   -- 한행씩 처리가 되게
begin
	insert into backup_usertbl values(old.userid, old.name, old.birthYear, old.addr, old.mobile1, old.mobile2,
										old.height, old.mDate, '수정', curdate(), current_user());
end //
delimiter ;



Drop trigger if exists backUsertbl_DeleteTrg;

delimiter //
create trigger backUserTbl_DeleteTrg
	after delete   -- 업데이트 이후에 동작
    on userTbl	   -- usertbl1 에 부착
    for each row   -- 한행씩 처리가 되게
begin           -- OLD.  붙이는 이유 - 예전에 사용한 데이터를 넣어줘라.. 저장하기 위해??   
				-- OLD 이전 데이터,   new  - 새로운 데이터
	insert into backup_usertbl values(old.userid, old.name, old.birthYear, old.addr, old.mobile1, old.mobile2,
										old.height, old.mDate, '삭제', curdate(), current_user());
end //
delimiter ;

Update usertbl set addr = '몽골' where userid = 'jkw';
delete from usertbl where height >= 177;
select * from backup_usertbl;

-- INSERT 트리거ALTER
Drop trigger if exists usertbl_insertTrg;

delimiter //
create trigger usertbl_insertTrg
	after insert
    on usertbl
    for each row
begin      -- 강제 에러가 있으면 밑에서 작도응ㄹ 안할 수도 있음.
	signal sqlstate '45000' -- 강제 에러
		set message_text = '데이터의 입력을 시도. 귀하의 정보고 서버에 기록.';
end //

delimiter ;

INSERT into usertbl VALUE('abc', '에비시', 1977, 'seoul', '011', '11111111', 181, '2019-12-25');

-- before 트리거 : 트리거 실행 이전에 SQL 실행 - 입력되는 데이터의 문제가 있는지 확인해서 수정
-- 1900 년 이전의 데이터가 입력되면 0으로 표기,  현재 년도보다 더 높은 년도 입력 되면 현재 년도로 수정
-- sqldb.sql을 실행 해서 sqldb 초기화

use sqldb;
drop trigger if exists userTbl_BeforeInsertTrg;

delimiter //
create trigger usertbl_beforeInsertTrg
	before insert
    on usertbl
    for EACH ROW
begin
	if new.birthYear < 1900 then
		set new.birthYear = 0;
							-- curdate() 올해 연도를 가져 옴
	elseif new.birthYear > Year(curdate()) then
		set new.birthYear = year(curdate());
	end if;
end //
delimiter ;

insert into usertbl values ('kkk', '에시', 1377, '서울', '011', '11111111', 181, '2022-12-25');
insert into usertbl values ('lll', '비시', 3977, '서울', '011', '11111111', 181, '2019-3-25');
select * from usertbl;

-- 생성된 트리거
show triggers from sqldb;


-- 여기까지 저장 ------------------------------






