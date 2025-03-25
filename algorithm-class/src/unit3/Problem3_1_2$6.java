package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/4/27 21:15
 * @Version 1.0
 * 3.1.2 例6
 * 整数划分问题
 */
public class Problem3_1_2$6 {
    public static int Q(int n, int m) {
        if (n == 1 || m == 1) return 1;
        else if (n < m) return Q(n, n);
        else if (n == m) return 1 + Q(n, n-1);
        else return Q(n, m-1) + Q(n - m, m);
    }
    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        int result=Q(6, 6 );
        System.out.println(result);
    }
}
