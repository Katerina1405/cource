package reception;

import doctors.Doctors;
import doctors.Chief;
import doctors.Others;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import patients.Sick;
import patients.GetWell;
import patients.Patients;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        LOGGER.info("Info message");
        LOGGER.error("Error message");


        Doctor name = new Chief("Jane");
        hight.OutputDoctor();

        Administrator administrator = new administrator();
        administrator.StartOfConversation();


        Patients bitumious = new Sick("Disease");
        bitumious.OutputSick();
    }
    public String input() throws MyException {
        SomeReader reader = new SomeReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

}