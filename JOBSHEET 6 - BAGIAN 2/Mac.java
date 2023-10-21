public class Mac extends Laptop {
    public String security;
    public Mac(){

    }
    public Mac(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatre, String security){
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatre);
        this.security = security;
    }

    public void tampilMac(){
        System.out.println("=============== MAC ================");
        super.tampilLaptop();
        System.out.println("Security : " +security);
    }
    
}
