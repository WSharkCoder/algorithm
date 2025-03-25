package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/4/26 18:31
 * @Version 1.0
 * 3.1.1 例4
 * 打印下列规则的图形
 * 1
 * 5  2
 * 8  6  3
 * 10 9  7  4
 * ....
 */
public class Problem3_1_1$4 {
    public static void SolveMethod(int n) {
        long start = System.nanoTime();
        int[][]  matrix=new int[n][n];
        int num=1;
        for (int k = 0; k < n; k++) {
            for(int i=k;i<n;i++)
                matrix[i][i-k]=num++;
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<=i;j++)
                System.out.printf(matrix[i][j]+" ");
            System.out.println();
        }
        long end = System.nanoTime();
        System.out.println("Time:" + (end-start));

    }
    public static void main(String[] args) {
        SolveMethod(5);
    }
}
