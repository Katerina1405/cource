package com.solvd.hospital.head;


import com.solvd.hospital.general.Entity;

public class Assignment implements Entity {
    private long id;
    private String description;
    private head.Patient doctor;
    private head.Patient executor;
    private head.Examination examination;

    public Assignment() {
    }

    public Assignment(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


    public head.Patient getDoctor() {
        return doctor;
    }

    public head.Patient getExecutor() {
        return executor;
    }

    public head.Examination getExamination() {
        return examination;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setDoctor(head.Patient doctor) {
        this.doctor = doctor;
    }

    public void setExecutor(head.Patient executor) {
        this.executor = executor;
    }

    public void setExamination(head.Examination examination) {
        this.examination = examination;
    }



    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", doctor=" + doctor +
                ", executor=" + executor +
                ", examination=" + examination +
                '}';
    }
}

