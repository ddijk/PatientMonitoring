package org.ucll.demo.service;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by dickdijk on 26/06/16.
 */
public class Patient {


    LocalDate birthDate;
    long socialSecNumber;

    Gender gender;

    Map<LocalDate, Measure> measures = new HashMap<>();

    public Patient(long socialSecNumber) {
        this.socialSecNumber = socialSecNumber;
    }

    public Patient(long l, LocalDate birthData) {
        socialSecNumber = l;
        this.birthDate = birthData;
    }

    public long getSocialSecNumber() {
        return socialSecNumber;
    }

    public void setSocialSecNumber(int socialSecNumber) {
        this.socialSecNumber = socialSecNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {

        this.gender = gender;
    }

    public Map<LocalDate,Measure> getMeasures() {
        return measures;
    }

    public Measure getLatestMeasure() {
        Measure latestMeasure = measures.values().stream().max(Comparator.comparing(Measure::getMeetDatum)).orElse(null);
        return latestMeasure;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
