package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/13 10:03
 * @Version V1.0
 * @ClassName Problem3_2_6$24
 */
public class Problem3_2_6$24 {
    //1 红花盆 2黄花盆 3蓝花盆
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n + 1][4];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= 3; j++)
                a[i][j] = scanner.nextInt();
        int m = 0;

        for (int i = 1; i <= n; i++) {
            if (a[i][1] == 2) {
                for (int j = 1; j <=n; j++)
                    if (a[j][2] == 1) {
                        int t = a[i][1];
                        a[i][1] = a[j][2];
                        a[j][2] = t;
                        m += 3;
                        break;
                    }
            }
            if (a[i][1] == 3) {
                for (int j = 1; j <= n; j++)
                    if (a[j][3] == 1) {
                        int t = a[i][1];
                        a[i][1] = a[j][2];
                        a[j][2] = t;
                        m += 3;
                        break;
                    }
            }
            if (a[i][2] == 3) {
                for (int j = 1; j <= n; j++)
                    if (a[j][3] == 2) {
                        int t = a[i][2];
                        a[i][2] = a[j][3];
                        a[j][3] = t;
                        m += 3;
                        break;
                    }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (a[i][1] == 2)
                for (int j = 1; j <= n; j++)
                    if (a[j][2] == 3)
                        for (int k = 1; k <= n; k++)
                            if (a[k][3] == 1) {
                                int t = a[i][1];
                                a[i][1] = a[j][2];
                                a[j][2] = a[k][3];
                                a[k][3] = t;
                                m += 4;
                                break;
                            }
            if(a[i][1]==3){
                for(int j=1;j<=n;j++)
                    if(a[j][2]==1)
                        for (int k =1;k<=n;k++)
                            if (a[k][3]==2){
                                int t = a[i][1];
                                a[i][1] = a[j][2];
                                a[j][2] = a[k][3];
                                a[k][3]=t;
                                m+=4;
                                break;
                            }
            }
        }
        System.out.println("Move:" + m);
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=3;j++)
                System.out.printf(a[i][j]+"");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        method();
    }

}
