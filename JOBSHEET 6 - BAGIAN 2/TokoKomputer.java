public class TokoKomputer {
    public static void main(String[] args) {
        Komputer K = new Komputer("Lenovo", "Intel Xeon CPU E3-1281", 410, 256);
        K.tampilData();

        Pc P = new Pc("Lenovo", "Intel Core i3-12100", 430, 256, 21);
        P.tampilPc();

        Laptop L = new Laptop("HP", "Core™ i7-1255U", 470, 256, "Baterai Sekunder");
        L.tampilLaptop();

        Mac M = new Mac("Apple MacBook Air ", "CPU 8-core", 430, 410, "Baterai Sekunder", "FileVault");
        M.tampilMac();

        Windows W = new Windows("Lenovo", "ntel® Core™ i5-12450H ", 430, 410,  "Baterai Sekunder", "Konten Web");
        W.tampilWindows();
    }
}
