package unit3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3_2_3$17 {
    /**
     * @param n 做游戏总人数
     * @param k 开始报数人的编号及状态数组的下标变量
     * @param m 退出圈外人报的点数
     */
    public static void method1(int n, int k, int m) {
        int[] num = new int[n + 1];
        Arrays.fill(num, 1);

        //目前踢出约瑟夫环的个数
        int p = 0;
        k -= 1;
        System.out.printf("Wash out:");
        while (p < n - 1) {
            int x = 0;
            while (x < m) {
                k++;
                if (k > n) k = 1;
                x += num[k];
            }

            System.out.printf(k + " ");
            num[k] = 0;
            p++;
        }
        for (int i = 1; i <= n; i++)
            if (num[i] != 0) System.out.println("\nResult:" + i);
    }

    /**
     * 可选顺时针或逆时针方向报数
     *
     * @param n    做游戏总人数
     * @param k    开始报数人的编号及状态数组的下标变量
     * @param m    退出圈外人报的点数
     * @param flag true 表示顺时针 false 表示逆时针
     */
    public static void method2(int n, int k, int m, boolean flag) {
        int[] num = new int[n + 1];
        Arrays.fill(num, 1);
//出圈次数
        int times = 0;
        if (flag) k--;
        else k++;
        System.out.printf("Wash out:");
        while (times < n - 1) {
            int sums = 0;
            if (flag) {
                while (sums < m) {
                    k++;
                    if (k > n) k = 1;
                    sums += num[k];
                }
            } else {
                while (sums < m) {
                    k--;
                    if (k < 1) k = n;
                    sums += num[k];
                }
            }
            System.out.printf(k + " ");
            num[k] = 0;
            times++;
        }
        for (int i = 1; i <= n; i++)
            if (num[i] != 0) System.out.println("\nResult:" + i);

    }

    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        System.out.println("Input numbers of game:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Input serial number of game start:");
        int k = scanner.nextInt();
        System.out.println("Input Number of out_ring:");
        int m = scanner.nextInt();
        method1(n, k, m);
        method2(7, 1, 3, false);

    }
}
