package com.karmasoftonline.tm.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class SparseUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;

    String username;
    String firstname;
    String lastname;

    public SparseUser () {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
