package lab_4;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    private String lastName;
    private int idNumber;

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;


    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


//    @Override
//    public int compareTo(Student o) {
//        return idNumber - o.idNumber;
//    }


    @Override
    public int compareTo(Student o) {
        return lastName.compareTo(o.lastName);
    }


    @Override
    public String toString() {
        return "LastName: " + this.lastName + " -- ID Number:" +idNumber;
    }


    public static void main(String[] args) {
        Student s1 = new Student("Carpenter", 3);
        Student s2 = new Student("Zebra", 4);
        Student s3 = new Student("Karen", 8);
        Student s4 = new Student("Birch", 1);
        Student s5 = new Student("Coby", 11);



        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        Collections.sort(students);
        for(Student s : students)
            System.out.println(s);
    }

}
