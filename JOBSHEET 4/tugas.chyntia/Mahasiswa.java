public class Mahasiswa {
        private String nim;
        private String nama;
        private String jurusan;
        private String prodi;
    
        public Mahasiswa(){
    
        }
    
        public Mahasiswa(String nama, String nim, String jurusan, String prodi){
            this.nim = nim;
            this.nama = nama;
            this.jurusan = jurusan;
            this.prodi = prodi;
        }
    
        public String getNim(){
            return nim;
        }
        public String getNama(){
            return nama;
        }
        public String getJurusan(){
            return jurusan;
        }
        public String getProdi(){
            return prodi;
        }
    
        public void setNim(String nim){
            this.nim = nim;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public void setJurusan(String jurusan){
            this.jurusan = jurusan;
        }
        public void setProdi(String prodi){
            this.prodi = prodi;
        }

        public String info(){
            String info = "";
            info += "Nama   : " + this.nama + "\n";
            info += "NIM    : " + this.nim + "\n";
            info += "Jurusan: " + this.jurusan + "\n";
            info += "Prodi  : " + this.prodi + "\n";
            return info;
        }
            
}
