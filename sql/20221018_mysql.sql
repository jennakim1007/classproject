-- 20221018

-- 오라클은 rownum, mysql은 limit 사용 
select * from emp order by hiredate limit 0, 3;
