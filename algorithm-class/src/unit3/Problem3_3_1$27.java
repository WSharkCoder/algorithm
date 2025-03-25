package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 11:05
 * @Version V1.0
 * @ClassName Problem3_3_1$27
 */
public class Problem3_3_1$27 {
    public static void method() {
        System.out.println("Input a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++)
            a[i] = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] mn = new int[2];
        int[] mx = new int[2];
        for (int i = 0; i < num; i++) {
            int p = (i - 1 + num) % num;
            int q = (i + 1) % num;
            int k = a[p] * a[q];
            if (k > max) {
                max = k;
                mx[0] = a[p];
                mx[1] = a[q];
            }
            if (k < min) {
                min = k;
                mn[0] = a[p];
                mn[1] = a[q];
            }
        }
        System.out.println("Max:" + mx[0] + "*" + mx[1] + "=" + max);
        System.out.println("Min:" + mn[0] + "*" + mn[1] + "=" + min);

    }

    public static void main(String[] args) {
        method();
    }
}
