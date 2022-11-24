package com.app.manager.mapper;

import com.app.manager.domain.DeptDTO;
import com.app.manager.domain.EmpDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    List<DeptDTO> selectAll();

    EmpDTO selectByDeptno(int deptno);

    int insertDept(DeptDTO deptDTO);

    int updateDept(DeptDTO deptDTO);

    int deleteDeptByDeptno(int deptno);

}
