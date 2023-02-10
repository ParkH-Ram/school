-- 중첩 트리거
drop database if exists triggerdb;

-- 트리거 디비 생성
create database if not exists triggerdb;

use triggerdb;

create table orderTbl								-- 구매 테이블
(
	orderNo int auto_increment primary key,			--  구매 일련 번호
    userid varchar(5),								-- 구매한 회원 아이디
    prodName varchar(5),							-- 구매한 물건
    orderamount int									-- 구매 개수
);

create table prodtbl								-- 물품 테이블
(
	prodName varchar(5),							-- 물건 이름
    account 	int       							-- 남아 있는 제품 수 
);


create table deliverTbl   							-- 배송 테이블
(
	deliverNo 	int auto_increment primary key,		-- 배송 일련 번호
    prodName	varchar(5),							-- 배송할 물건
    account int										-- 배송할 물건 개수
);

-- prodTbl 삭제 방법
drop table prodTbl;
-- data 입력
insert into prodTbl values ('사과', 100);
insert into prodTbl values ('배', 100);
insert into prodTbl values ('귤', 100);

 select * from prodtbl;

-- 튜플 값 삭제하는 방법
delete from prodtbl where prodname = '귤';


-- 중첩 트리거
-- 구매 테이블에서 구매가 있을 때 (insert) 물품 테이블 개수 감소 
drop trigger if EXISTS ordertrg;

delimiter //
create trigger orderTrg    		-- 구매 트리거
	after insert 				-- orderTbl에 insert : 구매재가 물품을 구매 했을 때
    on ordertbl    				-- 구매 테이블에서 인서트가 일어났을 때
    for each row
begin
	update prodtbl set account = account - new.orderamount  -- 남아 있는 수량에서 주문한 개수 만큼 뺌
		where prodName = new.prodName;
end //
delimiter ;


drop trigger prodTrg;        -- 


-- 배송 테이블에 새 배송 건을 입력하는 테이블 
delimiter //
create trigger prodTrg    		-- 물품 트리거
	after update 				-- 
    on prodTbl    				--
    for each row
begin
	declare orderAmount int; 	-- 주문 개수 : ( 변경 전의 개수 - 변경 후의 개수 ) 
	set orderAmount = old.account - new.account;
    insert into delivertbl (prodname, account) values(new.prodName, orderAmount);
end //
delimiter ;

select * from ordertbl;
select * from prodtbl;
select * from delivertbl;

insert into ordertbl values(Null, 'john', '배', 5);

-- fulltext 검색 

create table FulltextTbl (
  id int auto_increment primary key,
  title varchar(15) not null,
  description varchar(1000)
) ;
 
INSERT INTO FulltextTbl VALUES
  (NULL, '광해, 왕이 된 남자','왕위를 둘러싼 권력 다툼과 당쟁으로 혼란이 극에 달한 광해군 8년'),
  (NULL, '간첩','남한 내에 고장간첩 5만 명이 암약하고 있으며 특히 권력 핵심부에도 침투해있다.'),
  (NULL, '피에타',' 더 나쁜 남자가 온다! 잔혹한 방법으로 돈을 뜯어내는 악마같은 남자 스토리.'),
  (NULL, '레지던트 이블 5','인류 구원의 마지막 퍼즐, 이 여자가 모든 것을 끝낸다.'),
  (NULL, '파괴자들','사랑은 모든 것을 파괴한다! 한 여자를 구하기 위한, 두 남자의 잔인한 액션 본능!'),
  (NULL, '킹콩을 들다',' 역도에 목숨을 건 시골소녀들이 만드는 기적 같은 신화.'),
  (NULL, '테드','지상최대 황금찾기 프로젝트! 500년 전 사라진 황금도시를 찾아라!'),
  (NULL, '타이타닉','비극 속에 침몰한 세기의 사랑, 스크린에 되살아날 영원한 감동'),
  (NULL, '8월의 크리스마스','시한부 인생 사진사와 여자 주차 단속원과의 미묘한 사랑'),
  (NULL, '늑대와 춤을','늑대와 친해져 모닥불 아래서 함께 춤을 추는 전쟁 영웅 이야기'),
  (NULL, '국가대표','동계올림픽 유치를 위해 정식 종목인 스키점프 국가대표팀이 급조된다.'),
  (NULL, '쇼생크 탈출','그는 누명을 쓰고 쇼생크 감옥에 감금된다. 그리고 역사적인 탈출.'),
  (NULL, '인생은 아름다워','귀도는 삼촌의 호텔에서 웨이터로 일하면서 또 다시 도라를 만난다.'),
  (NULL, '사운드 오브 뮤직','수녀 지망생 마리아는 명문 트랩가의 가정교사로 들어간다'),
  (NULL, '매트릭스',' 2199년.인공 두뇌를 가진 컴퓨터가 지배하는 세계.') ;


select * from fulltexttbl;




