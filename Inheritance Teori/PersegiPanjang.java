public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(){

    }

    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float hitungLuas() {
        return panjang * lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void CetakPP(){
        System.out.println("====== Bangun Persegi Panjang ====== ");
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : "+ lebar);
        cetakHasil();

    }
}
