import java.util.HashSet;
import java.util.Set;

/**
 * Created by WSharkCoder on 2025/04/09. <br/>
 *
 * @author WSharkCoder
 * @date 2025/04/09
 */
public class P3375MinimumOperationsToMakeArrayValuesEqualToK {
    class Solution {
        public int minOperations(int[] nums, int k) {
            Set<Integer> existedSet = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < k) {
                    return -1;
                }
                if (nums[i] > k) {
                    existedSet.add(nums[i]);
                }
            }
            return existedSet.size();
        }
    }
}
