package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/5 19:25
 * @Version V1.0
 * @ClassName Problem3_2_1$11
 */
public class Problem3_2_1$11 {
    public static void main(String[] args) {
        int[] a = new int[6];//计票器
        System.out.println("Input data until input -1:");
        Scanner scanner = new Scanner(System.in);
        int xp = scanner.nextInt();
        while (xp != -1) {
            if (xp <= 5 && xp >= 1)
                a[xp] += 1;
            else System.out.println("Input error");
            xp = scanner.nextInt();
        }
        for (int i = 1; i <= 5; i++)
            System.out.println("S" + i + ":" + a[i]);
    }
}
