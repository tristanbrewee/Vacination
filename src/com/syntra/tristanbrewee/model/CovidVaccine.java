package com.syntra.tristanbrewee.model;

public class CovidVaccine extends Vaccine{
    @Override
    protected void performAftercare() {
        System.out.println("\t\tAftercare:");
        System.out.println("\t\t\tPatient has waited for twenty minutes before going home.");
    }

    @Override
    protected void administerVaccine() {
        System.out.println("\t\tAdminister:");
        System.out.println("\t\t\tPatient has been injected in the but.");
    }

    @Override
    protected void prepare() {
        System.out.println("\t\tPrepare:");
        System.out.println("\t\t\tVaccine has been defrosted.");
        System.out.println("\t\t\tNeedle has been filled with the vaccine.");
    }

    @Override
    protected void inform() {
        System.out.println("\t\tInform:");
        System.out.println("\t\t\tPatient has received a phone call about the vaccine.");
    }

    @Override
    protected void register(Patient patient) {
        System.out.println("\tPatient: " + patient.getName());
        System.out.println("\tAge: " + patient.getAge());
        System.out.println("\tSSN: " + patient.getSsn());
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof CovidVaccine)
            return true;
        return false;
    }

    @Override
    public String toString(){
        return "Covid Vaccine";
    }
}
