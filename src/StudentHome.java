
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
public class StudentHome extends javax.swing.JFrame {

    /**
     * Creates new form StudentHome
     */
    public StudentHome() {
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

        joinedCourcesButton = new javax.swing.JButton();
        joinNewCourseButton = new javax.swing.JButton();
        totalGradeButton = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        joinedCourcesButton.setText("Joined Courses");
        joinedCourcesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinedCourcesButtonActionPerformed(evt);
            }
        });

        joinNewCourseButton.setText("Join New Course");
        joinNewCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinNewCourseButtonActionPerformed(evt);
            }
        });

        totalGradeButton.setText("Current Total Grade");
        totalGradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalGradeButtonActionPerformed(evt);
            }
        });

        logoutBTN.setForeground(new java.awt.Color(255, 0, 0));
        logoutBTN.setText("LOGOUT");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });

        ExitButton.setForeground(new java.awt.Color(255, 0, 0));
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(logoutBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(joinedCourcesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(joinNewCourseButton)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(totalGradeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joinNewCourseButton)
                    .addComponent(joinedCourcesButton))
                .addGap(18, 18, 18)
                .addComponent(totalGradeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBTN)
                    .addComponent(ExitButton))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinedCourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinedCourcesButtonActionPerformed
        var newFrame = new JoinedCoursesStudent();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_joinedCourcesButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        JFrame loginPage = new ChooseLoginType();
        loginPage.setVisible(true);
        loginPage.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutBTNActionPerformed

    private void joinNewCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinNewCourseButtonActionPerformed
        var newFrame = new QueryCoursesStudent();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_joinNewCourseButtonActionPerformed

    private void totalGradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalGradeButtonActionPerformed
        try {
            var conn = DriverManager.getConnection(SessionManager.databaseURL);
            var stmt = conn.createStatement();
            
            var query = "SELECT grade FROM student WHERE id = " + SessionManager.ID + ";";
            
            var rs = stmt.executeQuery(query);
            
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Total grade = " + rs.getFloat(0));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Unable to fetch grade!");
            }
           
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane, "Unable to fetch grade!");
        }
    }//GEN-LAST:event_totalGradeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton joinNewCourseButton;
    private javax.swing.JButton joinedCourcesButton;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JButton totalGradeButton;
    // End of variables declaration//GEN-END:variables
}
