public class PercobaanTugas {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("26354172819", "Budi Handoko", "Jalan Paku Sari", 1000000, 2, 25000);
        Dosen dosen2 = new Dosen("26376524738", "Ayu Wiranda", "Jalan Sehat Sentosa", 1500000, 4, 25000);
        Dosen dosen3 = new Dosen("26394763948", "Ayu Wiranda", "Jalan Sumenep", 150000, 6, 25000);

        System.out.println("Data Pertama");
        dosen1.cetak();
        System.out.println("Data Kedua");
        dosen2.cetak();
        System.out.println("Data Ketiga");
        dosen3.cetak();
    }
}
