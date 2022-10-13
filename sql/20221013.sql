-- 20221013

-- 함수 : 단일행 함수, 집합 함수 

select ename, sal
-- , nvl(comm,0) as comm
from emp
where comm >=0;

-- 문자 함수

select lower('SCOTT)
from dual;
-- 더미테이블 dual 

select ename, lower(ename)
from emp;

select upper('scott') from dual;

select initcap('scott') from dual;
-- 앞 문자만 대문자로 바꿔주기 initcap

-- substr(원본, 시작포인트, 반환할 개수)
select substr('안녕하세요. 손흥민입니다. ', 2, 4) from dual;
select substr('안녕하세요. 손흥민입니다. ', 5) from dual;

select length('안녕하세요. 손흥민입니다') from dual;

-- lpad, rpad 특정 자리수 지정하고 자리수에 데이터가 없는 경우 특정 패턴으로 채우는 함수
-- 00010, 00020, 00030, 00040....
select dname, deptno, lpad(deptno, 5, '0'), rpad(deptno, 5, 'a')
from dept;

select '     ABC     ', trim('     ABC     '), 'A B C     ', trim('A B C     ')
from dual;

select replace('Steven King', 'Steven', 's.'), replace('Steven King', 'Steven', '')
from dual;

-- 숫자 함수

select -10, abs(-10)
from dual;

select 2.1, 2.9, floor(2.9)
from dual;

-- 반올림 round (값, 자릿수)
select 1234.567, round(1234.567, 1), round(1235.567, -1), round(1235.567)
from dual;

-- 절사 trunc
select 1234.567, trunc(1234.567, 1), trunc(1234.567, -1)
from dual;

-- 나누기 
select mod(1,3), mod(2,3), mod(3,3), mod(3,0)
from dual;

-- 날짜 함수

-- 현재 날짜
select sysdate from dual;

select months_between(sysdate, '21/12/13') from dual;

select add_months(sysdate, -2) from dual;

-- next_day : 오늘 날짜 기준으로 가장 빨리 만나는 요일 -> 1이 일요일부터 시작 
select next_day(sysdate, 1) from dual;

select last_day(sysdate) from dual;

select round(sysdate) from dual;

select trunc(sysdate) from dual;

-- 변환 함수 

-- to_char(원본, 'format')
-- date -> varchar2
-- 2022.10.13 14:39 형식 등
select sysdate, to_char(sysdate, 'YYYY-MM-DD'), to_char(sysdate, 'YYYY.MM.DD.'), to_char(sysdate, 'YYYY.MM.DD. HH24:MI:SS')
from dual;

-- number -> varchar2
select to_char(123456789, '000,000,000,000'), to_char(123456789, '999,999,999,999'), to_char(123456789, 'L999,999,999,999')
from dual;

select ename, sal, to_char(sal*1400,'L999,999,999,999') as wonsal
from emp;

-- to_date(문자, 'format(날짜형식)')
-- varchar2 -> date
select to_date('1999-12-13', 'YYYY-MM-DD')
from dual;

-- varchar2 -> number
select to_number('20,000','999,999') - to_number('10,000','999,999')
from dual;

-- decode 함수 -> 여러가지 비교를 통해 결과 출력 switch ~case 와 유사
select
    ename,deptno,
    decode( 
    deptno, 10, 'ACCOUNTING',
    20, 'RESEARCH',
    30, 'SALES',
    40, 'OPERATIONS'
    ) as dname
from emp;

--  직급에 따라 급여를 인상하도록 하자. 직급이 'ANALYST'인 사원은 5%, 'SALESMAN'인 사원은 10%, 'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상한다
select distinct job from emp;

select 
    ename, job, sal,
    nvl(
    decode(job, 'ANALYST', sal*1.05
         , 'SALESMAN', sal*1.10
         , 'MANAGER', sal*1.15
         , 'CLERK', sal*2.00
         )
         ,sal)as upsal
from emp;

-- case ~ when then 
select ename, deptno,
    case when deptno = 10 then 'accounting'
    when deptno = 20 then 'research'
    when deptno = 30 then 'sales'
    when deptno = 40 then 'operations'
    end as name
from emp;    

-----------------------------------------------------
-- 그룹함수, 집합함수, 집계함수, 다중행 함수...
-- sum, avg, count, max, min...

-- 회사의 모든 사원의 급여 총액 = 월 지출액
select sum(sal)
from emp;

-- 커미션 총액
select sum(comm), count(comm), avg(comm)
from emp;

-- 급여 평균
select avg(sal)
from emp;

-- 최고 급여 찾기
select max(sal)
from emp;

-- 최저 급여 찾기 
select min(sal)
from emp;

-- 전체 사원의 수
select count(*)
from emp;

-- 부서의 수 
select count(*)
from dept;

-- 직급의 수
select count(distinct job)
from emp;

-- group by -> 특정 컬럼 값을 기준으로 그룹핑 
select sum(sal), count(*) from emp where deptno=10;

select deptno, count(*), sum(sal), trunc(avg(sal)), max(sal), min(sal), count(comm)
from emp
group by deptno
-- 부서별 평균 급여가 2000 이상인 부서의 데이터만 출력
-- having avg(sal) >= 2000

-- 최대 급여가 2000 이상인 부서의 데이터만 출력
having max(sal) >= 2900
;

-- 직급별
select job, count(*)
from emp
group by job
;



















