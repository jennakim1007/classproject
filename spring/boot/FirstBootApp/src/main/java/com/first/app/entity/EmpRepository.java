package com.first.app.entity;

import com.first.app.domain.ListItemDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Objects;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

    @Query(value = "select e from Emp e join fetch e.dept")
    List<Emp> findEmpDept();

    @Query("select e from Emp e, Dept d where e.dept=d")
    List<Emp> findEmpWithDept();

    // 게시물 리스트에서 댓글 개수 구하기 ex. 제목[12]
    // 게시물[dept], count 사원 수
    @Query(value = "select " + "d " + "from Emp e left outer join Dept d " + "on e.dept=d " + "group by d "
            , countQuery = "select count(d) from Dept d")
    public Page<Object[]> listWithCnt(Pageable pageable);

    @Query("select new com.first.app.domain.ListItemDTO(e.empno, e.ename, e.job, d.dname, d.loc) from Emp e, Dept d where e.dept=d")
    List<ListItemDTO> findListItem();




}
