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
