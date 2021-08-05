package diagnose;

public class ViewDiagnose implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViewDiagnosesCommand.class);
    private static ViewDiagnose instance;

    public static ViewDiagnose getInstance() {
        if (instance == null) {
            synchronized (ViewDiagnose.class) {
                if (instance == null)
                    instance = new ViewDiagnose();
            }
        }
        return instance;
    }

    private ViewDiagnose() {
        LOGGER.info(getClass().getSimpleName() + " instance created!");
    }

