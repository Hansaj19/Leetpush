class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
        int leftmin = Integer.MAX_VALUE;
        int rightmin = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]<=nums[right]){
                //right part
                rightmin = Math.min(rightmin,nums[mid]);
                right = mid-1;
            }
            else{
                //left part
                leftmin = Math.min(leftmin,nums[left]);
                left=mid+1;
            }
        }
        return Math.min(leftmin,rightmin);
    }
}