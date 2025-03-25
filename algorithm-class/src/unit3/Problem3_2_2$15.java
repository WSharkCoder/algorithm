package unit3;

import jdk.jshell.Snippet;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/8 18:45
 * @Version V1.0
 * @ClassName Problem3_2_2$15
 */
public class Problem3_2_2$15 {
    public static void method1() {
        int[] faceValue = new int[]{50, 20, 10, 5, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input X:");
        int x = scanner.nextInt();
        System.out.println("Input Y:");
        int y = scanner.nextInt();
        int z=y-x;
        int[] T = new int[faceValue.length];
        for (int i = 0; i < faceValue.length; i++) {
            T[i] = z / faceValue[i];
            z %= faceValue[i];
        }
        for(int i=0;i<faceValue.length;i++)
            if(T[i]!=0) System.out.println(faceValue[i]+"---"+T[i]);
    }

    public static void main(String[] args) {
        method1();
    }
}
