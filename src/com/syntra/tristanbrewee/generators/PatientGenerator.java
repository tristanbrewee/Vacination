package com.syntra.tristanbrewee.generators;

import com.syntra.tristanbrewee.model.Patient;

import java.time.LocalDate;

public class PatientGenerator {

    public static Patient generatePatient(){
        String name = NameGenerator.getRandomFullName();
        LocalDate dateOfBirth = DateGenerator.dateOfBirthGenerator();
        String ssn = SsnGenerator.getRandomSsn(dateOfBirth);
        return new Patient(name, ssn, dateOfBirth);
    }
}
