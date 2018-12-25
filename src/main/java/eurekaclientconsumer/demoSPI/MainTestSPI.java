package eurekaclientconsumer.demoSPI;

import java.util.ServiceLoader;

public class MainTestSPI {
    public static void main(String[] args){
        ServiceLoader<Autobot> serviceLoader=ServiceLoader.load(Autobot.class);
        serviceLoader.forEach(Autobot::sayHello);
    }
}
