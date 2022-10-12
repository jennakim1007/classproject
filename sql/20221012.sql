-- 20221012

-- 사용가능한 테이블 정보 
select * from tab;

-- 테이블의 구조 확인 
desc dept;

-- 
select ename -- * 
from emp;

select deptno, job, sal, ename
from emp;

-- select [distinct] 칼럼 이름, 컬럼 이름, ...
-- from 테이블의 이름

select*
from dept;

select deptno, dname
from dept;

select *
from emp;

select sal + comm
from emp;

select ename, sal, sal*12
from emp;

select ename || ' is a ' || job
from emp;

-- NULL을 0 또는 다른 값으로 변환하기위해서 사용하는 함수 NVL
select ename, comm, 
sal*12+comm, nvl(comm, 0) as Monsal, 
sal*12+nvl(comm, 0) as Annsal
from emp;

-- distinct : 중복된 데이터를 생략하고 출력 
select deptno
from emp;

select distinct deptno
from emp;

-- 행을 찾는 조건
-- select
-- from
-- where <- 행을 찾는 조건식 
-- 급여를 3000 이상 받는 사원의 리스트
select *
from emp
where sal >= 3000;

-- 급여를 3000 이상 받는 사원의 이름과 직급 리스트
select ename, job
from emp
where sal >= 3000;

-- 부서테이블에서 부서번호가 10번인 사원의 리스트를 출력
-- deptno=10
select *
from emp
where deptno = 10;

-- 10번 부서 소속이 아닌 사원의 리스트를 출력
select *
from emp
where deptno != 10;

select *
from emp
where deptno <> 10;

-- 이름으로 검색 => 문자열 작은 따옴표로 표시
-- ename = 'SCOTT'
-- 이름이 SCOTT 인 사원의 정보를 출력
select *
from emp
where ename = 'SCOTT'; -- 저장된 문자열은 대소문자 구분 

select *
from emp
where hiredate = '81/11/17'; -- 날짜 비교시에도 작은 따옴표로 사용해서 비교 

-- 논리 연산 => 비교연산을 여러개 사용해서 결과를 만든다 
-- and, or, not

-- 10번 부서의 매니저를 검색
select *
from emp
where deptno = 10 and job = 'MANAGER';

-- 10번 부서에 소속한 사원들과 매니저들을 출력
select *
from emp
where deptno = 10 or job = 'MANAGER' ;

-- 10번 부서 소속이 아닌 사원 리스트 출력
select *
from emp
where not deptno=10;

-- 10번 부서 소속인 사원들 중에서 직급이 MANAGER인 사람을 검색하여 사원명, 부서번호, 직급을 출력하려고 한다면 두 가지 조건을 제시해야 합니다
select ename, deptno, job
from emp
where deptno = 10 and job = 'MANAGER';

-- 10번 부서에 소속된 사원이거나 직급이 MANAGER인 사람을 검색하여 사원명, 부서번호, 직급을 출력합시다
select ename, deptno, job
from emp
where deptno = 10 or job = 'MANAGER';

-- 2000에서 3000 사이의 급여를 받는 사원을 조회
select *
from emp
where sal between 2000 and 3000;

select *
from emp
where sal >= 2000 and sal <= 3000;

-- 1987년에 입사한 사원 리스트
select *
from emp
where hiredate between '1987/01/01' and '87/12/31';

-- 커미션이 300 이거나 500 이거나 1400 인 사원리스트
select *
from emp
where comm = 300 or comm = 500 or comm = 1400;

select *
from emp
where comm in(300,500,1400);

-- 이름 검색 : ename = 'SCOTT';
-- like 패턴 검색

-- 이름을 "F" 로 시작하는 이름을 검색
select *
from emp
where ename like 'F%';

-- 이름을 "N" 로 끝나는 이름을 검색
select *
from emp
where ename like '%N';

-- 이름에 "AR" 을 포함하는 이름을 검색
select *
from emp
where ename like '%AR%';

-- 이름에 두 번째 글자가 "A" 인 이름을 검색
select *
from emp
where ename like '_A%';

-- null 여부를 확인하는 is null
-- null 은 비교연산자를 사용할 수 없다 = null X
select *
from emp
where comm is null or comm = 0;

-- 커미션이 등록된 사원의 리스트
select *
from emp
where comm is not null;

-- 결과 행의 정렬 : order by 컬럼 asc | desc
-- asc : 오름차순, 생략하면 기본값
-- desc : 내림차순

-- 급여 컬럼을 기준으로 오름차순으로 정렬
select *
from emp
-- where 
order by sal; -- asc ;

-- 급여 컬럼을 기준으로 내림차순으로 정렬
select *
from emp
-- where 
order by sal desc;

-- 사원 리스트를 이름순으로 출력
select *
from emp
order by ename;

-- 입사일 순으로 사원리스트 출력
select *
from emp
order by hiredate desc, ename asc;

select *
from emp
order by sal, ename desc, comm;



