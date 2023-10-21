public class Windows extends Laptop {
    String fitur;

    public Windows(){

    }
    public Windows(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatre, String fitur){
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatre);
        this.fitur = fitur;
    }

    public void tampilWindows(){
        System.out.println("=============== Windows ================");
        super.tampilLaptop();
        System.out.println("Fitur : " +fitur);
    }
}
