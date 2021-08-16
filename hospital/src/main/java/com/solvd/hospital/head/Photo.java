package head;

import com.solvd.hospital.general.Entity;

import java.util.Objects;

public class Photo implements Entity {

    private long id;
    private String name;

    public Photo() {
    }

    public Photo(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, name);
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

    @Override
    public void setHomePatient(String name) {

    }

    @Override
    public void setVisitingPatient(String name) {

    }
}
