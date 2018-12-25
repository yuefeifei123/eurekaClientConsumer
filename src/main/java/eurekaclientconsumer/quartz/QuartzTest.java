package eurekaclientconsumer.quartz;

import java.util.Calendar;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.impl.JobDetailImpl;


/**quartz定时实现类
 * @author feifei
 */
@Slf4j
public class QuartzTest implements Job {

    @Override
    //该方法实现需要执行的任务
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        log.warn("************这个是job的一些基本信息;Generating report - "
                + arg0.getJobDetail().getJobDataMap().get("name") + ", type ="
                + arg0.getJobDetail().getJobDataMap().get("type")+"*************");
    }
    public static void main(String[] args) {
        try {
            // 创建一个Scheduler
//            SchedulerFactory schedulerFactory =
//                    new org.quartz.impl.StdSchedulerFactory();
//            Scheduler scheduler = schedulerFactory.getScheduler();
//
//            scheduler.start();
            // 创建一个JobDetail，指明name，groupname，以及具体的Job类名，
            //该Job负责定义需要执行任务
//            JobDetail jobDetail = new JobDetail("myJob",null,QuartzTest.class);

            // 创建一个每周触发的Trigger，指明星期几几点几分执行
//            Trigger trigger = TriggerUtils.makeWeeklyTrigger(3, 16, 38);
//            trigger.setGroup("myTriggerGroup");
//            // 从当前时间的下一秒开始执行
//            trigger.setStartTime(TriggerUtils.getEvenSecondDate(new Date()));
//            // 指明trigger的name
//            trigger.setName("myTrigger");

            //scheduler由工厂类构建
            Scheduler scheduler = new org.quartz.impl.StdSchedulerFactory().getScheduler();
            scheduler.start();
            //jobDetail由建造者模式创建
            JobDetail jobDetail = JobBuilder.newJob(QuartzTest.class)
                    .withIdentity("myJob",null)
                    .withDescription("第一次定时quartz执行任务").build();
            jobDetail.getJobDataMap().put("type", "FULL");
            CronExpression cronExpression=new CronExpression("5/3 * * * * ?");
            //trigger有创建者模式创建
            Trigger trigger = TriggerBuilder.newTrigger()
                            .withIdentity("myTrigger","myTriggerGroup")
                            .withSchedule(CronScheduleBuilder.cronSchedule(cronExpression)).build();

            // 用scheduler将JobDetail与Trigger关联在一起，开始调度任务
            scheduler.scheduleJob(jobDetail, trigger);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
