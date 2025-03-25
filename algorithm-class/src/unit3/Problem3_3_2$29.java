package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 13:04
 * @Version V1.0
 * @ClassName Problem3_3_2$29
 */
public class Problem3_3_2$29 {
    public static void method() {
        System.out.println("Input a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++)
        a[i]=scanner.nextInt();
        boolean flag=false;
        for(int i=1;i<=n-1;i++)
            for(int j=i+1;j<=n;j++)
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
        if(flag) System.out.println("repeat");
        else System.out.println("Non repeat");
    }

    public static void main(String[] args) {
        method();
    }
}
