package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 17:22
 * @Version V1.0
 * @ClassName Problem3_3_3$36
 */
public class Problem3_3_3$36 {
    public static void method1() {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = (n % 3 == 0 ? 1 : 0) + (n % 5 == 0 ? 1 : 0) + (n % 7 == 0 ? 1 : 0);
        switch (k) {
            case 3:
                System.out.println("All");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            case 0:
                System.out.println("None");
                break;
        }
    }

    public static void method2() {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = (n % 3 == 0 ? 1 : 0) * 1 + (n % 5 == 0 ? 1 : 0) * 2 + (n % 7 == 0 ? 1 : 0) * 4;
        switch (k) {
            case 7:
                System.out.println("3&5&7");
                break;
            case 6:
                System.out.println("5&7");
                break;
            case 5:
                System.out.println("3&7");
                break;
            case 4:
                System.out.println("7");
                break;
            case 3:
                System.out.println("3&5");
                break;
            case 2:
                System.out.println("5");
                break;
            case 1:
                System.out.println("3");
                break;
        }


    }
}
