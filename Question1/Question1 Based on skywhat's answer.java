class Solution {
       public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp;
            temp = map.get(target - nums[i]);
            if (temp != null) {
                return new int[]{temp, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    }
}