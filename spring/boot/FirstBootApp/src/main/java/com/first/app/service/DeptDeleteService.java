package com.first.app.service;

import com.first.app.mapper.DeptMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class DeptDeleteService {

    @Autowired
    private DeptMapper deptMapper;

    public int deleteDept(int deptno){
        return deptMapper.deletebyDeptno(deptno);
    }

}
