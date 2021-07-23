package doctors;

import interfaces.TheHead;

public class Chief extends Doctors implements TheHead {
    private String headOfTheHospital = "Jane";

    public Chief (String headOfTheHospital){

        this.headOfTheHospital = headOfTheHospital;
    }
    public Chief() {
    }

    @Override
    public void OutputChief() {
        System.out.println(headOfTheHospital);
    }

    @Override
    public void OutTheHead() {
        System.out.println("This is the head of the hospital.");
    }
}
