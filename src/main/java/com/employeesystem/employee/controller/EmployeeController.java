package com.employeesystem.employee.controller;

import com.employeesystem.employee.dto.EmployeeDto;
import com.employeesystem.employee.exception.CustomException;
import com.employeesystem.employee.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @PostMapping
    public String addEmployee(@RequestBody EmployeeDto employeeDto)  {
        return this.employeeService.addEmployee(employeeDto);
    }

    @GetMapping
    public Set<EmployeeDto> getEmployees() throws CustomException {
        return employeeService.getAllEmployee();
    }


    @GetMapping("/{id}")
    public EmployeeDto getEmployeeById(int employeeId) throws CustomException {

        return employeeService.getEmployeeById(employeeId);
    }
}

