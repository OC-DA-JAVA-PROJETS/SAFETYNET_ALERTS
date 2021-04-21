package com.safetynet.safetynetalerts.dto;

import lombok.Data;

@Data
public class MedicalRecordAdminDTO {

    private String firstName;

    private String lastName;

    private String birthdate;

    private String[] medications;

    private String[] allergies;

}
