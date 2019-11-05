package eurekaclientconsumer.demoSort;

import eurekaclientconsumer.DemoApplication;
import eurekaclientconsumer.demoProtoType.ProtoTypeImplOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class DemoApplicationTests {

    @Test
    public  void contextLoads() {
         String s=" ";
         String []s2=s.split(" ");
        System.out.println(s2.length);
//        System.out.println(s2[s2.length-1]);

//        System.out.println(s2[s2.length - 1].length());
//        String b=a.substring(0,2);
//        System.out.println(b);

    }

    @Test
    public void protoType() {
        ProtoTypeImplOne protoTypeImplOne=new ProtoTypeImplOne();
        System.out.println(protoTypeImplOne);
        protoTypeImplOne.clone();
    }

    @Test
    public void time() throws Exception{
        try
        {
            URL url = new URL("http://49.232.58.85:8080");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if(urlConnection instanceof HttpURLConnection)
            {
                connection = (HttpURLConnection) urlConnection;
            }
            else
            {
                System.out.println("请输入 URL 地址");
                return;
            }
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String urlString = "";
            String current;
            while((current = in.readLine()) != null)
            {
                urlString += current;
            }
            System.out.println(urlString);
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void testAtomic() {
        AtomicInteger count = new AtomicInteger(0);
        System.out.println(count.addAndGet(1));
        System.out.println(count.getAndAdd(1));
        System.out.println(count);
    }
}
