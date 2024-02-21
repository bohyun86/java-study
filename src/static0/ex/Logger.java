package static0.ex;

public class Logger {

    static String logLevel = "INFO";

    static void logInfo(String info) {
        if (logLevel.equals("INFO")) {
            System.out.println("[" + logLevel + "] " + info);
        }
    }

    static void logError(String info) {
        if (logLevel.equals("INFO")) {
            System.out.println("[" + logLevel + "] " + info);
        } else if (logLevel.equals("ERROR")) {
            System.out.println("[" + logLevel + "] " + info);
        }
    }

    public static void setLogLevel(String logLevel) {
        Logger.logLevel = logLevel;
    }
}
