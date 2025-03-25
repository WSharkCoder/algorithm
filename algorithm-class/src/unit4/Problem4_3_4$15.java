package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/23 19:54
 * @Version V1.0
 * @ClassName Problem4_3_4$15
 */
public class Problem4_3_4$15 {
    public static int max_sum3(int[] a, int n) {
        return max_sub_sum(a, 1, n);
    }

    public static int max_sub_sum(int[] a, int left, int right) {
        if (left == right)
            if (a[left] > 0)
                return a[left];
            else return 0;
        else {
            int center=(left+right)/2;
            int left_sum=max_sub_sum(a,left,center);//左半最大值
            int right_sum = max_sub_sum(a, center + 1, right);//右半最大值
            //中间最大值
            int s1=0;//中间左侧
            int lefts=0;
            for(int i=center;i>=left;i--){
                lefts+=a[i];
                if(lefts>s1)s1=lefts;
            }
            int s2= 0;//中间右侧
            int rights=0;
            for(int j=center+1;j<right;j++){
                rights += a[j];
                if(rights>s2)s2=rights;
            }
            if(s1+s2<left_sum&&right_sum<left_sum)return left_sum;
            if(s1+s2<right_sum&&left_sum<right_sum)return right_sum;
            return s1+s2;
        }
    }

    public static void main(String[] args) {
        System.out.println("201813137031-方俊雄-计科1801");
        int[] a = new int[]{0, -2, 11, -4, 13, -5,- 2};
        System.out.println(max_sum3(a,6));
    }
}