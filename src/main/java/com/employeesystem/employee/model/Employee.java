/*
 * Copyright (c) 2021, 2022, Ideas2it and/or its affiliates. All rights reserved.
 * IDEAS2IT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.employeesystem.employee.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * Employee class contains the employee data.
 * </p>
 * @author Ramprasath
 * @version 1.0
 **/
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "mobile_no")
    private long mobileNo;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "batch")
    private int batch;

    @Column(name = "date_of_joining")
    private LocalDate dateOfJoining;

    @Column(name = "designation")
    private String designation;

    @CreationTimestamp
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "status")
    private String status;

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String address, long mobileNo, LocalDate dateOfBirth, String gender, String emailId,
                    int batch, LocalDate dateOfJoining, String designation, LocalDateTime createdDate, LocalDateTime modifiedDate, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.emailId = emailId;
        this.batch = batch;
        this.dateOfJoining = dateOfJoining;
        this.designation = designation;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getDesignation() {
        return designation;
    }

    public int getBatch() {
        return batch;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String Gender) {
        this.gender = gender;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
