public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 -(sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        // Contoh pemanggilan metode totalSudut
        int hasilSudut1 = segitiga.totalSudut(90);
        System.out.println("Total Sudut segitiga 90 Derajat : " + hasilSudut1);

        int hasilSudut2 = segitiga.totalSudut(45, 60);
        System.out.println("Total Sudut (sudutA : 45, sudutB : 60): " + hasilSudut2);

        // Contoh pemanggilan metode keliling
        int hasilKeliling1 = segitiga.keliling(3, 4, 5);
        System.out.println("Keliling (sisiA : 3, sisiB : 4, sisiC : 5): " + hasilKeliling1);

        double hasilKeliling2 = segitiga.keliling(5, 12);
        System.out.println("Keliling (sisiA : 5, sisiB : 12): " + hasilKeliling2);
    }
}

