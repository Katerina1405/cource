package assignment;

public class ViewDoctor {
    public class ViewDoctor implements Action {

        private static final Logger LOGGER = LoggerFactory.getLogger(ViewDoctor.class);
        private static ViewDoctor instance;

        public static ViewDoctor getInstance() {
            if (instance == null) {
                synchronized (ViewDoctor.class) {
                    if (instance == null)
                        instance = new ViewDoctor();
                }
            }
            return instance;
        }

        private ViewDoctor() {
            LOGGER.info(getClass().getSimpleName() + " instance created!");
        }

