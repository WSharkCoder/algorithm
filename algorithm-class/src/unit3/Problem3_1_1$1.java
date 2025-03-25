import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/4/26 16:23
 * @Version 1.0
 * 3.1.1 例1
 */
public class Problem3_1_1$1 {
    /**
     * 数学模型
     * S(n)=S(n-1)+(-1)^(n+1)/(2n-1)!
     * @return
     */
    public static void SolveMethod1(int n){
        long start=System.nanoTime();
        double S=0;
        for (int i = 1; i <= n; i++) {
            double A=1;
            for(int j=1;j<=i*2-1;j++)
                A*=j;
            S=S+Math.pow(-1,i+1)/A;
        }
        long end=System.nanoTime();
        System.out.println("Result:"+S);
        System.out.println("Time:"+(end-start)+"\n");

    }
    /**
     * 数学模型
     * S(n)=S(n-1)+(-1)^(n+1)*A(n)
     * A(n)=A(n-1)/((2*n-2)*(2*n-1))
     * @return
     */
    public static void SolveMethod3(int n){
        long start=System.nanoTime();
        double S=1;
        double A =1;
        for (int i = 2; i <= n; i++) {
            A/=(2*i-1)*(2*i-2);
            S+=Math.pow(-1,i+1)*A;
        }
        long end=System.nanoTime();
        System.out.println("Result:"+S);
        System.out.println("Time:" + (end - start));
    }
    /**
     * 大误差解法
     * 数学模型
     * S(n)=S(n-1)+(-1)^(n+1)/A(n)
     * A(n)=A(n-1)*(2n-2)*(2n-1)
     * * @return
     */
    public static void SolveMethod2(int n) {
        long start = System.nanoTime();
        double S=1;
        long  A=1;
        for (int i = 2; i <= n; i++) {
            A *= (2 * i - 1) * (2 * i - 1);
            S+=Math.pow(-1,i+1)/A;
        }
        long end = System.nanoTime();
        System.out.println("Result:" + S);
        System.out.println("Time:"+(end-start)+"\n");

    }

    public static void main(String[] args) {
        //输入n
        int n =new Scanner(System.in).nextInt();
        SolveMethod1(n);
        SolveMethod2(n);
        SolveMethod3(n);

    }
}
