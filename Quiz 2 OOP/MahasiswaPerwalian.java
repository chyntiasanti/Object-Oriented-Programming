public class MahasiswaPerwalian extends Mahasiswa {
    private MataKuliah[] mataKuliahArray;
    private int jumlahMataKuliah;

    public MahasiswaPerwalian(String nama, String nim, double[] nilai, int maxMataKuliah) {
        super(nama, nim, nilai);
        this.mataKuliahArray = new MataKuliah[maxMataKuliah];
        this.jumlahMataKuliah = 0;
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        if (jumlahMataKuliah < mataKuliahArray.length) {
            mataKuliahArray[jumlahMataKuliah] = mataKuliah;
            jumlahMataKuliah++;
        } else {
            System.out.println("Batas maksimum mata kuliah dalam perwalian telah tercapai.");
        }
    }

    @Override
    public double hitungIPK() {
        if (jumlahMataKuliah == 0) {
            return super.hitungIPK();
        }

        double totalBobot = 0;
        double totalSKS = 0;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalBobot += mataKuliahArray[i].hitungBobot();
            totalSKS += mataKuliahArray[i].getSks();
        }

        if (totalSKS == 0) {
            return super.hitungIPK();
        } else {
            return totalBobot / totalSKS;
        }
    }

    @Override
    public String toString() {
        return "MahasiswaPerwalian [nama=" + getNama() + ", nim=" + getNim() + "]";
    }
}
