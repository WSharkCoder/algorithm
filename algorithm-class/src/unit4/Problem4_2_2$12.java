package unit4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 11:36
 * @Version V1.0
 * @ClassName Problem4_2_2$12
 */
public class Problem4_2_2$12 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        Arrays.fill(a, 1);
        for (int i = 1; i <= n; i++)
            for (int j = i; j <= n; j = j + i)
                a[j] = 1 - a[j];
        for (int i = 1; i <= n; i++)
            if (a[i] == 0) System.out.println(i + "is free");
    }
    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            int s=1;
            for(int j=2;j<=i;j++)
                if(i%j==0)s++;
                if(s%2==1) System.out.println(i+"is free");
        }
    }
    public static void method2() {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1; i<=n;i++){
            if(i*i<=n) System.out.println(i*i+"is free");
            else  break;
        }
    }
    public static void main(String[] args) {
        method();
        method1();
        method2();
    }
}
