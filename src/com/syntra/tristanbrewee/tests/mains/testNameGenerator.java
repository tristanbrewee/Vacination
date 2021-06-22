package com.syntra.tristanbrewee.tests.mains;

import com.syntra.tristanbrewee.generators.NameGenerator;

public class testNameGenerator {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++){
            System.out.println(NameGenerator.getRandomFullName());
        }
    }
}
