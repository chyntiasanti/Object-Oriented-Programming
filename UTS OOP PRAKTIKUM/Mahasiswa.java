import java.security.PublicKey;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    public Mahasiswa(){

    }

    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public void print(){
        System.out.println("NIM            : " +nim);  
        System.out.println("Nama           : " +nama);
        System.out.println("Alamat         : " +alamat);
        System.out.println("Jenis Kelamnin : " +jenisKelamin);
    }
}
