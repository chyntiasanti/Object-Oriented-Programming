public class Kategori {
    //Atribut
    private String jenisKategori;
    private int kodeKategori;
    private String deskripsiKategori;

    //Konstruktor
    public Kategori(String jenisKategori, String deskripsiKategori, int kodeKategori){
        this.jenisKategori = jenisKategori;
        this.deskripsiKategori = deskripsiKategori;
        this.kodeKategori = kodeKategori;
    }

    //Metode Get & Set Jenis Kategori
    public String getJenisKategori(){
        return jenisKategori;
    }

    public void setJenisKategori(String jenisKategori){
        this.jenisKategori = jenisKategori;
    }

    //Matode Get & Set Kode Kategori
     public int getKodeKategori(){
        return kodeKategori;
    }

    public void setKodeKategori(int kodeKategori){
        this.kodeKategori = kodeKategori;
    }

     //Matode Get & Set Deskripsi Kategori
     public String getDeskripsiKategori(){
        return deskripsiKategori;
    }

    public void setDeskripsiKategori(String deskripsiKategori){
        this.deskripsiKategori = deskripsiKategori;
    }
}
