package com.syntra.tristanbrewee.utils;

public class GeneralUtils {

    public static boolean isPositiveNumber(String input){
        try {
            int number = Integer.parseInt(input);
            if (number > 0)
                return true;
            return false;
        }
        catch (Exception e){
            return false;
        }
    }
}
