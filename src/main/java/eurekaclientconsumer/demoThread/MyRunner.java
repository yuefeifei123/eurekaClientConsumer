package eurekaclientconsumer.demoThread;

import lombok.extern.slf4j.Slf4j;

/**实现runnable接口创建方法
 * @author feifei
 */
@Slf4j
public class MyRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            log.info("implement runnable interface***"+Thread.currentThread().getName()+"***"+i);
        }
    }
}
