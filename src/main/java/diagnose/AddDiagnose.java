package diagnose;


import assignment.Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddDiagnose implements Action {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddDiagnose.class);
    private static AddDiagnose instance;

    public static AddDiagnose getInstance() {
        if (instance == null) {
            synchronized (AddDiagnose.class) {
                if (instance == null)
                    instance = new AddDiagnose();
            }
        }
        return instance;
    }

    private AddDiagnose() {
        LOGGER.info(getClass().getSimpleName() + " instance created!");
    }
