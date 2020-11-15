/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;

// imports for database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

// for table
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

// import for showMessageDialog
import javax.swing.JOptionPane;

/**
 *
 * @author kaka
 */
public class QueryTeachersAdmin extends javax.swing.JFrame {

    /**
     * Creates new form QueryTeachers
     */
    public QueryTeachersAdmin() {
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

        jPanel2 = new javax.swing.JPanel();
        nameTXT = new javax.swing.JTextField();
        deptTXT = new javax.swing.JTextField();
        passwordTXT = new javax.swing.JTextField();
        idTXT = new javax.swing.JTextField();
        salaryTXT = new javax.swing.JTextField();
        emailTXT = new javax.swing.JTextField();
        phoneTXT = new javax.swing.JTextField();
        nameRB = new javax.swing.JRadioButton();
        passwordRB = new javax.swing.JRadioButton();
        idRB = new javax.swing.JRadioButton();
        salaryRB = new javax.swing.JRadioButton();
        emailRB = new javax.swing.JRadioButton();
        phoneRB = new javax.swing.JRadioButton();
        deptRB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        clearButton1 = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameTXT.setEditable(false);

        deptTXT.setEditable(false);

        passwordTXT.setEditable(false);

        idTXT.setEditable(false);

        salaryTXT.setEditable(false);

        emailTXT.setEditable(false);

        phoneTXT.setEditable(false);

        nameRB.setText("Name");
        nameRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRBActionPerformed(evt);
            }
        });

        passwordRB.setText("Password");
        passwordRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordRBActionPerformed(evt);
            }
        });

        idRB.setText("ID");
        idRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRBActionPerformed(evt);
            }
        });

        salaryRB.setText("Salary");
        salaryRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryRBActionPerformed(evt);
            }
        });

        emailRB.setText("Email");
        emailRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRBActionPerformed(evt);
            }
        });

        phoneRB.setText("Phone");
        phoneRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneRBActionPerformed(evt);
            }
        });

        deptRB.setText("Dept");
        deptRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameRB)
                            .addComponent(idRB)
                            .addComponent(salaryRB)
                            .addComponent(emailRB)
                            .addComponent(phoneRB)
                            .addComponent(deptRB))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordRB)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(passwordTXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(idTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deptTXT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTXT))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneRB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptRB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Password", "ID", "Salary", "Email", "Phone", "Dept"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setForeground(new java.awt.Color(255, 0, 0));
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        backButton.setText("<<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearButton1.setForeground(new java.awt.Color(255, 0, 0));
        clearButton1.setText("CLEAR TABLE");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        modifyButton.setText("Modify Selected Row");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearButton)
                                    .addComponent(searchButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(clearButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(modifyButton)))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(searchButton)
                        .addGap(32, 32, 32)
                        .addComponent(backButton)
                        .addGap(28, 28, 28)
                        .addComponent(clearButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modifyButton)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRBActionPerformed
        if (nameRB.isSelected()) {
            nameTXT.setEditable(true);
        } else {
            nameTXT.setEditable(false);
        }
    }//GEN-LAST:event_nameRBActionPerformed

    private void passwordRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordRBActionPerformed
        if (passwordRB.isSelected()) {
            passwordTXT.setEditable(true);
        } else {
            passwordTXT.setEditable(false);
        }
    }//GEN-LAST:event_passwordRBActionPerformed

    private void idRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRBActionPerformed
        if (idRB.isSelected()) {
            idTXT.setEditable(true);
        } else {
            idTXT.setEditable(false);
        }
    }//GEN-LAST:event_idRBActionPerformed

    private void salaryRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryRBActionPerformed
        if (salaryRB.isSelected()) {
            salaryTXT.setEditable(true);
        } else {
            salaryTXT.setEditable(false);
        }
    }//GEN-LAST:event_salaryRBActionPerformed

    private void emailRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRBActionPerformed
        if (emailRB.isSelected()) {
            emailTXT.setEditable(true);
        } else {
            emailTXT.setEditable(false);
        }
    }//GEN-LAST:event_emailRBActionPerformed

    private void phoneRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneRBActionPerformed
        // TODO add your handling code here:
        if (phoneRB.isSelected()) {
            phoneTXT.setEditable(true);
        } else {
            phoneTXT.setEditable(false);
        }
    }//GEN-LAST:event_phoneRBActionPerformed

    private void deptRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptRBActionPerformed
        // TODO add your handling code here:
        if (deptRB.isSelected()) {
            deptTXT.setEditable(true);
        } else {
            deptTXT.setEditable(false);
        }
    }//GEN-LAST:event_deptRBActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        int rc = model.getRowCount();
        for (int i = 0; i < rc; ++i)
            model.removeRow(0);                              
        
        try {
            Connection conn = DriverManager.getConnection(SessionManager.databaseURL);
            Statement stmt = conn.createStatement();
            
            String query = "SELECT * FROM teacher ";
            int count = 0;
            
            if (nameRB.isSelected()) {
                String name = nameTXT.getText();
                query += "WHERE name = \'" + name + "\' ";
                count += 1;
            }
            if (passwordRB.isSelected()) {
                String password = passwordTXT.getText();
                if (count > 0)
                    query += "AND ";
                else
                    query += "WHERE ";
                query += "password = \'" + password + "\' ";
                count += 1;
            }
            if (idRB.isSelected()) {
                int id = Integer.parseInt(idTXT.getText());
                if (count > 0)
                    query += "AND ";
                else
                    query += "WHERE ";
                query += "id = " + id + " ";
                count += 1;
            }
            if (emailRB.isSelected()) {
                String email = emailTXT.getText();
                if (count > 0)
                    query += "AND ";
                else
                    query += "WHERE ";
                query += "email = \'" + email + "\' ";
                count += 1;
            }
            if (phoneRB.isSelected()) {
                long phone = Long.parseLong(phoneTXT.getText());
                if (count > 0)
                    query += "AND ";
                else
                    query += "WHERE ";
                query += "phone = " + phone + " ";
                count += 1;
            }
            if (salaryRB.isSelected()) {
                float salary = Float.parseFloat(salaryTXT.getText());
                if (count > 0)
                    query += "AND ";
                else
                    query += "WHERE ";
                query += "salary = " + salary + " ";
                count += 1;
            }
            if (deptRB.isSelected()) {
                int dept = Integer.parseInt(deptTXT.getText());
                if (count > 0)
                    query += "AND ";
                else
                    query += "WHERE ";
                query += "dept = " + dept + " ";
            }
            
            query += ";";

            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                String name = rs.getString("name");
                String password = rs.getString("password");
                int id = rs.getInt("id");
                float salary = rs.getFloat("salary");
                String email = rs.getString("email");
                long phone = rs.getLong("phone");
                int dept = rs.getInt("department");
                
                model.addRow(new Object[] {name, password, id, salary, email, phone, dept});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect Input.\nTry again with correct values");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        nameTXT.setText(null);
        passwordTXT.setText(null);
        phoneTXT.setText(null);
        emailTXT.setText(null);
        salaryTXT.setText(null);
        idTXT.setText(null);
        deptTXT.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        JFrame newFrame = new AdminHome();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rc = model.getRowCount();
        for (int i = 0; i < rc; ++i)
            model.removeRow(0);
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        int row = table.getSelectedRow();
        SessionManager.idToChange = Integer.parseInt(table.getValueAt(row, 2).toString());
        JFrame newFrame = new ModifyTeacher();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
    }//GEN-LAST:event_modifyButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QueryTeachersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryTeachersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryTeachersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryTeachersAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryTeachersAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearButton1;
    private javax.swing.JRadioButton deptRB;
    private javax.swing.JTextField deptTXT;
    private javax.swing.JRadioButton emailRB;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JRadioButton idRB;
    private javax.swing.JTextField idTXT;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JRadioButton nameRB;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JRadioButton passwordRB;
    private javax.swing.JTextField passwordTXT;
    private javax.swing.JRadioButton phoneRB;
    private javax.swing.JTextField phoneTXT;
    private javax.swing.JRadioButton salaryRB;
    private javax.swing.JTextField salaryTXT;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
