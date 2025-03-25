package unit5;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/6/7 17:06
 * @Version V1.0
 * @ClassName Probelm5_4_5$14
 */
public class Problem5_4_5$14 {
    public static int n;//作业总数
    public static int[][] job;
    public static int[] x, bestX;//作业顺序,最佳作业顺序
    public static int f1;//M1当前作业完成时间
    public static int[] f2;//M2作业时间
    public static int bestF;//最佳作业时长

    public static void init() {
        job = new int[n + 1][2];
        x = new int[n + 1];
        bestX = new int[n + 1];
        f2 = new int[n + 1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        init();
        for (int i = 1; i <= n; i++)
            for (int j = 0; j < 2; j++)
                job[i][j] = scanner.nextInt();
        bestF = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) x[i] = i;
        search(1);
        System.out.println("The BestX:");
        for (int i = 1; i <= n; i++)
            System.out.printf(" " + bestX[i]);
        System.out.println("\nThe BestF:" + bestF);
        System.out.println("201813137031-计科1801-方俊雄");
    }

    public static void search(int i) {
        if (i == n + 1) {
            for (int j = 1; j <= n; j++)
                bestX[j] = x[j];
            bestF = f2[i-1];
        } else
            for (int j = i; j <= n; j++) {
                f1 += job[x[j]][0];
                if (f2[i - 1] > f1) f2[i] = f2[i - 1] + job[x[j]][1];
                else f2[i] = f1 + job[x[j]][1];
                if (f2[i]<bestF){
                    int T=x[i];
                    x[i]=x[j];
                    x[j]=T;

                    search(i+1);

                     T=x[i];
                    x[i]=x[j];
                    x[j]=T;
                }
                f1 -= job[x[j]][0];
            }
    }

}
