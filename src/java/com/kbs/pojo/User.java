/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.pojo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author AhmedEldeeb
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private String name;

    @OneToMany(mappedBy = "user_id")
    private List<User_ans> user_id;
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User_ans> getUser_id() {
        return user_id;
    }

    public void setUser_id(List<User_ans> user_id) {
        this.user_id = user_id;
    }
    
    

}
