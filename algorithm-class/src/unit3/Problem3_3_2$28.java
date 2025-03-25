package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 11:23
 * @Version V1.0
 * @ClassName Problem3_3_2$28
 * 冒泡排序
 */
public class Problem3_3_2$28 {
    public static void method() {
        System.out.println("Input data number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        boolean flag=true;
        for (int i = 0; i < n - 1 && flag; i++) {
            flag=false;
            for(int j=i;j<n-1;j++)
                if(a[j]>a[j+1]){
                    flag=true;
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
        }

        for (int i = 0; i < n; i++)
            System.out.printf("%5d",a[i]);
    }

    public static void main(String[] args) {
        method();
    }
}
