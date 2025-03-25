package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 16:14
 * @Version V1.0
 * @ClassName Problem3_3_3$33
 */
public class Problem3_3_3$33 {
    public static void method() {
        int A, B, C, D;
        for (int i = 1; i <= 4; i++) {
            A = i;
            for (int j = 1; j <= 4; j++) {
                B = j;
                for (int k = 1; k <= 4; k++) {
                    C = k;
                    D = 10 - i - j - k;
                    if (fun(A == 1) + fun(B == 3) == 1 &&
                            fun(C == 1) + fun(D == 4) == 1 &&
                            fun(D == 2) + fun(A == 3) == 1)
                        System.out.println("A=" + A + " B=" + B + " C=" + C + " D=" + D);
                }
            }
        }
    }

    public static int fun(boolean flag) {
        return flag == true ? 1 : 0;
    }

    public static void main(String[] args) {
        method();
    }
}
