package assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Add implements Action {

    private static final Logger LOGGER = LoggerFactory.getLogger(Add.class);
    private static Add instance;

    public static Add getInstance() {
        if (instance == null) {
            synchronized (Add.class) {
                if (instance == null)
                    instance = new Add();
            }
        }
        return instance;
    }

    private Add() {
        LOGGER.info(getClass().getSimpleName() + " instance created!");
    }
