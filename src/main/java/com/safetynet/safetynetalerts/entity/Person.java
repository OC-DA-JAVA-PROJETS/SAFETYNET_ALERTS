package com.safetynet.safetynetalerts.entity;

import lombok.Data;

import java.util.List;

@Data
public class Person {

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

    private List<MedicalRecord> medicalRecords;

    private FireStation fireStation;

}
