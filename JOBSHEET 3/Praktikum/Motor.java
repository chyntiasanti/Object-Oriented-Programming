public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(kontakOn == true){
            kecepatan += 25;
        }
        else {
            System.out.println("Kecepatan tidak bisa tertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan tidak bisa tertambah karena Mesin Off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true){
            if(kecepatan == 100){
                System.out.println("Maaf Kecepatan sudah maksimal!");
            } else {
                System.out.println("Kontak On");
            }
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}