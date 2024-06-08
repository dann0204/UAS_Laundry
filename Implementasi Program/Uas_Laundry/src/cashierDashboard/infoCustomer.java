/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cashierDashboard;

import adminDashboard.adminDashboard;

/**
 *
 * @author MY PC
 */
public class infoCustomer extends javax.swing.JFrame {

    /** Creates new form infoCustomer */
    public infoCustomer() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableInfoCustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labelOrder = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        akunButton = new javax.swing.JButton();
        riwayatButton2 = new javax.swing.JButton();
        statusButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        statusButton2 = new javax.swing.JButton();
        statusButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        tableInfoCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tanggal Pemesanan", "Nama Pelanggan", "Layanan", "Status Pemesanan"
            }
        ));
        jScrollPane1.setViewportView(tableInfoCustomer);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 97, 153));
        jLabel2.setText("CUSTOMER INFORMATION FOR ORDER ID : ");

        labelOrder.setBackground(new java.awt.Color(255, 255, 255));
        labelOrder.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelOrder.setForeground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(42, 97, 153));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(242, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 97, 153));
        jLabel1.setText("INFORMASI CUSTOMER");

        jPanel3.setBackground(new java.awt.Color(42, 98, 154));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        akunButton.setBackground(new java.awt.Color(42, 98, 154));
        akunButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        akunButton.setForeground(new java.awt.Color(255, 255, 255));
        akunButton.setText("Layanan");
        akunButton.setAlignmentY(1.0F);
        akunButton.setBorderPainted(false);
        jPanel3.add(akunButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, 20));

        riwayatButton2.setBackground(new java.awt.Color(42, 98, 154));
        riwayatButton2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        riwayatButton2.setForeground(new java.awt.Color(255, 255, 255));
        riwayatButton2.setText("Kontak");
        riwayatButton2.setAlignmentY(1.0F);
        riwayatButton2.setBorderPainted(false);
        jPanel3.add(riwayatButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 20));

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
        jPanel3.add(statusButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 20));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/logo.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        statusButton2.setBackground(new java.awt.Color(242, 255, 255));
        statusButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        statusButton2.setForeground(new java.awt.Color(42, 97, 153));
        statusButton2.setText("Login");
        statusButton2.setAlignmentY(1.0F);
        statusButton2.setBorderPainted(false);
        jPanel3.add(statusButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 70, 20));

        statusButton3.setBackground(new java.awt.Color(242, 255, 255));
        statusButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        statusButton3.setForeground(new java.awt.Color(42, 97, 153));
        statusButton3.setText("Sign Up");
        statusButton3.setAlignmentY(1.0F);
        statusButton3.setBorderPainted(false);
        jPanel3.add(statusButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 90, 20));

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMIN");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelOrder)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(202, 202, 202))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void statusButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        adminDashboard halamanHomeAdmin = new adminDashboard();
        halamanHomeAdmin.setVisible(true);
    }//GEN-LAST:event_statusButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(infoCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akunButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelOrder;
    private javax.swing.JButton riwayatButton2;
    private javax.swing.JButton statusButton1;
    private javax.swing.JButton statusButton2;
    private javax.swing.JButton statusButton3;
    public javax.swing.JTable tableInfoCustomer;
    // End of variables declaration//GEN-END:variables

}
