-- 20221014

-- join 
select * from emp cross join dept;

-- equi join
select * from emp inner join dept
on emp.deptno = dept.deptno;

select e1.ename, e2.ename
from emp e1 left outer join emp e2
on e1.mgr = e2.empno;

select e1.ename, e2.ename
from emp e1 right outer join emp e2
on e1.empno = e2.mgr;

select empno, ename, job, dname, loc
from emp e join dept d
on e.deptno = d.deptno
where ename = 'SCOTT'
;

select ename, losal, sal, hisal, grade
from emp e join salgrade s
on e.sal between s.losal and s.hisal
;

-- 3개 이상의 테이블 합쳐보기
-- 판매내역 : 판매 정보, 판매 서적의 정보, 고객의 정보 
desc orders;
desc customer;

select orders.orderdate, customer.name, book.bookname, book.price, orders.saleprice
from book, customer, orders
where orders.custid=customer.custid and orders.bookid=book.bookid
order by orders.orderdate
;

select o.orderdate, c.name, b.bookname, b.price, o.saleprice
from orders o 
join customer c on o.custid = c.custid
join book b on o.bookid = b.bookid
where name='박지성'
;

select o.orderdate, c.name, count(*) as "구매횟수", b.bookname, b.price, o.saleprice
from orders o 
join customer c on o.custid = c.custid
join book b on o.bookid = b.bookid
group by c.name
;


