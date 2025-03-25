package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 8:44
 * @Version V1.0
 * @ClassName Problem4_1_1$5
 */
public class Problem4_1_1$5 {
    public static void method(){
        int k=1,oil=500;
        double dis=500;
        do {
            System.out.println("StorePoint:" + k + "," +
                    "Distance:" +(1000-dis) + ",oil:" + oil);
            k++;
            dis = dis + 500 / (2 * k - 1);
            oil=500*k;
        } while (dis < 1000);
        oil = (int) (500 * k  + (1000-dis)*(2*k-1)) ;
        System.out.println("StorePoint:"+k+",Distance"+0+",OilQuantity:"+oil);
    }

    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        method();
    }
}
