public class Barang{
    //Atribut
    private String namaBarang;
    private int kodeBarang;
    private int jumlah;
    private double harga;
    private Kategori kategori;

    //Constructor
    public Barang(String namaBarang, int kodeBarang, int jumlah, double harga, Kategori kategori){
        this.namaBarang = namaBarang;
        this.kodeBarang = kodeBarang;
        this.jumlah = jumlah;
        this.harga = harga;
        this.kategori = kategori;
    }

    //Method Get & Set Nama Barang
    public String getNamaBarang(){
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

     //Method Get & Set Kode Barang
    public int getKodeBarang(){
        return kodeBarang;
    }
    public void setKodeBarang(int kodeBarang){
        this.kodeBarang = kodeBarang;
    }

    //Method Get & Set Jumlah
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    //Method Get & Set Harga
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    

    //Method Get & Set Kategori
    public Kategori getKategori(){
        return kategori;
    }
    public void setKategori(Kategori kategori){
        this.kategori = kategori;
    }

    //Metode Hitung Total
    public double total(){
        return harga*jumlah;
    }

    //Metode Tambah Stok Barang
    public void tambahStok(int jumlahTambah){
        this.jumlah += jumlahTambah;
    }

    //Metode Kurang Stok Barang
    public void kurangStok(int jumlahKurang){
        if (jumlahKurang <= this.jumlah){
            this.jumlah -= jumlahKurang;
        } else{
            System.out.println("Maaf stok tidak mencukupi");
        }
    }

}