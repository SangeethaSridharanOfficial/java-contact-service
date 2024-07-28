package com.contactsApp.contacts_app.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class APIErrorModel {

    private String message;
    private Map<String, Object> details;

    public APIErrorModel(String message){
        this.message = message;
    }

    public void addDetail(String key, Object value){
        if(this.details == null) {
            this.details = new HashMap<String, Object>();
        }
        this.details.put(key, value);
    }

}
