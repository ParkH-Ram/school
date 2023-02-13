--  사용자 user 테이블

create table users (
    USERID          VARCHAR2(50) primary key,
    username        varchar2(50)  not null,
    userpassword  varchar2(50) not null,
    userage             number(3)       not null,
    useremail         varchar2(50)  not null
);
    
    

--   게시판(boards) 테이블

create table boards (
    bno            number                   primary key,
    btitle       varchar2(100)       not null,
    bcontent   clob                        not null,
    bwriter     varchar2(50)         not null,
    bdate         date                       default sysdate,
    bfilename varchar2(50)         null,
    bfiledate  blob                        null
 );
 
 
 -- board 테이블의 bno  값을 제공하는 시퀀스를 생성
 
create sequence seq_bno nocache;


drop table accounts;
--  계좌 정보 저장 될 accounts 테이블 생성
create table accounts(
    ano             varchar(20)     primary key,
    owner        varchar(20)     not null,
    balance      number             not null
);


--  안에 내용 넣기
insert into accounts  (ano, owner, balance)
values ('111-111-111', '        상여름', 1000000);

insert into accounts  (ano, owner, balance)
values ('222-222-222', '        상여자',9999333);

select * from accounts;

commit;

drop procedure user_create;
create or replace procedure user_create(
    a_userid                      IN users.userid%TYPE,
    a_username                 IN users.username%TYPE,
    a_userpassword          IN users.userpassword%TYPE,
    a_userage                    IN users.userage%TYPE,
    a_useremail                IN users.useremail%TYPE,
    a_rows                         OUT PLS_INTEGER
)
IS
BEGIN
    INSERT INTO users (userid, username, userpassword, userage, useremail)
    values (a_userid, a_username, a_userpassword, a_userage, a_useremail);
    a_rows := SQL%ROWCOUNT;
    commit;
END;
/

-- users 테이블에서  userid와 userpassword 확인

drop function user_login;

create OR REPLACE FUNCTION user_login (
    a_userid                 users.userid%TYPE,
    a_userpassword     user.userpassword%TYPE
) RETURN PLS_INTEGER
IS
    v_userpassword users.userpassword%TYPE;
    v_result PLS_INTEGER;
BEGIN
    SELECT userpassword INTO v_userpassword
    FROM    users
    WHERE  userid = a_userid;
    
    IF v_userpassword  = a_userpassword THEN
        RETURN 0;
        
    ELSE 
    
        RETURN 1;
        
    END IF;
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 2;
        
END;
   /



