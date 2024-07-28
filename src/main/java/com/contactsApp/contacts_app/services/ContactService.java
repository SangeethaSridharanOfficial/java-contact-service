package com.contactsApp.contacts_app.services;

import com.contactsApp.contacts_app.dto.ContactCreateDTO;
import com.contactsApp.contacts_app.dto.ContactResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {
    public ContactResponseDTO addContact(ContactCreateDTO contactCreateDTO) {
        // Database
        log.info("ContactCreateDTO " + contactCreateDTO.toString());
        return null;
    }
}
