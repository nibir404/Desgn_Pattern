package ObservPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Subscribe> subs = new ArrayList<>();
    String title;
    
    public void subscriber(Subscribe sub){
       subs.add(sub);
    }
    
    public void unSubscribe(Subscribe sub){
      subs.remove(sub);
    }
    
    public void notifySubscriber(){
      for(Subscribe sub : subs){
        sub.update();
      }
    }
    public void upload(String title){
    this.title = title;
    notifySubscriber();
    }

}
