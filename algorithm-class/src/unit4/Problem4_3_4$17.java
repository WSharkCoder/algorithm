package unit4;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/24 9:54
 * @Version V1.0
 * @ClassName Problem4_3_4$17
 */
public class Problem4_3_4$17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scanner.nextInt();

        float[] a = new float[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextFloat();
        float result = min(n, a);
        System.out.println("Result:" + result);
    }

    public static float min(int n, float[] a) {
        float[] Min = new float[2];
        twoMin(0, n - 1, a, Min);
        return Min[1];
    }

    public static void twoMin(int i, int j, float[] a, float[] Min) {

        if (i == j) Min[0] = Min[1] = a[i];
        else if (i == j - 1)
            if (a[i] > a[j]) {
                Min[0] = a[j];
                Min[1] = a[i];
            } else {
                Min[0] = a[i];
                Min[1] = a[j];
            }
        else {
            int mid = (i + j) / 2;
            float[] lMin = new float[2];
            float[] rMin = new float[2];
            twoMin(i, mid, a, lMin);
            twoMin(mid + 1, j, a, rMin);
            if (rMin[0] > lMin[0])
                if (lMin[1] > rMin[0]) {
                    Min[0] = lMin[0];
                    Min[1] = rMin[0];
                } else {
                    Min[0] = lMin[0];
                    Min[1] = lMin[1];
                }
            else if (rMin[0] <= lMin[0])
                if (rMin[1] > lMin[0]) {
                    Min[0] = rMin[0];
                    Min[1] = lMin[0];
                } else {
                    Min[0] = rMin[0];
                    Min[1] = rMin[0];
                }
        }
    }
}
