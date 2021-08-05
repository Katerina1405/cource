package head;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Hospitalization implements Entity {

    private long id;
    private Date startDate;
    private Date endDate;
    private Examination initialExamination;
    private Examination dischargeExamination;
    private List<Examination> intermediateExaminations;

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

    public Examination getInitialExamination() {
        return initialExamination;
    }

    public Examination getDischargeExamination() {
        return dischargeExamination;
    }

    public List<Examination> getIntermediateExaminations() {
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

    public void setInitialExamination(Examination initialExamination) {
        this.initialExamination = initialExamination;
    }

    public void setDischargeExamination(Examination dischargeExamination) {
        this.dischargeExamination = dischargeExamination;
    }

    public void setIntermediateExaminations(List<Examination> intermediateExaminations) {
        this.intermediateExaminations = intermediateExaminations;
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, startDate, endDate, initialExamination, dischargeExamination, intermediateExaminations);
    }
}
