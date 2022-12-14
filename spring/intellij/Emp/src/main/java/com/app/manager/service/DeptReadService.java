package com.app.manager.service;

import com.app.manager.domain.DeptDTO;
import com.app.manager.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptReadService {

    @Autowired
    private DeptMapper deptMapper;

    public DeptDTO readDeptByDeptno(int deptno){
        return deptMapper.selectByDeptno(deptno);
    }

}
