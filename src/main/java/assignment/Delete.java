package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Delete implements Actions {

    private static final Logger LOGGER = LoggerFactory.getLogger(Delete.class);
    private static Delete instance;

    public static Delete getInstance() {
        if (instance == null) {
            synchronized (Delete.class) {
                if (instance == null)
                    instance = new Delete();
            }
        }
        return instance;
    }

    private Delete() {
        LOGGER.info(getClass().getSimpleName() + " instance created!");
    }

