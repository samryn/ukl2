
package uklelang;
import java.util.ArrayList;

public class Barang {
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Barang(){
          this.idBarang.add(0);
          this.namaBarang.add("Televisi");
          this.hargaAwal.add(300000);
          this.status.add(true);
          
          this.idBarang.add(1);
          this.namaBarang.add("handphone");
          this.hargaAwal.add(200000);
          this.status.add(true);
          
          this.idBarang.add(2);
          this.namaBarang.add("laptop");
          this.hargaAwal.add(250000);
          this.status.add(true);
    }
    
    public void setIdBarang(int id){
        this.idBarang.add(id);
    }
    
    public int getIdBarang(int id){
        return this.idBarang.get(id);
    }
    
    public void setNamaBarang(String nama){
        this.namaBarang.add(nama);
    }
    
    public String getNamaBarang(int id){
        return this.namaBarang.get(id);
    }
    
    public void setHargaAwal(int harga){
        this.hargaAwal.add(harga);
    }
    
    public int getHargaAwal(int id){
        return this.hargaAwal.get(id);
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    
    public void editStatus(int id, Boolean status){
        this.status.set(id, status);
    }
    
}
