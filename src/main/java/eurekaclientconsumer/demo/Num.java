package eurekaclientconsumer.demo;

public class Num {
    public static int[] randomNumber(int min, int max, int n) {
        //判断需要的数量是否异常,超出范围直接跳出
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] result = new int[n]; //用于存放结果的数组
        int count = 0;
        while (count < n) {
            //随机得到一个num，范围为min到max
            int num = (int) (Math.random() * (max - min)) + min;
            boolean flag = true;
            //循环判断num和已有元素的值是否相当，相当跳出重新得到随机数；
            for (int j = 0; j < n; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            //不相等，没有重复值，将随机数赋值给固定位置的元素
            if (flag) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }
    //生成一个待排序的随机数列
    static final int[] old = Num.randomNumber(0, 50000, 40000);
}
