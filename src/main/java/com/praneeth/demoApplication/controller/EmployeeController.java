package com.praneeth.demoApplication.controller;

import com.praneeth.demoApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
     EmployeeService employeeService;
    @GetMapping("/employee/{id}")
    public ResponseEntity<String> getEmployee(@PathVariable Integer id) {
        String ans = employeeService.getEmployee(id);
        return ResponseEntity.ok(ans);
    }
}
