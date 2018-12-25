package eurekaclientconsumer.demoFactoryAutobot.shape;


/**类型为擎天柱
 * @author 24569
 */
public class OptimusPrime implements AutobotShape {
    @Override
    public OptimusPrime getAutobot(){
        System.out.println("======> create OptimusPrime success<=====");
        return new OptimusPrime();
    }
}
