package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/3 20:38
 * @Version V1.0
 * @ClassName Problem3_4_4$40
 * 楼梯问题
 */
public class Problem3_4_4$40 {
    public static int fun(int n) {
        if(n==1)return 1;
        else if(n==2) return 2;
        else return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        System.out.println("Input n:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("The Number of ways:"+fun(n));
    }
}
