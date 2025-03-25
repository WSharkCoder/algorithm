package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/13 18:41
 * @Version V1.0
 * @ClassName Problem3_3_1$25
 */
public class Problem3_3_1$25 {
    public static void method() {
        int[] a = new int[5];
        int num=0;
        for (int i = 1; i <= 50; i++) {
             int s=0;
            for (int j = 0; j < 5; j++) {
                double score = new Scanner(System.in).nextDouble();
                if(score>=90)s+=1;
            }
            if(s>=3)num++;
        }
        System.out.println("Num:" + num);
    }
}
