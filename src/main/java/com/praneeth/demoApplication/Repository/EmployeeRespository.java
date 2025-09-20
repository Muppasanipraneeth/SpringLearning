package com.praneeth.demoApplication.Repository;

import com.praneeth.demoApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRespository {

    public String getEmployee(Integer id) {

        return id+"";
    }
}
