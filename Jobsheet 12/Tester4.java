public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); // Pay For Electricity bill
        System.out.println("-------------------------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); // Pay for permanent employee
        System.out.println("-------------------------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showEmployee(iEmp); // Show permanent employee info
        System.out.println("-------------------------------------------------");
        ow.showEmployee(iEmp); // Show Intership employee info
    }
}
