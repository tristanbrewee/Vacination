package com.syntra.tristanbrewee.generators;

import java.time.LocalDate;

public class SsnGenerator {

    public static String getRandomSsn(LocalDate dateOfBirth){
        StringBuilder ssnStringBuilder = new StringBuilder();
        String year = String.valueOf(dateOfBirth.getYear());
        if (year.length() > 1)
            ssnStringBuilder.append(year.substring(year.length() - 2));
        else
            ssnStringBuilder.append("0").append(year);
        ssnStringBuilder.append(".");
        String month = String.valueOf(dateOfBirth.getMonthValue());
        if (month.length() == 2)
            ssnStringBuilder.append(month);
        else
            ssnStringBuilder.append("0").append(month);
        ssnStringBuilder.append(".");
        String day = String.valueOf(dateOfBirth.getDayOfMonth());
        if (day.length() == 2)
            ssnStringBuilder.append(day);
        else
            ssnStringBuilder.append("0").append(day);
        ssnStringBuilder.append("-");
        int firstNumber = (int)(Math.random() * 1000);
        String firstNumberAsString = String.valueOf(firstNumber);
        if (firstNumberAsString.length() == 3)
            ssnStringBuilder.append(firstNumberAsString);
        else if (firstNumberAsString.length() == 2)
            ssnStringBuilder.append("0").append(firstNumberAsString);
        else
            ssnStringBuilder.append("00").append(firstNumberAsString);
        ssnStringBuilder.append(".");
        int secondNumber = (int)(Math.random() * 100);
        String secondNumberAsString = String.valueOf(secondNumber);
        if (secondNumberAsString.length() == 2)
            ssnStringBuilder.append(secondNumberAsString);
        else
            ssnStringBuilder.append("0").append(secondNumberAsString);
        return ssnStringBuilder.toString();
    }
}
