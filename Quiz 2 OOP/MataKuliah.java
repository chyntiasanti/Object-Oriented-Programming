public class MataKuliah {
    private String namaMataKuliah;
    private int sks;
    private double[] nilaiMahasiswa;
    private int jumlahMahasiswa;

    // Konstruktor
    public MataKuliah(String namaMataKuliah, int sks, int maxMahasiswa) {
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.nilaiMahasiswa = new double[maxMahasiswa];
        this.jumlahMahasiswa = 0;
    }

    // Getter dan Setter untuk Nama Mata Kuliah
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    // Getter dan Setter untuk SKS
    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    // Getter dan Setter untuk Nilai Mahasiswa
    public double[] getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    public void setNilaiMahasiswa(double[] nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    // Getter dan Setter untuk Jumlah Mahasiswa
    public int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int jumlahMahasiswa) {
        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    // Metode untuk menambahkan nilai mahasiswa
    public void tambahNilaiMahasiswa(double nilai) {
        if (jumlahMahasiswa < nilaiMahasiswa.length) {
            this.nilaiMahasiswa[jumlahMahasiswa] = nilai;
            jumlahMahasiswa++;
        } else {
            System.out.println("Batas maksimum mahasiswa untuk mata kuliah ini telah tercapai.");
        }
    }

    // Metode hitung bobot mata kuliah berdasarkan nilai mahasiswa
    public double hitungBobot() {
        if (jumlahMahasiswa == 0) {
            return 0.0;
        }

        double totalNilai = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalNilai += nilaiMahasiswa[i];
        }

        return totalNilai / jumlahMahasiswa;
    }

    // Overload metode hitung bobot dengan versi baru yang menerima parameter bobot mahasiswa
    public double hitungBobot(double[] bobotMahasiswa) {
        if (jumlahMahasiswa != bobotMahasiswa.length) {
            System.out.println("Jumlah nilai dan bobot mahasiswa tidak sesuai.");
            return 0.0;
        }

        double totalBobot = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            totalBobot += nilaiMahasiswa[i] * bobotMahasiswa[i];
        }

        return totalBobot / jumlahMahasiswa;
    }

    // Metode untuk representasi string objek
    @Override
    public String toString() {
        return "MataKuliah [namaMataKuliah=" + namaMataKuliah + ", sks=" + sks + "]";
    }
}
