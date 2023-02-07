
CREATE DATABASE moviedb;
 USE moviedb;
 
 CREATE TABLE movieTBL(

movie_id INT ,
movie_title VARCHAR(30) ,
movie_director VARCHAR(20) ,
movie_star VARCHAR(20) ,
movie_script LONGTEXT ,
movie_film LONGBLOB
) DEFAULT CHARSET=utf8mb4;
 
 INSERT INTO movieTBL VALUES (1,'쉰들러 리스트' , '스필버그' , '리암 니슨' ,
LOAD_FILE('/root/movies/Schindler.txt') ,
LOAD_FILE('/root/movies/Schindler.mp4') );

SHOW variables LIKE 'max_allowed_packet';

SHOW variables LIKE 'secure_file_priv';

select * from movietbl;

-- 업로드 가능한 크기 확인
 show variables like 'max_allowed_packet';
 
 -- 업로드 가능한 디렉토리 확인
 show variables like 'secure_file_priv';

CREATE DATABASE IF NOT EXISTS FulltextDB;
USE FulltextDB;
DROP TABLE IF EXISTS FulltextTbl;


-- 데이터 입력
INSERT INTO movietbl2 VALUES 
(1, '쉰들러 리스트', '스필버그', '리암 니슨', LOAD_FILE('C:/SQL/movies/Schindler.TXT'), LOAD_FILE('C:/SQL/movies/Schindler.MP4')),
(2, '쇼생크 탈출', '프랭크 다라본트', '팀 로빈스', LOAD_FILE('C:/SQL/movies/Shawshank.TXT'), LOAD_FILE('C:/SQL/movies/Shawshank.MP4')), 
(3, '라스트 모히칸', '마이클 만', '다니엘 데이 루이스', LOAD_FILE('C:/SQL/movies/Mohican.TXT'), LOAD_FILE('C:/SQL/movies/Mohican.MP4'));



SELECT * from movietbl2;
 CREATE TABLE movieTBL2(

movie_id INT primary key,   --  primary key 중복이 안 되게 설정 //아예  진입을 못하게 막아 버리는
movie_title VARCHAR(30) ,
movie_director VARCHAR(20) ,
movie_star VARCHAR(20) ,
movie_script LONGTEXT ,
movie_film LONGBLOB
) DEFAULT CHARSET=utf8mb4;


SELECT MOVIE_SCRIPT FROM MOVIETBL WHERE MOVIE_ID =1
INTO OUTFILE 'C:/SQL/movies/SCHINDLER_OUT.TXT'
    LINES TERMINATED BY '\\N';   -- 라인들이 줄바꿈으로 끝난다


SELECT MOVIE_FILM FROM movietbl2 WHERE MOVIE_ID = 3
INTO DUMPFILE 'C:/SQL/movies/Mohican_OUT.MP4';  -- 복사 되는 이름을 정하고 쫫 
use sqldb;
CREATE TABLE pivotTest
( uName CHAR(3) ,
season CHAR(2) ,
amount INT );

INSERT INTO pivotTest VALUES
('김범수','겨울',10) ,  ('윤종신','여름',15) , ('윤종신','가을',5) , ('김범수','겨울',10) ,
('김범수','겨울',10) , ('윤종신','봄',25) , ('김범수','겨울',10) , ('윤종신','가을',15) , 
('김범수','겨울',10) ;

SELECT uName ,
SUM(IF(season='봄' , amount , 0)) AS '봄' ,
SUM(IF(season='여름' , amount , 0)) AS '여름' ,
SUM(IF(season='가을' , amount , 0)) AS '가을' ,
SUM(IF(season='겨울' , amount , 0)) AS '겨울' ,
SUM(amount) AS '합계' FROM pivotTest GROUP BY uName ;

SELECT season,
SUM(IF(uName='김범수' , amount , 0)) AS '김범수' ,
SUM(IF(uName='윤종신' , amount , 0)) AS '윤종신' ,
SUM(amount) AS '합계' FROM pivotTest GROUP BY season ;

use sqldb;
select json_object('name', name, 'height', height) AS 'JSON 값' FROM usertbl
	where height >= 180;   -- 키가 180보다 큰 사람 출력
    
SET @json = '{ "usertbl" : [
		{"name" : "임재범","height" : 182},
        {"name" : "이승기","height" : 182},
        {"name" : "성시경","height" : 186}
        ]
	}';
    
SELECT JSON_VALID(@json) AS JSON_VALID;
SELECT JSON_SEARCH(@json, 'one', '성시경') AS JSON_SEARCH;
SELECT JSON_EXTRACT(@json, '$.usertbl[2].name') AS JSON_EXTRACT;
SELECT JSON_INSERT(@json, '$.usertbl[0].mDate', '2009-09-09')AS JSON_INSERT;
    
    
    

use sqldb;
Create table stdtbl
( stdName VARCHAR(10) NOT NULL primary key,  -- 중복 제거 primary key
  addr    char(4) not null
  );
Create table clubtbl
( clubName VARCHAR(10) NOT NULL primary key,  -- 중복 제거 primary key
  roomNo    char(4) not null
  );
  
Create Table stdclubTbl
( num int AUTO_INCREMENT not null primary key,
  stdName varchar(10) not null,
  clubName varchar(10) not null,
  FOREIGN KEY(stdName) REFERENCES stdtbl(stdName),
  FOREIGN KEY(clubName) REFERENCES clubtbl(clubName)
  );

drop table stdclubTbl;

use sqldb;
delete from clubtbl;

  INSERT into stdtbl values ('김범수','경남'), ('성시경','서울'),('조용필', '경기'), ('은지원','경북'), ('바비킴','서울');
  INSERT into clubtbl values ('수영','101호'), ('바둑','102호'),('축구', '103'), ('봉사','104');
  INSERT into stdclubTbl values (NULL,'김범수', '바둑'), (NULL,'김범수', '축구'), (NULL,'조용필', '축구'), (NULL,'은지원', '축구'), (NULL,'은지원', '봉사'), (NULL,'바비킴', '봉사');
  
  select * from stdTbl;
  select * from clubTbl;
select * from stdclubTbl;

drop table stdclubTbl;


