public class ConsoleLogObserver implements LogObserver {


    @Override
    public void log(String msg) {
        System.out.println("Logging to console: "+ msg);
    }
}
