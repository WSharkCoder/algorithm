package unit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 20:28
 * @Version V1.0
 * @ClassName Problem4_3_4$16
 */
public class Problem4_3_4$16 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 Numbers(Type:String)");
        String s1 = scanner.next();
        String s2 = scanner.next();
        int[] num1 = new int[s1.length()];
        int[] num2 = new int[s2.length()];
        for (int i = 0; i < num1.length; i++) num1[i] = s1.charAt(s1.length() - 1 - i)-'0';
        for (int i = 0; i < num2.length; i++) num2[i] = s2.charAt(s2.length() - 1 - i)-'0';
        int[] result = new int[s1.length() +s2.length()];
        int n=0;
        for (int i = 0; i < num1.length; i++) {
            int carryBit = 0;
            for (int j = 0; j < num2.length; j++) {
                result[i+j]+=num1[i]*num2[j]+carryBit;
                if(result[i+j]>=10){
                    carryBit=result[i+j]/10;
                    result[i+j]%=10;
                }else carryBit=0;
            }
            int  index=i+num2.length;
            while(carryBit!=0){
                result[index++]+=carryBit%10;
                carryBit/=10;
            }
            n=index;
        }
        for(int i=n-1;i>=0;i--) System.out.printf(result[i]+"");
    }

    public static void main(String[] args) {
        method();
    }
}
