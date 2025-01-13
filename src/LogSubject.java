import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {

     Map<LogLevel, List<LogObserver>>ObserverMap=new HashMap<>();
    //add
    public void addObserver(LogLevel level, LogObserver observer) {
        List<LogObserver> list=ObserverMap.getOrDefault(level,new ArrayList<>());
          list.add(observer);

          ObserverMap.put(level,list);
    }
    //notify
    public void notifyObservers(LogLevel level, String message) {
        List<LogObserver> list=ObserverMap.get(level);

        for(LogObserver observer:list){
            observer.log(message);

        }
    }

    //remove

    public void removeObserver(LogLevel level, LogObserver observer) {
        List<LogObserver> list=ObserverMap.get(level);

        list.remove(observer);

    }


}
