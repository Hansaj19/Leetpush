class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefix[]=new int [n];
        int suffix[]=new int [n];
        prefix[0]=0;
        suffix[n-1]=0;
        int i=1,j=n-2;
        while(i<n){
            prefix[i]=prefix[i-1]+nums[i-1];
            i++;
            suffix[j]=suffix[j+1]+nums[j+1];
            j--;
        }
        for(int k=0;k<n;k++){
            if(prefix[k]==suffix[k]){
                return k;
            }
        }
        return -1;
    }
}