package com.edu.tar.lab42database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    @NonNull
    private String Phone;

    private String firstname;

    private String lastname;

    public User() {
    }

    public User(@NonNull String phone, String firstname, String lastname) {
        Phone = phone;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @NonNull
    public String getPhone() {
        return Phone;
    }

    public void setPhone(@NonNull String phone) {
        Phone = phone;
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
