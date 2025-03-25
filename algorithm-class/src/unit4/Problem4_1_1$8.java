package unit4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 9:51
 * @Version V1.0
 * @ClassName Problem4_1_1$8
 */
public class Problem4_1_1$8 {
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x1,x2 (f(x1)*f(x2)<0):");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double f1 = f(x1);
        double f2 = f(x2);
        if (f1 * f2 > 0) {
            System.out.println("Non root");
            return;
        }
        double x;
        double f;
        do {
            x = (x1 + x2) / 2;
            f = f(x);
            if (f == 0) break;
            if (f1 * f > 0.0) x1 = x;
            else x2 = x;
        } while (Math.abs(f) >= 1e-4);
        System.out.println("Root:"+x);
    }

    public static double f(double x){
        return (x*1/2+2)*x*x-8;
    }

    public static void main(String[] args) {
        method();
    }
}
