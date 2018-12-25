package eurekaclientconsumer.demoJvm;

import java.util.LinkedList;

public class JvmTest {
    public void change1(int i){
        i=1234;
    }
    public void change2(BirthDate b){
        b=new BirthDate(22,2,2004);
    }
    public void change3(BirthDate c){
        c.setDay(22);
    }
    public static void main(String[]args){

        JvmTest jvmTest=new JvmTest();
        int date=9;
        BirthDate b1=new BirthDate(7,7,1970);
        System.out.println(b1);
        BirthDate b2=new BirthDate(1,1,2000);
        jvmTest.change1(date);
        jvmTest.change2(b1);
//        System.out.println("------------"+b2);
        jvmTest.change3(b2);
//        System.out.println("************"+b2);
    }
}
