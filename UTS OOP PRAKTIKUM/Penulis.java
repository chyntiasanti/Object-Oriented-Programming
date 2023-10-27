import java.security.PublicKey;

public class Penulis {
    private String nama, alamat;

    public Penulis(){

    }

    public Penulis(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void print(){
        System.out.println("Nama Penulis : " + nama);
        System.out.println("Alamat       : " +alamat);
    }
}
