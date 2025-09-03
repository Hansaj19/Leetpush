class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();//created answer list
        Arrays.sort(nums); 
        // for (int i = 0; i < nums.length; i++) {
        //     int target = -nums[i];
        //     List<Integer> map = new ArrayList<>();
        //     for (int j = i+1; j < nums.length; j++) {
        //         int comp = -(nums[i]+ nums[j]);
        //         if (map.contains(comp)) {
        //             List<Integer> row = Arrays.asList(nums[i], nums[j], comp);
        //             if (!ans.contains(row)) ans.add(row);
        //         }  
        //         else map.add(nums[j]);
        //     }
        // }
        int n=nums.length;
        int prev=Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int k=n-1;
            int j=i+1;
            while(j<k){

                if((nums[i]+nums[j]+nums[k])>0){
                    k--;
                }
                else if((nums[i]+nums[j]+nums[k])<0){
                    j++;
                }
                else{
                    List<Integer> row = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(row);
                    j++;
                    k--;
                    while(j<k && nums[k]==nums[k+1])k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                }
            }
        }
        return ans;
    }
}