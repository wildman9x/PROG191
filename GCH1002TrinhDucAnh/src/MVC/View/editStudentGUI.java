/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC.View;

import java.awt.event.KeyEvent;
import java.lang.ModuleLayer.Controller;

import javax.swing.JOptionPane;

import MVC.Model.StudentModel;

/**
 *
 * @author wildm
 */
public class editStudentGUI extends javax.swing.JFrame {

        /**
         * Creates new form addStudentGUI
         */
        public editStudentGUI() {
                initComponents();
                populateFields(MVC.Controller.studentController.findStudent(MVC.Controller.studentController.idToFind));
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
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                IDLabel = new javax.swing.JLabel();
                nameLabel = new javax.swing.JLabel();
                dobLabel = new javax.swing.JLabel();
                phoneLabel = new javax.swing.JLabel();
                emailLabel = new javax.swing.JLabel();
                addressLabel = new javax.swing.JLabel();
                classLabel = new javax.swing.JLabel();
                engLabel = new javax.swing.JLabel();
                mathLabel = new javax.swing.JLabel();
                IDField = new javax.swing.JTextField();
                nameField = new javax.swing.JTextField();
                phoneField = new javax.swing.JTextField();
                dobField = new javax.swing.JFormattedTextField();
                emailField = new javax.swing.JTextField();
                addressField = new javax.swing.JTextField();
                classField = new javax.swing.JTextField();
                engGradeField = new javax.swing.JTextField();
                mathGradeField = new javax.swing.JTextField();
                submitBtn = new javax.swing.JButton();
                cancelBtn = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                IDLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                IDLabel.setText("ID");

                nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                nameLabel.setText("Name");

                dobLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                dobLabel.setText("Date of birth");

                phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                phoneLabel.setText("Phone number");

                emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                emailLabel.setText("Email address");

                addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                addressLabel.setText("Address");

                classLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                classLabel.setText("Class");

                engLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                engLabel.setText("English");

                mathLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                mathLabel.setText("Math");

                IDField.setEditable(false);
                IDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                nameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                phoneField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                dobField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                new javax.swing.text.DateFormatter(
                                                java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
                dobField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                dobField.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                dobFieldKeyPressed(evt);
                        }

                        private void dobFieldKeyPressed(KeyEvent evt) {
                        }
                });

                emailField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                addressField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                classField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                engGradeField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                mathGradeField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

                submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                submitBtn.setText("Submit");
                submitBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                submitBtnActionPerformed(evt);
                        }
                });

                cancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                cancelBtn.setText("Cancel");
                cancelBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancelBtnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(41, 41, 41)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(IDLabel)
                                                                                                                                                .addComponent(nameLabel))
                                                                                                                                .addGap(103, 103,
                                                                                                                                                103)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(nameField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(IDField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(phoneLabel)
                                                                                                                                                .addComponent(dobLabel))
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(phoneField,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                414,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addGap(8, 8, 8)
                                                                                                                                                                .addComponent(dobField,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                414,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(emailLabel)
                                                                                                                                                .addComponent(addressLabel)
                                                                                                                                                .addComponent(classLabel)
                                                                                                                                                .addComponent(engLabel)
                                                                                                                                                .addComponent(mathLabel))
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(mathGradeField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(engGradeField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(classField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(addressField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(emailField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                414,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(116, 116, 116)
                                                                                                .addComponent(submitBtn)
                                                                                                .addGap(148, 148, 148)
                                                                                                .addComponent(cancelBtn)))
                                                                .addContainerGap(43, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(IDLabel)
                                                                                .addComponent(IDField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(nameLabel)
                                                                                .addComponent(nameField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(dobLabel)
                                                                                .addComponent(dobField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(phoneLabel)
                                                                                .addComponent(phoneField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(emailLabel)
                                                                                .addComponent(emailField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(addressLabel)
                                                                                .addComponent(addressField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(classLabel)
                                                                                .addComponent(classField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(engLabel)
                                                                                .addComponent(engGradeField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(mathLabel)
                                                                                .addComponent(mathGradeField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                31,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(submitBtn)
                                                                                .addComponent(cancelBtn))
                                                                .addGap(24, 24, 24)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitBtnActionPerformed
                // TODO add your handling code here:
                String id = IDField.getText();
                String name = nameField.getText();
                String dob = dobField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();
                String address = addressField.getText();
                String classID = classField.getText();

                // if engGradeField.getText() and mathGradeField.getText() are not instance of
                // Integer,
                // then throw an exception
                try {
                        Integer.parseInt(engGradeField.getText());
                        Integer.parseInt(mathGradeField.getText());
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Please enter valid grades", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                        return;
                }

                int eng = Integer.parseInt(engGradeField.getText());
                int math = Integer.parseInt(mathGradeField.getText());
                // if eng and math are not integer, display error message

                MVC.Controller.studentController.editStudent(name, id, email, phone, address, dob, math, eng, classID);
                MVC.Controller.studentController.cancel();
                this.dispose();
        }// GEN-LAST:event_submitBtnActionPerformed

        private void jFormattedTextField1KeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jFormattedTextField1KeyPressed
                // TODO add your handling code here:
        }// GEN-LAST:event_jFormattedTextField1KeyPressed

        private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelBtnActionPerformed
                // TODO add your handling code here:
                MVC.Controller.studentController.cancel();
                this.dispose();
        }// GEN-LAST:event_cancelBtnActionPerformed

        // populate fields with student info
        public void populateFields(StudentModel student) {
                IDField.setText(student.getId());
                nameField.setText(student.getName());
                dobField.setText(student.getDob());
                phoneField.setText(student.getPhone());
                emailField.setText(student.getEmail());
                addressField.setText(student.getAddress());
                classField.setText(student.getClassId());
                engGradeField.setText(Integer.toString(student.getEnglishGrade()));
                mathGradeField.setText(Integer.toString(student.getMathGrade()));
        }

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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(editStudentGUI.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(editStudentGUI.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(editStudentGUI.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(editStudentGUI.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new editStudentGUI().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField IDField;
        private javax.swing.JLabel IDLabel;
        private javax.swing.JTextField addressField;
        private javax.swing.JLabel addressLabel;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JTextField classField;
        private javax.swing.JLabel classLabel;
        private javax.swing.JFormattedTextField dobField;
        private javax.swing.JLabel dobLabel;
        private javax.swing.JTextField emailField;
        private javax.swing.JLabel emailLabel;
        private javax.swing.JTextField engGradeField;
        private javax.swing.JLabel engLabel;
        private javax.swing.JTextField mathGradeField;
        private javax.swing.JLabel mathLabel;
        private javax.swing.JTextField nameField;
        private javax.swing.JLabel nameLabel;
        private javax.swing.JTextField phoneField;
        private javax.swing.JLabel phoneLabel;
        private javax.swing.JButton submitBtn;
        // End of variables declaration//GEN-END:variables
}