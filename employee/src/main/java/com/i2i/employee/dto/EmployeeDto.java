package com.i2i.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private long mobileNo;
    private LocalDate dateOfBirth;
    private String gender;
    private String emailId;
    private int batch;
    private LocalDate dateOfJoining;
    private String designation;
    private String status;

}