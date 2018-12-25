package eurekaclientconsumer.demoFactoryAutobot.shape;

import eurekaclientconsumer.demoFactoryAutobot.AbstractAutobotFactory;
import eurekaclientconsumer.demoFactoryAutobot.color.AutobotColor;

/**
 *
 */
public class AutobotShapeFactory extends AbstractAutobotFactory {

    AutobotShapeEnum autobotShape;

    /**枚举方式生成不同类型汽车人
     * @param autobotShape 汽车人类型
     * @return 汽车人类型
     */
          public AutobotShape getAutobotShapeEnum(AutobotShapeEnum autobotShape) {
              switch (autobotShape) {
                  case AUTOBOT_SHAPE_Bumblebee:
                      return new Bumblebee();
                  case AUTOBOT_SHAPE_OptimusPrime:
                      return new OptimusPrime();
                  case AUTOBOT_SHAPE_Ironhide:
                      return new Ironhide();
                  default:
                      return null;
              }
          }

    @Override
    public AutobotColor getAutobotColor(String autobotColor) {
        return null;
    }

    /**普通方式生成不同类型汽车人
     * @param shape 类型名称
     * @return 汽车人类型
     */
    @Override
    public AutobotShape getAutobotShape(String shape){
            switch (shape){
                case "Bumblebee":
                    return new Bumblebee();
                case "OptimusPrime":
                    return new OptimusPrime();
                case "Ironhide":
                    return new Ironhide();
                default:
                    return null;
            }
        }
}
