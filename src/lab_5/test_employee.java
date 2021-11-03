package lab_5;

public class test_employee {
    public static void main(String[] args) {
        Manager m1 = new Manager(1, "John", "Accounting", 50000, "Supervisor");
        Manager m2 = new Manager(2, "Fred", "Accounting", 50000, "Associate");
        Clerk c1 = new Clerk(3, "Penelope", "Marketing", 80000, "Supervisor");
        Clerk c2 = new Clerk(4, "Julia", "Marketing", 100000, "COO");

        m1.printEmployeeDetails();
        m1.addBonus();
        m1.printEmployeeDetails();

    }
}
