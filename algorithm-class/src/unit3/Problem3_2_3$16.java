package unit3;

import java.util.Arrays;

/**
 * @Author WSharkCoder
 * @Date 2020/5/8 19:01
 * @Version V1.0
 * @ClassName Problem3_2_3$16
 */
public class Problem3_2_3$16 {
    public static void method1() {
        int[] nums = new int[10];
        System.out.println("Number Set:");
        for (int x = 10000; (x * x + "").length() <= 9; x++) {
            Arrays.fill(nums, 0);
            int t = x * x;
            while (t != 0) {

                nums[t % 10]++;
                t /= 10;
            }
            boolean flag = true;
            for (int index = 0; index < nums.length; index++)
                if (nums[index] > 1) flag = false;
            if (flag) System.out.println(x);
        }
    }

    /**
     * method1优化
     *
     */
    public static void method2() {
        int[] nums = new int[10];
        System.out.println("Number Set:");
        int total=0;
        for (int x = 10000; (x * x + "").length() <= 9; x++) {
            Arrays.fill(nums, 1);
            int t=x*x;
            int k=0;
            while (t != 0) {
                if (nums[t % 10] == 1) {
                    k++;
                    nums[t%10]=0;
                    t/=10;
                }else break;
            }
            if(k==9)
            {
                total++;
                System.out.println("NO"+total+":"+x);
            }
        }
    }

    public static void main(String[] args) {
       method1();
       method2();
    }
}
