package assignment;

public class PatientAssignment implements Actions {

    private static final Logger LOGGER = LoggerFactory.getLogger(ViewPatientAssignmentsCommand.class);
    private static PatientAssignment instance;

    public static PatientAssignment getInstance() {
        if (instance == null) {
            synchronized (PatientAssignment.class) {
                if (instance == null)
                    instance = new PatientAssignment();
            }
        }
        return instance;
    }

    private PatientAssignment() {
        LOGGER.info(getClass().getSimpleName() + " instance created!");
    }

