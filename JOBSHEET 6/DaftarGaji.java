public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;

    public DaftarGaji(int ukuran) {
        listPegawai = new Pegawai[ukuran];
        jumlahPegawai = 0;
    }

    public void tambahPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar gaji penuh. Tidak bisa menambahkan pegawai lagi.");
        }
    }

    public void cetakSemuaGaji() {
        for (int i = 0; i < jumlahPegawai; i++) {
            listPegawai[i].getGaji();
        }
    }
}
