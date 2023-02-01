package com.employee_system_api.daily_code_buffer_employee.services;
// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee_system_api.daily_code_buffer_employee.entity.EmployeeEntity;
// import com.employee_system_api.daily_code_buffer_employee.model.Employee;
import com.employee_system_api.daily_code_buffer_employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);

    }

}
