package unit3;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/5 19:44
 * @Version V1.0
 * @ClassName Problem3_2_1$13
 */
public class Problem3_2_1$13 {
    public static void method1() {
        System.out.println("Input nums1-nums2:");
        Scanner scanner = new Scanner(System.in);
        int nums1 = scanner.nextInt();
        int nums2 = scanner.nextInt();
        int nums3 = scanner.nextInt();

        int[] a = new int[nums1], b = new int[nums2], c = new int[nums3];
        System.out.println("Input a[]:");
        for (int i = 0; i < nums1; i++)
            a[i] = scanner.nextInt();
        System.out.println("Input b[]:");
        for (int i = 0; i < nums2; i++)
            b[i] = scanner.nextInt();
        System.out.println("Input c[]:");
        for (int i = 0; i < nums3; i++)
            c[i] = scanner.nextInt();

        for (int i = 0; i < nums1; i++) {
            int T = a[0];
            for (int j = 0; j < nums2; j++)
                if (b[j] == T)
                    for (int k = 0; k < nums3; k++)
                        if (c[k] == T) System.out.println(T + " ");
        }
    }
    public static void method2() {
        System.out.println("Input nums1-nums2:");
        Scanner scanner = new Scanner(System.in);
        int nums1 = scanner.nextInt();
        int nums2 = scanner.nextInt();
        int nums3 = scanner.nextInt();
        int[] a = new int[nums1 + nums2 + nums3];
        for (int i = 0; i < nums1 + nums2 + nums3; i++) {
            int  sp=scanner.nextInt();
            a[sp-1]++;
        }
        for (int i = 0; i < nums1 + nums2 + nums3; i++) {
            if(a[i]==3) System.out.println(i+1);
        }


    }
    public static void main(String[] args) {
//        method1();
        method2();
    }
}
