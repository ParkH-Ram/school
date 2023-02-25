rollback;

create database foxy;
use foxy; 

drop table CompanyTable;
drop table users;
drop table stockHolding;    -- 드랍할 1 번

CREATE TABLE CompanyTable (
    CompanyCode		 CHAR(10) 		  Not Null primary key,     		-- 종목 코드
    CompanyName 	 VARCHAR(15) 	  Not Null,     					-- 종목명
    CompanyList 	 VARCHAR(6)  	  Not Null,    					    -- 종목 업종 ( KOSPI, KOSDAQ )
    CompanyBirth 	 CHAR(11),											-- 상장일 
    CompanyTotal 	 VARCHAR(255) 	  Not Null     						-- 시가 총액  ~~ 억
	
);

-- 코스닥 1~10등까지 인서트
INSERT CompanyTable values('247540', '에코프로비엠', 'KOSDAQ', '2019-03-11', '157265');   -- 1
INSERT CompanyTable values('091990', '셀트리온헬스', 'KOSDAQ', '2017-07-28', '90995');	-- 2
INSERT CompanyTable values('066970', '앨엔에프', 'KOSDAQ', '2020-03-22', '90226');	-- 3
INSERT CompanyTable values('086520', '에코프로', 'KOSDAQ', '2016-08-21', '62765');	-- 4
INSERT CompanyTable values('028300', 'HLB', 'KOSDAQ', '2019-03-25', '43500'); 	-- 5
INSERT CompanyTable values('293490', '카카오게임즈', 'KOSDAQ', '2019-03', '39915'); 	-- 6
INSERT CompanyTable values('263750', '펄어비스', 'KOSDAQ', '2013-03-30', '29516'); 	-- 7
INSERT CompanyTable values('041510', '에스엠', 'KOSDAQ', '2021-11-12', '29402'); 	-- 8
INSERT CompanyTable values('048260', '오스템임플란트', 'KOSDAQ', '2022-12-20', '28434'); 	-- 9
INSERT CompanyTable values('278280', '천보', 'KOSDAQ', '2015-05-22', '25950'); 	-- 10


-- 코스피 
Insert CompanyTable values('373220', 'LG에너지솔루션',	'KOSPI', '2022-01-27',	'1216800');
insert CompanyTable VALUEs('000270', 'KIA', 'KOSPI', '1973-07-21', '31508');  -- 기아
insert CompanyTable VALUEs('000660', 'sk하이닉스', 'KOSPI', '1973-07-21', '31508');  -- sk하이닉스
insert CompanyTable VALUEs('005380', '현대차', 'KOSPI', '1973-07-21', '31508');  -- 현대차
insert CompanyTable VALUEs('005930', '삼성전자', 'KOSPI', '1973-07-21', '31508');  -- 삼성전자
insert CompanyTable VALUEs('006400', '삼성SDI', 'KOSPI', '1973-07-21', '31508');  -- 삼성sdi
insert CompanyTable VALUEs('035420', 'NAVER', 'KOSPI', '1973-07-21', '31508');  -- 네이버
insert CompanyTable VALUEs('035720', 'KAKAO', 'KOSPI', '1973-07-21', '31508');  -- 카카오
insert CompanyTable VALUEs('051910', 'LG화학', 'KOSPI', '1973-07-21', '31508');  -- lg화학
insert CompanyTable VALUEs('207940', '삼성바이오로직스', 'KOSPI', '1973-07-21', '31508');  -- 삼성바이오로직스

-- 추가 
insert CompanyTable VALUES('068270', '셀트리온', 'KOSPI', '2012-08-08', '847100'); -- 셀트리온
insert CompanyTable VALUES('011170', '롯데케미칼', 'KOSPI', '1976-04-30', '45400'); -- 롯데케미칼
insert CompanyTable VALUES('015760', '한국전력', 'KOSPI', '1961-08-01', '25900'); -- 한국전력
insert CompanyTable VALUES('051900', 'LG생활건강', 'KOSPI', '2001-10-16', '1600400'); -- LG생활건강
insert CompanyTable VALUES('035250', '강원랜드', 'KOSPI', '2000-03-17', '30900'); -- 강원랜드
insert CompanyTable VALUES('090430', '아모레퍼시픽', 'KOSPI', '2002-09-05', '206900'); -- 아모레퍼시픽
insert CompanyTable VALUES('000020', '동화약품', 'KOSPI', '1976-03-17', '51000'); -- 동화약품
insert CompanyTable VALUES('005490', 'POSCO', 'KOSPI', '1988-04-27', '328500'); -- POSCO





-- 유저 정보 입력 


insert users values('kimjava', 'kimjava', '김자바', '010-2345-6789');
insert users values('parkracle', 'parkracle', '박라클', '010-4444-3333');
insert users values('koojava', 'koojava', '구자바', '010-3333-2222');
insert users values('jinsql', 'jinsql', '진에스큐', '010-1111-2222');
insert users values('oracle', 'oracle', '오라클', '010-2345-3333');
insert users values('koojoonpyo', 'koojoonpyo', '구준표', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');

-- 유저정보 추가 입력
insert users values('parkhaegyu', 'parkhaegyu', '박해규', 'secret');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');
insert users values('kamjava', 'kamjava', '감자바', '010-2345-6789');





create table users (
	-- user_no	int primary key AUTO_INCREMENT,				
	user_id			varchar(20) 	primary key not null, 				-- 유저 아이디
	user_pwd		varchar(128) 	not null,							-- 유저 비밀번호
	user_name		varchar(20)  	not null,							-- 유저 이름
	user_phoneNum	varchar(128) 	not null							-- 휴대폰 번호
);


-- primary key 외래키를 설정혀라면 primary 키나 , 유니크키가 있어야 한다 중요
CREATE TABLE stockHolding ( 											-- 보유 주식 목록 테이블
	user_id 					varchar(20),
    companyCode 				char(10) not null,
	FOREIGN KEY (user_id) 		REFERENCES users(user_id) on delete CASCADE, -- 회원정보 아이디 따오기
	FOREIGN KEY (CompanyCode) 	REFERENCES CompanyTable(CompanyCode),-- CompnayCode 
    holding_quantity			int ,		-- 보유수량  
    StocksSell					int ,		-- 매도가능 수
    Purchase_price				INT			-- 매입 단가	
);


-- 유저 정보 입력 후 값 주식 입력

-- 감자바씨 주식 목록
insert stockHolding values('kamjava', '278280', 20, 20, 15000);  -- 천보
insert stockHolding values('kamjava', '263750', 20, 20, 25000);	 -- 펄어버스 
insert stockHolding values('kamjava', '048260', 20, 20, 35000);  -- 오스템 임플란트 
insert stockHolding values('kamjava', '247540', 20, 20, 45000); -- 에코 프로비엠비
insert stockHolding values('kamjava', '005930', 2000, 2000, 100000);   -- 삼성

-- 김자바씨 주식 목록
insert stockHolding values('kimjava', '005930', 2000, 2000, 100000);  -- 삼성
insert stockHolding values('kimjava', '263750', 2000, 2000, 100000);  -- 펄어버스
insert stockHolding values('kimjava', '086520', 2000, 2000, 100000);  -- 에코프로
insert stockHolding values('kimjava', '041510', 2000, 2000, 100000);  -- 에스엠


-- 구자바씨 주식 목록
insert stockHolding values('koojava', '005930', 5000, 5000, 70000);   -- 삼성
insert stockHolding values('koojava', '000660', 1000, 5000, 70000);   -- sk하이닉스
insert stockHolding values('koojava', '005380', 2000, 5000, 70000);   -- 현대차
insert stockHolding values('koojava', '293490', 3000, 5000, 70000);   -- 카카오게임즈
insert stockHolding values('koojava', '035720', 4000, 5000, 70000);   -- 카카오

-- 구준표씨 주식 목록
insert stockHolding values('koojoonpyo', '035720', 1, 1, 100);   -- 카카오
insert stockHolding values('koojoonpyo', '000270', 1, 1, 1000);   -- 기아
insert stockHolding values('koojoonpyo', '005380', 1, 1, 10000);   -- 현대차
insert stockHolding values('koojoonpyo', '005930', 1, 1, 100000);   -- 삼성전자
insert stockHolding values('koojoonpyo', '006400', 1, 1, 10000);   -- 삼성SDI
insert stockHolding values('koojoonpyo', '028300', 1, 1, 10000);   -- HLB
insert stockHolding values('koojoonpyo', '041510', 1, 1, 10000);   -- 에스엠
insert stockHolding values('koojoonpyo', '373220', 1, 1, 10000);   -- LG에너지 솔루션

-- 박라클씨 주식 목록 
insert stockHolding values('parkracle', '035720', 1, 1, 100);   -- 카카오
insert stockHolding values('parkracle', '000270', 1, 1, 1000);   -- 기아
insert stockHolding values('parkracle', '005380', 1, 1, 10000);   -- 현대차
insert stockHolding values('parkracle', '005930', 1, 1, 100000);   -- 삼성전자
insert stockHolding values('parkracle', '006400', 1, 1, 10000);   -- 삼성SDI
insert stockHolding values('parkracle', '028300', 1, 1, 10000);   -- HLB
insert stockHolding values('parkracle', '041510', 1, 1, 10000);   -- 에스엠
insert stockHolding values('parkracle', '373220', 1, 1, 10000);   -- LG에너지 솔루션
insert stockHolding values('parkracle', '035720', 1, 1, 100);   -- 카카오
insert stockHolding values('parkracle', '000270', 1, 1, 1000);   -- 기아
insert stockHolding values('parkracle', '005380', 1, 1, 10000);   -- 현대차
insert stockHolding values('parkracle', '005930', 1, 1, 100000);   -- 삼성전자
insert stockHolding values('parkracle', '006400', 1, 1, 10000);   -- 삼성SDI
insert stockHolding values('parkracle', '028300', 1, 1, 10000);   -- HLB
insert stockHolding values('parkracle', '041510', 1, 1, 10000);   -- 에스엠
insert stockHolding values('parkracle', '373220', 1, 1, 10000);   -- LG에너지 솔루션


insert stockHolding values('parkracle', '035720', 1, 1, 100);   -- 카카오
insert stockHolding values('parkracle', '000270', 1, 1, 1000);   -- 기아
insert stockHolding values('parkracle', '005380', 1, 1, 10000);   -- 현대차
insert stockHolding values('parkracle', '005930', 1, 1, 100000);   -- 삼성전자
insert stockHolding values('parkracle', '006400', 1, 1, 10000);   -- 삼성SDI
insert stockHolding values('parkracle', '028300', 1, 1, 10000);   -- HLB
insert stockHolding values('parkracle', '041510', 1, 1, 10000);   -- 에스엠
insert stockHolding values('parkracle', '373220', 1, 1, 10000);   -- LG에너지 솔루션


insert stockHolding values('parkracle', '035720', 1, 1, 100);   -- 카카오
insert stockHolding values('parkracle', '000270', 1, 1, 1000);   -- 기아
insert stockHolding values('parkracle', '005380', 1, 1, 10000);   -- 현대차
insert stockHolding values('parkracle', '005930', 1, 1, 100000);   -- 삼성전자
insert stockHolding values('parkracle', '006400', 1, 1, 10000);   -- 삼성SDI
insert stockHolding values('parkracle', '028300', 1, 1, 10000);   -- HLB
insert stockHolding values('parkracle', '041510', 1, 1, 10000);   -- 에스엠
insert stockHolding values('parkracle', '373220', 1, 1, 10000);   -- LG에너지 솔루션


-- 박해규씨 주식 목록
insert stockHolding values('parkhaegyu', '005930', 150, 150, 20000);  -- 삼성
insert stockHolding values('parkhaegyu', '000270', 100, 100, 50000);  -- 기아
insert stockHolding values('parkhaegyu', '005380', 100, 100, 40000);  -- 현대차
insert stockHolding values('parkhaegyu', '035720', 200, 200, 10000);  -- 카카오
insert stockHolding values('parkhaegyu', '041510', 1, 1, 300000);  -- 에스엠
insert stockHolding values('parkhaegyu', '373220', 1, 1, 200000);  -- LG에너지 솔루션
insert stockHolding values('parkhaegyu', '028300', 1, 1, 100000);  -- HLB
insert stockHolding values('parkhaegyu', '278280', 1, 1, 15000);  -- 천보
insert stockHolding values('parkhaegyu', '263750', 1, 1, 25000);	 -- 펄어버스 
insert stockHolding values('parkhaegyu', '048260', 1, 1, 35000);  -- 오스템 임플란트 
insert stockHolding values('parkhaegyu', '247540', 1, 1, 77777); -- 에코 프로비엠비







select * from stockHolding ;
select * from users;  
select * from stockHolding  where user_id = 'parkhaegyu' ;
select * from users where user_id = 'parkhaegyu';
select * from CompanyTable where CompanyCode = '373220' ;
select * from CompanyTable;


select user_id, sum(holding_quantity*Purchase_price) as sum from stockHolding
where user_id = '2'
group by user_id;

현재 매입가 크롤링 하면 되고 
db에서 피룡한걸 몇개가지고 있냐 


-- 코드가 안 맞으면 에러가 뜬다
-- 종목 code가 안 맞으니까 에러가 뜬다 



select * from users;
select user_id as us, companyCode, sum(Purchase_price) as totalPrice,
 sum(holding_quantity)as totalQuantity    -- 계산은 sum(Purchase_price) (( 기준을 group by로 정하고 합처서 결과를 출력)) 이 결과를 as totalPrice, 이 이름의 칼럼으로 내보낸다 
from stockHolding 
where user_id= 'parkracle'
group by companyCode; -- companyCode로 그룹해준다  -- 위에 sum을 붙이면 companycode로 합쳐진 애들을 같이 합쳐줌
desc stockHolding;  

-- sql 문법 



