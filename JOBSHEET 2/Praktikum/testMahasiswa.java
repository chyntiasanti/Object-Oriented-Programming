public class testMahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        System.out.println(" ");

        mahasiswa mhs2 = new mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Reyhan";
        mhs2.alamat = "Jl. Mekar Jaya No 1A";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();
        ;

    }
}
