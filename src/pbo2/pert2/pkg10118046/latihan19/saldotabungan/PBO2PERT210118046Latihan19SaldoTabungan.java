/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan19.saldotabungan;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung saldo perbulan dari saldo awal
 */
public class PBO2PERT210118046Latihan19SaldoTabungan {

    /**
     * @param saldo
     * @return 
     */
    
    public static int hitungSaldo(int saldo)
    {
        int bunga = (int) (saldo * 0.15);
        int hasil = saldo + bunga;
        return hasil;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 2500000;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
        for (int i = 1; i<=6;i++) {
            saldo = hitungSaldo(saldo);
            System.out.println("Saldo Bulan ke-" + i + " Rp." + nf.format(saldo));
            
        }
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
