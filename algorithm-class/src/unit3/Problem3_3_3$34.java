package unit3;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author WSharkCoder
 * @Date 2020/5/4 10:26
 * @Version V1.0
 * @ClassName Problem3_3_3$34
 */
public class Problem3_3_3$34 {
    /**
     * 穷举法
     */
    public static void Method() {
        System.out.println("Input x1-x5:");
        Scanner scanner = new Scanner(System.in);
        double[] x = new double[5];
        x[0] = scanner.nextDouble();
        x[1] = scanner.nextDouble();
        x[2] = scanner.nextDouble();
        x[3] = scanner.nextDouble();
        x[4] = scanner.nextDouble();
        System.out.println("Input y:");
        double y = scanner.nextDouble();
        char[] operator = new char[]{'+', '-', '*', '/'};

        char[] C = new char[4];
        for (int i = 0; i < 4; i++) {
            C[0] = operator[i];
            for (int j = 0; j < 4; j++) {
                C[1] = operator[j];
                for (int m = 0; m < 4; m++) {
                    C[2] = operator[m];
                    for (int n = 0; n < 4; n++) {
                        C[3] = operator[n];
                        if (fun(x, C, y))
                            System.out.println("" + x[0] + C[0] + x[1] + C[1] + x[2] + C[2] + x[3] + C[3] + x[4] + "=" +
                                    " y");
                    }
                }
            }

        }
    }

    public static boolean fun(double[] D, char[] C, double y) {
        Stack<Double> S1 = new Stack<>();//数值栈
        Stack<Character> S2 = new Stack<>();//数符栈
        S1.push(D[0]);
        for (int i = 0; i < C.length; i++) {
            if (C[i] == '+' || C[i] == '-') {
                S2.push(C[i]);
                S1.push(D[i + 1]);
            } else if (C[i] == '*') {
                double Top = S1.pop();
                S1.push(Top * D[i + 1]);
            } else if (C[i] == '/') {
                double Top = S1.pop();
                S1.push(Top / D[1 + 1]);
            }
        }
        int sum = 0;
        while (!S2.empty()) {
            double Top = S1.pop();
            Top = S2.pop() == '-' ? (-1) * Top : Top;
            sum += Top;
        }
        sum += S1.pop();
        return sum == y;
    }

    public static void method2() {
        int j, k, f, total;
        float p, q;
        float[] n = new float[6];

        char[] c = new char[]{',', '+', '-', '*', '/'};
        int[] i = new int[5];//算符对应
        System.out.println("Input five number:");
        Scanner scanner = new Scanner(System.in);
        for (j = 1; j <= 5; j++)
            n[j] = scanner.nextFloat();
        System.out.println("Input result:");
        n[0] = scanner.nextFloat();
        total = 0;

        //循环遍历过程
        for (i[1] = 1; i[1] <= 4; i[1]++)
            if (i[1] < 4 || n[2] != 0)
                for (i[2] = 1; i[2] <= 4; i[2]++)
                    if (i[2] < 4 || n[3] != 0)
                        for (i[3] = 1; i[3] <= 4; i[3]++)
                            if (i[3] < 4 || n[4] != 0)
                                for (i[4] = 1; i[4] <= 4; i[4]++)
                                    if (i[4] < 4 || n[5] != 0) {
                                        p = 0;//累加器
                                        f = 1;//符号标记
                                        q = n[1];
                                        for (k = 1; k <= 4; k++)
                                            switch (i[k]) {
                                                case 1:
                                                    p += f * q;
                                                    f = 1;
                                                    q = n[k + 1];
                                                    break;
                                                case 2:
                                                    p += f * q;
                                                    f = -1;
                                                    q = n[k + 1];
                                                    break;
                                                case 3:
                                                    q *= n[k + 1];
                                                    break;
                                                case 4:
                                                    q /= n[k + 1];
                                                    break;
                                            }
                                        if (p + f * q == n[0]) {
                                            total++;
                                            System.out.println("Total" + total + ":");
                                            for (k = 1; k <= 4; k++)
                                                System.out.printf("" + n[k] + c[i[k]]);
                                            System.out.printf(n[5] + "=" + n[0]+"\n");
                                        }
                                    }
        if (total == 0)
            System.out.println("Non solution");
    }

    public static void main(String[] args) {
        System.out.println("201813137031-计科1801-方俊雄");
        method2();
    }
}
