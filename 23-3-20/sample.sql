-- port Ȯ�� �ϴ� �޼���
select dbms_xdb.gethttpport () from dual;

-- port �ٲٱ�~
exec dbms_xdb.sethttpport(9090);

-- ����� ���� ����
create user book_ex IDENTIFIED by book_ex
Default tablespace users                 -- �⺻ ���̺� �����̽��� users�� ����
temporary tablespace temp;               -- �ӽ� ���̺� �����̽��� temp�� ����

grant connect, DBA TO book_ex;          -- ���� ���Ѱ� DBA ������ ���� �ο�

-- C:\oraclexe\app\oracle\oradata\XE
-- DBF ���� : ���̺� �����̽� ��� �ϴ� ����
-- Users.DBF Users ���̺� �����̽�