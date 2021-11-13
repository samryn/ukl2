
package uklelang;
import java.util.ArrayList;

public class Petugas extends Masyarakat{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("gisel");
        this.alamat.add("Pasuruan");
        this.telp.add("089732");
        
        this.namaPetugas.add("Danu");
        this.alamat.add("Sawojajar");
        this.telp.add("08128471");
        
        this.namaPetugas.add("rayyan");
        this.alamat.add("nambo");
        this.telp.add("09871234");
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

     @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
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
