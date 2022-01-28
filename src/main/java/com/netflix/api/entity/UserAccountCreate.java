package com.netflix.api.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "UserAccount")
public class UserAccountCreate {
    @Id
    private Long id;

    private String name;

    private String email;

    private String password;

    private String country;

    public UserAccountCreate(String name, String email, String password, String country) {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
        this.country = country;
    }

    public UserAccountCreate() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
