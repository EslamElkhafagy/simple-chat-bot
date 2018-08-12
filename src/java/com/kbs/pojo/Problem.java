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
@Table(name = "problem")
public class Problem {
    
    @Id
    @GeneratedValue
    private int id;
    private String link;
    private int level;
    private String hint;
    private String video;
    private String topic;
    
    private String name;
    
    @OneToMany(mappedBy = "problem_Id")
    private List<User_ans> user_ans;

    public List<User_ans> getUser_ans() {
        return user_ans;
    }

    public void setUser_ans(List<User_ans> user_ans) {
        this.user_ans = user_ans;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
