package com.i2i.employee.service;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

        @Autowired
        EmployeeDto addEmployee(EmployeeDto employeeDto);

        EmployeeDto getById(int id);
        List<EmployeeDto> getAllEmployees() throws CustomException;

        EmployeeDto updateEmployee(EmployeeDto employeeDto);

        void deleteById(int id);
}
