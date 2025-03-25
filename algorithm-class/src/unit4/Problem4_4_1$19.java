package unit4;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/24 15:22
 * @Version V1.0
 * @ClassName Problem4_4_1$19
 */
public class Problem4_4_1$19 {

    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        StringBuffer n = new StringBuffer(scanner.next());
        int s=scanner.nextInt();
        if(s>n.length()){
            System.out.println("Data Error!");
            return;
        }
        int index=0;//上轮中散出数字的位置
        int[] data=new int[s];//删除数字的所有位置
        int i,j;
        for(i=0;i<s;i++){
            for( j=0;j<n.length()-1;j++){
                if(n.charAt(j)>n.charAt(j+1)){
                    n.delete(j,j+1);
                    if(j>=index)data[i]=j+i;//当前数字位置+偏移量
                    else data[i]=data[i-1]-1;//必然为上一轮删除数字的前一位置
                    index=j;
                    break;
                }
            }
            if(j>=n.length())break;
        }
        for(;i<s;i++){
            j=n.length()-1;
            n.delete(j,j+1);
            data[i]=j+1;
        }
        while(n.charAt(0)=='0'&&n.length()>1)n.delete(0,1);
        System.out.println(n);
        for( i=0;i<s;i++)
            System.out.printf(data[i]+" ");
    }
    public static void method2(){
        Scanner scanner=new Scanner(System.in);
        StringBuffer n=new StringBuffer(scanner.next());
        int s=scanner.nextInt();
        if(s>n.length()){
            System.out.println("Data Error!");
            return;
        }
        int i=0,j=0,index=0;
        int[] data=new int[s];
        while(i<s&&j<n.length()-1){
            while(j<n.length()-1&&n.charAt(j)<=n.charAt(j+1))j++;
            if(j<n.length()-1){
                n.delete(j, j + 1);
                if(j>=index)data[i]=i+j;
                else  data[i]=data[i-1]-1;
                i++;
                index=j;
                j--;
            }
        }

        for(;i<s;i++){
            j=n.length()-1;
            n.delete(j,j+1);
            data[i]=j+1;
        }
        while(n.charAt(0)=='0'&&n.length()>1)n.delete(0,1);
        System.out.println(n);
        for( i=0;i<s;i++)
            System.out.printf(data[i]+" ");

    }
    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        method1();
        method2();
    }
}
