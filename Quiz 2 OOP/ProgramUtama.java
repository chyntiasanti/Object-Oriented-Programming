public class ProgramUtama {
    public static void main(String[] args) {
        // Membuat objek mahasiswa perwalian
        MahasiswaPerwalian mahasiswa1 = new MahasiswaPerwalian("Chyntia Santi Nur Trisnawati", "123456", new double[]{80, 85, 90}, 5);
        MahasiswaPerwalian mahasiswa2 = new MahasiswaPerwalian("Reyhan Iqbal", "789012", new double[]{75, 88, 92}, 5);

        // Membuat objek mata kuliah
        MataKuliah mataKuliah1 = new MataKuliah("Pemrograman Java", 3, 10);
        MataKuliah mataKuliah2 = new MataKuliah("Basis Data", 4, 10);

        // Menambahkan mahasiswa dan mata kuliah ke perwalian
        mahasiswa1.tambahMataKuliah(mataKuliah1);
        mahasiswa2.tambahMataKuliah(mataKuliah2);

        // Menambahkan nilai mahasiswa ke objek mata kuliah
        mataKuliah1.tambahNilaiMahasiswa(75);
        mataKuliah1.tambahNilaiMahasiswa(88);
        mataKuliah1.tambahNilaiMahasiswa(90);

        mataKuliah2.tambahNilaiMahasiswa(85);
        mataKuliah2.tambahNilaiMahasiswa(78);
        mataKuliah2.tambahNilaiMahasiswa(92);

        // Cetak hasil perwalian
        System.out.println("Data Perwalian:");
        System.out.println("-----------------");

        System.out.println("Mahasiswa 1: " + mahasiswa1.getNama());
        System.out.println("IPK Mahasiswa 1: " + mahasiswa1.hitungIPK());
        System.out.println("-----------------");

        System.out.println("Mahasiswa 2: " + mahasiswa2.getNama());
        System.out.println("IPK Mahasiswa 2: " + mahasiswa2.hitungIPK());
        System.out.println("-----------------");

        System.out.println("Bobot Mata Kuliah 1: " + mataKuliah1.hitungBobot());
        System.out.println("Bobot Mata Kuliah 2: " + mataKuliah2.hitungBobot());
    }
}
