package eurekaclientconsumer.demoFactoryAutobot.color;


import eurekaclientconsumer.demoFactoryAutobot.AbstractAutobotFactory;
import eurekaclientconsumer.demoFactoryAutobot.shape.AutobotShape;
import eurekaclientconsumer.demoFactoryAutobot.shape.Ironhide;

/**
 *
 */
public class AutobotColorFactory extends AbstractAutobotFactory {

    AutobotColorEnum autobotColor;

    /**枚举方式生成不同颜色汽车人
     * @param autobotColor 汽车人颜色
     * @return 汽车人颜色
     */
          public AutobotColor getAutobotColorEnum(AutobotColorEnum autobotColor) {
              switch (autobotColor) {
                  case AUTOBOT_COLOR_RED:
                      return new RedAutobot();
                  case AUTOBOT_COLOR_BLUE:
                      return new BlueAutobot();
                  case AUTOBOT_COLOR_BLACK:
                      return new BlackAutobot();
                  default:
                      return null;
              }
          }

    /**普通方式生成不同颜色汽车人
     * @param color 颜色名称
     * @return 汽车人颜色
     */
        @Override
        public AutobotColor getAutobotColor(String color){
                switch (color){
                    case "red":
                        return new RedAutobot();
                    case "blue":
                        return new BlueAutobot();
                    case "black":
                        return new BlackAutobot();
                    default:
                        return null;
                }
            }

        @Override
        public AutobotShape getAutobotShape(String autobotShape){
            return null;
        }
}
