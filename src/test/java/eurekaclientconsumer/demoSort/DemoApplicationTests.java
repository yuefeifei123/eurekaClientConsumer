package eurekaclientconsumer.demoSort;

import eurekaclientconsumer.demoProtoType.ProtoTypeImplOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
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
}
