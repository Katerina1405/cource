package head;

import java.sql.Date;
import java.util.Objects;

public class Assignment implements Entity {
    private long id;
    private String description;
    private Patient doctor;
    private Patient executor;
    private Date startDate;
    private Date endDate;
    private Examination examination;

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


    public Patient getDoctor() {
        return doctor;
    }

    public Patient getExecutor() {
        return executor;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Examination getExamination() {
        return examination;
    }

    public void setId(long id) {
        this.id = id;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public void setDoctor(Patient doctor) {
        this.doctor = doctor;
    }

    public void setExecutor(Patient executor) {
        this.executor = executor;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setExamination(Examination examination) {
        this.examination = examination;
    }



    @Override
    public int hashCode() {

        return Objects.hash(id, description, startDate, endDate, doctor, executor);
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", doctor=" + doctor +
                ", executor=" + executor +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", examination=" + examination +
                '}';
    }
}

