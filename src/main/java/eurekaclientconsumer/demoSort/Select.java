package eurekaclientconsumer.demoSort;

import java.util.Arrays;

public class Select {

    public static void main(String[] args){
        int [] selectNew=Num.old;
        System.out.println(Num.old.length);
        System.out.println(Arrays.toString(selectNew));
        long start=System.currentTimeMillis();
        //外层固定一个元素作为基准
        for (int i = 0; i < selectNew.length; i++) {
            //内层每次都和外层固定的基准元素进行比较
            for (int j = i+1; j < selectNew.length; j++) {
                if(selectNew[i]>selectNew[j]) {
                    //如果基准大于后面的值，进行交换
                    int tem=selectNew[i];
                    selectNew[i]=selectNew[j];
                    selectNew[j]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(selectNew));
        long totalTime=System.currentTimeMillis()-start;
        System.out.println(totalTime);
    }
}
