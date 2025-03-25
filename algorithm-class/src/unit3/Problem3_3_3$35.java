package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 16:29
 * @Version V1.0
 * @ClassName Problem3_3_3$35
 */
public class Problem3_3_3$35 {
    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of boxes:");
        int n=scanner.nextInt();
        long w1 = 0,w2=0;
        int t=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"box take"+t+"units");
            w1 = t + w1;
            t*=2;
        }
        w1*=100;
        System.out.println("Normal weight:"+w1);
        System.out.println("Input reality weigth:");
        w2=scanner.nextInt();
        w1=(w1-w2)/10;
        while(w1!=0){
            int k=0;
            t=1;
            while(w1-t>=0){
                t*=2;
                k++;
            }
            System.out.println(k+"box id bad");
            w1=w1-t/2;
        }
    }
    public static void method2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of boxes:");
        int n=scanner.nextInt();
        long w1 = 0,w2=0;
        int t=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"box take"+t+"units");
            w1 = t + w1;
            t*=2;
        }
        w1*=100;
        System.out.println("Normal weight:"+w1);
        System.out.println("Input reality weigth:");
        w2=scanner.nextInt();
        w1=(w1-w2)/10;
        while (w1 != 0) {
            int k = (int) (Math.log(w1) / Math.log(2));
            System.out.println(k + 1 + "is bad");
            w1 = (long) (w1 - Math.pow(2, k));
        }


    }
    public static void main(String[] args) {
         method1();
         method2();
    }
}
