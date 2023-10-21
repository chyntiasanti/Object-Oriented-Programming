public class Pegawai extends DaftarGaji{
    private String nip;
    private String nama;
    private String alamat;
    private double gaji;

    public Pegawai(String nip, String nama, String alamat, double gaji){
        super(0);
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }
    public double getGaji() {
        return gaji;
    }

    public void print(){
        System.out.println("NIP          : " + nip);
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " +alamat);
        System.out.println("Gaji         : " +gaji);
    }
}
