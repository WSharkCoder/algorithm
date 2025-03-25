package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/4/29 21:17
 * @Version 1.0
 * 3.1.2 例 10
 */
public class Problem3_1_2$10 {
    public static void method1() {
        int n = 5;
        int total = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                for (int k = 1; k <= n; k++)
                    if (i < j && j < k) {
                        total++;
                        System.out.println(i + " " + j + " " + k);
                    }

        System.out.println("Total:" + total);


    }

    public static void method2() {
        int n = 5;
        int total = 0;
        int r = 3;
        for (int i = 1; i <= n - r + 1; i++)
            for (int j = i + 1; j <= n - r + 2; j++)
                for (int k = j + 1; k <= n - r + 3; k++) {
                    total++;
                    System.out.println(i + " " + j + " " + k);
                }
        System.out.println("Total:" + total);
    }

    /**
     * 递归算法
     */
    public static int[] a;
    public static int total;
    public static void method3() {
        System.out.println("Input  n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Input r:");
        int r = scanner.nextInt();
        if (r > n) System.out.println("Input n,r error!");
        else {
            a = new int[r + 1];
            a[0] = r;
            fun(n, r);
            System.out.println("Total:"+total);
        }
    }

    /**
     * 5 4 3
     * 5 4 2
     * 5 4 1
     * 5 3 2
     * 5 3 1
     * 5 2 1
     *
     * 4 3 2
     * 4 3 1
     * 4 2 1
     *
     * 3 2 1
     * @param n
     * @param r
     */
    public static void fun(int n, int r) {
        for(int k=n;k>=r;k--){
            a[r]=k;
            if(r>1)fun(k-1,r-1);
            else {
                for(int j=a[0];j>=1;j--)
                    System.out.printf(a[j]+" ");
                System.out.println();
                total++;
            }
        }
    }

    public static void main(String[] args) {
//        method1();
//        method2();
        method3();
    }
}
