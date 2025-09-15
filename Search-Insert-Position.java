class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
        while(left<=right){
            int mid = (int)Math.floor((left+right)/2);
            if(target > nums[mid]){
                left = mid+1;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else if(target == nums[mid]){
                return mid;
            }
        }
        return left;
    }
}