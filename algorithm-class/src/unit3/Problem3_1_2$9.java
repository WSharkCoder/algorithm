package unit3;

import java.lang.reflect.Method;

/**
 * @Author WSharkCoder
 * @Date 2020/4/29 18:46
 * @Version 1.0
 * 3.1.2 例9
 * 任何一个正整数可以用2的幂次方表示
 */
public class Problem3_1_2$9 {
    public static void method(int n) {
        int[] nums = new int[64];
        int originalN=n;
        int index=0;
        while (n >= 2) {
            nums[index++]=n%2;
            n/=2;
        }
        nums[index]=n;
        //数据转化结果
        System.out.print(originalN+"=");
        for (int i = index; i >= 0; i--) {
            if(i==index) System.out.printf("2^"+i);
            else if(nums[i]!=0) System.out.printf("+2^"+i);
        }
    }

    public static void main(String[] args) {
        method(10);

    }
}
