/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC.View;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import MVC.Model.StudentModel;

/**
 *
 * @author wildm
 */
public class StudentListGUI extends javax.swing.JFrame {

    // Student list
    // private ArrayList<StudentModel> studentList = new ArrayList<StudentModel>();

    /**
     * Creates new form StudentListGUI
     */

    public StudentListGUI() {
        initComponents();
        refreshTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        studentCount = new javax.swing.JLabel();
        deleteAllBtn = new javax.swing.JButton();
        sortGPAAsc = new javax.swing.JButton();
        sortGPADesc = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchNameBtn = new javax.swing.JButton();
        searchIDBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Name", "Class", "Math", "English", "GPA"
                }));
        jScrollPane1.setViewportView(jTable1);

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        infoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        infoBtn.setText("Info");
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        refreshBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        studentCount.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        studentCount.setText("Number of students: ");

        deleteAllBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        deleteAllBtn.setText("Delete all");
        deleteAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllBtnActionPerformed(evt);
            }
        });

        sortGPAAsc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sortGPAAsc.setText("Sort GPA ↑");
        sortGPAAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortGPAAscActionPerformed(evt);
            }
        });

        sortGPADesc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sortGPADesc.setText("Sort GPA ↓");
        sortGPADesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortGPADescActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        searchNameBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchNameBtn.setText("Search name");
        searchNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameBtnActionPerformed(evt);
            }
        });

        searchIDBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        searchIDBtn.setText("Search ID");
        searchIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 461,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(searchNameBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(searchIDBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 630,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(studentCount))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(refreshBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deleteAllBtn,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 140,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sortGPAAsc)
                                                        .addComponent(sortGPADesc))))
                                .addContainerGap(52, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(studentCount))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(sortGPAAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(sortGPADesc, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(deleteAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchField, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(searchNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(searchIDBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchNameBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteAllBtn1ActionPerformed
        // TODO add your handling code here:
        String name = searchField.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a name to search for.");
        } else {

            clearTable();
            MVC.Controller.studentController.studentList = MVC.Controller.studentController.findStudentByName(name);
            if (MVC.Controller.studentController.studentList.size() == 0) {
                JOptionPane.showMessageDialog(null, "No students found with that name.");
            } else {
                displayTable();
            }
        }
    }// GEN-LAST:event_deleteAllBtn1ActionPerformed

    private void searchIDBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteAllBtn2ActionPerformed
        // TODO add your handling code here:
        String id = searchField.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter an ID to search for.");
        } else {
            clearTable();
            StudentModel student = MVC.Controller.studentController.findStudent(id);
            if (student != null) {
                MVC.Controller.studentController.studentList.clear();
                MVC.Controller.studentController.studentList.add(student);
                displayTable();
                MVC.Controller.studentController.studentList.clear();
            } else {
                JOptionPane.showMessageDialog(null, "No student found with that ID.");
            }

        }
    }// GEN-LAST:event_deleteAllBtn2ActionPerformed

    private void sortGPAAscActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortGPAAscActionPerformed
        // TODO add your handling code here:
        clearTable();
        MVC.Controller.studentController.sortStudentByGpaAscending();
        displayTable();
        // refreshTable();
    }// GEN-LAST:event_sortGPAAscActionPerformed

    private void sortGPADescActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortGPADescActionPerformed
        // TODO add your handling code here:
        clearTable();
        MVC.Controller.studentController.sortStudentByGpaDescending();
        displayTable();
        // refreshTable();
    }// GEN-LAST:event_sortGPADescActionPerformed

    private void deleteAllBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteAllBtnActionPerformed
        // TODO add your handling code here:
        MVC.Controller.studentController.deleteAllStudent();
        refreshTable();
    }// GEN-LAST:event_deleteAllBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first");
            return;
        }
        String id = (String) jTable1.getValueAt(selectedRow, 0);
        MVC.Controller.studentController.deleteStudent(id);
        refreshBtnActionPerformed(evt);

    }// GEN-LAST:event_deleteBtnActionPerformed

    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_infoBtnActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row");
        } else {
            MVC.Controller.studentController.idToFind = (String) jTable1.getValueAt(row, 0);
            // Open viewStudentGUI
            MVC.View.viewStudentGUI viewStudentGUI = new viewStudentGUI();
            viewStudentGUI.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_infoBtnActionPerformed

    private int row = -1;

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
        } else {
            // get the id of the selected row
            // change the variable of MVC.Controller.studentController.idToFind to the id of
            // the selected row
            // change to the editStudentGUI
            String id = jTable1.getValueAt(row, 0).toString();
            MVC.Controller.studentController.idToFind = id;
            MVC.View.editStudentGUI editStudentGUI = new MVC.View.editStudentGUI();
            editStudentGUI.setVisible(true);
            row = -1;
            this.dispose();
        }
    }// GEN-LAST:event_editBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }// GEN-LAST:event_refreshBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        MVC.Controller.studentController.addStudent();

        this.dispose();
    }// GEN-LAST:event_addBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentListGUI().setVisible(true);
            }
        });
    }

    // populate table, read from studentList and write to table with their id, name,
    // class, math, eng, gpa
    public void populateTable() {
        MVC.Controller.studentController.studentList = MVC.Controller.studentController.getStudentList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (StudentModel student : MVC.Controller.studentController.studentList) {
            model.addRow(
                    new Object[] { student.getId(), student.getName(), student.getClassId(), student.getMathGrade(),
                            student.getEnglishGrade(), student.getGpa() });
        }

    }

    // displayTable()
    public void displayTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (StudentModel student : MVC.Controller.studentController.studentList) {
            model.addRow(
                    new Object[] { student.getId(), student.getName(), student.getClassId(), student.getMathGrade(),
                            student.getEnglishGrade(), student.getGpa() });
        }
    }

    // clear table, delete all from studentList
    public void clearTable() {
        for (int i = MVC.Controller.studentController.studentList.size() - 1; i >= 0; i--) {
            MVC.Controller.studentController.studentList.remove(i);
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

    }

    // Count number of students
    public void countStudents() {
        studentCount.setText("Number of students: " + MVC.Controller.studentController.studentList.size());
    }

    // refresh table
    public void refreshTable() {
        clearTable();
        populateTable();
        countStudents();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteAllBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton infoBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton searchIDBtn;
    private javax.swing.JButton searchNameBtn;
    private javax.swing.JButton sortGPAAsc;
    private javax.swing.JButton sortGPADesc;
    private javax.swing.JLabel studentCount;
    // End of variables declaration//GEN-END:variables
}