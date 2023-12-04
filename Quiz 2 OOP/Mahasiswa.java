public class Mahasiswa {
    private String nama;
    private String nim;
    private double[] nilai;

    // Konstruktor
    public Mahasiswa(String nama, String nim, double[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter dan Setter untuk Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk Nilai
    public double[] getNilai() {
        return nilai;
    }

    public void setNilai(double[] nilai) {
        this.nilai = nilai;
    }

    // Hitung IPK berdasarkan nilai
    public double hitungIPK() {
        if (nilai.length == 0) {
            return 0.0;
        }

        double totalNilai = 0;
        for (double nilaiMataKuliah : nilai) {
            totalNilai += nilaiMataKuliah;
        }

        return totalNilai / nilai.length;
    }

    // Overload Hitung IPK dengan versi baru yang menerima parameter nilaiSKS
    public double hitungIPK(double[] nilaiSKS) {
        if (nilai.length != nilaiSKS.length) {
            System.out.println("Jumlah nilai dan nilai SKS tidak sesuai.");
            return 0.0;
        }

        double totalBobot = 0;
        double totalSKS = 0;

        for (int i = 0; i < nilai.length; i++) {
            totalBobot += nilai[i] * nilaiSKS[i];
            totalSKS += nilaiSKS[i];
        }

        if (totalSKS == 0) {
            return 0.0;
        } else {
            return totalBobot / totalSKS;
        }
    }
}
