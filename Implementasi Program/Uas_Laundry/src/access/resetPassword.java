/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import Main.Home;
import Main.loginPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import koneksiDatabase.Connect;

/**
 *
 * @author MY PC
 */
public class resetPassword extends javax.swing.JFrame {

    /**
     * Creates new form resetPassword
     */
    public resetPassword() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loginPage = new javax.swing.JLabel();
        labelnama = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        akunButton = new javax.swing.JButton();
        riwayatButton2 = new javax.swing.JButton();
        statusButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 97, 153));
        jLabel2.setText("Please enter your new password");

        loginPage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginPage.setForeground(new java.awt.Color(42, 97, 153));
        loginPage.setText("Back to login page ?");
        loginPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPageMouseClicked(evt);
            }
        });

        labelnama.setBackground(new java.awt.Color(255, 102, 102));
        labelnama.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelnama.setForeground(new java.awt.Color(255, 51, 51));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 97, 153));
        jLabel6.setText("Password");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 97, 153));
        jLabel5.setText("Confirm Password");

        txtPassword.setBackground(new java.awt.Color(206, 212, 218));

        txtConfirmPassword.setBackground(new java.awt.Color(206, 212, 218));

        jButton1.setBackground(new java.awt.Color(42, 97, 153));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 255, 255));
        jButton1.setText("RESET PASSWORD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(42, 98, 154));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        akunButton.setBackground(new java.awt.Color(42, 98, 154));
        akunButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        akunButton.setForeground(new java.awt.Color(255, 255, 255));
        akunButton.setText("Layanan");
        akunButton.setAlignmentY(1.0F);
        akunButton.setBorderPainted(false);
        akunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunButtonActionPerformed(evt);
            }
        });
        jPanel2.add(akunButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, 20));

        riwayatButton2.setBackground(new java.awt.Color(42, 98, 154));
        riwayatButton2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        riwayatButton2.setForeground(new java.awt.Color(255, 255, 255));
        riwayatButton2.setText("Kontak");
        riwayatButton2.setAlignmentY(1.0F);
        riwayatButton2.setBorderPainted(false);
        riwayatButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(riwayatButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 20));

        statusButton1.setBackground(new java.awt.Color(42, 98, 154));
        statusButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        statusButton1.setForeground(new java.awt.Color(255, 255, 255));
        statusButton1.setText("Beranda");
        statusButton1.setAlignmentY(1.0F);
        statusButton1.setBorderPainted(false);
        statusButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(statusButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/logo.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 97, 153));
        jLabel3.setText("Reset Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(labelnama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(loginPage)
                                .addGap(76, 76, 76))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(labelnama)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginPage)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPageMouseClicked
        // TODO add your handling code here:
        loginPage login = null;
        try {
            login = new loginPage();
        } catch (SQLException ex) {
            Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginPageMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            if (isFilled() && isPasswordEquals()) {
                Statement stm = (Statement) Connect.configDB().createStatement();
                stm.executeUpdate("UPDATE `login` SET `password` = '"+ String.valueOf(txtPassword.getPassword()) +"' WHERE `login`.`username` = '"+ labelnama.getText() +"';");
                stm.close();
                JOptionPane.showMessageDialog(this, "Your password has been reset, please login");
                loginPage login = new loginPage();
                login.setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void akunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunButtonActionPerformed

    }//GEN-LAST:event_akunButtonActionPerformed

    private void riwayatButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riwayatButton2ActionPerformed

    private void statusButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Home halamanHome = new Home();
        halamanHome.setVisible(true);
    }//GEN-LAST:event_statusButton1ActionPerformed
    
    private boolean isFilled () {
        if (!String.valueOf(txtPassword.getPassword()).isEmpty() && !String.valueOf(txtConfirmPassword.getPassword()).isEmpty()) {
            return true;
        }else{
            JOptionPane.showMessageDialog(this, "Please fill out the form");
            return false;
        }
    }
    
    private boolean isPasswordEquals () {
        if (!String.valueOf(txtPassword.getPassword()).equals(String.valueOf(txtConfirmPassword.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Password Do Not Match");
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            return false;
        }else{
            return true;
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akunButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel labelnama;
    private javax.swing.JLabel loginPage;
    private javax.swing.JButton riwayatButton2;
    private javax.swing.JButton statusButton1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
