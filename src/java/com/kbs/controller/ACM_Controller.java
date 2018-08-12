/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kbs.controller;

import com.kbs.pojo.Subject;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;

/**
 *
 * @author tawfik
 */
public class ACM_Controller {

    Connection con;

    public ACM_Controller() {
        con = new Connection();
    }

    public String getVideoLink(int level) {

        Session session = con.getSession();
        String str = (String) session.createQuery("select link from Subject_links where level = " + level).list().get(0);
        return str;

    }

    public static void main(String[] args) {
        
        
        
        
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello Ahmed how can i help you ");
        CSController csc = new CSController();
        
        System.out.println(new ACM_Controller().getVideoLink(1));
        
        String subject = "";
        List<Subject> allSubjects = csc.getAllSubjects();
        while (true) {
            String s = scn.nextLine();

            if (s.contains("proplem solving")) {
                subject = "proplem solving";
                System.out.println("let 's speak about proplem solving");
            } else {
                for (int i = 0; i < allSubjects.size(); i++) {
                    if (s.contains(allSubjects.get(i).getName().toLowerCase())) {
                        subject = allSubjects.get(i).getName();
                        System.out.println("let 's speak about " + subject);

                    }
                }

            }

            if (subject.equals("proplem solving")) {
                System.out.println("please enter your level {beginner,intermediate,advanced}");
                String level = scn.nextLine();

                if (level.equals("beginner")) {

                    System.out.println("you can first watch this video");

                } else if (level.equals("intermediate")) {

                } else if (level.equals("advanced")) {

                }

            }

        }
    }

}
