package com.syntra.tristanbrewee.model;

public abstract class Vaccine {

    public Vaccine() {
    }

    public final void administer(Patient patient){
        register(patient);
        System.out.println("\tProceudre:");
        inform();
        prepare();
        administerVaccine();
        performAftercare();
    }

    protected abstract void performAftercare();

    protected abstract void administerVaccine();

    protected abstract void prepare();

    protected abstract void inform();

    protected abstract void register(Patient patient);
}
