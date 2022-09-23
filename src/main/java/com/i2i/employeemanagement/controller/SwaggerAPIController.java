package com.i2i.employeemanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class SwaggerAPIController {
    private static List<String> employee = new ArrayList<>();

    @PostMapping
    public String getEmployees(@RequestBody String name) {
        employee.add(name);
        return name;
    }
    @GetMapping
    public List<String> createEmployee() {
        return employee;
    }
}