package patients;

public class Sick extends Patients {
    private String people = "Olena, Rita, Masha, Alex";

    public Information (String people){

        this.people = people;
    }
    public People() {
    }

    @Override
    public void OutputSick() {
        System.out.println(people);
    }
}
