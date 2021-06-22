package com.syntra.tristanbrewee.factories;

import com.syntra.tristanbrewee.generators.PatientGenerator;
import com.syntra.tristanbrewee.model.Patient;

import java.time.LocalDate;

public class PatientFactory {

    public static Patient getPatient(){
        return PatientGenerator.generatePatient();
    }

    public static Patient getPatient(String name, String ssn, LocalDate dateOfBirth){
        return new Patient(name, ssn, dateOfBirth);
    }
}
