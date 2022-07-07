package com.jpa.springjpaexample.com.jpa.springjpaexample.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.core.codec.StringDecoder;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptId;
    @Column
    private String departmentName;
//    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name="user_id",referencedColumnName = "id")
//    private User user;

    public Department() {

    }

//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public User getUser() {
//        return user;
//    }

    public Department(int deptId, String departmentName, User user) {
        this.departmentName = departmentName;
        this.deptId = deptId;

    }



    public int getDeptId() {
        return deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }


}
