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
