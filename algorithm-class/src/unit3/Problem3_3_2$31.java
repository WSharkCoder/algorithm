package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 15:05
 * @Version V1.0
 * @ClassName Problem3_3_2$31
 */
public class Problem3_3_2$31 {
    public static void method() {
        System.out.println("Input 3 Number:");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x0 = max(x1, x2, x3);
        int t=1;//最小公倍数
        for (int i = 2; i <= x0; i++) {
            boolean flag = true;
            while(flag){
                flag=false;
                if(x1%i==0){
                    x1/=i;
                    flag=true;
                }
                if(x2%i==0){
                     x2/=i;
                     flag=true;
                }
                if(x3%i==0){
                    x3/=i;
                    flag=true;
                }
                if(flag)t*=i;
                x0 = max(x1, x2, x3);
            }
        }
        System.out.println("The result is:" + t);
    }
    public static int max(int x, int y, int z) {
        if(x>y&&x>z)return x;
        else if(y>x&&y>z) return y;
        else return z;
    }

    public static void main(String[] args) {
        method();
    }
}
