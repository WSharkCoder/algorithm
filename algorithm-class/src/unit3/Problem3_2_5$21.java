package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/5/9 21:23
 * @Version V1.0
 * @ClassName Problem3_2_5$21
 */
public class Problem3_2_5$21 {
    public static void method(int n) {
        int[][] T = new int[n][n];
        int num = 1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = i; j < n - i - 1; j++) T[j][i] = num++;
            for (int j = i; j < n - 1 - i; j++) T[n - 1 - i][j] = num++;
            for (int j = n - 1 - i; j > i; j--) T[j][n - 1 - i] = num++;
            for (int j = n - 1 - i; j > i; j--) T[i][j] = num++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.printf("%5d", T[i][j]);
            System.out.println();
        }
    }

    public static void method1(int n) {
        int[][] T = new int[n + 1][n + 1];
        int k = 1;
        for (int i = 1; i <= n / 2; i++) {
            //左
            for (int j = i; j <= n - i; j++) T[j][i] = k++;
            //下
            for (int j = i; j <= n - i; j++) T[n + 1 - i][j] = k++;
            //右
            for (int j = n + 1 - i; j >= i + 1; j--) T[j][n + 1 - i] = k++;
            //上
            for (int j = n + 1 - i; j >= i + 1; j--) T[i][j] = k++;
        }
        if (n % 2 == 1)
            T[(n + 1) / 2][(n + 1) / 2] = k;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.printf("%5d", T[i][j]);
            System.out.println();
        }
    }

    public static void method2(int n) {
        int[][] T = new int[n + 1][n + 1];
        int[] b = new int[]{0, 1};//x,y下标
        int x = 1, t = 1, k = n;
        while (x <= n * n) {
            for (int j = 1; j <= 2 * k - 1; j++) {
                b[j / (k + 1)] = b[j / (k + 1)] + t;
                T[b[0]][b[1]] = x;
                x++;
            }
            k--;
            t = (-1) * t;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.printf("%5d", T[i][j]);
            System.out.println();
        }
    }


    public static void main(String[] args) {
        method(4);
        method1(4);
        method2(4);
    }
}
