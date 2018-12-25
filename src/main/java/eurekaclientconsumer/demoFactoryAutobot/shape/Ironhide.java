package eurekaclientconsumer.demoFactoryAutobot.shape;


/**类型为铁皮
 * @author 24569
 */
public class Ironhide implements AutobotShape {
    @Override
    public Ironhide getAutobot(){
        System.out.println("=====>create Ironhide success<=====");
        return new Ironhide();
    }
}
