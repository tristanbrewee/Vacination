package com.syntra.tristanbrewee.factories;

import com.syntra.tristanbrewee.model.CovidVaccine;
import com.syntra.tristanbrewee.model.PolioVaccine;
import com.syntra.tristanbrewee.model.StupidityVaccine;
import com.syntra.tristanbrewee.model.Vaccine;

public class VaccineFactory {

    public static Vaccine getVaccine(int choice){
        Vaccine vaccine;
        switch (choice){
            case 0:
                return new StupidityVaccine();
            case 1:
                return new PolioVaccine();
            case 2:
                return new CovidVaccine();
            default:
                System.out.println("This should not be reached...");
                return null;
        }
    }
}
