package lab_5;

public class Clerk extends Employee{
    public Clerk(int employeeID, String name, String department, double salary, String position) {
        super(employeeID, name, department, salary, position);
    }
    public void addBonus(){
        double salary = super.getSalary();
        salary += 100;
    }
}
