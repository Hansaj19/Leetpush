class Solution {
    public int countDays(int []weights, int cap, int days){
        int sum=0,count=0;
        int res=-1;
        int n = weights.length;
        for(int j=0;j<n;j++){
            sum+=weights[j];
            if(sum>cap){
                count++;
                j--;
                sum=0;
            }
            if(count > days) return count;
        }
        if(sum > 0) count++;
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = Integer.MIN_VALUE;
        int n = weights.length;
        int temp=0;
        for(int i=0;i<n; i++){
            maxWeight = Math.max(maxWeight,weights[i]);
            temp+=weights[i];
        }
        int low = maxWeight;
        int high = temp;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(countDays(weights,mid,days)>days){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}