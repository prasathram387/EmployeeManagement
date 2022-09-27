package com.i2i.employee.service.impl;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.exception.CustomException;
import com.i2i.employee.mapper.EmployeeMapper;
import com.i2i.employee.model.Employee;
import com.i2i.employee.repository.EmployeeRepository;
import com.i2i.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    public EmployeeMapper mapper = new EmployeeMapper();

    @Autowired
    public EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        return mapper.toDto(employeeRepository.save(mapper.fromDto(employeeDto)));
    }

    public EmployeeDto getById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeDto employeeDto = null;
        if (employee.isPresent()) {
            employeeDto = mapper.toDto(employee.get());
        }
        return employeeDto;
    }


    public List<EmployeeDto> getAllEmployees() throws CustomException {
        List<Employee> employees = employeeRepository.findAll();
        if (employees.isEmpty()) {
            throw new CustomException("No Employee Found");
        } else {
            return employees.stream()
                    .map(employee -> mapper.toDto(employee))
                    .collect(Collectors.toList());
        }
    }

    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        return mapper.toDto(employeeRepository.save(mapper.fromDto(employeeDto)));
    }

    public void deleteById(int id) {
        employeeRepository.deleteById(Integer.valueOf(id));
    }
}
