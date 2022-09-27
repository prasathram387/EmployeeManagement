

/*
 * Copyright (c) 2021, 2022, Ideas2it and/or its affiliates. All rights reserved.
 * IDEAS2IT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.i2i.employee.mapper;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.model.Employee;
import com.i2i.employee.utils.DateUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
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

        return new Employee(employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getAddress(),
                employeeDto.getMobileNo(),employeeDto.getDateOfBirth(), employeeDto.getGender(), employeeDto.getEmailId(), employeeDto.getBatch(),
                employeeDto.getDateOfJoining(), employeeDto.getDesignation(), employeeDto.getStatus());
    }



    /**
     * <p>
     * it converts employee object to employee dto object.
     * </p>
     *
     * @employee it contains employee data.
     */
    public EmployeeDto toDto(Employee employee) {

        return new EmployeeDto(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getAddress(),
                employee.getMobileNo(), employee.getDateOfBirth(), employee.getGender(), employee.getEmailId(), employee.getBatch(),
                employee.getDateOfJoining(), employee.getDesignation(),employee.getStatus());
    }
}
