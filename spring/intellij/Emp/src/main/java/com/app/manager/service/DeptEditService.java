package com.app.manager.service;

import com.app.manager.domain.DeptDTO;
import com.app.manager.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptEditService {

    @Autowired
    private DeptMapper deptMapper;

    public int edit(DeptDTO deptDTO){
        return deptMapper.updateDept(deptDTO);
    }


}
