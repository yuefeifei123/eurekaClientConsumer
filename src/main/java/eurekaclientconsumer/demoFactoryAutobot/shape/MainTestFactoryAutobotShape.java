package eurekaclientconsumer.demoFactoryAutobot.shape;


public class MainTestFactoryAutobotShape {
    public static void main(String[] args){
        //遍历取得工厂类中的所有汽车人对象
        for (AutobotShapeEnum autobotShape : AutobotShapeEnum.values()) {
            System.out.println(autobotShape.name());
        }
        AutobotShape autobotShape=new AutobotShapeFactory().getAutobotShape("Bumblebee");
        autobotShape.getAutobot();
        AutobotShape autobotShape2=new AutobotShapeFactory().getAutobotShapeEnum(AutobotShapeEnum.AUTOBOT_SHAPE_OptimusPrime);
        autobotShape2.getAutobot();
    }

}
