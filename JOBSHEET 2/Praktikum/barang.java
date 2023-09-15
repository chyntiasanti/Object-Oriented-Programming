public class barang {
    public String namaBrg;
    public String jenisBrg;
    public int stock;

    public void tampilBarang(){
        System.out.println("Nama Barang   : " +namaBrg);
        System.out.println("Jenis Barang  : " +jenisBrg);
        System.out.println("Stok          : " +stock);
    }

    //Method dengan argumen dan nilai batik (return)
    public int tambahStock(int brgMasuk) {
        int stockBaru = brgMasuk+stock;
        return stockBaru;
    }
}
