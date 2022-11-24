package com.app.manager.service;

import com.app.manager.domain.EmpDTO;
import com.app.manager.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpListService {

    @Autowired
    private EmpMapper empMapper;

    public List<EmpDTO> getList(){
       return empMapper.selectAll();
    }


}
