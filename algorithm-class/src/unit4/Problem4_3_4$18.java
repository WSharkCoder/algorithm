package unit4;

/**
 * @Author WSharkCoder
 * @Date 2020/5/24 10:41
 * @Version V1.0
 * @ClassName Problem4_3_4$18
 */
public class Problem4_3_4$18 {
    public static int findMin(int[] a,int n,int k){
        if(k<1||k>n) {
            System.out.println("Error");
            return -1;
        }
        return select(a,0,n-1,k);
    }
    public static int  select(int[] a,int left,int right,int k){
         if(left>=right)return a[left];
         int pivot=a[left];
         int i=left+1;
        int j=right;
        while(true){
            while(a[i]<pivot)i++;
            while(a[j]>pivot)j--;
             if(i>=j)break;
             int T=a[j];
             a[j]=a[i];
             a[i]=T;
         }
         if(j-left+1==k)return pivot;
         a[left]=a[j];
         a[j]=pivot;
         if(j-left+1<k)
             return select(a,j+1,right,k-j-1+left);
         else return select(a,left,j-1,k);
    }
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,-4,5};
        System.out.println(findMin(a, 5, 4));
    }
}
