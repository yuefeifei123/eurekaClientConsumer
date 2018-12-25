package eurekaclientconsumer.demoSPI.Impl;
import eurekaclientconsumer.demoSPI.Autobot;

/**服务接口的实现类二---擎天柱
 * @author 24569
 */
public class OptimusPrime implements Autobot {
    @Override
    public void sayHello(){
        System.out.println("======> hello human, i am OptimusPrime <======");
    }
}
