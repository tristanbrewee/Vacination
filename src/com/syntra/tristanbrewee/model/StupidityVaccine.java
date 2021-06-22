package com.syntra.tristanbrewee.model;

public class StupidityVaccine extends Vaccine{


    @Override
    protected void performAftercare() {
        System.out.println("\t\tAftercare:");
        System.out.println("\t\t\tPatient has been checked for intelligence improvements.");
        System.out.println("\t\t\tNo luck. The patient is still stupid...");
    }

    @Override
    protected void administerVaccine() {
        System.out.println("\t\tAdminister:");
        System.out.println("\t\t\tGlass of water (Placebo) has been drunk.");
    }

    @Override
    protected void prepare() {
        System.out.println("\t\tPrepare:");
        System.out.println("\t\t\tPatient has done five barrel rolls.");
        System.out.println("\t\t\tPatient has sung The National Anthem.");
        System.out.println("\t\t\tPatient has tried not to blink for five minutes.");
        System.out.println("\t\t\tDear God this patient is stupid...");
    }

    @Override
    protected void inform() {
        System.out.println("\t\tInform:");
        System.out.println("\t\t\tAn invitation was sent.");
        System.out.println("\t\t\tLet's hope they're smart enough to read it...");
    }

    @Override
    protected void register(Patient patient) {
        System.out.println("\tPatient: " + patient.getName());
        System.out.println("\tAge: " + patient.getAge());
        System.out.println("\tSSN: " + patient.getSsn());
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof StupidityVaccine)
            return true;
        return false;
    }

    @Override
    public String toString(){
        return "Stupidity Vaccine";
    }
}
