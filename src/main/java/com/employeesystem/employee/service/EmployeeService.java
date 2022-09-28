package com.employeesystem.employee.service;

import com.employeesystem.employee.dto.EmployeeDto;
import com.employeesystem.employee.exception.CustomException;

import java.util.Set;
public interface EmployeeService {


    String addEmployee(EmployeeDto employeeDto);

    Set<EmployeeDto> getAllEmployee() throws CustomException, RuntimeException;

    EmployeeDto getEmployeeById(int employeeId) throws CustomException;

}
