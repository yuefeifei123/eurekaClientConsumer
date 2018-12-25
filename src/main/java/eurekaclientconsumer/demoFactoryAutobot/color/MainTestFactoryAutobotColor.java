package eurekaclientconsumer.demoFactoryAutobot.color;

public class MainTestFactoryAutobotColor {
    public static void main(String[] args){
        //遍历取得工厂类中的所有汽车人对象
        for (AutobotColorEnum autobotColor : AutobotColorEnum.values()) {
            System.out.println(autobotColor.name());
        }
        AutobotColor autobotColor=new AutobotColorFactory().getAutobotColor("red");
        autobotColor.getColor();
        AutobotColor autobotColor2=new AutobotColorFactory().getAutobotColorEnum(AutobotColorEnum.AUTOBOT_COLOR_BLACK);
        autobotColor2.getColor();
    }

}
