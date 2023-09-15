public class barangDua {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public int hargajual;

    public int hitungHargaJual(float diskon) {
        hargajual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargajual;
    }

    public void tampilData() {
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Barang : " + hargaDasar);
        System.out.println("Diskon       : " + diskon);
        System.out.println("Total Harga  : " +hitungHargaJual(diskon));
    }

}
