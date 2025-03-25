package unit3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author WSharkCoder
 * @Date 2020/4/26 17:02
 * @Version 1.0
 * 3.1.1 例2
 * 找出1000之内的所有完数，并按照下面格式输出其因子
 * 28 it's factors are [1,2,4,7,14]
 */
public class Problem3_1_1$2 {
    public static void SolveMethod1(int n) {
        long start=System.nanoTime();
        for (int i = 2; i <= n; i++) {
            int sum =0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 1; j < i; j++)
                if(i%j==0) {
                    sum+=j;
                    list.add(j);
                }
            if(sum==i)
                System.out.println(i + " it's factors are " +Arrays.asList(list.toArray()));
        }
        long end =System.nanoTime();
        System.out.println("Time:" + (end - start));
    }

    public static void main(String[] args) {
        int max=1000;
        SolveMethod1(max);
    }


}
