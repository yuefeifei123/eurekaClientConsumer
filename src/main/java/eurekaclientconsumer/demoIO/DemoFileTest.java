package eurekaclientconsumer.demoIO;

import java.io.File;

/**
 * @author 24569
 */
public class DemoFileTest {
    public void getFileList(){
        File dir = new File("c:/logs");
        String[] str=dir.list();
        File[] str1=dir.listFiles();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        for (int j = 0; j < str1.length; j++) {
            System.out.println(str1[j]);
        }

    }
    public static void main(String[] args) {
        new DemoFileTest().getFileList();
    }
}
