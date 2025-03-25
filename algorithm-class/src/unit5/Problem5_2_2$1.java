package unit5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author WSharkCoder
 * @Date 2020/6/7 10:04
 * @Version V1.0
 * @ClassName Problem5_2_2$1
 */
public class Problem5_2_2$1 {
    public static int[][] jz = new int[][]{
            {0, 1, 1, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 1, 1},
            {1, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 1, 1, 0}
    };
   public static class Node //含前驱指针的节点
   { public int city; public int pre; }
    public static int n=8;//城市数目
    public static int qh,qe;//队首指针，队尾指针
    public static  int[] visited=new int[n];//访问标记
    public static Node[] sq=new Node[n];//队列
    public static void main(String[] args) {
        System.out.println("201813137031-计科1801-方俊雄");
        search();
    }
    public static int target=7;
    public static void search(){
        qh=0;
        qe=1;
        sq[0]=new Node();
        sq[0].city=0;//起点：A市0
        sq[0].pre=-1;
        visited[0]=1;
        while(qh!=qe)//队列不为空
        {
            for(int i=0;i<n;i++){
                if(jz[sq[qh].city][i]==1&&visited[i]==0)//入队未访问的邻接节点
                {
                    sq[qe]=new Node();
                    sq[qe].city=i;
                    sq[qe].pre=qh;
                    visited[i]=1;
                    if(sq[qe].city==target){
                        out();
                        return;
                    }
                    qe++;
                }
            }
            qh++;//头节点退栈
        }
        System.out.println("Non solution!!");
    }
    //逆序输出结果
    public static void out(){
       
        System.out.printf(""+sq[qe].city);
        while(sq[qe].pre!=-1){
            qe=sq[qe].pre;
            System.out.printf("- -"+sq[qe].city);
        }
    }


}
