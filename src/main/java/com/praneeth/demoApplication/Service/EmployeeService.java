package com.praneeth.demoApplication.Service;

import com.praneeth.demoApplication.Repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRespository employeeRespository;
    public String getEmployee(Integer id) {
    return employeeRespository.getEmployee(id);

    }
}
