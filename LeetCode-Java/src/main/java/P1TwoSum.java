import java.util.HashMap;

/**
 * 1.两数之和
 *
 * @author WSharkCoder
 * @date 2022/03/07
 */
public class P1TwoSum {

    static class Solution {
        /**
         * 解题思路:
         * 倒序索引 map<value,index>，遍历每个数据，判断另外一个（相加=target）值是否在倒序索引中
         * 时间复杂度: O(n)
         *
         * @param nums   数据数组
         * @param target 目标值
         * @return 下标
         */
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
