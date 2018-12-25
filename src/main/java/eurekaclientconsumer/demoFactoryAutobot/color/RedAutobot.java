package eurekaclientconsumer.demoFactoryAutobot.color;

public class RedAutobot implements AutobotColor{
    @Override
    public RedAutobot getColor() {
        System.out.println("=====> create redAutobot success <=====");
        return new RedAutobot();
    }
}
