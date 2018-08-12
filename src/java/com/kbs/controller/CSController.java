/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.controller;

import com.kbs.pojo.Subject;
import com.kbs.pojo.Subject_links;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author AhmedEldeeb
 */
public class CSController {

    Connection connection;

    public CSController() {

        connection = new Connection();
    }

    public List<String> getSubject() {
        Session session = connection.getSession();

        return session.createQuery("select name from Subject").list();
    }

    public List<Subject_links> findAllBySubjectName(String sub_name) {

        Session session = connection.getSession();

        Subject subject = (Subject) session.createQuery("from Subject where name='" + sub_name + "'").list().get(0);

        return subject.getSubj_links();

    }

    public List<Subject> getAllSubjects() {
        Session session = connection.getSession();
      
        List<Subject> allSubjects = session.createQuery("from Subject").list();
        return allSubjects;
    }

    public static void main(String[] args) {

        CSController cs = new CSController();
        List<Subject> all = cs.getAllSubjects();
                System.out.println(all.size());

        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).getName());
        }
    }
}
