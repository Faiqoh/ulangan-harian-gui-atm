
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
public class penarikan extends javax.swing.JFrame {

    /**
     * Creates new form penarikan
     */
    
    /*String str, str1, saldo;
        int s,se,t, tab=250000;
        int z;*/
    public penarikan() {
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
        jLabel1 = new javax.swing.JLabel();
        ttarik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bcancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bok = new javax.swing.JButton();
        jsisa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("JUMLAH PENARIKAN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 210, 140, 50);
        jPanel1.add(ttarik);
        ttarik.setBounds(210, 220, 160, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MASUKKAN JUMLAH PENARIKAN YANG ANDA INGINKAN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 160, 410, 50);

        bcancel.setText("CANCEL");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });
        jPanel1.add(bcancel);
        bcancel.setBounds(120, 330, 80, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 10, 320, 150);

        bok.setText("OK");
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });
        jPanel1.add(bok);
        bok.setBounds(270, 330, 80, 40);
        jPanel1.add(jsisa);
        jsisa.setBounds(140, 280, 170, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 490, 400);

        setBounds(0, 0, 491, 437);
    }// </editor-fold>//GEN-END:initComponents

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_bcancelActionPerformed

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        // TODO add your handling code here:
        int z = saldo.bonus;
        int b;
                
        b = Integer.parseInt(ttarik.getText());
        
        if(z>b){
            
            z = z - b;
            saldo.bonus = z;
        }else{
            JOptionPane.showMessageDialog(null, "Saldo anda tidak mencukupi!","INFORMASI",JOptionPane.INFORMATION_MESSAGE);
        }           
            
        new menu().setVisible(true);
        dispose();    
    }//GEN-LAST:event_bokActionPerformed

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
            java.util.logging.Logger.getLogger(penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penarikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penarikan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jsisa;
    private javax.swing.JTextField ttarik;
    // End of variables declaration//GEN-END:variables
}
