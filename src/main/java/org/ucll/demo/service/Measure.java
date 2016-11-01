package org.ucll.demo.service;

import java.time.LocalDate;

/**
 * Created by dickdijk on 26/06/16.
 */
public class Measure {

    private int length;
    private int mass;
    LocalDate meetDatum;

    public Measure(int length, int mass, LocalDate meetDatum) {
        this.length = length;
        this.mass = mass;
        this.meetDatum = meetDatum;
    }

    public int getLength() {
        return length;
    }

    public int getMass() {


        return mass;
    }

    public LocalDate getMeetDatum() {
        return meetDatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measure measure = (Measure) o;

        if (length != measure.length) return false;
        if (mass != measure.mass) return false;
        return meetDatum != null ? meetDatum.equals(measure.meetDatum) : measure.meetDatum == null;

    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + mass;
        result = 31 * result + (meetDatum != null ? meetDatum.hashCode() : 0);
        return result;
    }
}
