# Laporan Relasi Kelas
Nama  : Chyntia Santi Nur Trisnawati             
Kelas : 2C                                                                                       
Absen : 08 (Delapan)                                                                            
NIM   : 2241720017

## III. Praktikum
Percobaan 1                                                                      
a. Perhatikan diagram class berikut:

<img src = satu.png>

b. Buka project baru di Netbeans dan buat package dengan format berikut:
<identifier>.relasiclass.percobaan1 (ganti <identifier> dengan
identitas anda atau nama domain), Contoh: ac.id.polinema, jti.polinema, dan
sebagainya).

Catatan: Penamaan package dengan tambahan identifier untuk menghindari adanya
kemungkinan penamaan class yang bentrok.

c. Buatlah class Processor dalam package tersebut.
```java
public class Processor{

} 
```
d. Tambahkan atribut merk dan cache pada class Processor dengan akses modifier
private .
```java
public class Processor{
    private String merk;
    private double cache;
} 
```
e. Buatlah constructor default untuk class Processor.
```java
public class Processor{
    private String merk;
    private double cache;

    public Processor(){

    }
} 
```
f. Buatlah constructor untuk class Processor dengan parameter merk dan cache.
```java
public class Processor{
    private String merk;
    private double cache;

    public Processor(){

    }

    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }
} 
```
g. Implementasikan setter dan getter untuk class Processor.
```java
public class Processor{
    private String merk;
    private double cache;

    public Processor(){

    }

    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Getter untuk cache
    public double getCache() {
        return cache;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk cache
    public void setCache(int cache) {
        this.cache = cache;
    }
} 
```
h. Implementasikan method info() seperti berikut:
```java
public class Processor{
    private String merk;
    private double cache;

    public Processor(){

    }

    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Getter untuk cache
    public double getCache() {
        return cache;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk cache
    public void setCache(int cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Chace Memory = %.2f\n", cache);
    }
} 
```
i. Kemudian buatlah class Laptop di dalam package yang telah anda buat.
``` java
public class Laptop {

}
```
j. Tambahkan atribut merk dengan tipe String dan proc dengan tipe Object Processor
```java
public class Laptop {
    private String merk;
    private Processor proc;
}
```

k. Buatlah constructor default untuk class Laptop .
```java
public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }
}
```
l. Buatlah constructor untuk class Laptop dengan parameter merk dan proc .
```java
public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

     // Getter untuk merk
     public String getMerk() {
        return merk;
    }

    // Getter untuk Processor 
    public Processor getProc() {
        return proc;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk Processor
    public void setProc(Processor proc) {
        this.proc = proc;
    }
}
```
m. Selanjutnya implementasikan method info() pada class Laptop sebagai berikut
```java
public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

     // Getter untuk merk
     public String getMerk() {
        return merk;
    }

    // Getter untuk Processor 
    public Processor getProc() {
        return proc;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk Processor
    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}
```
n. Pada package yang sama, buatlah class MainPercobaan1 yang berisi method
```java
public class MainPercobaan1 {
    public static void main(String[] args) {
    }
}
 ```
o. Deklarasikan Object Processor dengan nama p kemudian instansiasi dengan informasi
atribut Intel i5 untuk nilai merk serta 3 untuk nilai cache .
```java
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
    }
}
 ```
p. Kemudian deklarasikan serta instansiasi Objek Laptop dengan nama L dengan informasi
atribut Thinkpad dan Objek Processor yang telah dibuat.
```java
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", p);

        L.info();
    }
}
 ```
r. Tambahkan baris kode berikut
```java
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", p);

        L.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}
 ```

 s. Compile kemudian run class MainPercobaan1, akan didapatkan hasil seperti berikut:
 <img src = dua.png>

## Pertanyaan
### Berdasarkan percobaan 1,  jawablah pertanyaan‑pertanyaan yang terkait:
1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk
masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?

`JAWAB`

- Untuk membantu dalam menerapkan prinsip encapsulation dalam pemrograman berorientasi objek.
- Setter digunakan untuk mengatur nilai properti, sedangkan getter digunakan untuk mendapatkan nilai properti.  sehingga dapat mengendalikan akses ke data dalam objek dan membatasi akses ke data yang hanya boleh dibaca, hanya boleh ditulis, atau bahkan melibatkan logika tambahan saat mengambil atau mengatur nilai.
- Setter memungkinkan untuk melakukan validasi terhadap data yang akan diatur ke dalam properti sebelum disimpan.
- Setter dan getter mengabstraksi bagaimana data diakses dan dimodifikasi. 

2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor
default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis
konstruktor tersebut ?

`JAWAB`

Konstruktor default tidak berisi atau bisa kita bilang kosongan hanya mengkonstruktor saja Konstruktor default biasanya digunakan untuk menginisialisasi objek dengan nilai-nilai default atau untuk melakukan tugas-tugas inisialisasi dasar. Sedangka Konstruktor dengan parameter adalah konstruktor yang menerima satu atau lebih parameter saat objek dari suatu kelas dibuat. Konstruktor ini digunakan untuk menginisialisasi objek dengan nilai-nilai yang diberikan saat pembuatan objek.

3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut
manakah yang bertipe object ?

`JAWAB`

Atribut yang bernilai objek adalah proc, hal ini karena pada proses inisialisasi menggunakan tipe data berupa objec pada class Processor.


4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop
memiliki relasi dengan class Processor ?

`JAVWAB`
Pada baris dengan kode program berikut yang menunjukkan adanya relasi dengan class Processor

```java
public class Laptop {
    private String merk;
    private Processor proc; // Baris program ini

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

    // Getter untuk Processor 
    public Processor getProc() {
        return proc;
    }
    // Setter untuk Processor
    public void setProc(Processor proc) {
        this.proc = proc;
    }
}
```
5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?

`JAWAB`

Sintaks proc.info() adalah untuk memanggil Change Memory pada object Processor sehingga tidak perlu dilakukan penulisan kode program yang sama

6. Pada class MainPercobaan1, terdapat baris kode:
Laptop l = new Laptop("Thinkpad", p);.
Apakah p tersebut ?
Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:
Page 4 of 10
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5",
3));
Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?

`JAWAB`

p meurupakan instansiasi dari class Processor karena pada laptop dilakukan pemanggilan objec sehingga ketika berada di proses instalisasi dilakukan dengan p dimana p merupakan variabel hasil instalisasi dari Processor.

Kode Program jika diganti dengan kode diatas adalah sebagai berikut
```java
public class MainPercobaan1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", new Processor("Intel i5",3));

        L.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}
```

Dan hasil ketika dijalanakan adalah sebagai berikut

<img src = tiga.png>

Dapat diketahui bahwa tidak terjadi perubahan.

## Percobaan 2
Perhatikan diagram class berikut yang menggambarkan sistem rental mobil. Pelanggan bisa
menyewa mobil sekaligus sopir. Biaya sopir dan biaya sewa mobil dihitung per hari.

<img src = empat.png>

a. Tambahkan package <identifier>.relasiclass.percobaan2.

`JAWAB`

<img src = satua.png>

b. Buatlah class Mobil di dalam package tersebut.

`JAWAB`
```java
public class Mobil {
}
```
c. Tambahkan atribut merk tipe String dan biaya tipe int dengan akses modifier
private.

`JAWAB`
```java
public class Mobil {
    private String merk;
    private int modifier;
}
```

d. Tambahkan constructor default serta setter dan getter.

`JAWAB`
```java
public class Mobil {
    private String merk;
    private int modifier;

    public Mobil(){

    }

    public Mobil(String merk, int modifier){
        this.merk = merk;
        this.modifier = modifier;
    }

    public String getMerk(){
        return merk;
    }

    public int getModifier(){
        return modifier;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setModifier(int modifier){
        this.modifier = modifier;
    }
}
```
e. Implementasikan method hitungBiayaMobil
```java
public class Mobil {
    private String merk;
    private int biaya;

    public Mobil(){

    }

    public Mobil(String merk, int biaya){
        this.merk = merk;
        this.biaya = biaya;
    }

    public String getMerk(){
        return merk;
    }

    public int getBiaya(){
        return biaya;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setModifier(int biaya){
        this.biaya = biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }        
}

```
h. Tambahkan class Pelanggan dengan constructor default.
```java
public class Pelanggan {
    public Pelanggan(){
    }
}
```
i. Tambahkan atribut‑atribut dengan akses modifier private berikut:
```java
public class Pelanggan {
    public Pelanggan(){
    }

    private String nama;
    private Mobil mobil;
    private String sopir;
    private int hari;

    public String getNama(){
        return nama;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public String getSopir(){
        return sopir;
    }
    public int getHari(){
        return hari;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    public void setSopir(String sopir){
        this.sopir = sopir;
    }
    public void setHari(int hari){
        this.hari = hari;
    }
}
```
k. Tambahkan method hitungBiayaTotal
```java
public class Pelanggan {
    public Pelanggan(){
    }

    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public String getNama(){
        return nama;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public Sopir getSopir(){
        return sopir;
    }
    public int getHari(){
        return hari;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }
    public void setHari(int hari){
        this.hari = hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) +
        sopir.hitungBiayaSopir(hari);
    } 
}
```
m. Compile dan jalankan class MainPercobaan2, dan perhatikan hasilnya!
```java
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = " +
        p.hitungBiayaTotal());
        
    }
}
```
Ketika di jalankan 

<img src = lima.png>

## Pertanyaan

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class
Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?

```JAWAB```

Baris program ke enam dan tujuh dengan kode program seperti di bawah
```java
private Mobil mobil;
private Sopir sopir;
```

2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method
hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus
memiliki argument hari ?

``Jawab``

Dalam sistem pembayarannya dilakukan dengan perhitungan hari sehingga dibutuhkan method hari untuk melakukan penghitungan ketika menyewa sopir dan mobil. Dari hari tersebut maka akan ditentukan total pembayaran dari perhitungan penyewaan sopir dan mobil.

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah
mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?

```Jawab```
- mobil.hitungBiayaMobil(hari) 
untuk menghitung biaya sewa mobil selama sejumlah hari tertentu. Parameter hari kemungkinan adalah jumlah hari sewa yang diinginkan. Metode ini mungkin akan mengambil tarif harian atau tarif per jam mobil, kemudian mengalikannya dengan jumlah hari (hari) untuk menghasilkan biaya total sewa mobil.
- sopir.hitungBiayaSopir(hari)
untuk menghitung biaya menyewa sopir selama sejumlah hari tertentu. Parameter hari juga kemungkinan adalah jumlah hari sewa sopir yang diinginkan. Metode ini mungkin akan mengambil tarif harian sopir, kemudian mengalikannya dengan jumlah hari (hari) untuk menghasilkan biaya total menyewa sopir. Hasil biaya ini kemudian mungkin akan dikembalikan sebagai nilai dari metode hitungBiayaSopir.

4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan
p.setSopir(s) ?

``Jawab``

sintaks p.setMobil(m) dan p.setSopir(s) digunakan untuk menghubungkan atau mengaitkan objek mobil dan objek sopir dengan objek pelanggan p, sehingga p dapat menggunakan informasi dari objek-objek ini dalam interaksi dan perhitungan selanjutnya.

5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal()
tersebut ?

``Jawab``

Untuk memanggil method p yang perupakab objek dari kelas pelanggan untuk menghitung total dari biaya sewa.

6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method
main dan amati perubahan saat di‑run!
Page 6 of 10
System.out.println(p.getMobil().getMerk());
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method
main tersebut?

``Jawab``

Untuk menunjukkan mobil apa yang digunakan dengan memanggil class mobil dan mengoutputkan merk dari mobil tersebut

## Percobaan 3

a. Sebuah Kereta Api dioperasikan oleh Masinis serta seorang Asisten Masinis. Baik Masinis
maupun Asisten Masinis keduanya merupakan Pegawai PT. Kereta Api Indonesia. Dari
ilustrasi cerita tersebut, dapat digambarkan dalam diagram kelas sebagai berikut:

<img src  = enam.png>

b. Perhatikan dan pahami diagram kelas tersebut, kemudian bukalah IDE anda!

c. Buatlah package <identifier>.relasiclass.percobaan3, kemudian tambahkan
class Pegawai.
d. Tambahkan atribut‑atribut ke dalam class Pegawai
e. Buatlah constructor untuk class Pegawai dengan parameter nip dan nama.
e. Buatlah constructor untuk class Pegawai dengan parameter nip dan nama.
Page 7 of 10
f. Tambahkan setter dan getter untuk masing‑masing atribut.

```java
public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(){

    }
    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}
```
g. Implementasikan method info() dengan menuliskan baris kode berikut:
```java
public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(){

    }
    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String info() { String info = "";
    info += "Nip: " + this.nip + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
    }
}
```
k. Tambahkan setter dan getter untuk atribut‑atribut yang ada pada class KeretaApi
l. Kemudian implementasikan method info()
```java
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public Pegawai getMasinis(){
        return masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }

    public void setNama(){
        this.nama = nama;
    }
    public void setKelas(){
        this.kelas = kelas;
    }
    public void setMasinis(){
        this.masinis = masinis;
    }
    public void setAsisten(){
        this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
```
m. Buatlah sebuah class MainPercobaan3 dalam package yang sama.
n. Tambahkan method main() kemudian tuliskan baris kode berikut.
```java
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
        masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
```

Ketika dijalankan adalah sebagai berikut

## Pertanyaan
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan
this.asisten.info() digunakan untuk apa ?
Page 8 of 10

``jawab``

Dua baris kode tersebut tampaknya digunakan untuk mengakses method info() dari objek yang disebut masinis dan asisten. Dalam konteks ini, masinis dan asisten mungkin merujuk pada objek-objek lain yang terkait dengan kereta api.

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang
sama. Tambahkan kode berikut pada method main() !
Pegawai masinis = new Pegawai("1234", "Spongebob
Squarepants");

``jawab``
```java
public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis",
        masinis);
        System.out.println(keretaApi.info());
    }
}
```
3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?

Ouput dari program tersebut adalah
 
<img src = sembilan.png>

4. Perbaiki class KeretaApi sehingga program dapat berjalan !

```java
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
       
        System.out.println(keretaApi.info());
    }
}
```

Dalam kode program dibutuhkan asisten sehingga ketika assisten tidak digunakan maka output tidak keluar sehingga dibutuhkan parameter asisten.

## Percobaan 4
 <img src = sepuluh.png>

a. Perhatikan dan pahami diagram class tersebut.                                    
b. Buatlah masing‑masing class Penumpang, Kursi dan Gerbong sesuai rancangan
tersebut pada package <identifier>.relasiclass.percobaan4.                                     
c. Tambahkan method info() pada class Penumpang
```java
public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(){

    }

    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp(){
        return ktp;
    }
    public String getNama(){
        return nama;
    }

    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String info(){
        String info = "";
        info += "Nama   : " + this.nama + "\n";
        info += "No KTP : " + this.ktp + "\n";
        return info;
    }
        
}
```

d. Tambahkan method info() pada class Kursi
```java
public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor){
        this.nomor = nomor;
    }

    public String getNomor(){
        return nomor;
    }
    public Penumpang getPenumpang(){
        return penumpang;
    }

    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
        info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
```

e. Pada class Gerbong buatlah method initKursi() dengan akses private.
f. Panggil method initKursi() dalam constructor Gerbong sehingga baris kode menjadi
berikut:
g. Tambahkan method info() pada class Gerbong
h. Implementasikan method untuk memasukkan penumpang sesuai dengan nomor kursi.
```java
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }  
    }

    public String getKode(){
        return kode;
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }

    public void setKode(String kode){
        this.kode = kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }
        

}
```
i. Buatlah class MainPercobaan4 yang berisi method main(). Kemudian tambahkan
baris berikut!
```java
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
```

## Pertanyaan
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam
Gerbong A ?

``Jawab``

Jumlah kursi pada gerbong A sebanyak 10 kursi

2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode
tersebut ?
...
if (this.penumpang != null) {
info += "Penumpang: " + penumpang.info() + "\n";
}
...

``Jawab``
Jika penumpang tidak sama dengan null maka info menambah penumpang bisa dilaukan dengan memanggil data diri berupa info dari class penumpang 

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi
dengan angka 1 ?

``Jawab``

Karena array dimulai dari 0 Sehingga dilakukan pengurangan untuk memasukkan data sehingga data dapat terbaca.

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru
tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang
Page 10 of 10
terjadi ?

``Jawab``

Jika kita ingin menambahkan objek budi (sebagai instance dari class Penumpang) ke dalam gerbong (sebagai instance dari class Gerbong) dengan menggunakan method setPenumpang(budi, 1), maka biasanya kita mengharapkan objek budi akan ditempatkan dalam daftar penumpang di dalam gerbong, mungkin pada posisi 1 (indeks 0)

```java
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Penumpang p1 = new Penumpang("12346", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(p1, 1);
        System.out.println(gerbong.info());
    }
}
```

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada
penumpang lain !

``Jawab``
```java
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }  
    }

    public String getKode(){
        return kode;
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public boolean setPenumpang(Penumpang penumpang, int jumlah) {
        if (jumlah >= 0 && jumlah < arrayKursi.length) {
            if (arrayKursi[jumlah] == null) {
                return true; // Penumpang berhasil ditempatkan di kursi
            } else {
                System.out.println("Maaf, kursi nomor " + jumlah + " sudah terisi.");
                return false; // Kursi sudah terisi, penumpang tidak bisa ditempatkan
            }
        } else {
            System.out.println("Maaf, kursi nomor " + jumlah + " tidak tersedia.");
            return false; // Nomor kursi tidak valid
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }
        

}
```
Program ketika dijalankan

<img src = sebelas.png>

## IV. Tugas
Berdasarkan latihan di pertemuan teori, rancang dengan class diagram, kemudian implementasikan
ke dalam program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah
dilakukan pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak
dihitung).

<img src = tigabelas.png>

### Kode Program

```java
public class Mahasiswa {
        private String nim;
        private String nama;
        private String jurusan;
        private String prodi;
    
        public Mahasiswa(){
    
        }
    
        public Mahasiswa(String nama, String nim, String jurusan, String prodi){
            this.nim = nim;
            this.nama = nama;
            this.jurusan = jurusan;
            this.prodi = prodi;
        }
    
        public String getNim(){
            return nim;
        }
        public String getNama(){
            return nama;
        }
        public String getJurusan(){
            return jurusan;
        }
        public String getProdi(){
            return prodi;
        }
    
        public void setNim(String nim){
            this.nim = nim;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public void setJurusan(String jurusan){
            this.jurusan = jurusan;
        }
        public void setProdi(String prodi){
            this.prodi = prodi;
        }

        public String info(){
            String info = "";
            info += "Nama   : " + this.nama + "\n";
            info += "NIM    : " + this.nim + "\n";
            info += "Jurusan: " + this.jurusan + "\n";
            info += "Prodi  : " + this.prodi + "\n";
            return info;
        }
            
}
```
```java
public class Dosen {
        private String nid;
        private String nama;
        private String mataKuliah;
    
        public Dosen(){
    
        }
    
        public Dosen(String nid, String nama, String mataKuliah){
            this.nid = nid;
            this.nama = nama;
            this.mataKuliah = mataKuliah;
        }
    
        public String getNid(){
            return nid;
        }
        public String getNama(){
            return nama;
        }
        public String getMataKuliah(){
            return mataKuliah;
        }

        public void setNid(String nid){
            this.nid = nid;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public void setMataKuliah(String mataKuliah){
            this.mataKuliah = mataKuliah;
        }
    
        public String info(){
            String info = "";
            info += "Nama   : " + this.nama + "\n";
            info += "NID    : " + this.nid + "\n";
            info += "Mata Kuliah : "+ this.mataKuliah + "\n";
            return info;
        }

}
```

```java
public class KursiKelas {
    private String nomor;
    private Mahasiswa mahasiswa;
    private Dosen dosen;

    public KursiKelas(String nomor){
        this.nomor = nomor;
    }

    public String getNomor(){
        return nomor;
    }
    public Mahasiswa getMahasiswa(){
        return mahasiswa;
    }
    public Dosen getDosen(){
        return dosen;
    }

    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public void setMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }
    public void setDosen(Dosen dosen){
        this.dosen = dosen;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.mahasiswa != null) {
        info += "Penumpang: " + mahasiswa.info() + "\n";
        }
        
        return info;
    }
}
```

```java
public class Kelas {
    private String kode;
    private KursiKelas[] arrayKursiKelas;

    public Kelas(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursiKelas = new KursiKelas[jumlah];
        this.initKursiKelas();
    }
    private void initKursiKelas() {
        for (int i = 0; i < arrayKursiKelas.length; i++) {
        this.arrayKursiKelas[i] = new KursiKelas(String.valueOf(i + 1));
        }  
    }

    public String getKode(){
        return kode;
    }
    public KursiKelas[] getArrayKursiKelas(){
        return arrayKursiKelas;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public boolean setMahasiswa(Mahasiswa mahasiswa, int jumlah) {
        if (jumlah >= 0 && jumlah < arrayKursiKelas.length) {
            if (arrayKursiKelas[jumlah] == null) {
                return true; // Penumpang berhasil ditempatkan di kursi
            } else {
                System.out.println("Maaf, kursi nomor " + jumlah + " sudah terisi.");
                return false; // Kursi sudah terisi, penumpang tidak bisa ditempatkan
            }
        } else {
            System.out.println("Maaf, kursi nomor " + jumlah + " tidak tersedia.");
            return false; // Nomor kursi tidak valid
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (KursiKelas kursiKelas : arrayKursiKelas) {
        info += kursiKelas.info();
        }
        return info;
    }
        

}
```
```java
public class MainTugas {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("Revaldo", "987554129", "Teknologi Informasi", "D4 Teknik Informatika");
        Dosen d = new Dosen("1112312", "Bapak Hasan", "Dasar Pemrograman");
        Kelas kelas = new Kelas("B", 10);
        kelas.setMahasiswa(m, 1);
        System.out.println(d.info());
        System.out.println(m.info());
        System.out.println(kelas.info());
    }
}
```

Jika kode dijalankan adalah sebagai berikut

<img src = empatbelas.png>
