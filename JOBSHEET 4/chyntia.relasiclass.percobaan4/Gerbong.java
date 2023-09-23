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
