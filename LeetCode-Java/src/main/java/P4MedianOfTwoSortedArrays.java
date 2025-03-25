/**
 * @author WSharkCoder
 * @date 2022/03/07
 */
public class P4MedianOfTwoSortedArrays {
    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int s1 = 0, s2 = 0, e1 = nums1.length - 1, e2 = nums2.length - 1;
            int len = nums1.length + nums2.length;
            int i = s1, j = e2;
            // 奇数

            if ((len & 1) == 1) {
                while ((len - 1) >> 1 != i + j) {
                    if (nums1[i] <= nums2[j]) {
                        i = i + (e1 - i) >> 1;
                        j = j - (j - s1) >> 1;

                        s1 = i + 1 < e1 ? i + 1 : e1;
                        e2 = j;
                    } else {
                        i = (s1 + i) / 2;
                        j = (j + e2) / 2;

                        e1 = i;
                        s2 = j;

                    }
                }
                return nums1[i] < nums2[j] ? nums1[i] : nums2[j];
            } else {
                while ((len - 2) / 2 != i + j) {
                    if (nums1[i] <= nums2[j]) {
                        i = (i + e1) / 2;
                        j = (s2 + j) / 2;

                        s1 = i;
                        e2 = j;
                    } else {
                        i = (s1 + i) / 2;
                        j = (j + e2) / 2;

                        e1 = i;
                        s2 = j;
                    }
                }
                // i i+1 j j+1 四个下标对应值的中的中位数
                if (i + 1 < nums1.length && j + 1 < nums2.length) {
                    if (nums1[i + 1] <= nums2[j]) {
                        return (nums1[i] + nums1[i + 1]) / 2;
                    } else if (nums1[i] >= nums2[j + 1]) {
                        return (nums2[j] + nums2[j + 1]) / 2;
                    } else {
                        return (nums1[i] + nums2[j]) / 2;
                    }
                } else if (i + 1 == nums1.length && j + 1 == nums2.length) {
                    return (nums1[i] + nums2[j]) / 2;

                } else if (i + 1 == nums1.length) {
                    if (nums1[i] >= nums2[j + 1]) {
                        return (nums2[j] + nums2[j + 1]) / 2;
                    } else {
                        return (nums1[i] + nums2[j]) / 2;
                    }

                } else {
                    if (nums2[j] >= nums1[i + 1]) {
                        return (nums1[i] + nums1[i + 1]) / 2;
                    } else {
                        return (nums1[i] + nums2[j]) / 2;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Solution s = new Solution();
            double res = s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        }
    }


}

