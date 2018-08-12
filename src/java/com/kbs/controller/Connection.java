/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.controller;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author AhmedEldeeb
 */
public class Connection {

    private SessionFactory sessionFactory;
    private Session session;

    public Connection() {

        sessionFactory = new Configuration().configure().buildSessionFactory();

    }

    public Session getSession() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        return session;

    }

    public static void main(String[] args) {
        Connection con = new Connection();
    }

}
