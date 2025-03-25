package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/4/27 18:36
 * @Version 1.0
 * 3.1.2 例5
 * 汉诺塔问题
 */
public class Problem3_1_2$5 {

    public static void hanNoi(int n, String A, String B, String C) {
        if (n > 1) hanNoi(n - 1, A, C, B);
        System.out.println(n + ":" + A + "----->" + B);
        if (n > 1) hanNoi(n - 1, C, B, A);
    }

    public static void hanNoi2(int n, String A, String B, String C) {
        if(n>0){
            hanNoi2(n - 1, A, C, B);
            System.out.println(n + ":" + A + "----->" + B);
            hanNoi2(n - 1, C, B, A);
        }
    }

    public static void main(String[] args) {
        hanNoi(3, "A", "B", "C");
        System.out.println();
        hanNoi2(3,"A","B","C");
    }
}
