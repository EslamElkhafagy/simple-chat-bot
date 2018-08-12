/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbsproject;

import com.kbs.controller.CSController;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author elkhafagy
 */
public class KBSProject {

    /**
     * @param args the command line arguments
     */
    public static String Words(String line) {
        try {
            BufferedReader stopWordsFile = new BufferedReader(new FileReader("C:\\Users\\AhmedEldeeb\\Documents\\NetBeansProjects\\KBS_Project\\src\\java\\com\\kbs\\algorithms\\stopWords.txt"));

            String stopWord;

            HashSet<String> set = new HashSet<String>();

            while ((stopWord = stopWordsFile.readLine()) != null && !stopWord.equals(" ")) {

                set.add(stopWord.toLowerCase());

            }// add line from file to list
            String newWords = "";
            String lineWords[] = line.replaceAll("[ ;'*()`<>{}./\"-_]+", ",").split(",");// split user input

            boolean flag = false;
            int siz = set.size();

            for (int i = 0; i < lineWords.length; ++i) {
                set.add(lineWords[i]);// add user input to set 

                if (set.size() != siz) {// check set and size are same or not 
                    ++siz;
                    newWords += lineWords[i] + " ";// this word isn't stopwords

                }

            }

            stopWordsFile.close();
            return newWords;
        } catch (Exception e) {
            System.out.println("at method words  =  " + e);
        }

        return "failed word";

    }

    public static void want(String s) {

        CSController cscon = new CSController();

        List<String> names = cscon.getSubject();

        if (s.contains("know")) {

            for (int i = 0; i < names.size(); i++) {

                if (s.contains(names.get(i))) {
                    // link about java
                    
                }

            }

        }// end know statment

        if (s.contains("test")) { // المفروض بعديها اللينك 
            if (s.contains("java")) {
                // link test java
            }
            if (s.contains("c++")) {
                // link test c++
            }
            if (s.contains("php")) {
                // link test php
            }
            if (s.contains("ccna")) {
                // link test ccna
            }
            if (s.contains("linux")) {
                // link test linux
            }

        }// end test statment

    }

    public static void problemsolving(String s) {

        if (s.contains("test")) {
            // test link 

        }
        if (s.contains("beginner")) {
            // test link 

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        KBSProject.want("sakjgsnhkjrfsl");
//        try {
//            String s = "i want to about learn java know";
//            System.out.println(Words(s.toLowerCase()));
//            String out = Words(s);
//            if (out.contains("want") || out.contains("need")) {
//                want(out);
//
//            }
//
//        } catch (Exception e) {
//            System.out.println("at main method  =  " + e);
//        }

    }

}
