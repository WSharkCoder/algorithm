package unit4;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 9:40
 * @Version V1.0
 * @ClassName Problem4_1_1$7
 */
public class Problem4_1_1$7 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入系数a,b,c,d:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double result = fn(a, b, c, d);
        System.out.println("方程的根：" + result);
    }

    public static double fn(double a, double b, double c, double d) {
        double x1=1,x0,f0,f1;
        do {
            x0 = x1;
            f0 = ((a * x0 + b) * x0 + c) * x0 + d;
            f1 = (3 * a * x0 + 2 * b) * x0 + c;
            x1 = x0 - f0 / f1;
        } while (Math.abs(x1 - x0) >=1e-4);
        return x1;
    }

    public static void main(String[] args) {
        method();
    }
}
