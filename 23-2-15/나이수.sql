create database thisisjava;

use thisisjava;

-- 테이블 작성
create table users(
	userid		varchar(50) primary key,
    username		varchar(50) not null,
    userpassword	varchar(50) not null,
    userage		numeric(3) not null,
    useremail	varchar(50) not null
);

create table board(
	bno 			INT					primary key,
    btitle			varchar(100)		not null,
    bcontent		longtext			not null,
    bwriter			varchar(50)			not null,
    bdate			datetime			default now(),
    bfilename		varchar(50)			null,
    bfiledata		longblob				null
);

create table accounts (
	ano				varchar(20) 		PRIMARY key,
    owner			varchar(20) 		not null,
    balance			NUMERIC				not null
);
