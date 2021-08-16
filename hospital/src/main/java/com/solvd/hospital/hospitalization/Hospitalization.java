package com.solvd.hospital.hospitalization;

import com.solvd.hospital.general.Entity;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Hospitalization implements Entity {

    private long id;
    private Date startDate;
    private Date endDate;
    private head.Examination initialExamination;
    private head.Examination dischargeExamination;
    private List<head.Examination> intermediateExaminations;

    public Hospitalization() {
    }

    public Hospitalization(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public head.Examination getInitialExamination() {
        return initialExamination;
    }

    public head.Examination getDischargeExamination() {
        return dischargeExamination;
    }

    public List<head.Examination> getIntermediateExaminations() {
        return intermediateExaminations;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setInitialExamination(head.Examination initialExamination) {
        this.initialExamination = initialExamination;
    }

    public void setDischargeExamination(head.Examination dischargeExamination) {
        this.dischargeExamination = dischargeExamination;
    }

    public void setIntermediateExaminations(List<head.Examination> intermediateExaminations) {
        this.intermediateExaminations = intermediateExaminations;
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, startDate, endDate, initialExamination, dischargeExamination, intermediateExaminations);
    }

    @Override
    public void setHomePatient(String name) {

    }

    @Override
    public void setVisitingPatient(String name) {

    }

    @Override
    public void homePatientData(int points) {

    }

    @Override
    public void visitingPatientData(int points) {

    }

    @Override
    public void PatientCard(String data) {

    }
}
