public class Laptop extends Komputer {
    public String jnsBatre;
    
     public Laptop(){
    
        }
        public Laptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatre){
            super(merk, jnsProsesor, kecProsesor, sizeMemory);
            this.jnsBatre = jnsBatre;
        }
    
        public void tampilLaptop(){
            System.out.println("========= Spesifikasi Laptop =========");
            super.tampilData();
            System.out.println("Jenis Batre : " +jnsBatre);
        }
    
}
