public class lingkaran {
    public double phi;
    public double r;

    public void hitungLuas() {
        double luasLingkaran = phi * r * r;
        System.out.println("Luas        :" + luasLingkaran);
    }

    public void hitungKeliling() {
        double kelilingLingkaran = phi * 2 * r * r;
        System.out.println("Keliling    :" + kelilingLingkaran);
    }

    public void tampil() {
        System.out.println("Phi         : " + phi);
        System.out.println("Jari-Jari   : " + r);

    }
}
