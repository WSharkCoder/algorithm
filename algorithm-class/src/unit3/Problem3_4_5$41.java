package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 18:50
 * @Version V1.0
 * @ClassName Problem3_4_5$41
 */
public class Problem3_4_5$41 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[t+1];
        int[] m = new int[t + 1];
        n[0]=1;
        m[1]=0;
        for (int i = 1; i <= t; i++) {
            n[i]=m[i-1];
            m[i] = 3 * n[i - 1] + 2 * m[i - 1];
        }
        System.out.println(n[t]);
        System.out.println(m[t]);
        
    }
}
