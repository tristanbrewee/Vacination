package com.syntra.tristanbrewee.model;

public class PolioVaccine extends Vaccine{
    @Override
    protected void performAftercare() {
        System.out.println("\t\tAftercare:");
        System.out.println("\t\t\tThe baby has been soothed by the mother.");
    }

    @Override
    protected void administerVaccine() {
        System.out.println("\t\tAdminister:");
        System.out.println("\t\t\tThe vaccine has been injected in the child's left arm.");
    }

    @Override
    protected void prepare() {
        System.out.println("\t\tPrepare:");
        System.out.println("\t\t\tThe child has been changed.");
        System.out.println("\t\t\tThe child has been washed.");
        System.out.println("\t\t\tThe needle has been filled with the vaccine.");
        System.out.println("\t\t\tThe mother is present to sooth the baby after the vaccine.");
    }

    @Override
    protected void inform() {
        System.out.println("\t\tInform:");
        System.out.println("\t\t\tParents have been notified by the doctor about (mandatory) the vaccine.");
    }

    @Override
    protected void register(Patient patient) {
        System.out.println("\tPatient: " + patient.getName());
        System.out.println("\tAge: " + patient.getAge());
        System.out.println("\tSSN: " + patient.getSsn());
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof PolioVaccine)
            return true;
        return false;
    }

    @Override
    public String toString(){
        return "Polio Vaccine";
    }
}
