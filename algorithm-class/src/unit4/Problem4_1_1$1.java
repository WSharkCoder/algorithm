package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/15 16:29
 * @Version V1.0
 * @ClassName Problem4_1_1$1
 */
public class Problem4_1_1$1 {
    public static void method1() {
        int a =1,b=1;
        System.out.printf(a + " " + b);
        for (int i = 1; i <= 10; i++) {
            int  c=a+b;
            a=b;
            b=c;
            System.out.printf(" " + c);
        }
    }

    public static void method2() {
        int a =1,b=1;
        System.out.printf(a + " " + b);
        for (int i = 1; i <= 4; i++) {
            int c=a+b;
            a=b+c;
            b =a+c;
            System.out.printf(" "+c+" "+a+" "+b);
        }
    }
    public static void method3() {
        int a=1,b=1;
        System.out.printf(a+" "+b);
        for (int i = 1; i <= 5; i++) {
            a=a+b;
            b=a+b;
            System.out.printf(" "+a+" "+b);
        }
    }

    public static void main(String[] args) {
        method1();
        System.out.println();
        method2();
        System.out.println();
        method3();
    }
}
