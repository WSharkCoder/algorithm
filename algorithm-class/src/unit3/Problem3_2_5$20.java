package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/5/9 11:55
 * @Version V1.0
 * @ClassName Problem3_2_5$20
 */
public class Problem3_2_5$20 {
    public static void method(int n) {
        int[][] T = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) T[i][j] = 0;
                if (i < j && i + j < n - 1) T[i][j] = 1;
                if (i > j && i + j < n - 1) T[i][j] = 2;
                if (i > j && i + j > n - 1) T[i][j] = 3;
                if (i < j && i + j > n - 1) T[i][j] = 4;
            }
        for (int i=0;i<n;i++){
            for (int j = 0; j < n; j++)
                System.out.printf("%5d",T[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        method(5);
    }
}
