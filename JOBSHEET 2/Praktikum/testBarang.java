public class testBarang {
    public static void main(String[] args) {
        barang brg1 = new barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stock = 10;
        brg1.tampilBarang();

        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah " + brg1.tambahStock(20));
    }

}
