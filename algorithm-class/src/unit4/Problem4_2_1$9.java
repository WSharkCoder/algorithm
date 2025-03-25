package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 10:14
 * @Version V1.0
 * @ClassName Problem4_1_1$9
 */
public class Problem4_2_1$9 {
    public static void method() {
        for (int x = 1; x <= 20; x++)
            for (int y = 1; y <= 33; y++) {
                int z=100-x-y;
                if(z%3==0&&5*x+4*y+z/3==100){
                    System.out.println("The cock number is" + x);
                    System.out.println("The hen number is" + y);
                    System.out.println("The chick number is"+z);
                }
            }
    }

    public static void main(String[] args) {
        method();
    }
}
