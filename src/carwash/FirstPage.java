package carwash;

import javax.swing.ImageIcon;


public class FirstPage extends javax.swing.JFrame {

    
    public FirstPage() {
        initComponents();
        ImageIcon icon = new ImageIcon("C:\\Users\\hashan\\OneDrive\\Desktop\\CARWASH_Dash_himal\\CARWASH_Dash_Updated\\src\\carwash\\images\\car.png");
        setIconImage(icon.getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        ImageOne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToreX Technologies");
        setBounds(383,221,720,390);

        firstPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(45, 21, 203));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADMIN");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        firstPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 343, -1, 30));

        btnSignup.setBackground(new java.awt.Color(45, 21, 203));
        btnSignup.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setText("Sign Up");
        btnSignup.setFocusable(false);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        firstPanel.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 100, 40));

        btnSignin.setBackground(new java.awt.Color(45, 21, 203));
        btnSignin.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnSignin.setForeground(new java.awt.Color(255, 255, 255));
        btnSignin.setText("Sign In");
        btnSignin.setFocusable(false);
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        firstPanel.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 100, 40));

        ImageOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carwash/images/firstPage.png"))); // NOI18N
        firstPanel.add(ImageOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        dispose();
        SigninFrame sign = new SigninFrame();
        sign.setVisible(true);
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        dispose();
        new registerFrame().setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new AdminLogIn().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageOne;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JPanel firstPanel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
