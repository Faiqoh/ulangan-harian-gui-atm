
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faiqoh
 */
public class menu extends javax.swing.JFrame {
        
    
        String str, str1, saldo;
        int s,se,t, tab=250000;
        int z; 
    /**
     * Creates new form menu
     */
    public menu() {
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
        bpetunjuk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btarik = new javax.swing.JButton();
        bsaldo = new javax.swing.JButton();
        bkeluar3 = new javax.swing.JButton();
        bsetor1 = new javax.swing.JButton();
        btransfer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("LAKUKAN TRANSAKSI SESUAI YANG ANDA BUTUHKAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 140, 400, 50);

        bpetunjuk.setText("PETUNJUK");
        bpetunjuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpetunjukActionPerformed(evt);
            }
        });
        jPanel1.add(bpetunjuk);
        bpetunjuk.setBounds(270, 270, 140, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 10, 320, 130);

        btarik.setText("PENARIKAN");
        btarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btarikActionPerformed(evt);
            }
        });
        jPanel1.add(btarik);
        btarik.setBounds(80, 270, 140, 40);

        bsaldo.setText("INFORMASI SALDO");
        bsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaldoActionPerformed(evt);
            }
        });
        jPanel1.add(bsaldo);
        bsaldo.setBounds(80, 340, 140, 40);

        bkeluar3.setText("KELUAR");
        bkeluar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluar3ActionPerformed(evt);
            }
        });
        jPanel1.add(bkeluar3);
        bkeluar3.setBounds(270, 340, 140, 40);

        bsetor1.setText("PENYETORAN");
        bsetor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsetor1ActionPerformed(evt);
            }
        });
        jPanel1.add(bsetor1);
        bsetor1.setBounds(80, 200, 140, 40);

        btransfer.setText("TRANSFER");
        btransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btransferActionPerformed(evt);
            }
        });
        jPanel1.add(btransfer);
        btransfer.setBounds(270, 200, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 400);

        setBounds(0, 0, 500, 437);
    }// </editor-fold>//GEN-END:initComponents

    private void bpetunjukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpetunjukActionPerformed
        // TODO add your handling code here:
    new petunjuk().setVisible(true);
        dispose();
    }//GEN-LAST:event_bpetunjukActionPerformed

    private void btarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btarikActionPerformed
        // TODO add your handling code here:
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //pengambilan
            t = Integer.parseInt(str1);
            tarik mengambil = new tarik();
            mengambil.ambil(tab,t);
            tab =mengambil.getSaldo();
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM MANDIRI SYARIAH",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM MANDIRI SYARIAH, ambil kartu ATM Anda.");
                System.exit(0);
            }  
    }//GEN-LAST:event_btarikActionPerformed

    private void bsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaldoActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab); //informasi saldo
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM MANDIRI SYARIAH", 
            JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain 
            if (z==0) {
                this.setVisible(true);
            }
            
            else {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM MANDIRI SYARIAH, ambil kartu ATM Anda."); 
            System.exit(0);
            }
            
    }//GEN-LAST:event_bsaldoActionPerformed

    private void bkeluar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluar3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bkeluar3ActionPerformed

    private void bsetor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsetor1ActionPerformed
        // TODO add your handling code here:
      
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //pengambilan
            se = Integer.parseInt(str1);
            setor jadi = new setor();
            jadi.menabung(tab,se);
            tab =jadi.getSaldo();
            
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM MANDIRI SYARIAH",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM MANDIRI SYARIAH, ambil kartu ATM Anda.");
                System.exit(0);
            }
    }//GEN-LAST:event_bsetor1ActionPerformed

    private void btransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btransferActionPerformed
        // TODO add your handling code here:
        
        
        str = JOptionPane.showInputDialog(null,"Masukkan rekenening tujuan : " ); //transfer
        str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah transfer : " ); //transfer
            t = Integer.parseInt(str1);
            tarik mengambil = new tarik();
            mengambil.ambil(tab,t);
            tab =mengambil.getSaldo();
            
            z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain ?","ATM MANDIRI SYARIAH",
                JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
            if (z==0)
            {
                this.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM MANDIRI SYARIAH, ambil kartu ATM Anda.");
                System.exit(0);
            }
    }//GEN-LAST:event_btransferActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bkeluar3;
    private javax.swing.JButton bpetunjuk;
    private javax.swing.JButton bsaldo;
    private javax.swing.JButton bsetor1;
    private javax.swing.JButton btarik;
    private javax.swing.JButton btransfer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
