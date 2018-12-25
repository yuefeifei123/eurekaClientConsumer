package eurekaclientconsumer.demoSPI.Impl;
import eurekaclientconsumer.demoSPI.Autobot;


/**服务接口的实现类一，大黄蜂
 * @author 24569
 */
public class Bumblebee implements Autobot {
    @Override
    public void sayHello(){
        System.out.println("======> hello human, i am Bumblebee <======");
    }
}
