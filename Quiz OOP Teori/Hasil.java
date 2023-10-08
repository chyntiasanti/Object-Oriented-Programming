import java.util.Scanner;

public class Hasil {
    public static void main(String[] args) {
        //Membuat Objek Kategori
        Kategori makanan0 = new Kategori("Minuman", "Susu untuk anak usia 9 - 15 Tahun", 987);
        Kategori makanan1 = new Kategori("Makanan", "Snak singkong rasa balado", 223);
        Kategori makanan2 = new Kategori("Makanan", "Mie instan rasa sambal ijo", 663);

        //Membuat Objek Barang
        Barang barang0 = new Barang("Susu Ultramilk", 1198, 5, 25000, makanan0);
        Barang barang1 = new Barang("Kusuka", 2928, 3, 8500, makanan1);
        Barang barang2 = new Barang("Mie Goreng", 3214, 4, 2500, makanan2);

        //Membuat Menu Tampilan
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("--------------------------------------------------");
        System.out.println("              Selamat Datang       ");
        System.out.println("      Data Informasi Toko Sejahterah       ");
        System.out.println("--------------------------------------------------");
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Tampil Barang ");
        System.out.println("2. Tambah Barang ");
        System.out.println("3. Kurang Barang ");
        System.err.print("Pilih Menu [1/2/3] : ");
        menu = sc.nextInt();

        //Pilihan Menu
        if(menu == 1){
            //Menampilkan Barang dan Kategori 
            System.out.println("Informasi Barang 1:");
            System.out.println("Kode Barang : " + barang0.getKodeBarang());
            System.out.println("Nama Barang : " + barang0.getNamaBarang());
            System.out.println("Harga       : Rp " + barang0.getHarga());
            System.out.println("Jumlah      : " + barang0.getJumlah());
            System.out.println("Kategori    : " + barang0.getKategori().getJenisKategori());
            System.out.println("Deskripsi   : " + barang0.getKategori().getDeskripsiKategori());
            System.out.println("   ");

            System.out.println("Informasi Barang 2:");
            System.out.println("Kode Barang : " + barang1.getKodeBarang());
            System.out.println("Nama Barang : " + barang1.getNamaBarang());
            System.out.println("Harga       : Rp " + barang1.getHarga());
            System.out.println("Jumlah      : " + barang1.getJumlah());
            System.out.println("Kategori    : " + barang1.getKategori().getJenisKategori());
            System.out.println("Deskripsi   : " + barang1.getKategori().getDeskripsiKategori());
            System.out.println("   ");

            System.out.println("Informasi Barang 3:");
            System.out.println("Kode Barang : " + barang2.getKodeBarang());
            System.out.println("Nama Barang : " + barang2.getNamaBarang());
            System.out.println("Harga       : Rp " + barang2.getHarga());
            System.out.println("Jumlah      : " + barang2.getJumlah());
            System.out.println("Kategori    : " + barang2.getKategori().getJenisKategori());
            System.out.println("Deskripsi   : " + barang2.getKategori().getDeskripsiKategori());
            System.out.println("   ");
        } else if(menu == 2){
            //Tambah Barang
            int kode;
            int jumlah;

            Scanner ab = new Scanner(System.in);
            Scanner bc = new Scanner(System.in);
        
            System.out.print("Masukkan Kode Barang : ");
            kode = ab.nextInt();
            System.out.println("Masukkan Jumlah Barang yang di tambahkan");
            jumlah = bc.nextInt();

            //Pemilihan barang
            if(kode == barang0.getKodeBarang()){
                barang0.tambahStok(jumlah);
                System.out.println("Barang dengan kode " +kode + " berjumlah : " + barang0.getJumlah());
            } else if(kode == barang1.getKodeBarang()){
                barang1.tambahStok(jumlah);
                System.out.println("Barang dengan kode " +kode + " berjumlah : " + barang0.getJumlah());
            } else if (kode == barang2.getKodeBarang()){
                barang2.tambahStok(jumlah);
                System.out.println("Barang dengan kode " +kode + " berjumlah : " + barang0.getJumlah());
            }
        } else if(menu == 3){
            //Kurang Barang

            int kode;
            int jumlah;

            Scanner ab = new Scanner(System.in);
            Scanner bc = new Scanner(System.in);

            System.out.print("Masukkan Kode Barang : ");
            kode = ab.nextInt();
            System.out.println("Masukkan Jumlah Barang yang di tambahkan");
            jumlah = bc.nextInt();

            //Pemilihan barang
            if(kode == barang0.getKodeBarang()){
                barang0.kurangStok(jumlah);
                System.out.println("Barang dengan kode " +kode + " berjumlah : " + barang0.getJumlah());
            } else if(kode == barang1.getKodeBarang()){
                barang1.kurangStok(jumlah);
                System.out.println("Barang dengan kode " +kode + " berjumlah : " + barang0.getJumlah());
            } else if (kode == barang2.getKodeBarang()){
                barang2.kurangStok(jumlah);
                System.out.println("Barang dengan kode " +kode + " berjumlah : " + barang0.getJumlah());
            }
        }
    }
}
