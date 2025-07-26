class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] output = new int[]{-1, -1};  // default if not found

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output; // break dono loop se
                }
            }
        }
        return output; // no pair found
    }
}
