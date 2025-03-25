package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 10:55
 * @Version V1.0
 * @ClassName Problem3_3_1$26
 */
public class Problem3_3_1$26 {
    public static void method() {
        System.out.println("input  a number:");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int k=1;
            while (i * k <= n) {
                a[i * k] = 1 - a[i * k];
                k++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (a[i]==1) System.out.printf("%5d", i);
        }
    }

    public static void main(String[] args) {
        method();
    }
}
