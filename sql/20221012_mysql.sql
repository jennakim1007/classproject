select sal, comm
from emp;

select *
from emp;

-- null 값을 치환하는 함수 : ifnull()
select sal, ifnull(comm, 0)
from emp;

-- 문자열을 완성하는 함수 : concat(arg, arg, arg.....)
select concat(ename, ' is a ', job)
from emp;