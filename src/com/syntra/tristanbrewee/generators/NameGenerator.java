package com.syntra.tristanbrewee.generators;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NameGenerator {

    private static ArrayList<String> firstNames = new ArrayList<>();
    private static ArrayList<String> lastNames = new ArrayList<>();
    private static String firstNamesPath = "src/com/syntra/tristanbrewee/resources/firstNames.txt";
    private static String lastNamesPath = "src/com/syntra/tristanbrewee/resources/lastNames.txt";

    public static String getRandomFullName(){
        return getRandomFirstName() + " " + getRandomLastName();
    }

    private static String getRandomFirstName(){
        if (firstNames.isEmpty()){
            fillList(firstNamesPath, firstNames);
        }
        return firstNames.get((int)(Math.random()*firstNames.size()));
    }

    private static String getRandomLastName(){
        if (lastNames.isEmpty()){
            fillList(lastNamesPath, lastNames);
        }
        return lastNames.get((int)(Math.random()*lastNames.size()));
    }

    private static void fillList(String path, ArrayList<String> destination){
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)){
            scanner.useDelimiter(";");
            while (scanner.hasNext()){
                destination.add(scanner.next());
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
