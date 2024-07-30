public class Logger {
    private static Logger _instance;
    private Logger() {}
    public static Logger getInstance() {
        if (_instance == null) {
            synchronized (Logger.class) {
                if (_instance == null) {
                    _instance = new Logger();
                }
            }
        }
        return _instance;
    }
}