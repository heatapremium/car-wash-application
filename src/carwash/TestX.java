package carwash;

import java.lang.String;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class TestX extends javax.swing.JFrame {
    
   
    String branch_id=null;
    Connection con  = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public TestX(String branch_id) {
        initComponents();
        tfBranchID.setText(branch_id);
        this.branch_id=branch_id;
        con = DbConnection.myconn();
        
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBranchName = new javax.swing.JLabel();
        btnTryAgain = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfBranchID = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Branch Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 29));

        tfBranchName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfBranchName.setText("0");
        tfBranchName.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tfBranchNameComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tfBranchNameComponentRemoved(evt);
            }
        });
        tfBranchName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tfBranchNameInputMethodTextChanged(evt);
            }
        });
        tfBranchName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfBranchNamePropertyChange(evt);
            }
        });
        jPanel1.add(tfBranchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 360, 29));

        btnTryAgain.setBackground(new java.awt.Color(45, 21, 203));
        btnTryAgain.setForeground(new java.awt.Color(255, 255, 255));
        btnTryAgain.setText("Try Again");
        btnTryAgain.setBorderPainted(false);
        btnTryAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTryAgain.setFocusable(false);
        btnTryAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTryAgainActionPerformed(evt);
            }
        });
        jPanel1.add(btnTryAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 98, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Branch ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, 29));

        tfBranchID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfBranchID.setText("0");
        tfBranchID.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tfBranchIDComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tfBranchIDComponentRemoved(evt);
            }
        });
        tfBranchID.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tfBranchIDInputMethodTextChanged(evt);
            }
        });
        tfBranchID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfBranchIDPropertyChange(evt);
            }
        });
        jPanel1.add(tfBranchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 164, 29));

        btnConfirm.setBackground(new java.awt.Color(45, 21, 203));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.setBorderPainted(false);
        btnConfirm.setFocusPainted(false);
        btnConfirm.setFocusable(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 98, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        /*JOptionPane.showMessageDialog(rootPane,"Are You Confirm This Branch ");
        dispose();*/
        if("Branch ID not found in database.Please Try Again".equals(tfBranchName.getText())||"Failed to retrieve branch name from database.".equals(tfBranchName.getText())){
            JOptionPane.showMessageDialog(this,"Branch ID not found in database.Please Try Again ","Try again ",JOptionPane.ERROR_MESSAGE);
        }
        else{
          JOptionPane.showMessageDialog(rootPane,"Are You Confirm This Branch ");
          dispose();
        }
        //new DashBoard().setVisible(true);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void tfBranchIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfBranchIDPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBranchIDPropertyChange

    private void tfBranchIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tfBranchIDInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBranchIDInputMethodTextChanged

    private void tfBranchIDComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tfBranchIDComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBranchIDComponentRemoved

    private void tfBranchIDComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tfBranchIDComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBranchIDComponentAdded

    private void btnTryAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTryAgainActionPerformed
        dispose();
        new QRCode().setVisible(true);
        //new DashBoard().setVisible(true);
    }//GEN-LAST:event_btnTryAgainActionPerformed

    private void tfBranchNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfBranchNamePropertyChange
        //tfAssign.getText(name);
    }//GEN-LAST:event_tfBranchNamePropertyChange

    private void tfBranchNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tfBranchNameInputMethodTextChanged

    }//GEN-LAST:event_tfBranchNameInputMethodTextChanged

    private void tfBranchNameComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tfBranchNameComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBranchNameComponentRemoved

    private void tfBranchNameComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tfBranchNameComponentAdded

    }//GEN-LAST:event_tfBranchNameComponentAdded
    public void displayDetails(String branchId) {
        //String url = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false";
       // String user = "root";
        //String password = "mypassword";

        try {
            String sql = "SELECT branch_name FROM branches WHERE branch_id = ?";
            //PreparedStatement statement = con.prepareStatement("SELECT branch_name FROM branches WHERE branch_id = ?");
            //statement.setString(1, branchId);
            pst = con.prepareCall(sql);
            pst.setString(1,branch_id);
            
            rs = pst.executeQuery();

            if (rs.next()) {
                String branchName = rs.getString("branch_name");
                tfBranchName.setText(branchName);
               // new DashBoard(null,null,branchName);
               DashBoard obj = new DashBoard(null,null,branchName);
               obj.getBranchid(branchName);
            } else {
               tfBranchName.setText("Branch ID not found in database.Please Try Again");
            }
        } catch (Exception e) {
            e.printStackTrace();
            tfBranchName.setText("Failed to retrieve branch name from database.");
        }
    }
  
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestX(null).setVisible(true);
            }
        });
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }

       
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnTryAgain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tfBranchID;
    private javax.swing.JLabel tfBranchName;
    // End of variables declaration//GEN-END:variables
}
