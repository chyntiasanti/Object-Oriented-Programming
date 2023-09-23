public class Dosen {
        private String nid;
        private String nama;
        private String mataKuliah;
    
        public Dosen(){
    
        }
    
        public Dosen(String nid, String nama, String mataKuliah){
            this.nid = nid;
            this.nama = nama;
            this.mataKuliah = mataKuliah;
        }
    
        public String getNid(){
            return nid;
        }
        public String getNama(){
            return nama;
        }
        public String getMataKuliah(){
            return mataKuliah;
        }

        public void setNid(String nid){
            this.nid = nid;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public void setMataKuliah(String mataKuliah){
            this.mataKuliah = mataKuliah;
        }
    
        public String info(){
            String info = "";
            info += "Nama   : " + this.nama + "\n";
            info += "NID    : " + this.nid + "\n";
            info += "Mata Kuliah : "+ this.mataKuliah + "\n";
            return info;
        }

}
