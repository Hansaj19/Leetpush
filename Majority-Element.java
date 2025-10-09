class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count=0;
        int cand=0;
        for(int i=0;i<n;i++){
            if(count==0){
                cand=nums[i];
                count++;
            }
            else{
                if(nums[i]==cand)count++;
                else count--;
            }
        }
        int othercount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==cand){
                othercount++;
            }
        }
        return (othercount>(n/2))?cand:-1;
    }
}
