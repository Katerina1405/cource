package patients;

import interfaces.Relatives;

public class GetWell extends Patients implements Relatives {
    private String recovered = "Sergey, Misha, Pavel,Alina";

    public GetWell (String recovered){

        this.rocovered = recovered;
    }
    public GetWell() {
    }

    @Override
    public void OutputSick() {
        System.out.println(recovered);
    }
}

    @Override
    public void NamesForRelatives() {
        System.out.println("Patients who have recovered");
    }
}
