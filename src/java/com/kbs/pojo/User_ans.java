/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 


/**
 *
 * @author AhmedEldeeb
 */
@Entity
@Table(name = "user_ans")
public class User_ans {
    
    @Id
    @GeneratedValue
    int id;
    int state;
    
    @ManyToOne
    Problem problem_Id;
    
    @ManyToOne          
    User user_id;
    
    
}
