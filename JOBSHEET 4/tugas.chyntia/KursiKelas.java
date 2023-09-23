public class KursiKelas {
    private String nomor;
    private Mahasiswa mahasiswa;
    private Dosen dosen;

    public KursiKelas(String nomor){
        this.nomor = nomor;
    }

    public String getNomor(){
        return nomor;
    }
    public Mahasiswa getMahasiswa(){
        return mahasiswa;
    }
    public Dosen getDosen(){
        return dosen;
    }

    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    public void setMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa = mahasiswa;
    }
    public void setDosen(Dosen dosen){
        this.dosen = dosen;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.mahasiswa != null) {
        info += "Penumpang: " + mahasiswa.info() + "\n";
        }
        
        return info;
    }
}
