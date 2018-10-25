package eurekaclientconsumer.demoSort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int [] bubbleNew=Num.old;
        System.out.println(Num.old.length);
        System.out.println(Arrays.toString(bubbleNew));
        long start=System.currentTimeMillis();
        //外层分别比较每个元素
        for (int i = 0; i < bubbleNew.length; i++) {
            //内层每次比较的长度减少的数量为外层的循环次数
            for (int j = 1; j < bubbleNew.length-i; j++) {
                if(bubbleNew[j-1]>bubbleNew[j]) {
                    //如果前一个大于后一个值，进行交换
                    int tem=bubbleNew[j-1];
                    bubbleNew[j-1]=bubbleNew[j];
                    bubbleNew[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleNew));
        long totalTime=System.currentTimeMillis()-start;
        System.out.println(totalTime);
    }
}
