package com.employee_system_api.daily_code_buffer_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee_system_api.daily_code_buffer_employee.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository < EmployeeEntity , Long > {

}
