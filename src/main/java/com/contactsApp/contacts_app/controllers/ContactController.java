package com.contactsApp.contacts_app.controllers;

import com.contactsApp.contacts_app.dto.ContactCreateDTO;
import com.contactsApp.contacts_app.dto.ContactResponseDTO;
import com.contactsApp.contacts_app.services.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ContactResponseDTO addContact(@Valid @RequestBody ContactCreateDTO contactCreateDTO){
        return contactService.addContact(contactCreateDTO);
    }
}
