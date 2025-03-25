package unit5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/6/7 16:09
 * @Version V1.0
 * @ClassName Problem5_4_1$6
 */
public class Problem5_4_1$6 {
    public static int n;//n皇后问题
    public static int[] y;//皇后所在的列
    public static int[] c;//n列是否被占用标记
    public static int[] b;//2*n-1主对角线是否占用
    public static int[] d;//副对角线是否被占用
    public static int total;//问题解的总数

    public static void init() {
        y = new int[n];
        c = new int[n];
        b = new int[2 * n - 1];
        d = new int[2 * n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        init();
        search1(0);
        System.out.println("201813137031-计科1801-方俊雄");
        System.out.println("Total:"+total);
    }

    public static void outPut() {
        total++;
        for (int k = 0; k < n; k++)
            System.out.printf(" " + "(" + k + "," + y[k] + ")");
        System.out.println();
    }

    public static void search1(int i) {
        for (int j = 0; j < n; j++) {
            if (c[j] == 0 && b[j-i+n-1] == 0 && d[j+i] == 0) {
                y[j] = j;
                c[j] = 1;//占领j列
                b[j - i + n - 1] = 1;//主对角线 -(n-1)<= j-i <= n-1
                d[i + j] = 1;    //负对角线  0<= i+j <=2*n-1
                if (i < n-1)    //i==n-1 以找到结果
                    search1(i + 1);
                else outPut();
                //回溯（返回当前状态）
                c[j] = 0;
                b[j - i + n - 1] = 0;
                d[i + j] = 0;
            }
        }
    }

}
