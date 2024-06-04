/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import adminDashboard.adminDashboard;
import access.forgotPassword;
import access.signupPage;
import access.signupPage;
import cashierDashboard.kasirDashboard;
import userDashboard.memberDashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksiDatabase.Connect;

/**
 *
 * @author MY PC
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */

    
    public loginPage() throws SQLException {
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
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        forgotPassword = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        akunButton = new javax.swing.JButton();
        riwayatButton2 = new javax.swing.JButton();
        statusButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 97, 153));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 97, 153));
        jLabel3.setText("Password");

        txtUsername.setBackground(new java.awt.Color(206, 212, 218));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(42, 97, 153));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(242, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(206, 212, 218));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(42, 97, 153));
        jButton1.setForeground(new java.awt.Color(242, 255, 255));
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        forgotPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(0, 76, 153));
        forgotPassword.setText("Forgot Password ?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
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
        jPanel2.add(akunButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 100, 20));

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
        jPanel2.add(statusButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/logo.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(42, 97, 153));
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(42, 97, 153));
        jLabel6.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(forgotPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        signupPage signup = null;
        try {
            signup = new signupPage();
        } catch (SQLException ex) {
            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        // TODO add your handling code here:
        forgotPassword reset = new forgotPassword();
        reset.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // get username and password 
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
     
        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                //try connection
                Statement stmt = (Statement) Connect.configDB().createStatement();
                String query = "SELECT * FROM login where username = ('" + username + "');" ;              
                ResultSet rs = stmt.executeQuery(query);
                
                //check result from username
                if (rs.next()) {
                    //if username was found then we check the password
                    if (password.equals(rs.getString("password"))){
                       //check if username is admin
                        if (username.equals("admin")) {
                            //create and redirect to admin dashboard
                            adminDashboard adm = new adminDashboard();
                            adm.setVisible(true);
                            clear();
                            this.dispose();
                        }else if(username.contains("kasir")){
                            kasirDashboard kd = new kasirDashboard();
                            
                            Statement stmt2 = (Statement) Connect.configDB().createStatement();
                            String query2 = "SELECT * FROM customer where username = ('" + username + "');" ;              
                            ResultSet rs2 = stmt2.executeQuery(query2);
                            
                            if (rs2.next()) {
                                kd.labelNama.setText(rs2.getString("nama").toUpperCase());
                            }
                            
                            kd.setVisible(true);
                            kd.labelUsername.setText(txtUsername.getText());
                            clear();
                            this.dispose();
                        }else{
                            //create and redirect to member dashboard
                            memberDashboard dashboard = new memberDashboard();

                            Statement stmt2 = (Statement) Connect.configDB().createStatement();
                            String query2 = "SELECT * FROM customer where username = ('" + username + "');" ;              
                            ResultSet rs2 = stmt2.executeQuery(query2);
                            
                            if (rs2.next()) {
                                dashboard.labelNama.setText(rs2.getString("nama").toUpperCase());
                            }
                            
                            dashboard.setVisible(true);
                            dashboard.labelusername.setText(txtUsername.getText()) ;
                            clear();
                            this.dispose();
                        }
                    }else{
                        //Username was found but the password doesn't match
                        JOptionPane.showMessageDialog(this, "Wrong Password");
                        clear();
                    } 
                }else{
                    //username not found
                    JOptionPane.showMessageDialog(this, "Username Not Found");
                    clear();
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please fill out the form");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
 
    private void clear (){
        txtUsername.setText("");
        txtPassword.setText("");
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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new loginPage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akunButton;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton riwayatButton2;
    private javax.swing.JButton statusButton1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
