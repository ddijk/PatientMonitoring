package org.ucll.demo.service;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * Created by dickdijk on 26/06/16.
 */
public class PatientTest {
    @Test
    public void getLatestMeasure() throws Exception {

        Patient p = new Patient(0L, null);

        LocalDate d1 = LocalDate.of(2016, 5, 5);
        Measure m1 = new Measure(10, 11, d1);
        LocalDate d2 = LocalDate.of(2016, 7, 5);
        Measure m2 = new Measure(10, 11, d2);
        LocalDate d3 = LocalDate.of(2016, 6, 5);
        Measure m3 = new Measure(10, 11, d3);
        p.getMeasures().put(d1, m1);
        p.getMeasures().put(d2, m2);
        p.getMeasures().put(d3, m3);


        Assert.assertEquals(m2, p.getLatestMeasure());

    }

}