package com.syntra.tristanbrewee.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Patient {

    private String name;
    private String ssn;
    private LocalDate dateOfBirth;

    //Constructors
    public Patient(String name, String ssn, LocalDate dateOfBirth) {
        this.name = name;
        this.ssn = ssn;
        this.dateOfBirth = dateOfBirth;
    }

    //Methods
    public int getAge(){
        Period lifeTime = Period.between(dateOfBirth, LocalDate.now());
        return lifeTime.getYears();
    }

    //Overrides
    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "SSN: " + ssn + "\n"
                + "Age: " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Patient){
            if (this.ssn.equals(((Patient) o).ssn))
                return true;
            return false;
        }
        return false;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
