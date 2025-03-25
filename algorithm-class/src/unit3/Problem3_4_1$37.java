package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 17:34
 * @Version V1.0
 * @ClassName Problem3_4_1$37
 */
public class Problem3_4_1$37 {
    public static void fun(int[] a, int n) {
        if(n==1){
            a[1]=1;
            a[2]=1;
        }
        else {
            fun(a, n-1);
            a[n+1]=1;
            for(int i=n;i>=2;i--)
                a[i]=a[i]+a[i-1];
            a[1]=1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Input a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 2];
        fun(a, n);
        for(int i=1;i<=n+1;i++)
            System.out.printf(a[i]+" ");

    }
}
