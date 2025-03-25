package unit3;

import java.lang.reflect.Method;

/**
 * @Author WSharkCoder
 * @Date 2020/4/29 18:03
 * @Version 1.0
 * 3.1.2 例 7
 * 从地位向高逐位输出正十进制整数各个数位
 */
public class Problem3_1_2$7 {

    /**
     * 递归算法
     *
     * @param n
     */
    public static void method0(int n) {
        if (n < 10) System.out.println(n);
        else {
            System.out.print(n % 10 + " ");
            method0(n / 10);
        }
    }
    /**
     * 循环算法
     *
     * @param n
     */
    public static void method1(int n) {
        while (n >= 10) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
        System.out.print(n % 10 + " " + "\n");
    }
    public static void main(String[] args) {
        long start = System.nanoTime();
        method0(123);
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println();
        long start1 = System.nanoTime();
        method1(234);
        long end1 = System.nanoTime();
        System.out.println(end1-start1);
    }
}
