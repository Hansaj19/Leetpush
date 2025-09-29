class Solution {
    private int totalSum(int [] nums,int mid){
        int n = nums.length;
        int res=0,sum=0;
        for(int j=0;j<n;j++){
            res = (nums[j]+mid-1)/mid;
            sum+=res;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
        }
        int low = 1;
        int high= max;
        while(low<=high){
            int mid = low+((high-low)/2);
            if(totalSum(nums,mid)>threshold){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
            
        }
        return low;
    }
}