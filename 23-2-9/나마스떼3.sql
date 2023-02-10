create DATABASE if not exists indexdb;

use indexdb;

select count(*) from employees.employees;
-- 테이블 데이터를 랜덤하게 가져오기

create table emp select * from employees.employees order by rand();
create table emp_c select * from employees.employees order by rand();
create table emp_se select * from employees.employees order by rand();

select * from emp limit 5;
select * from emp_c limit 5;
select * from emp_se limit 5;

show table status;

show index from emp;
show index from emp_c;
show index from emp_se;

-- emp : 인덱스 nope , emp_c : 클러스터    emp_se : 보조 인덱스