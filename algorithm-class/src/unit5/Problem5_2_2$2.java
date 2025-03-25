package unit5;

/**
 * @Author WSharkCoder
 * @Date 2020/6/7 13:00
 * @Version V1.0
 * @ClassName Problem5_2_2$2
 */
public class Problem5_2_2$2 {
    //迷宫矩阵 8*8
    public static int[][] maze=new int[][]{
            {0,0,0,0,0,0,0,0},
            {0,1,1,1,1,0,1,0},
            {0,0,0,0,1,0,1,0},
            {0,1,0,0,0,0,1,0},
            {0,1,0,1,1,0,1,0},
            {0,1,0,0,0,0,1,1},
            {0,1,0,0,1,0,0,0},
            {0,1,1,1,1,1,1,0}
    };
    public static int[] fx = new int[]{1, -1, 0, 0};//左右
    public static int[] fy = new int[]{0, 0, 1, -1};//上下
    static class Node {
        public int x;
        public int y;
        public int pre;

    }
    public static Node[] sq=new Node[8*8];
    public static int qh,qe;

    public static void main(String[] args) {
        System.out.println("201813137031-计科1801-方俊雄");
        search();
    }
    public static void search(){
        qh=0;
        qe=1;
        maze[0][0]=-1;      //迷宫入口
        sq[0]=new Node();
        sq[0].x=0;
        sq[0].y=0;
        sq[0].pre=-1;
        while(qh!=qe){
            for(int k=0;k<4;k++){
                int i=sq[qh].x+fx[k];
                int j=sq[qh].y+fy[k];
                if(check(i,j)==1){
                    sq[qe]=new Node();
                    sq[qe].x=i;
                    sq[qe].y=j;
                    sq[qe].pre=qh;
                    maze[i][j]=-1;
                    if(sq[qe].x==7&&sq[qe].y==7){
                        out();
                        return;
                    }
                    qe++;
                }
            }
            qh++;
        }
        System.out.println("No Solution" +
                "!");
    }

    public static int check(int i, int j) {
        if(i<0||i>=8||j<0||j>=8)return 0;//是否在迷宫中
        if(maze[i][j]==1||maze[i][j]==-1)return 0;//是否可行
        return 1;
    }
    public static void out(){
        System.out.printf("(" + sq[qe].x + "," + sq[qe].y + ")");
        int num=1;
        while(sq[qe].pre!=-1){
            if(num++%4==0) System.out.println();
            qe=sq[qe].pre;
            System.out.printf("- -"+"("+sq[qe].x+","+sq[qe].y+")");
        }
    }

}
