public class StaffTetap extends Staff {
    public String golongan;
    public int asuransi;

    public StaffTetap(){

    }
    public StaffTetap(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap(){
        System.out.println("================== Data Staff Tetap =====================");
        super.tampilDataStaff();
    }
}
