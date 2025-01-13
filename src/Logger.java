//1)Create logger singelton class

public class Logger implements Cloneable {


    public static Logger instance;
    public static AbstractLogger chainOfLogger;
    public static LogSubject logSubject;
    private Logger()
    {
         chainOfLogger=LogManager.getChainOfLogger();
         logSubject=LogManager.getLogSubject();
    }

    public static Logger getInstance()
    {
         if(instance == null)
         {
             synchronized(Logger.class)
             {
                 if(instance == null)
                     instance =new Logger();
             }
         }

         return instance;

    }

    public  Object clone() throws CloneNotSupportedException{

        throw new CloneNotSupportedException("Logger is not clonable");
    }

    public void info(String msg)
    {
         CreateLogMessage(LogLevel.INFO,msg,logSubject);
    }

    public void error(String msg)
    {
        CreateLogMessage(LogLevel.ERROR,msg,logSubject);
    }

    public void debug(String msg)
    {
        CreateLogMessage(LogLevel.DEBUG,msg,logSubject);
    }

    public void CreateLogMessage(LogLevel level, String msg,LogSubject logSubject)
    {
         chainOfLogger.logMessage(level,msg,logSubject);
    }
}
