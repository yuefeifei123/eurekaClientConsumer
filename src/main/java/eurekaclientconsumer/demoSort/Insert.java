package eurekaclientconsumer.demoSort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args){
        int [] insertNew=Num.old;
        System.out.println(Num.old.length);
        System.out.println(Arrays.toString(insertNew));
        long start=System.currentTimeMillis();
        //从第二个元素开始
        for (int i = 1; i < insertNew.length; i++) {

            //和尾脚表为i的每一个元素比较，
            for (int j = i; j>0  ; j--) {
                //大于值的元素两者交换位置，即后移一位
                if (insertNew[j] < insertNew[j - 1]) {
                    int tem = insertNew[j];
                    insertNew[j] = insertNew[j - 1];
                    insertNew[j - 1] = tem;
                }
            }
            }
        System.out.println(Arrays.toString(insertNew));
        long totalTime=System.currentTimeMillis()-start;
        System.out.println(totalTime);
    }
}
