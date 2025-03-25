package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 13:42
 * @Version V1.0
 * @ClassName Problem4_3_2$13
 */
public class Problem4_3_2$13 {
    public static void maxMin(int i, int j, float[] a, float[] result) {
        float[] lResult = new float[2], rResult = new float[2];
        if (i == j) {
            result[0] = a[i];
            result[1] = a[i];
        } else if (i == j - 1) {
            if (a[i] > a[j]) {
                result[1] = a[i];
                result[0] = a[j];
            } else {
                result[1] = a[j];
                result[0] = a[i];
            }
        } else {
            int min = (i + j) / 2;
            maxMin(i, min, a, lResult);
            maxMin(min + 1, j, a, rResult);
            if (lResult[0] < rResult[0]) result[0] = lResult[0];
            else result[0] = rResult[0];
            if (lResult[1] > rResult[1]) result[1] = lResult[1];
            else result[1] = rResult[1];
        }
    }

    public static void main(String[] args) {
        float[] a=new float[]{
            2, 1, 3, 4};
        float[]result=new float[2];
        maxMin(0,3,a,result);
        System.out.println(result[0]+","+result[1]);

    }
}
