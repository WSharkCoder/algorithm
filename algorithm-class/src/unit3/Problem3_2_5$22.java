package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/10 9:41
 * @Version V1.0
 * @ClassName Problem3_2_5$22
 * 魔方阵
 */
public class Problem3_2_5$22 {
    public static void method(int n) {
        int[][] T = new int[n + 1][n + 1];
        System.out.println("Input an odd number:");
        if (n % 2 == 0) {
            System.out.println("Input error");
            return;
        }
        int i = 1;
        int j=(n+1)/2;
        int x =1;
        while (x <= n * n) {
            T[i][j]=x++;
            int o=i;
            int p=j;
            i--;
            j--;
            if(i==0)i=n;
            if(j==0)j=n;
            if(T[i][j]!=0){
                i=o+1;
                j=p;
            }
        }

        for (i = 1; i <= n; i++) {
            for (j=1;j<=n;j++) System.out.printf("%5d",T[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        method(3);
    }
}
