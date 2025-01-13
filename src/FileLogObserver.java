public class FileLogObserver implements LogObserver {
    @Override
    public void log(String msg) {
        System.out.println("Logging to file: " +msg);
    }
}
