package hospitalization;

import assignment.Actions;

import java.util.List;

public class NewHospitalization implements Actions {

    private static NewHospitalization instance;

    public static NewHospitalization getInstance() {
        if (instance == null) {
            synchronized (NewHospitalization.class) {
                if (instance == null)
                    instance = new NewHospitalization();
            }
        }
        return instance;
    }

