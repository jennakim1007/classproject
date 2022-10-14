-- 20221014

-- join : 관계있는 테이블의 스키마를 붙이는 것 
select * 
from emp, dept;

-- 유효한 데이터만 남기도록 조건 붙이기 
-- Equi Join
select * 
from emp, dept
where emp.deptno = dept.deptno
;

select emp.ename, dept.dname 
from emp, dept
where emp.deptno = dept.deptno
;

-- 테이블 별칭을 이용해서 컬럼 구별
select e.ename, d.dname 
from emp e, dept d
where e.deptno = d.deptno
;

select * from emp inner join dept
on emp.deptno = dept.deptno;

select * from emp join dept
on emp.deptno = dept.deptno;

select * from emp e join dept d
on e.deptno = d.deptno;

-- self join : 자기 자신의 테이블과 조인 
-- 각 사원들의 상사의 이름을 출력 emp -> mgr : 상사의 사원번호
-- outer join :  “(+)” 기호

select ename, mgr from emp;

select e1.ename as "사원이름", e2.ename as "상사이름"
from emp e1, emp e2
where e1.mgr=e2.empno(+)
;

select *
from emp e1 left outer join emp e2
on e1.mgr = e2.empno;

select deptno
from emp e inner join dept d
using(deptno);

select *
from emp natural join dept;

-- 'SCOTT' 사원의 사원번호와 이름 직급 부서이름 부서위치를 출력
-- emp -> 사원번호 이름 직급 dmpt -> 부서이름, 부서위치
select empno, ename, job, dname, loc
from emp e, dept d
where e.deptno=d.deptno and e.ename='SCOTT'
;

select empno, ename, job, dname, loc
from emp e join dept d
on e.deptno = d.deptno
where ename = 'SCOTT'
;

select *
from book join orders
on book.bookid=orders.bookid
join customer
on orders.custid=customer.custid;

-- salgrade 테이블을 참조해서 사원들의 사번, 이름, 급여, 급여 등급을 출력 
select * from salgrade;

select ename, losal, sal, hisal, grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
;

-- mysql 
select ename, losal, sal, hisal, grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal
;

-- 3개 이상의 테이블 합쳐보기
-- 판매내역 : 판매 정보, 판매 서적의 정보, 고객의 정보 
desc orders;
desc customer;

select orders.orderdate, customer.custid, customer.name, book.bookname, book.price, orders.saleprice
from book, customer, orders
where orders.custid=customer.custid and orders.bookid=book.bookid
order by orders.orderdate desc
;



