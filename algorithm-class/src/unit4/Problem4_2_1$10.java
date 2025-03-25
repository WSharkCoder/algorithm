package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 10:31
 * @Version V1.0
 * @ClassName Problem4_4_1$10
 */
public class Problem4_2_1$10 {
    public static void method1() {
        for(int A=3;A<=9;A++)
            for(int B=0;B<=9;B++)
                for(int C=0;C<=9;C++)
                {
                    long F=10000*A+1000*B+C*100+A*10+B;
                    long E=F*A;
                    long E1=E;
                    long G1=E1%10;
                    int i;
                    for( i=1;i<=5;i++){
                        long G2=G1;
                        E1=E1/10;
                        G1=E1%10;
                        if(G1!=G2)break;
                    }
                    if(i==6) System.out.println(F+"*"+A+"="+E);

                }
    }
    public static void method2() {
        for(int A=3; A<=9;A++)
            for(int D=1;D<=9;D++){
                long E=D*100000+ D*10000+D*1000+D*100+D*10+D;
                if(E%A==0){
                    long F=E/A;
                    if(F/10000==A&&(F/10)%10==A)
                        if((F/1000)%10==(F%10))
                            System.out.println(F+"*"+A+"="+E);
                }
            }


    }
    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        method1();
        method2();
    }
}
