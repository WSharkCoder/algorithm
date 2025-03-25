package unit3;

/**
 * @Author WSharkCoder
 * @Date 2020/4/26 18:00
 * @Version 1.0
 * 3.1.1例3
 * 求一个矩阵的鞍点，即在行上的最小而列上最大的点
 */
public class Problem3_1_1$3 {
    /**
     *
     * @param a
     * @param m 行
     * @param n 列
     */
    public static void SolveMethod1(int[][] a, int m, int n) {
        long start = System.nanoTime();
        for (int i = 0; i < m; i++) {
            int minIndex=0;
            boolean flag=true;
            for(int j=0;j<n;j++)if(a[i][minIndex]>a[i][j])minIndex=j;
            for(int j=0;j<m;j++)if(a[i][minIndex]<a[j][minIndex])flag=false;
            if(flag) System.out.println(a[i][minIndex]);
        }
        long end = System.nanoTime();
        System.out.println("Time:" + (end - start));

    }
    public static void main(String[] args) {
        int[][] a =new int[][]{
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},

        };
         SolveMethod1(a,5,5);

    }

}
