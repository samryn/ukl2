/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklelang;

public class Laporan {
    public void laporan(Transaksi tr, Barang br){
        int x = tr.namaBarang.size();
        
        System.out.println("Laporan Barang Lelang");
        System.out.println("Nama \t  Harga Awal \t Status");
        for(int i = 0; i < x; i++){
            System.out.println(tr.namaBarang.get(i) + "\t" + tr.hargaAwal.get(i) + "\t\t" + br.getStatus(i));
        }
    }
    
    public void laporan(Transaksi tr, Barang brg, Lelang lel){
        int x = tr.hargaTawar.size();
        
        System.out.println("Laporan Transaksi Lelang");
        System.out.println("Nama \t Id Pembeli \t Laba");
        for(int i = 0; i < x; i++){
            int laba = lel.getHargaTawar(i) - brg.getHargaAwal(i);
            System.out.println(tr.namaBarang.get(i) + "\t"+ tr.idMasyarakatPenawar.get(i) +"\t\t" + laba);
        }
    }
}
