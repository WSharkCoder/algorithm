package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/10 11:27
 * @Version V1.0
 * @ClassName Problem3_2_6$23
 */
public class Problem3_2_6$23 {
    public static void method() {
        System.out.println("How many is numbers:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a=new int[10][10];
        System.out.println("Please input these numbers:");
        int k0= scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            int k1 = scanner.nextInt();
            a[k0][k1]++;
            k0=k1;
        }
        for(int i=0;i<=9;i++)
            for (int j=0;j<=9;j++)
                if(a[i][j]!=0&&a[j][i]!=0)
                    System.out.println("("+i+","+j+")="+a[i][j]+",("+j+","+i+")="+a[j][i]);

    }

    public static void main(String[] args) {
        method();
    }
}
