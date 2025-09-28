class Solution {
    public boolean isPossible(int[] bloomDay, int days, int m, int k){
        int n = bloomDay.length;
        int flower=0,bouqet=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=days){
                flower++;
            }
            else{
                bouqet+=(flower/k);
                flower=0;
            }
        }
        bouqet+=(flower/k);
        if(bouqet>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = bloomDay.length;
        if ((long)m * k > n) return -1;
        for(int i=0;i<n;i++){
            max = Math.max(max,bloomDay[i]);
            min = Math.min(min,bloomDay[i]);
        }
        int low = min;
        int high = max;
        int mid=0;
        while(low<=high){
            mid = low+((high-low)/2);
            if(isPossible(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}