package eurekaclientconsumer.quartz;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 24569
 */
@Slf4j
public class ScheduledExecutorTest implements Runnable {
    private String jobName ;
    public ScheduledExecutorTest(String jobName) {
        super();
        this.jobName = jobName;
    }

@Override
    public void run() {
    log.info("execute " + jobName);
    }

    public static void main(String[] args) {
    ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
    //执行任务据线程启动的时间间隔
    long initialDelay1 = 10;
    //线程的执行间隔
    long period1 = 2;
    log.info("定时任务马上开始了*************");
    // 从现在开始1秒钟之后，每隔1秒钟执行一次job1
    service.scheduleAtFixedRate(new ScheduledExecutorTest("ScheduledExecutor"), initialDelay1,
period1, TimeUnit.SECONDS);

    }
}

