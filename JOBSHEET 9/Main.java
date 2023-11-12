public class Main {
    public static void main(String[] args) {
        // Objek Manusia
        Manusia manusia = new Manusia();
        System.out.println("Manusia");
        manusia.bernafas();
        manusia.makan();
        System.out.println();

        // Objek Dosen (kelas turunan Manusia)
        Dosen dosen = new Dosen();
        System.out.println("Dosen");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();
        System.out.println();

        // Objek Mahasiswa (kelas turunan Manusia)
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println("Mahasiswa");
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}