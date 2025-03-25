package unit4;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/15 16:57
 * @Version V1.0
 * @ClassName Problem4_1_1$4
 */
public class Problem4_1_1$4 {
    public static void method() {
        System.out.println("Input a number n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++){
            a[1]=a[i]=1;
            for(int j=i-1;j>1;j--)
                a[j]=a[j]+a[j-1];
            for(int j=1;j<=i;j++)
                System.out.printf("%4d",a[j]);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        method();
    }
}
