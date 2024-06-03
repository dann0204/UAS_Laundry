/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashierDashboard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksiDatabase.Connect;

/**
 *
 * @author MY PC
 */
public class paymentForm extends javax.swing.JFrame {

    /**
     * Creates new form paymentForm
     */
    public paymentForm() {
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
        txtIDPesanan = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNewTotal = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        btnDone = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        akunButton = new javax.swing.JButton();
        riwayatButton2 = new javax.swing.JButton();
        statusButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        statusButton2 = new javax.swing.JButton();
        statusButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 97, 153));
        jLabel2.setText("ID Pesanan");

        txtIDPesanan.setEditable(false);
        txtIDPesanan.setBackground(new java.awt.Color(206, 212, 218));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(42, 97, 153));
        jLabel19.setText("Total");

        txtNewTotal.setEditable(false);
        txtNewTotal.setBackground(new java.awt.Color(206, 212, 218));

        txtPayment.setBackground(new java.awt.Color(206, 212, 218));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(42, 97, 153));
        jLabel20.setText("Payment");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(42, 97, 153));
        jLabel21.setText("Kembalian");

        txtKembalian.setEditable(false);
        txtKembalian.setBackground(new java.awt.Color(206, 212, 218));

        btnDone.setBackground(new java.awt.Color(42, 97, 153));
        btnDone.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnDone.setForeground(new java.awt.Color(242, 255, 255));
        btnDone.setText("DONE");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

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
        jLabel1.setText("Payment Form");

        jPanel4.setBackground(new java.awt.Color(42, 98, 154));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        akunButton.setBackground(new java.awt.Color(42, 98, 154));
        akunButton.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        akunButton.setForeground(new java.awt.Color(255, 255, 255));
        akunButton.setText("Layanan");
        akunButton.setAlignmentY(1.0F);
        akunButton.setBorderPainted(false);
        jPanel4.add(akunButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 90, 20));

        riwayatButton2.setBackground(new java.awt.Color(42, 98, 154));
        riwayatButton2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        riwayatButton2.setForeground(new java.awt.Color(255, 255, 255));
        riwayatButton2.setText("Kontak");
        riwayatButton2.setAlignmentY(1.0F);
        riwayatButton2.setBorderPainted(false);
        jPanel4.add(riwayatButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 20));

        statusButton1.setBackground(new java.awt.Color(42, 98, 154));
        statusButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        statusButton1.setForeground(new java.awt.Color(255, 255, 255));
        statusButton1.setText("Beranda");
        statusButton1.setAlignmentY(1.0F);
        statusButton1.setBorderPainted(false);
        jPanel4.add(statusButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 20));
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/logo.png"))); // NOI18N
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        statusButton2.setBackground(new java.awt.Color(242, 255, 255));
        statusButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        statusButton2.setForeground(new java.awt.Color(42, 97, 153));
        statusButton2.setText("Login");
        statusButton2.setAlignmentY(1.0F);
        statusButton2.setBorderPainted(false);
        jPanel4.add(statusButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 70, 20));

        statusButton3.setBackground(new java.awt.Color(242, 255, 255));
        statusButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        statusButton3.setForeground(new java.awt.Color(42, 97, 153));
        statusButton3.setText("Sign Up");
        statusButton3.setAlignmentY(1.0F);
        statusButton3.setBorderPainted(false);
        jPanel4.add(statusButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 90, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNewTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addComponent(txtIDPesanan, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNewTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        
        //condition if total price is equal to 0
        if (txtNewTotal.getText().replace("Rp. ", "").equals("0")) {
            try {
                Statement stmt = (Statement) Connect.configDB().createStatement();
                stmt.execute("UPDATE tab_pesanan SET status = 'false' WHERE id_pesanan =('"+txtIDPesanan.getText()+"');"); 
                JOptionPane.showMessageDialog(this, "Order "+ txtIDPesanan.getText() + " Telah Selesai");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal Menyelesaikan Pembayaran");
            }    
        }else{
           //if total price is not equal to 0, then we calculate from total price, and the payment input from user
           
           //null exception
            int payment=0;
            try {
                payment = Integer.parseInt(txtPayment.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please fill the form");
                return;
            }
            
            //if total payment < total price
            if (payment < Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""))) {
                JOptionPane.showMessageDialog(this, "Payment kurang dari total tagihan");
                txtPayment.setText("");
            }else if(payment > Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""))){
                //if total payment > total price
                //show the change field
                jLabel21.setVisible(true);
                txtKembalian.setVisible(true);
                txtKembalian.setText("Rp. "+String.valueOf(payment - Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""))));
                
                //then we update value from tab_pesanan status to false
                try {
                    Statement stmt = (Statement) Connect.configDB().createStatement();
                    stmt.execute("UPDATE tab_pesanan SET status = 'false' WHERE id_pesanan =('"+txtIDPesanan.getText()+"');");
                    JOptionPane.showMessageDialog(this, "Order "+ txtIDPesanan.getText() + " Telah Selesai");
                    
                    //then we add some point to the user
                    insertPoint();
                    txtIDPesanan.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Gagal Menyelesaikan Pembayaran");
                }
                
            }else{
                try {
                    Statement stmt = (Statement) Connect.configDB().createStatement();
                    stmt.execute("UPDATE tab_pesanan SET status = 'false' WHERE id_pesanan =('"+txtIDPesanan.getText()+"');"); 
                    JOptionPane.showMessageDialog(this, "Order "+ txtIDPesanan.getText() + " Telah Selesai");
                    
                    //add some point to user
                    insertPoint();
                    txtIDPesanan.setText("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Gagal Menyelesaikan Pembayaran");
                }
            }
        }
        
        
    }//GEN-LAST:event_btnDoneActionPerformed
    
    private void insertPoint () {
        //add point to user
        if (!isOrderFromCashier(getIDUserFromOrderID(txtIDPesanan.getText()))) {
            try {
                Statement stmt2 = (Statement) Connect.configDB().createStatement();
                stmt2.executeUpdate("UPDATE `point_diskon` SET `point` = '"+(getPointDiskonFromDB(getIDUserFromOrderID(txtIDPesanan.getText()))+calculatePointFromOrder())+"' WHERE `id_user` = '"+getIDUserFromOrderID(txtIDPesanan.getText())+"'");
            } catch (Exception e) {
            }
        }
    }
    
    private boolean isOrderFromCashier (String idUser) {
        boolean result = false;
        try {
           Statement stmt3 = (Statement) Connect.configDB().createStatement();
           ResultSet rs3 = stmt3.executeQuery("SELECT * FROM customer WHERE id_user = ('"+idUser+"')"); 
           
            if (rs3.next()) {
                if (rs3.getString("username").contains("kasir")) {
                    result = true;
                }
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private String getIDUserFromOrderID (String orderID) {
        String result = "";
        try {
           Statement stmt3 = (Statement) Connect.configDB().createStatement();
           ResultSet rs3 = stmt3.executeQuery("SELECT * FROM tab_pesanan WHERE id_pesanan = ('"+orderID+"')"); 
           
            if (rs3.next()) {
                result = rs3.getString("kode_customer");
            }
        } catch (Exception e) {
        }
        return result;
    }
    
    private int calculatePointFromOrder () {
        //calculate point from order 
        int counter=0;
        int totalBayar = Integer.parseInt(txtNewTotal.getText().replace("Rp. ", ""));
        while(totalBayar >= 25000) {
            if (totalBayar - 25000 >= 0) {
                counter++;
                totalBayar -= 25000;
                }
            } 
        return counter;
    }
    
    private int getPointDiskonFromDB (String idUser) throws SQLException {
        Statement stmt3 = (Statement) Connect.configDB().createStatement();
        ResultSet rs3 = stmt3.executeQuery("SELECT * FROM point_diskon WHERE id_user = ('"+idUser+"')");
        int diskon = 0;
        if (rs3.next()) {
            diskon = rs3.getInt("point");
        }
        
        return diskon;
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
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
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akunButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton riwayatButton2;
    private javax.swing.JButton statusButton1;
    private javax.swing.JButton statusButton2;
    private javax.swing.JButton statusButton3;
    public javax.swing.JTextField txtIDPesanan;
    public javax.swing.JTextField txtKembalian;
    public javax.swing.JTextField txtNewTotal;
    public javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
