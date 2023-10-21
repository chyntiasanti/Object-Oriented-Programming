public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki-Laki", 20, 2000000, 250000, 2000000, "2A", 1000000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 100000, 1000000, 50000, 1000);
        SH.tampilStaffHarian();
    }
}
