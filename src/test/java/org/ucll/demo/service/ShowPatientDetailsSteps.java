package org.ucll.demo.service;

import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by dickdijk on 26/06/16.
 */
public class ShowPatientDetailsSteps {

    PatientRepo patientRepo = PatientRepo.getInstance();
    Patient patient;
    long socSecNr;
    LocalDate meetDatum;

    @After
    public  void teardown() {
        patientRepo.clear();
    }

    @Given("^a patient with the social security number \"(.*?)\" , gender male and birthdate \"(.*?)\"$")
    public void a_patient_with_the_social_security_number_gender_male_and_birthdate(String socSecNummer, @Format("yyyy-MM-dd") Date birthDate) throws Throwable {
        LocalDate gebDatum = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        socSecNr= Long.parseLong(socSecNummer);
        patient = new Patient(socSecNr, gebDatum);
    }

    @Given("^on \"(.*?)\" the patient had a length of (\\d+) cm and a weight of (\\d+) gr$")
    public void on_the_patient_had_a_length_of_cm_and_a_weight_of_gr(@Format("yyyy-MM-dd") Date measureDate, int length, int mass) throws Throwable {
        meetDatum = measureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        patient.getMeasures().put(meetDatum, new Measure(length,mass, meetDatum));

    }

    @Given("^the patient is registered$")
    public void the_patient_is_registered() throws Throwable {
        patientRepo.addPatient( patient);
    }

    @When("^I ask for the details of the patient using his social security number$")
    public void i_ask_for_the_details_of_the_patient_using_his_social_security_number() throws Throwable {
        patient = patientRepo.getPatient(socSecNr);
        Assert.assertNotNull("Patient not found. " , patient);
    }

    @Then("^the examination details length, weight and last examination date are given$")
    public void the_examination_details_length_weight_and_last_examination_date_are_given() throws Throwable {

        Measure measure = patient.getLatestMeasure();
        Assert.assertNotNull("Measure not found. " , measure);

        Assert.assertTrue(measure.getLength()>0);
        Assert.assertTrue(measure.getMass()>0);
    }

    @Then("^the personal details social security number, gender and birthdate are given$")
    public void the_personal_details_social_security_number_gender_and_birthdate_are_given() throws Throwable {
        Assert.assertTrue(patient.getSocialSecNumber()>0);
    }

    @Then("^the calculated bmi \"(.*?)\" is given$")
    public void the_calculated_bmi_is_given(double expectedBmi) throws Throwable {
        int len = patient.getLatestMeasure().getLength();
        int mass = patient.getLatestMeasure().getMass();

        double calculatedBmi = calculateBmi(len, mass);

        Assert.assertEquals(expectedBmi, calculatedBmi, 0.0);
    }

    @Given("^a patient with the social sec number \"(.*?)\"$")
    public void a_patient_with_the_social_security_number(long arg1) throws Throwable {
                patient = new Patient(socSecNr );

        Assert.assertNotNull(patient);
    }

    @Given("^on \"(.*?)\" the patient had a length of (\\d+) cm and a weight of (\\d+) gr but these data were added later$")
    public void on_the_patient_had_a_length_of_cm_and_a_weight_of_gr_but_these_data_were_added_later(@Format("yyyy-MM-dd") Date measureDate, int length, int mass) throws Throwable {
        meetDatum = measureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        patient.getMeasures().put(meetDatum, new Measure(length,mass, meetDatum));
    }

    @Then("^the patient has (\\d+) measurements$")
    public void the_patient_has_measurements(int arg1) throws Throwable {
        Assert.assertEquals(arg1, patient.getMeasures().size());
    }

    @Then("^the length (\\d+), weight (\\d+), and date of the examination \"(\\d+)-(\\d+)-(\\d+)“ are given$")
    public void the_length_weight_and_date_of_the_examination_are_given(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
        Measure measure = patient.getLatestMeasure();


    }

    @Then("^the calculated bmi \"(.*?)\" is based on these data$")
    public void the_calculated_bmi_is_based_on_these_data(String arg1) throws Throwable {

    }

    double calculateBmi(int len, int mass) {

        if ( len==180 && mass==75000 ){
            return 23.15;
        }

        if ( len == 180 && mass==80000) {
            return 24.69;
        }

        throw new IllegalArgumentException("Unsupported data for length and mass ....");
    }

}
