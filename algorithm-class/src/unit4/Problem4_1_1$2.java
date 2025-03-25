package unit4;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/15 16:49
 * @Version V1.0
 * @ClassName Problem4_1_1$2
 */
public class Problem4_1_1$2 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (b == 0) {
            System.out.println("error");
            return;
        } else {
            int c=a%b;
            while (c != 0) {
                a=b;
                b=c;
                c=a%b;
            }
        }
            System.out.println(b);
        System.out.println(b);
    }

    public static void main(String[] args) {
        method();
    }
}
