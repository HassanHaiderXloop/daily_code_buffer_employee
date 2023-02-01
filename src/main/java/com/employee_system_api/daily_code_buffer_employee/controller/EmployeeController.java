package com.employee_system_api.daily_code_buffer_employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_system_api.daily_code_buffer_employee.entity.EmployeeEntity;
import com.employee_system_api.daily_code_buffer_employee.services.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api") 
public class EmployeeController {
   
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employeeEntity){
        
        return ResponseEntity.ok().body(employeeService.createEmployee(employeeEntity));
    }
    
}
