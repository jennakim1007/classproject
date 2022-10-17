-- 20221017

-- 서브쿼리

-- SCOTT이 소속된 부서이름 출력
-- join 사용 
select dname from emp e, dept d where e.deptno=d.deptno and e.ename='SCOTT';
-- 서브쿼리 사용 
select deptno from emp where ename='SCOTT';
select dname from dept where deptno=20;
select dname from dept where deptno=(select deptno from emp where ename='SCOTT');

-- 스칼라 부속질의
select custid, (select name from customer c where o.custid=c.custid) as name
from orders o
group by custid
;
-- 마당서점의 고객별 판매액을 보이시오(결과는 고객이름과 고객별 판매액을 출력)
select custid, (select name from customer c where o.custid=c.custid) as name, sum(saleprice)as total
from orders o
group by custid
;

-- 인라인 뷰 : from 절 뒤에 쓰여지는 서브쿼리 -> 가상 테이블
-- 고객번호가 2 이하인 고객의 판매액 
select o.custid, sum(saleprice)
from  orders o, (select custid, name from customer where custid<=2) c
where c.custid=o.custid
group by o.custid
;
select *
from (select empno, ename, job, hiredate from emp)
where ename='SCOTT'
;

-- 중첩질의
-- 평균 급여보다 더 많은 급여를 받는 사원을 검색
select * 
from emp
where sal > (select avg(sal) from emp)
;
-- 평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오
select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice) from orders)
;
-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오.
select orderid, custid, saleprice
from orders
where saleprice >= (select avg(saleprice) from orders)
;
-- 3000 이상 받는 사원이 소속된 부서(?)와 동일한 부서에서 근무하는 사원이기에 서브쿼리의 결과 중에서 하나라도 일치하면 참
select * from emp where deptno in(select distinct deptno from emp where sal >= 3000);
select distinct deptno from emp
-- where deptno=? or deptno=? or...
-- where deptno in(?, 10, 20, 30....)
where sal >= 3000
;
-- 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select sum(saleprice) 
from orders
where custid in(select custid from customer where address like('%대한민국%'))
;
-- 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문번호와 금액을 보이시오
-- all 연산자는 모든 값이 true
select orderid, saleprice
from orders
where saleprice > all(select saleprice from orders where custid=3)
;
select orderid, saleprice
from orders
where saleprice > (select max(saleprice) from orders where custid=3)
;
-- EXISTS 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오
select sum(saleprice)
from orders o
where exists(select * from customer c where c.custid=o.custid and address like '%대한민국%')
;













