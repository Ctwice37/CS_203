package lab_1;

import javax.swing.*;
import java.util.Scanner;

public class Student {
    private int quiz1;
    private int quiz2;
    private int quiz3;

    private int midtermExam;

    private int finalExam;

    public void reportCard(){
        int grade = grading();

        if (grade >= 90)
            System.out.println("Score: " + grade + "\nFinal Grade: A");
            else if (grade >= 80 && grade < 90)
            System.out.println("Score: " + grade + "\nFinal Grade: B");
            else if (grade >= 70 && grade < 80)
            System.out.println("Score: " + grade + "\nFinal Grade: C");
                    else if (grade >= 60 && grade < 70)
            System.out.println("Score: " + grade + "\nFinal Grade: D");
                        else
            System.out.println("Score: " + grade + "\nFinal Grade: F");





    }

    public int grading(){
        double quizzesScore;
        double midtermScore;
        double finalExamScore;

        Scanner input = new Scanner(System.in);
        System.out.println("Quiz 1 Score: ");
        this.quiz1 = input.nextInt();
        System.out.println("Quiz 2 Score: ");
        this.quiz2 = input.nextInt();
        System.out.println("Quiz 3 Score: ");
        this.quiz3 = input.nextInt();

        System.out.println("MidTerm Score");
        this.midtermExam = input.nextInt();

        System.out.println("Final Exam Score");
        this.finalExam = input.nextInt();


        quizzesScore = .25 * ((float)(quiz3 + quiz2 + quiz1) / 30) * 100;

        midtermScore = .35 * ((float)midtermExam/100) * 100;

        finalExamScore = .40 * ((float)finalExam/100) * 100;


        return (int)(quizzesScore + midtermScore + finalExamScore);




    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.reportCard();
    }

}
