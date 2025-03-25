package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/5/3 17:45
 * @Version V1.0
 * @ClassName Problem3_2_4$19
 * 求n<100时，n!准取值
 */
public class Problem3_2_4$19 {
    private  static final  int MOD=1000000;
    /**
     * 独立编写
     * @param n
     */
    public static void  method1(int n) {
        long[] result = new long[2048];
        result[0]=1;
        int length=0;
        for (int i = 2,total=0; i <= n; i++) {
            for (int j = 0; j <= length; j++) {
                total+=i*result[j];
                result[j]=total%MOD;
                total/=MOD;
            }
            while (total != 0) {
                result[++length]=total%MOD;
                total/=MOD;
            }
        }
        for (int i = length; i >= 0; i--) {
            if(i%5==0) System.out.println();
            System.out.printf("%06d ",result[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        int n=100;
        System.out.printf(n+"=\n");
        method1(100 );

    }
}
