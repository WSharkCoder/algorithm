package unit4;

import javax.swing.border.Border;
import java.util.Scanner;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 18:25
 * @Version V1.0
 * @ClassName Problem4_3_3$13
 */
public class Problem4_3_3$13 {
    public static int amount = 0;
    public static int[][] Board = new int[100][100];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int size = (int) Math.pow(2, k);
        System.out.println("Input incomplete  pane:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Cover(0, 0, x, y, size);
        OutputBoard(size);
    }

    public static void Cover(int tr, int tc, int dr, int dc, int size) {
        int s, t;
        if (size < 2) return;
        amount++;
        t = amount;//所使用的三格板的数目
        s = size / 2;//子问题的棋盘大小
        if (dr < tr + s && dc < tc + s) {//残缺方格为于左上方棋盘
            Cover(tr, tc, dr, dc, s);
            Board[tr + s - 1][tc + s] = t;
            Board[tr + s][tc + s] = t;
            Board[tr + s][tc + s - 1] = t;
            Cover(tr, tc + s, tr + s - 1, tc + s, s);
            Cover(tr + s, tc + s, tr + s, tc + s, s);
            Cover(tr + s, tc, tr + s, tc + s - 1, s);
        } else if (dr < tr + s && dc >= tc + s) {//残缺方格位于右上方
            Cover(tr, tc, dr, dc, s);
            Board[tr + s - 1][tc + s - 1] = t;
            Board[tr + s][tc + s - 1] = t;
            Board[tr + s][tc + s] = t;
            Cover(tr, tc, tr + s - 1, tc + s - 1, s);
            Cover(tr + s, tc, tr + s, tc + s - 1, s);
            Cover(tr + s, tc + s, tr + s, tc + s, s);
        } else if (dr >= tr + s && dc < tc + s) {//残缺方格位于左下方
            Cover(tr, tc, dr, dc, s);
            Board[tr + s - 1][tc + s - 1] = t;
            Board[tr + s - 1][tc + s] = t;
            Board[tr + s][tc + s] = t;
            Cover(tr, tc, tr + s - 1, tc + s - 1, s);
            Cover(tr, tc + s, tr + s - 1, tc + s, s);
            Cover(tr + s, tc + s, tr + s, tc + s, s);
        } else if (dr >= tr + s && dc >= tc + s) {
            Cover(tr, tc, dr, dc, s);
            Board[tr + s - 1][tc + s - 1] = t;
            Board[tr + s][tc + s - 1] = t;
            Board[tr + s - 1][tc + s] = t;
            Cover(tr, tc, tr + s - 1, tc + s - 1, s);
            Cover(tr + s, tc, tr + s, tc + s - 1, s);
            Cover(tr, tc + s, tr + s - 1, tc + s, s);
        }
    }

    public static void OutputBoard(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(Board[i][j]);
            System.out.println();
        }
    }

}
