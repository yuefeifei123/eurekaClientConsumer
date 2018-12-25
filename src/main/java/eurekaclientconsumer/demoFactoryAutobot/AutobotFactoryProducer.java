package eurekaclientconsumer.demoFactoryAutobot;

import eurekaclientconsumer.demoFactoryAutobot.color.AutobotColorFactory;
import eurekaclientconsumer.demoFactoryAutobot.shape.AutobotShapeFactory;

public  class AutobotFactoryProducer {
    public AbstractAutobotFactory getAutobotFactory(String factoryName){
        switch (factoryName){
            case "color":
                return new AutobotColorFactory();
            case "shape":
                return new AutobotShapeFactory();
            default:
                    return null;
        }
    }
}
