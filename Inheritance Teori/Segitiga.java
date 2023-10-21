public class Segitiga extends BangunDatar {
    private float tinggi;
    private float alas;
    private float sisi1;
    private float sisi2;

    public Segitiga(){

    }

    public Segitiga(float tinggi, float alas){
        this.tinggi = tinggi;
        this.alas = alas;
    }

    public float hitungLuas(){
        return 0.5f * alas * tinggi;
    }

    public float hitungKeliling(){
        return alas + sisi1 + sisi2;
    }

    public void cetakSet(){
        System.out.println("====== Bangun Segitiga ====== ");
        System.out.println("Alas   : " + alas );
        System.out.println("Tinggi   : " + tinggi );
        cetakHasil();
    }
}
