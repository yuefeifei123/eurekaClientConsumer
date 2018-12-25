package eurekaclientconsumer.demoThread;

import java.util.concurrent.Callable;

/**实现callable接口出国年线程
 * @author feifei
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i=0;
        for (i = 0; i <20 ; i++) {
            System.out.println("implement callable interface***"+Thread.currentThread().getName()+"***"+i);
        }
        return i;
    }
}
