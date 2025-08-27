class Solution {
    public int subarraySum(int[] nums, int k){
        HashMap<Integer,Integer>hmap = new HashMap<>();
        int presum = 0;
        int count = 0;
        int n = nums.length;
        hmap.put(0,1) ;//important
        for(int i=0;i<n;i++){
            presum += nums[i];
            int remove = presum-k;
            count += hmap.getOrDefault(remove,0);
            hmap.put(presum,hmap.getOrDefault(presum,0)+1);
        }
        return count;
    }   
}