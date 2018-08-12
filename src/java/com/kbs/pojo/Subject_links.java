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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject_links")
public class Subject_links {

    @Id
    @GeneratedValue
    private int id;

    private String msg;
    private String link;
    private int level;
    private String about;
    @ManyToOne
    private Subject sub_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

   

    public Subject getSub_id() {
        return sub_id;
    }

    public void setSub_id(Subject sub_id) {
        this.sub_id = sub_id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

}
