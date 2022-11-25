package com.app.manager.mapper;

import com.app.manager.domain.DeptDTO;
import com.app.manager.domain.DeptSearchOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    // 전체 부서 리스트 가져오기 select *
    List<DeptDTO> selectAll();

    // 검색 타입과 키워드를 받아서 검색 결과를 반환
    List<DeptDTO> selectByOption(DeptSearchOption searchOption);

    List<DeptDTO> selectByDeptnos(List<Integer> deptnos);

    // 상세페이지 등에 사용 : select * from dept where deptno=#{deptno}
    DeptDTO selectByDeptno(int deptno);

    // 수정(변경) update
    int updateDept(DeptDTO deptDTO);

    // 삭제 delete
    int deletebyDeptno(int deptno);

    // 입력 insert
    int insertDept(DeptDTO deptDTO);

}
