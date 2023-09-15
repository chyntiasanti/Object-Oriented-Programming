public class game {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int waktu;

    public void totalHarga(){
        int total = harga*waktu;
        System.out.println("Total yang harus dibayarkan : ");
    }

    public void tampilData(){
        System.out.println("ID            : " +id);
        System.out.println("Nama Member   : " +namaMember);
        System.out.println("Nama Game     : " +namaGame);
        System.out.println("Harga         : " +harga);
        System.out.println("Waktu         : " +waktu + " jam");
        
    }
}
