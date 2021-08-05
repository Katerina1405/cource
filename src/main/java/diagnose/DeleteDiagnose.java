package diagnose;

import assignment.Actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteDiagnose implements Actions {

    private static final Logger LOGGER = LoggerFactory.getLogger(DeleteDiagnoseCommand.class);
    private static DeleteDiagnose instance;

    public static DeleteDiagnose getInstance() {
        if (instance == null) {
            synchronized (DeleteDiagnose.class) {
                if (instance == null)
                    instance = new DeleteDiagnose();
            }
        }
        return instance;
    }

    public DeleteDiagnose() {
        LOGGER.info(getClass().getSimpleName() + " instance created!");
    }

