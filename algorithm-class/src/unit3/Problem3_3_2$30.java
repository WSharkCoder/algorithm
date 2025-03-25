package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 14:40
 * @Version V1.0
 * @ClassName Problem3_3_2$30
 */
public class Problem3_3_2$30 {
    public static void method() {
        System.out.println("Input 3 number:");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+b<c||a+c<b||b+c<a)
            System.out.println("Don't form a triangle.");
        else {
            boolean flag=true;
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a) {
                flag=false;
                System.out.println("form a right-angle triangle");
            }
            if (a == b && b == c) {
                flag=false;
                System.out.println("form a equilateral triangle");
            } else if (a == b || b == c||a==c){
                System.out.println("form a equal triangle" );
                flag=false;
            }
            if (flag)
                System.out.println("form a triangle");
        }

    }

    public static void main(String[] args) {
        method();
    }
}
