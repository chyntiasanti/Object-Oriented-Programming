public class Processor{
private String merk;
private double cache;
    public Processor(){

    }

    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Getter untuk cache
    public double getCache() {
        return cache;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Setter untuk cache
    public void setCache(int cache) {
        this.cache = cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Chace Memory = %.2f\n", cache);
    }

}
