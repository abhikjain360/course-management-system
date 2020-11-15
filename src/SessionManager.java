/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaka
 */

import javax.swing.JFrame;

// imports for database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;




public class SessionManager {
    public enum LoginAs {
        Student, Teacher, Admin
    };
    
    // Login details
    static LoginAs loginAs;
    static int ID;
    static String Password;
    static String name;
    
    // DataBase Connectections
    static String databaseURL = "jdbc:sqlite:/home/kaka/NetBeansProjects/java-cms/db/cms.db";
    
    static int idToChange;
    static String courseId;
}
