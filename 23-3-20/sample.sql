-- port 확인 하는 메서드
select dbms_xdb.gethttpport () from dual;

-- port 바꾸기~
exec dbms_xdb.sethttpport(9090);

-- 사용자 계정 생성
create user book_ex IDENTIFIED by book_ex
Default tablespace users                 -- 기본 테이블 스페이스는 users로 지정
temporary tablespace temp;               -- 임시 테이블 스페이스는 temp로 지정

grant connect, DBA TO book_ex;          -- 접속 권한과 DBA 관리자 권한 부여

-- C:\oraclexe\app\oracle\oradata\XE
-- DBF 파일 : 테이블 스페이스 사용 하는 파일
-- Users.DBF Users 테이블 스페이스