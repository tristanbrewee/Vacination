package com.syntra.tristanbrewee.generators;

import java.time.LocalDate;

public class DateGenerator {

    public static LocalDate dateOfBirthGenerator(){
        int year = (int)(Math.random() * (LocalDate.now().getYear() - (LocalDate.now().getYear() - 100)) + LocalDate.now().getYear() - 100);
        int month, day;
        if (year == LocalDate.now().getYear()){
            month = (int)(Math.random() * LocalDate.now().getMonthValue() + 1);
            if (month == LocalDate.now().getMonthValue())
                day = (int)(Math.random() * LocalDate.now().getDayOfMonth() + 1);
            else {
                day = getRandomDay(month, year);
            }
        }
        else {
            month = (int)(Math.random() * 12 + 1);
            day = getRandomDay(month, year);
        }
        return LocalDate.of(year, month, day);
    }

    private static int getRandomDay(int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return  (int)(Math.random() * 31 + 1);
            case 4:
            case 6:
            case 9:
            case 11:
                return  (int)(Math.random() * 30 + 1);
            case 2:
                if (isLeapYear(year))
                    return (int)(Math.random() * 29 + 1);
                else
                    return (int)(Math.random() * 28 + 1);
            default:
                System.out.println("This should not be reached.");
                return -1;
        }
    }

    private static boolean isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }
}
