import java.security.PublicKey;

public class Buku extends Penulis{
    private String ISBN;
    private String judul;
    private int harga;
    Penulis penulis;

    public Buku(){

    }

    public Buku(String ISBN, String judul, int harga, Penulis penulis){
        this.ISBN = ISBN;
        this.judul = judul;
        this.harga = harga;
        this.penulis = penulis;
    }

    public String getIsbn(){
        return ISBN;
    }

    public String getJudul(){
        return judul;
    }

    public Penulis getPenulis(){
        return penulis;
    }

    public int getHarga(){
        return harga;
    }

    public void setIsbn(String ISBN){
        this.ISBN = ISBN;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(Penulis penulis){
        this.penulis = penulis;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void print2(){
        System.out.println("ISBN    : " + ISBN);
        System.out.println("Judul   : " + judul);
        System.out.println("Harga   : " + harga);
        System.out.println("Penulis : " + penulis.getNama());
        System.out.println("Alamat  : " + penulis.getAlamat());
    }
    
}

