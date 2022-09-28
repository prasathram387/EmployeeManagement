/*
 * Copyright (c) 2021, 2022, Ideas2it and/or its affiliates. All rights reserved.
 * IDEAS2IT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.employeesystem.employee.service;

import com.employeesystem.employee.dto.EmployeeDto;
import com.employeesystem.employee.exception.CustomException;
import com.employeesystem.employee.mapper.EmployeeMapper;
import com.employeesystem.employee.model.Employee;
import com.employeesystem.employee.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * EmployeeService class can be used for transfers data from employee controller to employee dao and employee dao to employee controller.
 * </p> 
 * @author Ramprasath
 * @version 1.0
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper mapper;
    @Autowired
    EmployeeRepository employeeRepository;


    /**
     * <p>
     * To perform add employee details.
     * </p>
     *
     * @param employeeDto it contains employee dto object.
     */
    @Override
    public String addEmployee(EmployeeDto employeeDto) {
	Employee employee = mapper.fromDto(employeeDto);
	employeeRepository.save(employee);
    return "ADDED SUCCESSFULLY";
    }

    @Override
    public Set<EmployeeDto> getAllEmployee() throws CustomException, RuntimeException {
        return null;
    }

    @Override
    public EmployeeDto getEmployeeById(int employeeId) throws CustomException {
        return null;
    }

}
