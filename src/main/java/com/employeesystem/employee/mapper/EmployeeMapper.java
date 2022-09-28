/*
 * Copyright (c) 2021, 2022, Ideas2it and/or its affiliates. All rights reserved.
 * IDEAS2IT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.employeesystem.employee.mapper;

import com.employeesystem.employee.dto.EmployeeDto;
import com.employeesystem.employee.model.Employee;
import com.employeesystem.employee.utils.DateUtil;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * EmployeeMapper class can be used for convert dto object to model object.
 * </p> 
 * @author Ramprasath
 * @version 1.0
 **/
@Component
public class EmployeeMapper {

    /**
     * <p>
     * it converts employee dto object to employee object.
     * </p>
     *
     * @employeeDto it contains employee dto data. 
     */
    public Employee fromDto(EmployeeDto employeeDto) {
        LocalDate dateOfBirth = DateUtil.convertToLocalDate(employeeDto.getDateOfBirth());
        LocalDate dateOfJoining = DateUtil.convertToLocalDate(employeeDto.getDateOfJoining());
        LocalDateTime createdDate = DateUtil.convertToLocalDateTime(employeeDto.getCreatedDate());
        LocalDateTime modifiedDate = DateUtil.convertToLocalDateTime(employeeDto.getModifiedDate());

        Employee employee = new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getAddress(),
                employeeDto.getMobileNo(), dateOfBirth, employeeDto.getGender(), employeeDto.getEmailId(), employeeDto.getBatch(),
                dateOfJoining, employeeDto.getDesignation(), createdDate, modifiedDate, employeeDto.getStatus());
        return employee;
    }



    /**
     * <p>
     * it converts employee object to employee dto object.
     * </p>
     *
     * @employee it contains employee data. 
     */
    public EmployeeDto toDto(Employee employee) {
        Date dateOfBirth = DateUtil.convertToDate(employee.getDateOfBirth());
        Date dateOfJoining = DateUtil.convertToDate(employee.getDateOfJoining());
        Date createdDate = DateUtil.convertToDateViaInstant(employee.getCreatedDate());
        Date modifiedDate = DateUtil.convertToDateViaInstant(employee.getModifiedDate());

        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getAddress(),
                employee.getMobileNo(), dateOfBirth, employee.getGender(), employee.getEmailId(), employee.getBatch(),
                dateOfJoining, employee.getDesignation(), createdDate, modifiedDate, employee.getStatus());
        return employeeDto;
    }

}