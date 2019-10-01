package ObservPattern;
public class Subscribe {
    private String name;
    private Channel channel = new Channel();

    public Subscribe(String name) {
        this.name = name;
    }
    
    public void update()
    {
        System.out.println("Hey "+name+" Video upload : "+ channel.title);
    }
    
    public void subscribeChannel(Channel ch){
     channel = ch ; 
    }

}
