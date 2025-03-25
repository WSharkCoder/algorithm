package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/3 17:54
 * @Version V1.0
 * @ClassName Problem3_2_4$18
 * 高精度数据*长整数
 */
public class Problem3_2_4$18 {
    public  static void   method(){
        System.out.println("Input high precision Number:");
        Scanner scanner = new Scanner(System.in);
        char[] s1 = scanner.nextLine().toCharArray();
        System.out.println("Input  long  Number:");
        long c = scanner.nextLong();
        int[] a = new int[2048];//结果集
        long  d=0;//按位乘积+进位
        int i,j;
        for (i = 0, j = s1.length - 1; i < s1.length; i++, j--) {
            d= c*(s1[j]-'0')+d;
            a[i]= (int) (d%10);
            d/=10;
        }
        while (d != 0) {
            a[i++]= (int) (d%10);
            d/=10;
        }
        for (j = i-1; j >0; j--) {
            System.out.printf(a[j]+"");
        }
    }
    public static void main(String[] args) {
        method();
    }
}
