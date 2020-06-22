package com.tts.h2explorer.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String message;

    public Customer(String firstName, String lastName, String email, String message){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.message = message;
    }

    public Customer() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    @Override
    public String toString() {
        return "Customer [ id=" + id + ",firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", message=" + message + "]";
    }

}