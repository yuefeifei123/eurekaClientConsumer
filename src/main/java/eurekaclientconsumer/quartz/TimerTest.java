package eurekaclientconsumer.quartz;

import lombok.extern.slf4j.Slf4j;

import java.util.Timer;
import java.util.TimerTask;

/**定时任务的timer类；
 * @author feifei
 */
@Slf4j
public class TimerTest extends TimerTask {

    private String jobName = "";

     public TimerTest(String jobName) {
        super();
        this.jobName = jobName;
    }

    @Override
    public void run() {

        log.info(Thread.currentThread().getName()+"execute " + jobName);
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        //线程开始执行的时间据线程开始的时间
        long delay1 = 3 * 1000;
        //任务开始执行后的时间间隔
        long period1 = 2000;
        // 从现在开始 3 秒钟之后，每隔 2 秒钟执行一次 job1
        timer.schedule(new TimerTest("timer1"), delay1, period1);
        long delay2 = 2 * 1000;
        long period2 = 2000;
        // 从现在开始 2 秒钟之后，每隔 2 秒钟执行一次 job2
        timer.schedule(new TimerTest("timer2"), delay2, period2);
    }
}
