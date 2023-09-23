public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(){

    }

    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp(){
        return ktp;
    }
    public String getNama(){
        return nama;
    }

    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String info(){
        String info = "";
        info += "Nama   : " + this.nama + "\n";
        info += "No KTP : " + this.ktp + "\n";
        return info;
    }
        
}