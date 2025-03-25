package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 17:57
 * @Version V1.0
 * @ClassName Problem3_4_2
 */
public class Problem3_4_2$38 {
    public static void method() {
        System.out.println("Input the number of data:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Input the distant of moving:");
        int k = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        int m = fun(n, k);
        //移动圈
        for (int j = 0; j < m; j++) {
            int T1=a[j];
            int index=j;
            //移动券内每个元素
            for (int i = 0; i < n / m; i++) {
                index=(index+k)%n;
                int T2 = a[index];
                a[index]=T1;
                T1=T2;
            }
            for (int i = 0; i < n; i++)
                System.out.printf(a[i]+" ");
        }
    }
    public static int fun(int a, int b) {
        int t = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            while (a % i == 0 && b % i == 0) {
                t *= i;
                a /= i;
                b /= i;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        method();
    }
}
