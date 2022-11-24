package com.app.manager.service;

import com.app.manager.domain.EmpDTO;
import com.app.manager.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpRegService {

    @Autowired
    private EmpMapper empMapper;

    public int register(EmpDTO empDTO){
        return empMapper.insertEmp(empDTO);
    }


}
