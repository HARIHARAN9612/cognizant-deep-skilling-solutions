public class Logger {
    private static Logger singleLoggerInstance;
    private Logger() {
        System.out.println("Logging system initialized.");
    }

    public static Logger getLogger() {
        if (singleLoggerInstance == null) {
            singleLoggerInstance = new Logger();
        }
        return singleLoggerInstance;
    }
}
