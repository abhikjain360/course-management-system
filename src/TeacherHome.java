
import javax.swing.JFrame;

// imports for database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

// import for showMessageDialog
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaka
 */
public class TeacherHome extends javax.swing.JFrame {

    /**
     * Creates new form TeacherHome
     */
    public TeacherHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutBTN = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        newCourseButton = new javax.swing.JButton();
        queryCourses = new javax.swing.JButton();
        queryDeptsButton = new javax.swing.JButton();
        queryStudentsButton = new javax.swing.JButton();
        queryTeacherButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutBTN.setBackground(new java.awt.Color(255, 69, 0));
        logoutBTN.setForeground(java.awt.Color.white);
        logoutBTN.setText("LOGOUT");
        logoutBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBTN.setBorderPainted(false);
        logoutBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(255, 69, 0));
        ExitButton.setForeground(java.awt.Color.white);
        ExitButton.setText("EXIT");
        ExitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.setBorderPainted(false);
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        newCourseButton.setBackground(new java.awt.Color(255, 69, 0));
        newCourseButton.setForeground(java.awt.Color.white);
        newCourseButton.setText("Add New Course");
        newCourseButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newCourseButton.setBorderPainted(false);
        newCourseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCourseButtonActionPerformed(evt);
            }
        });

        queryCourses.setBackground(new java.awt.Color(255, 69, 0));
        queryCourses.setForeground(java.awt.Color.white);
        queryCourses.setText("Query Courses");
        queryCourses.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        queryCourses.setBorderPainted(false);
        queryCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryCoursesActionPerformed(evt);
            }
        });

        queryDeptsButton.setBackground(new java.awt.Color(255, 69, 0));
        queryDeptsButton.setForeground(java.awt.Color.white);
        queryDeptsButton.setText("Query Depts");
        queryDeptsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        queryDeptsButton.setBorderPainted(false);
        queryDeptsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryDeptsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryDeptsButtonActionPerformed(evt);
            }
        });

        queryStudentsButton.setBackground(new java.awt.Color(255, 69, 0));
        queryStudentsButton.setForeground(java.awt.Color.white);
        queryStudentsButton.setText("Query Students");
        queryStudentsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        queryStudentsButton.setBorderPainted(false);
        queryStudentsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryStudentsButtonActionPerformed(evt);
            }
        });

        queryTeacherButton.setBackground(new java.awt.Color(255, 69, 0));
        queryTeacherButton.setForeground(java.awt.Color.white);
        queryTeacherButton.setText("Query Teachers");
        queryTeacherButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        queryTeacherButton.setBorderPainted(false);
        queryTeacherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryTeacherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton))
                    .addComponent(queryCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryDeptsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryStudentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryTeacherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(newCourseButton)
                .addGap(18, 18, 18)
                .addComponent(queryCourses)
                .addGap(18, 18, 18)
                .addComponent(queryDeptsButton)
                .addGap(18, 18, 18)
                .addComponent(queryStudentsButton)
                .addGap(18, 18, 18)
                .addComponent(queryTeacherButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBTN)
                    .addComponent(ExitButton))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        JFrame loginPage = new ChooseLoginType();
        loginPage.setVisible(true);
        loginPage.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void newCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCourseButtonActionPerformed
        JFrame newFrame = new AddCourseTeacher();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_newCourseButtonActionPerformed

    private void queryCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryCoursesActionPerformed
        JFrame newFrame = new QueryCoursesTeacher();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_queryCoursesActionPerformed

    private void queryDeptsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryDeptsButtonActionPerformed
        JFrame newFrame = new QueryDeptsTeacher();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_queryDeptsButtonActionPerformed

    private void queryStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryStudentsButtonActionPerformed
        JFrame newFrame = new QueryStudentsTeacher();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_queryStudentsButtonActionPerformed

    private void queryTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryTeacherButtonActionPerformed
        JFrame newFrame = new QueryTeachersTeacher();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_queryTeacherButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton newCourseButton;
    private javax.swing.JButton queryCourses;
    private javax.swing.JButton queryDeptsButton;
    private javax.swing.JButton queryStudentsButton;
    private javax.swing.JButton queryTeacherButton;
    // End of variables declaration//GEN-END:variables
}
