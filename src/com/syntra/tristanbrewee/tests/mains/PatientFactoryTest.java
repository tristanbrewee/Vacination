package com.syntra.tristanbrewee.tests.mains;

import com.syntra.tristanbrewee.factories.PatientFactory;
import com.syntra.tristanbrewee.model.Patient;

import java.time.LocalDate;

public class PatientFactoryTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            Patient patient = PatientFactory.getPatient();
            System.out.println(patient);
            System.out.println();
        }
        System.out.println("-----");
        Patient patient = PatientFactory.getPatient("Bob Bobber", "12456789", LocalDate.now());
        System.out.println(patient);
    }
}
