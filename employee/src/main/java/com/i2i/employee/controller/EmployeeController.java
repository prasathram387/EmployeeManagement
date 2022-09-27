package com.i2i.employee.controller;

import com.i2i.employee.dto.EmployeeDto;
import com.i2i.employee.exception.CustomException;
import com.i2i.employee.model.Employee;
import com.i2i.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.addEmployee(employeeDto);
    }

    @GetMapping("/{id}")
    public EmployeeDto getById(@PathVariable("id") int id) {
        return employeeService.getById(id);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees() throws CustomException {
        return employeeService.getAllEmployees();
    }

    @PutMapping
    public EmployeeDto updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.updateEmployee(employeeDto);
    }


    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteById(id);
        return "deleted";
    }
}
