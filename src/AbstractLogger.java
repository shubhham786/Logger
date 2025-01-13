public abstract class AbstractLogger {

     LogLevel level;

      AbstractLogger nextLogLevel;

    public AbstractLogger() {
        this.nextLogLevel = nextLogLevel;
    }

    public void logMessage(LogLevel level, String message,LogSubject logSubject) {

        if(this.level.getLevel()<=level.getLevel()) {
            display(message,logSubject);
        }

        if(this.nextLogLevel!=null){
            this.nextLogLevel.logMessage(level, message,logSubject);
        }
    }


    public abstract void display(String message,LogSubject logSubject);
}
