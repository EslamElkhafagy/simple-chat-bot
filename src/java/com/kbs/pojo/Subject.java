/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.pojo;

/**
 *
 * @author AhmedEldeeb
 */
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String test_Link;
    
    @OneToMany(mappedBy = "sub_id")
    private List<Subject_links> subj_links;

    public List<Subject_links> getSubj_links() {
        return subj_links;
    }

    public void setSubj_links(List<Subject_links> subj_links) {
        this.subj_links = subj_links;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest_Link() {
        return test_Link;
    }

    public void setTest_Link(String test_Link) {
        this.test_Link = test_Link;
    }
    
            
}
