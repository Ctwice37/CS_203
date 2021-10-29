package lab_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class calAge {

    int currentDateMonth;
    int currentDateDay;
    //int currentDateYear;



    int DateOfBirthMonth;
    int DateOfBirthDay;
    int DateOfBirtYear;

    public static double ageDecimal(int month, int day, int year){
        int totalDays = 0;
        double ageYears = 0;

        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (month == 1)
            totalDays = day;
        else if (month ==2)
            totalDays = 31 + day;
        else {

            for (int i = 0; i < month - 1; i++) {
                totalDays += months[i];
            } totalDays += day;
        }
        System.out.println(totalDays);
        ageYears = 2021 - year;
        double decimal = totalDays/365;

        return ageYears + decimal;


    }

//    public void setCurrentDate(int currentDate) {
//        this.currentDate = currentDate;
//    }
//
//    public void setDateOfBirth(int dateOfBirth) {
//        DateOfBirth = dateOfBirth;
//    }
//
//    public static boolean validateAge(int month, int day) {
//        switch (month) {
//
//            case 1:
//            case 3:
//            case 7:
//            case 8:
//            case 5:
//            case 10:
//            case 12: {
//                if (day > 31)
//                    System.out.println("invalid");
//                else
//                    return true;
//                break;
//
//            }
//            case 2: {
//                if (day > 29)
//                    System.out.println("invalid");
//                else
//                    return true;
//                break;
//
//            }
//            case 4:
//            case 6:
//            case 9:
//            case 11: {
//                if (day > 30)
//                    System.out.println("invalid");
//                else
//                    return true;
//                break;
//
//            }
//
//
//        } return false;
//
//
//    }


    public static void main(String[] args) {

        System.out.println(ageDecimal(7,3,1991));


    }


}
