class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n-3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int l=i+1;l<n-2;l++){
                long target2 =(long) target - nums[i] - nums[l];
                if (l > i + 1 && nums[l] == nums[l - 1]) continue; 
                int j=n-1;
                int k=l+1;
                while(j>k){
                    long sum = (long)nums[k] + nums[j];
                    if(sum > target2){
                        j--;
                    }
                    else if(sum < target2){
                        k++;
                    }
                    else{
                        List<Integer> row = Arrays.asList(nums[i], nums[l], nums[k],nums[j]);
                        ans.add(row);
                        j--;
                        k++;
                        while(k<j && nums[k]==nums[k-1])k++;
                        while(k<j && nums[j]==nums[j+1])j--;
                    }
                }
            }
        }
        return ans;
    }
}