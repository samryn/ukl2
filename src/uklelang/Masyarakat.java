
package uklelang;
import java.util.ArrayList;

public class Masyarakat implements User{ 
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    
    public Masyarakat(){ 
        this.namaMasyarakat.add("isam"); 
        this.alamat.add("lowokwaru");
        this.telp.add("082467827");
        
        this.namaMasyarakat.add("sam");
        this.alamat.add("tlogowaru");
        this.telp.add("082335074989");
        
        this.namaMasyarakat.add("yasam");
        this.alamat.add("klapanunggal");
        this.telp.add("181234551123"); 
    }

    @Override 
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

     @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public void setTelp(String telp) {
        this.telp.add(telp);
    }

    @Override
    public String getTelp(int id) {
        return this.telp.get(id);
    }
    
}
