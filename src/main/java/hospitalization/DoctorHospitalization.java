package hospitalization;

import assignment.Actions;

public class DoctorHospitalization implements Actions {
    private static DoctorHospitalization instance;

    public static DoctorHospitalization getInstance() {
        if (instance == null) {
            synchronized (DoctorHospitalization.class) {
                if (instance == null)
                    instance = new DoctorHospitalization();
            }
        }
        return instance;
    }

    private DoctorHospitalization() {
    }


