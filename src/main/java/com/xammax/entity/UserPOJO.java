package com.xammax.entity;

import java.util.Random;
import java.util.UUID;

public class UserPOJO {

    private final String id;
    private String firstName;
    private String lastName;
    private String midleName;

    public UserPOJO(String id, String firstName, String lastName, String midleName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.midleName = midleName;
    }

    public UserPOJO(String firstName, String lastName, String midleName) {
        this(UUID.randomUUID().toString(), firstName, lastName, midleName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public String getId() {
        return id;
    }
}
