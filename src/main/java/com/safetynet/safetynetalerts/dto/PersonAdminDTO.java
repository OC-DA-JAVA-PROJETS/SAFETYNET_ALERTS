package com.safetynet.safetynetalerts.dto;

import com.safetynet.safetynetalerts.entity.PersonEntity;
import com.safetynet.safetynetalerts.service.PersonServiceAdmin;
import lombok.Data;

@Data
public class PersonAdminDTO {

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String zip;

    private String phone;

    private String email;

    public static PersonServiceAdmin create(final PersonEntity item) {
        return null;
    }

    public static PersonServiceAdmin update() {
        return null;
    }

}
