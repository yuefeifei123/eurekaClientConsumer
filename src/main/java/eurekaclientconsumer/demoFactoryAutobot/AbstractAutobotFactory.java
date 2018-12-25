package eurekaclientconsumer.demoFactoryAutobot;

import eurekaclientconsumer.demoFactoryAutobot.color.AutobotColor;
import eurekaclientconsumer.demoFactoryAutobot.shape.AutobotShape;

public abstract class AbstractAutobotFactory {
        public abstract AutobotColor getAutobotColor(String autobotColor);
        public abstract AutobotShape getAutobotShape(String autobotShape);
}
