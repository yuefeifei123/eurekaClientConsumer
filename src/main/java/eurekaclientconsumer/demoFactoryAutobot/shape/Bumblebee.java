package eurekaclientconsumer.demoFactoryAutobot.shape;

/**类型为大黄蜂
 * @author 24569
 */
public class Bumblebee implements AutobotShape {
    @Override
    public Bumblebee getAutobot(){
        System.out.println("=====>create Bumblebee success<=====");
        return new Bumblebee();
    }
}
