public class MainCetak {
    public static void main(String[] args) {
        // Membuat objek Penulis terlebih dahulu
        Penulis penulis = new Penulis("Agatha Lee", "Jalan Surabaya");

        // Membuat objek Buku dengan menggunakan objek Penulis sebagai parameter
        Buku b = new Buku("0987625428", "Menjemput Jodoh", 98000, penulis);
        b.print2();
    }
}
