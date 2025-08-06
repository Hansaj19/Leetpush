class Solution {
    public void rev(int []nums, int start, int end){
        int n = nums.length;
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--; 
        }
    }
    public void nextPermutation(int[] nums) {
        int ind =-1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                ind = i;
                break;
            }
        }
        if(ind==-1){
            rev(nums,0,n-1);
        }
        else{
            for(int i = n-1;i>=0;i--){
                if(nums[i]>nums[ind]){
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                    break;
                }
            }
            rev(nums,ind+1,n-1);
        }
    }
}