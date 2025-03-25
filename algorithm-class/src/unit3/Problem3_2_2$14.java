package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/8 18:14
 * @Version V1.0
 * @ClassName Problem3_2_2$14
 *
 */
public class Problem3_2_2$14 {
    public static void method1() {
        String[] nums = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        long no =new Scanner(System.in).nextLong();
        int MAX=20;
        int[] T=new int[MAX];
        int index=0;
        while(no!=0){
            T[index++]= (int) (no%10);
            no/=10;
        }

        StringBuffer buffer = new StringBuffer(new String());
        for (int i = index - 1; i >= 0; i--) {
            buffer.append(nums[T[i]]);
            if(i!=0)buffer.append("-");
        }
        System.out.println(buffer.toString());
    }
    public static void method2() {
        String[] nums = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("Input a num:");
        String no = new Scanner(System.in).next();
        StringBuffer buffer = new StringBuffer(new String());
        for (int index = 0; index < no.length(); index++)
            buffer.append(nums[no.charAt(index)-'0']+'-');
        buffer.delete(buffer.length() - 1, buffer.length());
        System.out.println(buffer.toString());
    }
    public static void main(String[] args) {
//        method1();
        method2();
    }
}
