class Solution {
    public int crossSum(int[]nums, int l, int m, int h){
        int leftsum=Integer.MIN_VALUE;
        int rightsum=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=m; i>=l; i--){
            sum+=nums[i];
            leftsum = Math.max(leftsum, sum);
        }
        sum=0;
        for(int i=m+1; i<=h; i++){
            sum+=nums[i];
            rightsum = Math.max(rightsum, sum);
        }
        // return Math.max(Math.max(leftsum,rightsum),leftsum+rightsum);
        return leftsum + rightsum;
    }
    public int maxSum(int[]nums, int l, int h){
        if(l==h) return nums[l];
        int m = (l+h)/2;
        int left = maxSum(nums,l,m);
        int right = maxSum(nums,m+1,h);
        int cross = crossSum(nums,l,m,h);
        return Math.max(Math.max(left,right),cross);
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = maxSum(nums,0,n-1);
        return max;
    }
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             currentSum += nums[i];
            
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
            
//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }
        
//         return maxSum;
//     }
// }