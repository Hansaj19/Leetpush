class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int high = 0;
        int low = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            low = Math.max(low,nums[i]);
            high +=nums[i];
        }
        int answer=-1;
        if (k > n) return answer;
        while(low<=high){
            int student = 1;
            int pages = 0;
            int mid = low + (high-low)/2;
            for(int i = 0; i<n; i++){
                if((pages+nums[i]) <= mid){
                    pages+=nums[i];
                }
                else{
                    student++;
                    pages=nums[i];
                }
            }    
            if (student <= k) {
                answer = mid;
                high = mid - 1; // try smaller maximum
            } else {
                low = mid + 1;  // need larger maximum
            }
        }
        return answer;
    }
}