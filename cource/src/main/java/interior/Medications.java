package interior;

import interfaces.Relatives;
import interfaces.Remedy;

public class Medications extends Wall implements Relatives, Remedy {
    private String pills;
    public String name;

    public Medications(String pills){
        this.pills = pills;
    }
    public Medications() {
    }
    public String getPills() {
        return pills;
    }

    public void setPills(int name) {
        this.name = name;
    }

    @Override
    public void HaveMedications() {
        System.out.println("You don't need buy medications if patient recovers.");
    }
}
