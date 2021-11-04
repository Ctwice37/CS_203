package Lab_5_q4;

public class Clerk extends Employee{
    public Clerk(int employeeID, String name, String department, double salary, String position) {
        super(employeeID, name, department, salary, position);
    }
    public void addBonus(){
        this.setSalary(this.getSalary()+100);
    }
}
