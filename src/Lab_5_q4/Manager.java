package Lab_5_q4;

public class Manager extends Employee{
    public Manager(int employeeID, String name, String department, double salary, String position) {
        super(employeeID, name, department, salary, position);
    }

    @Override
    public void addBonus() {
        this.setSalary(this.getSalary()+300);


    }
}

