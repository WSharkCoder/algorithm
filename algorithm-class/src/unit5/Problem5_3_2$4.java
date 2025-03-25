package unit5;

import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/6/7 15:16
 * @Version V1.0
 * @ClassName Problem5_3_2$4
 */
public class Problem5_3_2$4 {
    public static int n = 7;
    public static int[][] data = new int[7][7];//地图块之间的联系
    public static int total;                   //涂色总数
    public static int[] color = new int[7];      //地图块的颜色

    /*
        0 1 0 0 1 0 1
        1 0 0 1 0 1 0
        0 0 0 0 1 0 1
        0 1 1 0 0 1 1
        1 0 0 0 0 0 1
        0 1 0 1 0 0 0
        1 0 1 1 1 0 0
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 7; j++)
                data[i][j] = scanner.nextInt();
        total = 0;
        search(0);
        System.out.println("\n Total="+total);
        System.out.println("201813137031-方俊雄-计科1801");
    }
    public static void search(int s){
        if(s>=7)
            outPut();
        else{
            for(int i=1;i<=4;i++){
                color[s]=i;
                if(colorSame(s)==0)
                    search(s+1);
            }
        }
    }
    public static int colorSame(int s){
        int flag=0;
        for(int i=0;i<s;i++){
            if(data[s][i]==1&&color[s]==color[i])//地图块相邻且同色
                flag =1;
        }
        return flag;
    }
    public static void outPut(){
        System.out.printf("Serial number:"+total+"||");
        for(int i=0;i<n;i++) System.out.printf(color[i]+" ");
        System.out.println();
        total++;
    }
}
