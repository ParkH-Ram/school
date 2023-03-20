CREATE DATABASE yse_spring_mvc;

CREATE USER 'yse_spring_mvc_user'@'%' IDENTIFIED BY '1234';   -- 데이터베이스를 위한 데이터베이스 유저 


-- yse_spring_mvc_user가 yse_spring_mvc db에 접근할 수 있는 권한 추가
GRANT EXECUTE, SELECT, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, LOCK TABLES  ON `yse_spring_mvc`.* TO 'yse_spring_mvc_user'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

-- 책관리 테이블 생성

-- 책을 관리하기 위한 속성을 도출해보면 아래와  같다 
-- 제목 , 분류, 가격 
use yse_spring_mvc;

-- 테이블 생성
CREATE TABLE `book` (
 `book_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
 `title` VARCHAR(200) NOT NULL,
 `category` VARCHAR(200) NOT NULL DEFAULT '',
 `price` INT NULL,
 `insert_date` DATETIME NOT NULL DEFAULT NOW(),
 PRIMARY KEY (`book_id`)
)
COLLATE='utf8mb4_general_ci'
;


