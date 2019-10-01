
package ObservPattern;

public class Youtube {

    public static void main(String[] args) {
        
        Channel Nibirman = new Channel();
        
        Subscribe s1 = new Subscribe("Nibir");
        Subscribe s2 = new Subscribe("Anika");
        Subscribe s3 = new Subscribe("Munia");
        Subscribe s4 = new Subscribe("Jinia");
        Subscribe s5 = new Subscribe("Sonia");
        
        
        Nibirman.subscriber(s1);
        Nibirman.subscriber(s2);
        Nibirman.subscriber(s3);
        Nibirman.subscriber(s4);
        Nibirman.subscriber(s5);
        
        s1.subscribeChannel(Nibirman);
        s2.subscribeChannel(Nibirman);
        s3.subscribeChannel(Nibirman);
        s4.subscribeChannel(Nibirman);
        s5.subscribeChannel(Nibirman);
        
        Nibirman.upload("How to make Design  Pattern Architecture");
        
    }
    
}
