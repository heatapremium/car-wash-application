package carwash;

import java.awt.Toolkit;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.border.LineBorder;
import test.Message;

public class registerFrame extends javax.swing.JFrame {

    
    public registerFrame() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\user\\OneDrive\\Desktop\\CARWASH\\src\\carwash\\car.png");
        setIconImage(icon.getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        pfConfirmPassword = new com.raven.swing.PasswordField();
        pfPassword = new com.raven.swing.PasswordField();
        tfAddress = new com.raven.swing.TextField();
        tfPhone = new com.raven.swing.TextField();
        tfEmail = new com.raven.swing.TextField();
        tfName = new com.raven.swing.TextField();
        btnCancel = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        REGISTER = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToreX Technologies");
        setBounds(383,221,720,390);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pfConfirmPassword.setLabelText("Confirm Password");
        pfConfirmPassword.setLineColor(new java.awt.Color(131, 126, 253));
        pfConfirmPassword.setSelectionColor(new java.awt.Color(157, 153, 255));
        pfConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfConfirmPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 310, -1));

        pfPassword.setLabelText("Password");
        pfPassword.setLineColor(new java.awt.Color(131, 126, 253));
        pfPassword.setSelectionColor(new java.awt.Color(157, 153, 255));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 310, -1));

        tfAddress.setLabelText("Address");
        tfAddress.setLineColor(new java.awt.Color(131, 126, 253));
        tfAddress.setSelectionColor(new java.awt.Color(157, 153, 255));
        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });
        jPanel1.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 310, -1));

        tfPhone.setToolTipText("");
        tfPhone.setLabelText("Phone");
        tfPhone.setLineColor(new java.awt.Color(131, 126, 253));
        tfPhone.setSelectionColor(new java.awt.Color(157, 153, 255));
        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 310, -1));

        tfEmail.setLabelText("Email");
        tfEmail.setLineColor(new java.awt.Color(131, 126, 253));
        tfEmail.setSelectionColor(new java.awt.Color(157, 153, 255));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 310, -1));

        tfName.setLabelText("Name");
        tfName.setLineColor(new java.awt.Color(131, 126, 253));
        tfName.setSelectionColor(new java.awt.Color(157, 153, 255));
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        jPanel1.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 310, 60));

        btnCancel.setBackground(new java.awt.Color(45, 21, 203));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setFocusable(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 80, 30));

        btnRegister.setBackground(new java.awt.Color(45, 21, 203));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 90, 30));

        REGISTER.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        REGISTER.setText("REGISTER");
        jPanel1.add(REGISTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carwash/images/Register.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfConfirmPasswordActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
        new FirstPage().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String address = tfAddress.getText();
        String password = String.valueOf(pfPassword.getPassword());
        String confirmPassword = String.valueOf(pfConfirmPassword.getPassword());

        if(name.isEmpty()||email.isEmpty()||phone.isEmpty()||address.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter all field ","try again ",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(password.equals(confirmPassword)){
            try{
                Statement stmt = DbConnection.myconn().createStatement();
                stmt.executeUpdate("INSERT INTO customers(name,email,phone,address,password)"+"VALUES('"+name+"','"+email+"','"+phone+"','"+address+"','"+password+"')");

                //JOptionPane.showMessageDialog(rootPane, "Your account created.Login now ");
                test.Message me = new test.Message(this, true);
                me.showAlert();
                dispose();
                new SigninFrame().setVisible(true);

            }catch(Exception e){
                System.out.println(e);

            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"Passwords do not match,Please try again ");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel REGISTER;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private com.raven.swing.PasswordField pfConfirmPassword;
    private com.raven.swing.PasswordField pfPassword;
    private com.raven.swing.TextField tfAddress;
    private com.raven.swing.TextField tfEmail;
    private com.raven.swing.TextField tfName;
    private com.raven.swing.TextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
