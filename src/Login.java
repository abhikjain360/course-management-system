/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhik Jain, Ayush Mehar & Ishan Kumar Kaler
 */

// imports for database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

// import for JOptionPane
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        headLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        nameTXT = new javax.swing.JTextField();
        pwdTXT = new javax.swing.JPasswordField();
        clearBTN = new javax.swing.JButton();
        loginBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headLabel.setBackground(java.awt.Color.white);
        headLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        headLabel.setForeground(java.awt.Color.black);
        headLabel.setText("Course Management System");

        nameLabel.setBackground(java.awt.Color.white);
        nameLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nameLabel.setForeground(java.awt.Color.black);
        nameLabel.setText("Enter Name");

        pwdLabel.setBackground(java.awt.Color.white);
        pwdLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pwdLabel.setForeground(java.awt.Color.black);
        pwdLabel.setText("Enter Password");

        nameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTXTActionPerformed(evt);
            }
        });

        clearBTN.setBackground(new java.awt.Color(1, 188, 235));
        clearBTN.setFont(new java.awt.Font("FreeMono", 1, 15)); // NOI18N
        clearBTN.setText("Clear");
        clearBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearBTN.setBorderPainted(false);
        clearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTNActionPerformed(evt);
            }
        });

        loginBTN.setBackground(new java.awt.Color(1, 188, 235));
        loginBTN.setFont(new java.awt.Font("FreeMono", 1, 15)); // NOI18N
        loginBTN.setText("Login");
        loginBTN.setBorderPainted(false);
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        exitBTN.setBackground(new java.awt.Color(1, 188, 235));
        exitBTN.setFont(new java.awt.Font("FreeMono", 1, 15)); // NOI18N
        exitBTN.setForeground(java.awt.Color.black);
        exitBTN.setText("Exit");
        exitBTN.setBorderPainted(false);
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameLabel)
                        .addGap(43, 43, 43)
                        .addComponent(nameTXT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(headLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pwdLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(clearBTN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBTN)
                                .addGap(27, 27, 27))
                            .addComponent(pwdTXT))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headLabel)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdLabel)
                    .addComponent(pwdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void clearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTNActionPerformed
        nameTXT.setText(null);
        pwdTXT.setText(null);
    }//GEN-LAST:event_clearBTNActionPerformed

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        // get info from all fields
	sessionManager.sessionUsername = nameTXT.getText();
	sessionManager.sessionUserPassword = String.valueOf(pwdTXT.getPassword());
	
	// sql queries to check name and password
	String teacherQuery = "SELECT name,password,id FROM teachers "
			    + "WHERE name=\'" + sessionManager.sessionUsername + "\'"
			    + "AND password=\'" + sessionManager.sessionUserPassword + "\';";
	String studentQuery = "SELECT name,password,id FROM students "
			    + "WHERE name=\'" + sessionManager.sessionUsername + "\'"
			    + "AND password=\'" + sessionManager.sessionUserPassword + "\';";

	// boolean to keep track of failed of successful login attempt
	boolean success  = false;

	// cacthing the sql exception
	try {
		// boilerplate code
		Connection conn = DriverManager.getConnection(sessionManager.databaseURL);
		Statement stmt = conn.createStatement();
		
		// get result from studentQuery
		ResultSet rs = stmt.executeQuery(studentQuery);

		// There should be a single match, no need to check here again as SQL already checked
		if (rs.next()) {
			success = true;
			sessionManager.sessionUserID = rs.getString("id");
		} else {
			rs = stmt.executeQuery(teacherQuery);
			if (rs.next()) {
				success = true;
				sessionManager.isTeacher = true;
                sessionManager.sessionUserID = rs.getString("id");
			}
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
	if (success) {
		System.out.println("Login Success");

		// new frame's code goes here @Ishan Kumar Kaler

	} else {
		// clear all fields
		pwdTXT.setText(null);
		nameTXT.setText(null);

		// show failed login
		JOptionPane.showMessageDialog(rootPane, "Login Failed!");
	}
    }//GEN-LAST:event_loginBTNActionPerformed

    private void nameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTXTActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel headLabel;
    private javax.swing.JButton loginBTN;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JPasswordField pwdTXT;
    // End of variables declaration//GEN-END:variables
}
