package com.jpa.springjpaexample.com.jpa.springjpaexample.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String email;


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)

    private List<Department> department;

    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    public List<Department> getDepartment() {
        return department;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public User() {
        super();
    }

    public User(int id, String username, String password, String email, Department department) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
