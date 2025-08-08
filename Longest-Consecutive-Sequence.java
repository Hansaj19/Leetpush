class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n <= 1) return n ;
        int count = 1;
        int longest = 1;
        int flag = 0;
        for(int i = 1 ; i<n ; i++){
            flag = 0;
            if(nums[i] == ( nums[i-1]+1)){
                count++;
            }
            else if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                count = 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}