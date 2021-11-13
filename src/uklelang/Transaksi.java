
package uklelang;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Transaksi {
    
        ArrayList<Integer> idMasyarakatPelelang = new ArrayList<Integer>();
        ArrayList<Integer> idMasyarakatPenawar = new ArrayList<Integer>();
        ArrayList<String> namaBarang = new ArrayList<String>();
        ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
        ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        
    Scanner input = new Scanner(System.in);
    public void LelangBarang(Barang barang, Masyarakat masyarakat){
        
        System.out.println("====== LELANG BARANG ======\nSilahkan isi data berikut ini");
        
        System.out.print("Id masyarakat : ");
        int idMas = input.nextInt();
        idMasyarakatPelelang.add(idMas);
        
        System.out.print("Id barang : ");
        int idBrg = input.nextInt();
        idBarang.add(idBrg);
        
        System.out.print("Harga Awal : ");
        int harga = input.nextInt();
        hargaAwal.add(harga);
        barang.setHargaAwal(harga);
        
        barang.setStatus(true);
    }
    
    public void TawarBarang(Lelang lelang, Masyarakat masyarakat, Barang barang, Laporan laporan){
        System.out.println("====== TAWAR BARANG ======\nSilahkan isi data berikut ini");
        
        System.out.print("Id masyarakat : ");
        int idMas = input.nextInt();
        idMasyarakatPenawar.add(idMas);
        
        laporan.laporan(this, barang);
        System.out.print("No Barang : ");
        int idBrg = input.nextInt();
        
        int inputHargaTawar;
        do {
            System.out.print("Harga Tawar : ");
            inputHargaTawar = input.nextInt();
            
            if (inputHargaTawar > barang.getHargaAwal(idBrg)) {
                System.out.println("Anda berhasil menawar barang ini");
                barang.editStatus(idBrg, false);
                hargaTawar.add(inputHargaTawar);
                lelang.setHargaTawar(inputHargaTawar);
                
            } else {
                System.out.println("Anda harus menawar dengan harga yang lebih tinggi");
            }
        } while (inputHargaTawar < barang.getHargaAwal(idBrg));
       
        System.out.println("Berikut detail penawaran barang yang anda lakukan : ");
        System.out.println("Nama \t Barang \t Harga Awal \t Harga Tawar \t Status");
        System.out.println(masyarakat.getNama(idMas) + "\t" + barang.getNamaBarang(idBrg) + " \t " + barang.getHargaAwal(idBrg) + "\t\t" + lelang.getHargaTawar(idBrg) +"\t\t"+ barang.getStatus(idBrg));
    }
    
    public String getNamaBarang(int id){
        return this.namaBarang.get(id);
    }
    
    public int getHargaTawar(int id){
        return this.hargaTawar.get(id);
    }
}
