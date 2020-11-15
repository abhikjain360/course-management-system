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
public class QueryCoursesAdmin extends javax.swing.JFrame {

    /**
     * Creates new form QueryCourses
     */
    public QueryCoursesAdmin() {
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
        deptTXT = new javax.swing.JTextField();
        teacherTXT = new javax.swing.JTextField();
        prereqTXT = new javax.swing.JTextField();
        nameTXT = new javax.swing.JTextField();
        idTXT = new javax.swing.JTextField();
        idRB = new javax.swing.JRadioButton();
        nameRB = new javax.swing.JRadioButton();
        deptRB = new javax.swing.JRadioButton();
        prereqRB = new javax.swing.JRadioButton();
        teacherRB = new javax.swing.JRadioButton();
        statusRB = new javax.swing.JRadioButton();
        statusTXT = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clearButton1 = new javax.swing.JButton();
        enrolledButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deptTXT.setEditable(false);

        teacherTXT.setEditable(false);

        prereqTXT.setEditable(false);

        nameTXT.setEditable(false);

        idTXT.setEditable(false);

        idRB.setText("ID");
        idRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRBActionPerformed(evt);
            }
        });

        nameRB.setText("Name");
        nameRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRBActionPerformed(evt);
            }
        });

        deptRB.setText("Dept");
        deptRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptRBActionPerformed(evt);
            }
        });

        prereqRB.setText("PreReq ID");
        prereqRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prereqRBActionPerformed(evt);
            }
        });

        teacherRB.setText("Teacher ID");
        teacherRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRBActionPerformed(evt);
            }
        });

        statusRB.setText("Status");
        statusRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusRBActionPerformed(evt);
            }
        });

        statusTXT.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teacherRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deptRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prereqRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idTXT)
                    .addComponent(nameTXT)
                    .addComponent(statusTXT)
                    .addComponent(teacherTXT)
                    .addComponent(prereqTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(deptTXT))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prereqTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prereqRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deptRB)
                    .addComponent(deptTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusRB)
                    .addComponent(statusTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clearButton.setBackground(new java.awt.Color(255, 69, 0));
        clearButton.setForeground(java.awt.Color.white);
        clearButton.setText("CLEAR");
        clearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton.setBorderPainted(false);
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(255, 69, 0));
        searchButton.setForeground(java.awt.Color.white);
        searchButton.setText("SEARCH");
        searchButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 69, 0));
        backButton.setForeground(java.awt.Color.white);
        backButton.setText("<<");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "PreReq", "Teacher", "Dept", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        clearButton1.setBackground(new java.awt.Color(255, 69, 0));
        clearButton1.setForeground(java.awt.Color.white);
        clearButton1.setText("CLEAR TABLE");
        clearButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearButton1.setBorderPainted(false);
        clearButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        enrolledButton.setBackground(new java.awt.Color(255, 69, 0));
        enrolledButton.setForeground(java.awt.Color.white);
        enrolledButton.setText("See Students Enrolled");
        enrolledButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enrolledButton.setBorderPainted(false);
        enrolledButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enrolledButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrolledButtonActionPerformed(evt);
            }
        });

        modifyButton.setBackground(new java.awt.Color(255, 69, 0));
        modifyButton.setForeground(java.awt.Color.white);
        modifyButton.setText("MODIFY");
        modifyButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modifyButton.setBorderPainted(false);
        modifyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enrolledButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(clearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enrolledButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifyButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        JFrame newFrame = new AdminHome();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        nameTXT.setText(null);
        prereqTXT.setText(null);
        teacherTXT.setText(null);
        idTXT.setText(null);
        deptTXT.setText(null);
        statusTXT.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        int rc = model.getRowCount();
        for (int i = 0; i < rc; ++i) {
            model.removeRow(0);
        }

        try {
            Connection conn = DriverManager.getConnection(SessionManager.databaseURL);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM courses ";
            int count = 0;

            if (idRB.isSelected()) {
                String id = idTXT.getText();
                query += "WHERE id = \'" + id + "\' ";
                count += 1;
            }
            if (nameRB.isSelected()) {
                String name = nameTXT.getText();
                if (count > 0) {
                    query += "AND ";
                } else {
                    query += "WHERE ";
                }
                query += "WHERE name = \'" + name + "\' ";
                count += 1;
            }
            if (prereqRB.isSelected()) {
                String prereq = prereqTXT.getText();
                if (count > 0) {
                    query += "AND ";
                } else {
                    query += "WHERE ";
                }
                query += "prereq = \'" + prereq + "\' ";
                count += 1;
            }

            if (teacherRB.isSelected()) {
                int teacher = Integer.parseInt(teacherTXT.getText());
                if (count > 0) {
                    query += "AND ";
                } else {
                    query += "WHERE ";
                }
                query += "teacher = " + teacher + " ";
                count += 1;
            }
            if (deptRB.isSelected()) {
                int dept = Integer.parseInt(deptTXT.getText());
                if (count > 0) {
                    query += "AND ";
                } else {
                    query += "WHERE ";
                }
                query += "dept = " + dept + " ";
            }
            if (statusRB.isSelected()) {
                boolean status = Boolean.parseBoolean(statusTXT.getText());
                if (count > 0) {
                    query += "AND ";
                } else {
                    query += "WHERE ";
                }
                query += "status = " + status + " ";
                count += 1;
            }

            query += ";";

            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String prereq = rs.getString("prereq");
                String teacher = rs.getString("teacher_id");
                boolean status = rs.getBoolean("status");
                int dept = rs.getInt("dept_id");

                model.addRow(new Object[]{id, name, prereq, teacher, dept, status});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Incorrect Input.\nTry again with correct values");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deptRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptRBActionPerformed
        // TODO add your handling code here:
        if (deptRB.isSelected()) {
            deptTXT.setEditable(true);
        } else {
            deptTXT.setEditable(false);
        }
    }//GEN-LAST:event_deptRBActionPerformed

    private void idRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRBActionPerformed
        if (idRB.isSelected()) {
            idTXT.setEditable(true);
        } else {
            idTXT.setEditable(false);
        }
    }//GEN-LAST:event_idRBActionPerformed

    private void nameRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRBActionPerformed
        if (nameRB.isSelected()) {
            nameTXT.setEditable(true);
        } else {
            nameTXT.setEditable(false);
        }
    }//GEN-LAST:event_nameRBActionPerformed

    private void teacherRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRBActionPerformed
        if (teacherRB.isSelected()) {
            teacherTXT.setEditable(true);
        } else {
            teacherTXT.setEditable(false);
        }
    }//GEN-LAST:event_teacherRBActionPerformed

    private void prereqRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prereqRBActionPerformed
        if (prereqRB.isSelected()) {
            prereqTXT.setEditable(true);
        } else {
            prereqTXT.setEditable(false);
        }
    }//GEN-LAST:event_prereqRBActionPerformed

    private void statusRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusRBActionPerformed
        if (statusRB.isSelected()) {
            statusTXT.setEditable(true);
        } else {
            statusTXT.setEditable(false);
        }
    }//GEN-LAST:event_statusRBActionPerformed

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rc = model.getRowCount();
        for (int i = 0; i < rc; ++i)
            model.removeRow(0);
    }//GEN-LAST:event_clearButton1ActionPerformed

    private void enrolledButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrolledButtonActionPerformed
        int row = table.getSelectedRow();
        SessionManager.courseId = table.getValueAt(row, 0).toString();
        JFrame newFrame = new EnrolledStudents();
        newFrame.setVisible(true);
        newFrame.setEnabled(true);
    }//GEN-LAST:event_enrolledButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        int row = table.getSelectedRow();
        SessionManager.courseId = table.getValueAt(row, 0).toString();
        JFrame newFrame = new ModifyCourses();
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
            java.util.logging.Logger.getLogger(QueryCoursesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryCoursesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryCoursesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryCoursesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryCoursesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearButton1;
    private javax.swing.JRadioButton deptRB;
    private javax.swing.JTextField deptTXT;
    private javax.swing.JButton enrolledButton;
    private javax.swing.JRadioButton idRB;
    private javax.swing.JTextField idTXT;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JRadioButton nameRB;
    private javax.swing.JTextField nameTXT;
    private javax.swing.JRadioButton prereqRB;
    private javax.swing.JTextField prereqTXT;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton statusRB;
    private javax.swing.JTextField statusTXT;
    private javax.swing.JTable table;
    private javax.swing.JRadioButton teacherRB;
    private javax.swing.JTextField teacherTXT;
    // End of variables declaration//GEN-END:variables
}
