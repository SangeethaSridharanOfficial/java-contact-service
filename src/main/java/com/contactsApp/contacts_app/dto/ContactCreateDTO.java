package com.contactsApp.contacts_app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactCreateDTO {

    @NotBlank(message = "firstName is mandatory")
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank(message = "lastName is mandatory")
    @JsonProperty("last_name")
    private String lastName;

    @Email(message = "Email should be valid")
    @NotBlank(message = "emailId is mandatory")
    @JsonProperty("email_id")
    private String emailId;

    @NotBlank(message = "phoneNo is mandatory")
    @JsonProperty("phone")
    private String phone;
}
