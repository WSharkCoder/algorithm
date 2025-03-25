package unit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/24 16:41
 * @Version V1.0
 * @ClassName Problem4_5_4$28
 */
public class Problem4_5_4$28 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1],
                b = new int[n + 1],//点i~n的最长的不下降子序列长度
                c = new int[n + 1];//点i在最长的不下降子序列的后继数据编号
        Arrays.fill(b, 1);
        for (int i = 1; i <= n; i++)
            a[i] = scanner.nextInt();
        for (int i = n - 1; i >= 1; i--) {
            int max = 0,
                    p = 0;//点i后继节点
            for (int j = i + 1; j <= n; j++)
                if (a[i] < a[j] && b[j] > max) {
                    max = b[j];
                    p = j;
                }
            if (p != 0) {
                b[i] = b[p] + 1;//点i最长不降子序列长度等于点p最长~~
                c[i] = p;
            }
        }
        int max = 0, p = 0;
        for (int i = 1; i <= n; i++)
            if (b[i] > max) {
                max = b[i];
                p = i;
            }
        System.out.println("maxLong=" + max);
        System.out.println("Result is:");
        while (p != 0) {
            System.out.println(a[p]);
            p = c[p];
        }
    }

    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        method();
    }
}
