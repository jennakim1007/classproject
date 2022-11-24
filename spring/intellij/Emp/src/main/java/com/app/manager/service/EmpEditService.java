package com.app.manager.service;

import com.app.manager.domain.EmpDTO;
import com.app.manager.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpEditService {

    @Autowired
    private EmpMapper empMapper;

    public int edit(EmpDTO empDTO){
        return empMapper.updateEmp(empDTO);
    }


}
