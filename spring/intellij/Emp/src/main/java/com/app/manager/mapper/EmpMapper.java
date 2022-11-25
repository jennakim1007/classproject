package com.app.manager.mapper;

import com.app.manager.domain.EmpDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    List<EmpDTO> selectAll();

    EmpDTO selectByEmpno(int empno);

    int insertEmp(EmpDTO empDTO);

    int updateEmp(EmpDTO empDTO);

    int deleteEmpByEmpno(int empno);

}
