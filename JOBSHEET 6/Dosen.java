public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS;

   public Dosen(String nip, String nama, String alamat, double gaji, int jumlahSKS, int TARIF_SKS){
    super(nip, nama, alamat, gaji);
    this.jumlahSKS = jumlahSKS;
    this.TARIF_SKS = TARIF_SKS;
    
   }

   public void setJumlahSKS(int jumlahSKS) {
       this.jumlahSKS = jumlahSKS;
   }
   
   public void cetak(){
    System.out.println("---------------------------------------");
    print();
    System.out.println("Jumlah SKS   : " + jumlahSKS);
    System.out.println("Tarif SKS    : " + TARIF_SKS);
    System.out.println("---------------------------------------");
   }
}
