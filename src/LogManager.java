public class LogManager {

    public static AbstractLogger getChainOfLogger() {

        AbstractLogger infoLogger=new InfoLogger(LogLevel.INFO);
        AbstractLogger errorLogger=new ErrorLogger(LogLevel.ERROR);
        AbstractLogger debugLogger=new DebugLooger(LogLevel.DEBUG);

              infoLogger.nextLogLevel=errorLogger;
              errorLogger.nextLogLevel=debugLogger;
              return infoLogger;
    }

    public static LogSubject getLogSubject() {
        LogSubject subject=new LogSubject();
        LogObserver consoleLogObserver=new ConsoleLogObserver();
        LogObserver fileLogObserver=new FileLogObserver();

         subject.addObserver(LogLevel.INFO, consoleLogObserver);
         subject.addObserver(LogLevel.ERROR, consoleLogObserver);
         subject.addObserver(LogLevel.ERROR, fileLogObserver);
         subject.addObserver(LogLevel.DEBUG, fileLogObserver);

         return subject;
    }
}
