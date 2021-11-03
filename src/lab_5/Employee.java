package lab_5;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    private String position;


    public Employee(int employeeID, String name, String department, double salary, String position) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.position = position;
    }

    public void addBonus(){
        this.salary+=200;
    }

    @Override
    public boolean equals(Object obj) {
        return position.equals(this.position);
    }

    public void printEmployeeDetails(){
        System.out.println("Employee id:" + employeeID +
                "\nname" + name +
                "\ndepartment" + department +
                "\nsalary + bonus:" + salary +
                "\nposition:" + position);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
