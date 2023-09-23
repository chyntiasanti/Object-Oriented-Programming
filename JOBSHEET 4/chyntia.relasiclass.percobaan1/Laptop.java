public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }

     // Getter untuk merk
     public String getMerk() {
        return merk;
    }

    // Getter untuk Processor 
    public Processor getProc() {
        return proc;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk Processor
    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}
