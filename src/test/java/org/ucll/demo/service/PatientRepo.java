package org.ucll.demo.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dickdijk on 26/06/16.
 */
public class PatientRepo {

    private static PatientRepo repo = new PatientRepo();

    private Map<Long, Patient> patients = new HashMap<>();

    private PatientRepo() {






    }

    public static PatientRepo getInstance() {
        return repo;
    }
    public  Patient getPatient(long socSecNr) {

        return patients.get(socSecNr);

    }

    public void addPatient(Patient p ) {

        patients.put(p.getSocialSecNumber(), p);
    }

    public void clear() {
        patients.clear();
    }
}
