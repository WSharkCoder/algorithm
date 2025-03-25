import java.util.HashMap;

/**
 * @author WSharkCoder
 * @date 2022/03/07
 */
public class P1TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // val->index映射
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
