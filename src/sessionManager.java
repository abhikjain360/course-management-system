/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// imports for table
import javax.swing.table.DefaultTableModel;

// imports for database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Ayush Mehar, Ishan Kumar Kaler & Abhik Jain
 */
public class sessionManager {
    // user info for the session
    static String sessionUsername, sessionUserPassword, sessionUserID;
    static boolean isTeacher;

    // url for jdbc to connect to
    static String databaseURL = "jdbc:sqlite:/home/abhik/Desktop/oop2/netbreans/course-management-system/db/cms.db";

    //
    static void setStudentTable(DefaultTableModel model) {
        // The query to fetch all courses;
        String courseListQuery = "SELECT * FROM courses;";
        String courseQuery, tableName;

        try {
            // boilerplate code
            Connection conn = DriverManager.getConnection(sessionManager.databaseURL);
            Statement stmt = conn.createStatement();

            // fetching all tables of all courses
            ResultSet rs = stmt.executeQuery(courseListQuery);

            // ResultSet for each course table
            ResultSet course_rs;

            // Counter to keep track of the last edited index
            int counter = 0;

            int courseID, courseTeacher;
            String courseName, courseSemester;

            // looping the the list, putting entries in courseTable
            // TODO: Multithread this part
            while (rs.next()) {
                // querying the database whether student present in this course or not
                courseID = rs.getInt("id");
                courseName = rs.getString("name");
                courseTeacher = rs.getInt("teacher");
                courseSemester = rs.getString("semester");
                courseQuery = "SELECT * FROM \'" + courseName + " " + courseID + "\'"
                            + " WHERE student_id = \'" + sessionManager.sessionUserID + "\';";
                course_rs = stmt.executeQuery(courseQuery);

                // if yes, add that course to the table
                if (course_rs.next()) {
                    model.addRow(new Object[]{
                            courseID, courseName, courseTeacher, courseSemester
                    });

                    // increment the counter for next row
                    counter++;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void setTeacherTable(DefaultTableModel model) {
        // The query to fetch all courses;
        String courseListQuery = "SELECT * FROM courses;";
        String courseQuery, tableName;

        try {
            // boilerplate code
            Connection conn = DriverManager.getConnection(sessionManager.databaseURL);
            Statement stmt = conn.createStatement();

            // fetching all tables of all courses
            ResultSet rs = stmt.executeQuery(courseListQuery);

            // ResultSet for each course table
            ResultSet course_rs;

            // Counter to keep track of the last edited index
            int counter = 0;

            int courseID;

            // looping the the list, putting entries in courseTable
            // TODO: Multithread this part
            while (rs.next()) {
                // querying the database whether student present in this course or not
                courseID = rs.getInt("id");
                courseQuery = "SELECT * FROM " + courseID
                        + " WHERE student_id = \'" + sessionManager.sessionUserID + "\';";
                course_rs = stmt.executeQuery(courseQuery);

                // if yes, add that course to the table
                if (course_rs.next()) {
                    model.setValueAt(courseID, counter, 0);
                    model.setValueAt(rs.getString("name"), counter, 1);
                    model.setValueAt(rs.getString("semester"), counter, 2);

                    // increment the counter for next row
                    counter++;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
