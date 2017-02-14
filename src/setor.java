
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
public class setor {
    private int saldo;
    public void menabung(int tab, int se) {
        if (se%100!=0)
            JOptionPane.showMessageDialog(null,
                    "Mesin ATM BRI tidak menerima uang koin \nSilakan ulani kembali!",
                    "Transaksi Gagal",0);
        else if(se<50000)
            JOptionPane.showMessageDialog(null,
                    "Besaran minimal setor tunai adalah Rp 50.000,00","ERROR",0);
        else if(se>50000){
            saldo = tab+se;
            JOptionPane.showMessageDialog(null,
                    "Saldo Anda saat ini sebesar : "+saldo);
        }
    }

    public int getSaldo() {
        return saldo;
    }
}
