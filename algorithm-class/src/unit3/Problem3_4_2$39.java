package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 18:42
 * @Version V1.0
 * @ClassName Problem3_4_2$39
 */
public class Problem3_4_2$39 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please think of a number between 1 and 100");
        System.out.println("your number divided by 3 has a remainder of");
        int a = scanner.nextInt();
        System.out.println("your number divided by 5 has a remainder of");
        int b = scanner.nextInt();
        System.out.println("your number divided by 7 has a remainder of");
        int c = scanner.nextInt();
        System.out.println("Let me think a moment...");
        int d=70*a+21*b+15*c;
        while (d > 105)
            d-=105;

        System.out.println("your number was" + d);
    }

    public static void main(String[] args) {
        method();
    }
}
