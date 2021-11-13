
package uklelang;
import java.util.ArrayList;

public class Lelang {
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    
    public Lelang(){
          this.idPenawar.add(0);
          this.idBarang.add(0);
          this.hargaTawar.add(3000000);
          
          this.idPenawar.add(1);
          this.idBarang.add(1);
          this.hargaTawar.add(200000);
          
          this.idPenawar.add(2);
          this.idBarang.add(2);
          this.hargaTawar.add(2500000);
    }
    
    public void setIdPenawar(int idPenawar){
        this.idPenawar.add(idPenawar);
    }
    
    public int getIdPenawar(int id){
        return this.idPenawar.get(id);
    }
    
    public void setIdBarang(int idBarang){
        this.idBarang.add(idBarang);
    }
    
     public int getIdBarang(int id){
        return this.idBarang.get(id);
    }
    
    public void setHargaTawar(int harga){
        this.hargaTawar.add(harga);
    }
    
    public int getHargaTawar(int id){
        return this.hargaTawar.get(id);
    }
}
