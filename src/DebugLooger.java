public class DebugLooger extends AbstractLogger {


    DebugLooger(LogLevel level){
        this.level = level;
    }

    @Override
    public void display(String message,LogSubject subject) {
        String mes=level.name() + ": " + message;
        subject.notifyObservers(this.level,mes);
    }
}
