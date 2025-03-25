package unit3;

import java.util.Date;

/**
 * @Author WSharkCoder
 * @Date 2020/4/18 19:21
 * @Version 1.0
 * 算法练习
 */
public class Problem2 {
    //求最大值
    public static int max1(int a, int b, int c) {
        if (a > b)
            if (a > c)
                return a;
            else return c;
        else if (b > c) return b;
        else return c;

    }

    //求最大值
    public static int max2(int a, int b, int c) {
        int m;
        if (a > b)
            m = a;
        else m = b;
        if (c > m) return c;
        else return m;

    }

    public static int max3(int a, int b, int c) {
        if (a < b)
            a = b;
        return a > c ? a : c;
    }

    //显示运行时间
    private static void show(long begin, long end) {
        System.out.println(end - begin + "ns");//单位纳秒
    }

    public static void main(String[] args) {
        long begin1 = System.nanoTime();
        max1(1, 2, 3);
        long end1 = System.nanoTime();
        show(begin1, end1);
        long begin2 = System.nanoTime();
        max2(1, 2, 3);
        long end2 = System.nanoTime();
        show(begin2, end2);
        long begin3 = System.nanoTime();
        max3(1, 2, 3);
        long end3 = System.nanoTime();
        show(begin3, end3);

    }
}
