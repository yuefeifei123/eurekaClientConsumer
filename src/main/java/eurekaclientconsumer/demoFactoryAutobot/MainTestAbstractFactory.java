package eurekaclientconsumer.demoFactoryAutobot;

public class MainTestAbstractFactory {
    public static void main(String[] args) {
        //首先得到颜色工厂
        AbstractAutobotFactory colorAutobotFactory=
                new AutobotFactoryProducer().getAutobotFactory("color");
        //得到汽车人颜色
        colorAutobotFactory.getAutobotColor("blue").getColor();

        //首先得到类型工厂
        AbstractAutobotFactory shapeAutobotFactory=
                new AutobotFactoryProducer().getAutobotFactory("shape");
        //得到汽车人类型
        shapeAutobotFactory.getAutobotShape("Ironhide").getAutobot();
        System.out.println(28 % 1000000007);
    }
}
