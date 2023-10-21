import java.security.PublicKey;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Lingkaran extends BangunDatar{
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float hitungLuas() {
        return (float) (Math.PI * r * r);

    }

    public float hitungKeliling() {
        return (float) (2 * Math.PI * r);
    }

    public void cetakL(){
        System.out.println("====== Bangun Lingkaran ====== ");
        System.out.println("Jari-Jari   : " + r);
        cetakHasil();
    }
}
