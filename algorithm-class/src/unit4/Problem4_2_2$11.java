package unit4;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 10:56
 * @Version V1.0
 * @ClassName Problem4_2_2$11
 */
public class Problem4_2_2$11 {
    public static void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x1,x2,x3:");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int i=1;
        int max=(x1>x2?x1:x2)>x3?(x1>x2?x1:x2):x3;
        int result= max*i;
        while(true){
            if(result%x1==0&&result%x2==0&&result%x3==0)break;
            i++;
            result*=i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        method();
    }
}
