/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.controller;

import com.kbs.pojo.User;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author AhmedEldeeb
 */
public class UserController {

    private Connection con;

    public UserController() {
        con = new Connection();
    }

    public boolean saveUser(User usr) {
        Session session = con.getSession();
        List<User> users = session.createQuery("from User where username = '" + usr.getUsername()+"'" ).list();
        if (users.size() > 0) {
            return false;
        }

        session.save(usr);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean isUser(User usr) {
        Session session = con.getSession();

        List<User> user = session.createQuery("from User where username = '" + usr.getUsername() + "' and password = '" + usr.getPassword()+"'").list();
        if (user.size() == 1) {
            return true;
        }
        return false;
    }

}
