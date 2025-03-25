package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/5 19:33
 * @Version V1.0
 * @ClassName Problem3_2_1$12
 */
public class Problem3_2_1$12 {
    public static void main(String[] args) {
        int[] a = new int[8];
        System.out.println("Input height data util input -1:");
        Scanner scanner = new Scanner(System.in);
        int sp = scanner.nextInt();
        while (sp != -1) {
            if (sp > 179) a[7]++;
            else {
                if (sp < 150) a[0]++;
                else a[sp / 5 - 29]++;
            }
            sp = scanner.nextInt();
        }
        for(int i=0;i<8;i++)
            System.out.println("S"+i+":"+a[i]);
    }
}
