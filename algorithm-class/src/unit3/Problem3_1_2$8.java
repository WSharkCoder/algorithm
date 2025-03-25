package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/4/29 18:32
 * @Version 1.0
 * 3.1.2 例8
 * 从高位向地位逐位输出是十进制整数的各个位数字
 */
public class Problem3_1_2$8 {
    /**
     * 循环算法
     *
     * @param n
     */
    public static void method0(int n) {
        int[] nums = new int[16];
        int index = 0;
        while (n >= 10) {
            nums[index++] = n % 10;
            n /= 10;
        }
        nums[index] = n;
        //输出结果
        for (int i = index; i >= 0; i--) {
            System.out.println(nums[i] + " ");
        }
    }

    /**
     * 递归算法
     *
     * @param n
     */
    public static void method1(int n) {
        if (n >= 10) {
            method1(n / 10);
            System.out.println(n % 10);
        } else
            System.out.println(n);
    }

    /**
     * 衍生问题
     * 将输入的十进制数n转换为m进制数
     */

    /**
     * 递归算法
     *
     * @param n 十进制数
     * @param m m进制 1<m<=10
     */
    public static void method2(int n, int m) {
        if (n < m) {
            System.out.println(n);
        } else {
            method2(n / m, m);
            System.out.println(n % m);
        }
    }

    public static void method3(int n, int m) {
        int[] nums = new int[32];
        int index = 0;
        while (n >= m) {
            nums[index++] =n%m;
            n/=m;
        }
        nums[index]=n;
        //输出结果
        for (int i = index; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        method0(10);
        long end = System.nanoTime();
        System.out.println("Method0 Time:" + (end - start));
        long start1 = System.nanoTime();
        method1(10);
        long end1 = System.nanoTime();
        System.out.println("Method1 Time:" + (end1 - start1));
        method2(10, 8);
        method3(10,8);
    }
}
