package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/5/14 16:03
 * @Version V1.0
 * @ClassName Problem3_3_3$32
 */
public class Problem3_3_3$32 {
    public static void method() {
        for(char x='a';x<='c';x++){
            if(fun(x!='a')+fun(x=='c')+fun(x=='d')+fun(!(x=='d'))==3){
                System.out.println(x+ "is a thief");
            }
        }

    }
    public static int fun(boolean flag){
        return flag==true?1:0;
    }
    public static void main(String[] args) {
        method();
    }
}
