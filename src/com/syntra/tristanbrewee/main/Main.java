package com.syntra.tristanbrewee.main;

import com.syntra.tristanbrewee.factories.PatientFactory;
import com.syntra.tristanbrewee.factories.VaccineFactory;
import com.syntra.tristanbrewee.model.Patient;
import com.syntra.tristanbrewee.model.Vaccine;
import com.syntra.tristanbrewee.utils.GeneralUtils;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String input;
        boolean flag = true;
        do {
            input = JOptionPane.showInputDialog("How many patients do you want?");
            flag = !GeneralUtils.isPositiveNumber(input);
            if (flag) {
                int selected = JOptionPane.showConfirmDialog(null, "Invalid input given.\n" +
                        "Please enter a positive whole number.");
                if (selected == JOptionPane.CANCEL_OPTION || selected == JOptionPane.NO_OPTION)
                    System.exit(0);
            }
        } while (flag);
        int numOfPatients = Integer.parseInt(input);
        ArrayList<Patient> patients = getPatients(numOfPatients);
        addVaccinesAndPrintOutput(patients);
    }

    private static ArrayList<Patient> getPatients(int numOfPatients){
        ArrayList<Patient> patients = new ArrayList<>();
        for (int i = 0; i < numOfPatients; i++){
            do {
                Patient newPatient = PatientFactory.getPatient();
                if (patients.contains(newPatient))
                    continue;
                else {
                    patients.add(newPatient);
                    break;
                }
            } while (true);
        }
        return patients;
    }

    private static void addVaccinesAndPrintOutput(ArrayList<Patient> patients){
        for (Patient patient: patients) {
            int numOfVaccines = (int)(Math.random() * 3 + 1);
            ArrayList<Vaccine> vaccines = new ArrayList<>();
            for (int i = 0; i < numOfVaccines; i++){
                do {
                    int random = (int)(Math.random() * 3);
                    Vaccine newVaccine = VaccineFactory.getVaccine(random);
                    if (vaccines.contains(newVaccine))
                        continue;
                    else {
                        vaccines.add(newVaccine);
                        break;
                    }
                } while (true);
            }
            printOutput(patient, vaccines);
        }
    }

    private static void printOutput(Patient patient, ArrayList<Vaccine> vaccines){
        int count = 1;
        for (Vaccine vaccine : vaccines) {
            System.out.println("Vaccine "+count+": " + vaccine.toString());
            vaccine.administer(patient);
            System.out.println("-----");
            count++;
        }
        System.out.println();
    }
}
