package eurekaclientconsumer.demoFactoryAutobot.color;

public class BlueAutobot implements AutobotColor{

    @Override
    public BlueAutobot getColor() {
        System.out.println("=====> create buleAutobot success <=====");
        return new BlueAutobot();
    }
}
