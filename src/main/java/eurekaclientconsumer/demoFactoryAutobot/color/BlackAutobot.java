package eurekaclientconsumer.demoFactoryAutobot.color;

public class BlackAutobot implements AutobotColor{
    @Override
    public BlackAutobot getColor() {
        System.out.println("=====> create redAutobot success <=====");
        return new BlackAutobot();
    }
}
