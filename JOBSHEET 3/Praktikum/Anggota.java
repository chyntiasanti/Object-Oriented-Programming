public class Anggota {
    
    private String nomor;
    private String nama;
    private int simpananAnggota;

    Anggota(String nomor, String nama, int simpanAnggota){
        this.nomor = nomor;
        this.nama = nama;
        this.simpananAnggota = 0;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getLimitPinjaman(int simpan){
        simpan = 5000000;
        return simpan;
    }
    public String getNama(){
        return nama;
    }
    
    public int getJumlahPinjaman(){
        return simpananAnggota;
    }

    public void pinjam(int uang){
        if(uang > 5000000){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            simpananAnggota += uang;
            uang = simpananAnggota;
        }
    }

    public void angsur(int uang){
        if(uang < 10*uang/100){
            simpananAnggota -= uang;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
