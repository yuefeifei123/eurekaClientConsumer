package eurekaclientconsumer.timer;

import java.util.Timer;
import java.util.TimerTask;

public class timerReduceing {
    //秒数
    public static long midTime=238878L;

    public static void main(String args[]){
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                midTime--;
                long hh=midTime/1000/60%60;
                long mm=midTime/1000%60;
                long ss=midTime%1000;
                System.out.println("还剩" + hh + "小时" + mm + "分钟" + ss + "秒");
            }
        },0,1000L);
    }
}
